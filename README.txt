To run the executable jar file, run the command:
java –cp ./porta.jar ie.gmit.sw.MenuRunner

This project contains for classes:
MenuRunner.java
FileParse.java
Decrypt.java
PortaCipher.java

The first class contains a basic Menu accessed via the command prompt.
The second class contains a URL/file parser, which breaks down what is read in into
characters. It is then passed to the 'Decrypt.java' class. The 'FileParse.java' class
also writes out what is returned from 'Decrypt.java' into a file.
The third class decrypts the read in characters using unicode and the 'PortaCipher.java' class.
The final class just contains the tableau which is given to us.
Each class, contains a number of methods, each stating the running time (Big O Notation).

Once this program is ran, you will be prompted with the options to parse a file or exit.
When parsing a file, you must enter the name of the file including '.txt'.
When parsing a URL, you must include the 'www.' or 'http.'.
After this, you will be prompted to enter the key you wish to encrypt the file with.
Once you enter the file/URL and key, you will be told the running time (in ms), and your
encrypted file will be created (output.txt).
To decrypt, simply run the program again but this time enter 'output.txt' to be parsed,
but make sure to use the same key as before.