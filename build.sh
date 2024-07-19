#!/bin/bash

cd ./frontend

npm install

npm run build

cd ../backend

gradle clean build