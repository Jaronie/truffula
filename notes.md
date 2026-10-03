# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java

This file runs a Java application that prints a directory tree. The root directory is referred to as what part of the directory the path begins at. <strong>"home/x/y"</strong> for example, "home" is the root directory - x & y are the descendant files.

<br>
The behavior of the application contains options for creating a directory tree. Such as:
<br>
<ul> 
<li> The option to show hidden files
<li> The option to use colored output.
<li> The root directory. (Where the path begins.)
</ul>

## ConsoleColor.java

This file contains color variables to be used for console output.

With the use of ANSI escape codes stored in enum variables, these codes represent colors.



## ColorPrinter.java / ColorPrinterTest.java

ColorPrinter.java / Has functionality to get colors from ConsoleColor and set them to the current stream of output. Every newline resets the color to default unless set otherwise with the use of the "reset" boolean.

ColorPrinterTest.java / Tests the functionality of ColorPrinter.java using JUnit framework. 

## TruffulaOptions.java / TruffulaOptionsTest.java
TruffulaOptions.java / contains functionality for how a directory tree is printed in the terminal. The options correspond to the options in App.java, and with use of basic flags like -
   * Supported Flags:
   * - -h   : Show hidden files (defaults to false).
   * - -nc  : Do not use color (uses color by default).

TruffulaOptionsTest.java runs JUnit Tests for TruffulaOptions.java by ensuring that the use of it is correctly set.

## TruffulaPrinter.java / TruffulaPrinterTest.java
TruffulaPrinter.java / Prints a directory tree with desired options such as colored output and/or showing hidden files.

TruffulaPrinterTest.java / Builds an example directory and checks for the OS. Tests TruffulaPrinter.java's functionality to compare its output of the example directory.


## AlphabeticalFileSorter.java

This file functions to sort files in the supposed directory, making things organized!