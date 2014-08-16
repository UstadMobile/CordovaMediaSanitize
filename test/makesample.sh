#!/bin/bash

WORKINGDIR=$(pwd)
TARGETDIR=$WORKINGDIR/../../CordovaMediaSanity-TestProject
PLUGINDIR=$(pwd)/../

if [ -e $TARGETDIR ]; then
    rm -rf $TARGETDIR
fi

if [ ! -e $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi


cd $TARGETDIR
cordova create CordovaMediaSanityTestProject com.ustadmobile.cordovamediasanity.CordovaMediaSanity CordovaMediaSanityTestProject
cd CordovaMediaSanityTestProject
cordova platform add android
cordova plugin add $PLUGINDIR

echo "Created cordova project in $(pwd)"

cp $PLUGINDIR/test/index.html $TARGETDIR/CordovaMediaSanityTestProject/www/index.html
cp $PLUGINDIR/test/demo.js $TARGETDIR/CordovaMediaSanityTestProject/www/demo.js


cd $WORKINGDIR


