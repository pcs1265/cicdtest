#!/bin/bash

dirpath=`dirname $0`

cd $dirpath/frontend

npm install

npm run build

cd $dirpath/backend

./gradlew bootRun
