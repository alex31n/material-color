# Material Color

![Download](https://api.bintray.com/packages/alex31n/Material-Color/material-color/images/download.svg) 

A set of colors based on Google's Material Design for android projects. Colors are found via XML or Java class. 

&nbsp;

### Use
Material color resource 
* XML: `@color/md_red_100`, `@color/md_orange_A100`
* Java: `MaterialColor.MD_RED_100`, `MaterialColor.MD_ORANGE_A100`


Normal color resource 
* XML: `@color/aqua`, `@color/yellow`
* Java: `Color.AQUA`, `Color.YELLOW`

&nbsp;&nbsp;

### Install           


#### Gradle 

```

dependencies {
        compile 'com.github.alex31n:material-color:1.0'
}

```
&nbsp;
#### Maven

```

<dependency>
    <groupId>com.github.alex31n</groupId>
    <artifactId>material-color</artifactId>
    <version>1.0</version>
    <type>pom</type>
</dependency>

```
&nbsp;
### Some useful method
|Method Name | Params| Return|
| ---------- | :---: | ----- |
|getRandomMaterialColor  |-| int|
|getRandomMaterialColor | size of array |int[]|
|getRandomMaterialColorDark |-| int|
|getRandomMaterialColorLight |-| int|
|getColors | - |int[]|


&nbsp;
### Material color names
* red
* pink
* purple
* deeppurple
* indigo
* blue
* lightblue
* cyan
* teal
* green
* lightgreen
* lime
* yellow
* amber
* orange
* deeporange
* brown
* grey
* bluegrey

&nbsp;

## License
    Copyright 2017 Alex
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and limitations under the License.
    
