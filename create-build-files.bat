:: Build all needed files for ant compilation
:: Norbert Nagold (2011)
:: You must:
::  - Have installed the Android SDK,
::  - Have added android to the PATH system variable.

android update lib-project -p deps\showcaseview
android update lib-project -p deps\appcompat
android update project -p . -n AnkiDroid -s
