# Hilt-Navigation-Issue
A simple project reproducing Dagger.Hilt 2.34 issue with Jetpack Navigation.


Prior to the 2.34 update, when using Jetpack Navigation with animation, when going back, the animation looked correctly.
Old fragment was animating out at the same time as the new fragment is animated in.

You can see that in this GIF, or by building sources yourself and changing included Dagger.Hilt version from `2.34` to `2.33`

![Correct Behaviour of Dagger.Hilt 2.33](https://raw.githubusercontent.com/lukas1/Hilt-Navigation-Issue/master/correct-2-33-behaviour.gif)

Unfortunately starting with update 2.34, this behaviour is now broken. The screen user returns to is displayed immediately behind the original screen.
If the original screen has transparent background, it creates undesired visual artifact, as can be seen in this GIF:

![Incorrect Behaviour of Dagger.Hilt 2.34](https://raw.githubusercontent.com/lukas1/Hilt-Navigation-Issue/master/incorrect-2-34-behaviour.gif)
