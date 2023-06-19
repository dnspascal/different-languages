<?php
$x = 10.365;
echo(var_dump($x));
// constants in php are automatically global
const GREETING = "Hello goldie ";
echo(GREETING);
// constant arrays

const cars = ["Mustang", "porch", "volkswagen","ferrari", "Lamborghini", "Bugatti"];
for($x = 0; $x <= count(cars) ;++$x){
echo(cars[$x]." ");
}
