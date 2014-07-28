Enable media .play() and autoplay in Cordova

Plugin to ensure that media playback works as anticipated.
Mobile browsers are using restrictions to prevent data
allowance wastage - that silently ignore .play() and autoplay
on audio and video tags.

Tested only against loading files over HTTP: results may vary
when using app package assets.

Support for:

* Android only (at present)
  Discussion here of issue here:
   https://code.google.com/p/chromium/issues/detail?id=178297



 
