# Welcome!

This is a quick start guide on the workshop.
If you have any questions, **please ask**!

Codespaces sometimes shows notifications, such as when the CPU utilization is high, there are too many files for Git to track, or when it wants you to install a language-specific extension. These can be ignored.

## Exercise 1: Benchmarking

DaCapo tells you the execution time of the benchmark once it's done.
For example, given the following output:
```
===== DaCapo 23.11-MR2-chopin sunflow starting warmup 1 =====
===== DaCapo 23.11-MR2-chopin sunflow completed warmup 1 in 37166 msec =====
===== DaCapo 23.11-MR2-chopin sunflow starting =====
===== DaCapo 23.11-MR2-chopin sunflow PASSED in 33707 msec =====
```
We do one two iterations, the first one is warmup, and the second one is the real deal.
In this case, we note down `33707 msec` as the execution time.

It's important to run the benchmarks with a consistent heap size (`-Xmx` and `-Xms`) due to the CPU vs memory trade-off.

We've made some wrapper scripts for quality of life: `./lovelace-java` and `./hopper-java`.
These just redirect to the respective JDK's `java` binary, so all arguments that work with `java` work here.

### Lovelace

Run Sunflow with Lovelace:
```
./lovelace-java -Xms2G -Xmx2G -jar dacapo-slim/dacapo-23.11-MR2-chopin.jar sunflow -n 5
```

### Hopper

Run Sunflow with Hopper:
```
./hopper-java -Xms2G -Xmx2G -jar dacapo-slim/dacapo-23.11-MR2-chopin.jar sunflow -n 5
```

Note: the Dacapo bundled here is a "slim" version where we stripped everything that was not relevant. Other programs will not run.

## Exercise 2: Improving performance

Make sure to check the slides for useful information as well.

### Printing and using VM flags

To show all flags and their setting (`grep` is advised when looking for something):
```
./hopper-java -XX:+PrintFlagsFinal -version
```

Try setting a G1 flag:
```
./hopper-java -XX:MaxGCPauseMillis=500 -version
```

### Re-running Sunflow with custom VM flags

Simply add them before the `-jar`, e.g. with the G1 flag:
```
./hopper-java -Xms2G -Xmx2G -XX:MaxGCPauseMillis=500 -jar dacapo-slim/dacapo-23.11-MR2-chopin.jar sunflow -n 5
```

### Hacking the JDK

> 🚨 This part is finicky (we are experimenting with incremental builds in codespaces). We have [fallback options available](https://cr.openjdk.org/~phubner/lleap-perf/) in case the steps here don't work.

We have a custom JDK for you to modify in `jdk/`.

#### Step 1: Setting up the required files

Due to filesize limitations, we can't bundle everything in the codespace.
Running the following script is **required before doing anything**

You have to **set up your codespace** before you can modify it:

```
./exercise2-run-me-first.sh
```

```
sudo apt-get install libasound2-dev
sudo apt-get install libcups2-dev
sudo apt-get install libx11-dev libxext-dev libxrender-dev libxrandr-dev libxtst-dev libxt-dev
```

This may take a decently long time.

#### Step 2: Getting familiar with the local build

The JDK is based on JDK-26+23, like the others.
You can run Java with the `./my-java` and `./my-javac` scripts, which wrap `java` and `javac`, respectively.

Verify that your installation works:
```
./my-java -version
./my-javac -version
```

#### Step 3: Performning modifications

The flag defaults are in `src/hotspot/share/gc/shared/tlab_globals.hpp`.
You can update these values using your editor.

Once you've made your changes, you can rebuild the binaries. **This will take 10-25 minutes!**
We recommend to rebuild sparingly.
```
cd jdk/
make hotspot
```

Verify that your defaults have been updated by printing the flags of `./my-java`.

There is more information in the `README.md` inside the JDK directory for in-depth information on building the JDK.
We've already pre-configured and pre-built parts of the JDK to improve your build times.
