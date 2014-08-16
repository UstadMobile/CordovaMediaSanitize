Enable media .play() and autoplay in Cordova.  Avoid thread leak.

Issue 1:
Plugin to ensure that media playback works as anticipated.
Mobile browsers are using restrictions to prevent data
allowance wastage - that silently ignore .play() and autoplay
on audio and video tags.

Tested only against loading files over HTTP: results may vary
when using app package assets.

Issue 2:
Android leaks Timer Threads with every page that has audio tags - see:
https://code.google.com/p/android/issues/detail?id=28723

Borrowed from:
https://github.com/WaniKani/Android-Notification/blob/master/src/com/wanikani/androidnotifier/TimerThreadsReaper.java
To cleanup those threads

===Usage===
See the folder 'test' or use test/makesample.sh to make a demo project

Support for:

* Android only (at present)
  Discussion here of issue 1:
   https://code.google.com/p/chromium/issues/detail?id=178297



 
