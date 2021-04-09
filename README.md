# Jetpack Navigation Fragment
A simple project reproducing issue with Jetpack Navigation and Jetpack Fragment 1.3.2.

Prior to the 1.3.2 update, when using Jetpack Navigation with animation, when going back, the animation looked correctly.
Old fragment was animating out at the same time as the new fragment is animated in.

You can see that in this GIF, or by building sources yourself and changing included Jetpack Fragment version from `1.3.2` to `1.3.1`.

![Correct Behaviour of Fragment 1.3.1](https://raw.githubusercontent.com/lukas1/Hilt-Navigation-Issue/master/correct-1-3-1-behaviour.gif)

Unfortunately starting with update `1.3.2`, this behaviour is now broken. The screen user returns to is displayed immediately behind the original screen.
If the original screen has transparent background, it creates undesired visual artifact, as can be seen in this GIF:

![Incorrect Behaviour of Fragment 1.3.2](https://raw.githubusercontent.com/lukas1/Hilt-Navigation-Issue/master/incorrect-1-3-2-behaviour.gif)
