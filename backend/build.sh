#!/bin/bash

dirpath=`dirname $0`

cd $dirpath

./gradlew clean build -x test