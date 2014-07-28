#!/bin/bash

WORKINGDIR=$(pwd)
TARGETDIR=$WORKINGDIR/../../test-cordova-media-sanity
PLUGINDIR=$(pwd)/../

if [ -e $TARGETDIR ]; then
    rm -rf $TARGETDIR
fi

if [ ! -e $TARGETDIR ]; then
    mkdir -p $TARGETDIR
fi


cd $TARGETDIR
cordova create testmediasanity com.ustadmobile.cordovamediasanity.CordovaMediaSanity testmediasanity
cd testmediasanity
cordova platform add android
cordova plugin add $PLUGINDIR

echo "Created cordova project in $(pwd)"

#cp $PLUGINDIR/test/index.html $TARGETDIR/testhttp/www/index.html

cd $WORKINGDIR


