#!/bin/bash

echo "Installing sound dependencies"
sudo apt-get update
sudo apt-get install -y libasound2-dev
echo "Installing printer dependencies"
sudo apt-get install -y libcups2-dev
echo "Installing X11 dependencies"
sudo apt-get install -y libx11-dev libxext-dev libxrender-dev libxrandr-dev libxtst-dev libxt-dev

# Boot JDK
echo "Downloading boot JDK"
mkdir ./support
curl -k -o support/jdk-25_linux-x64_bin.tar.gz https://download.oracle.com/java/25/latest/jdk-25_linux-x64_bin.tar.gz
echo "Unpacking the boot JDK"
tar -xvf support/jdk-25_linux-x64_bin.tar.gz -C support/
echo "Cleaning the boot JDK"
rm support/jdk-25_linux-x64_bin.tar.gz

# Incremental build
echo "Setting up JDK for building"
cd ./jdk && bash configure --with-boot-jdk=../support/jdk-25.0.1

