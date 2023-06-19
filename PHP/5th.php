<?php
// strings
$myString = "Hello denis !";
// string length
$x = strlen($myString);
// searches the string within the big string
$y = strpos($myString, "!");
// repeat the string as many timees as you want
$z = str_repeat($myString, 10);
// replace takes 3 arguments
$a = str_replace("denis", "mgaya", $myString);
echo"$x <br>";
echo "$y<br>";
echo "$z<br>";
echo "$a<br>";
// counts number of words in a string
echo (str_word_count($myString).'<br>');
// reverses words
echo(strrev($myString));


?>