
#!/bin/bash

#
# Handy script to update working directory from the test project
# (where debugging etc is likely being done)

WORKINGDIR=$(pwd)
PATHTOPROJSRC=$WORKINGDIR/../../CordovaMediaSanity-TestProject/CordovaMediaSanityTestProjet/platforms/android/src/
REPOSRCDIR=$WORKINGDIR/../platforms/android/src

FILETOCOPY="com/ustadmobile/cordovamediasanity/CordovaMediaSanityPlugin.java
org/apache/cordova/CordovaMediaSanity.java 
com/wanikani/androidnotifier/TimerThreadsReaper.java"

for FILETOCOPY in $FILETOCOPY ; do
    cp -v $PATHTOPROJSRC/$FILETOCOPY $REPOSRCDIR/$FILETOCOPY
done





