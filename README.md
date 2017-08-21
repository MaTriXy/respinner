# ReSpinner

[![](https://jitpack.io/v/santalu/respinner.svg)](https://jitpack.io/#santalu/respinner) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ReSpinner-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/6074)

Android's regular spinner can be really annoying sometimes. Unwanted calls during initialization, doesn't let user to select same item etc. </br>
Respinner is a simple spinner which supports item click events. You can set item click listener.

## Samples

<img src="https://github.com/santalu/respinner/blob/master/screens/sample.gif"/>

## Usage

### Gradle
```
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```
```
dependencies {
  compile 'com.github.santalu:respinner:1.0.0'
}
```

### XML
```xml
<com.santalu.respinner.ReSpinner
    android:id="@+id/spinner"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```
## Notes

* ```setSelection(position, false)``` will change the selection but doesn't trigger click event

## License
```
Copyright 2017 Fatih Santalu

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
