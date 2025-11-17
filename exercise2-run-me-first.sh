#!/bin/bash

# Dependencies
echo "Installing sound dependencies"
sudo apt-get install libasound2-dev
echo "Installing printer dependencies"
sudo apt-get install libcups2-dev
echo "Installing X11 dependencies"
sudo apt-get install libx11-dev libxext-dev libxrender-dev libxrandr-dev libxtst-dev libxt-dev

# Boot JDK
echo "Downloading boot JDK"
mkdir ./support &&
cd ./support
curl -k -o jdk-25_linux-x64_bin.tar.gz https://download.oracle.com/java/25/latest/jdk-25_linux-x64_bin.tar.gz
echo "Unpacking the boot JDK"
tar -xvf jdk-25_linux-x64_bin.tar.gz
echo "Cleaning the boot JDK"
rm jdk-25_linux-x64_bin.tar.gz
cd ..

# Incremental build
echo "Incrementally building initial JDK"
cd ./jdk
make images

