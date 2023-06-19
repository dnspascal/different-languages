<?php
$x = 10;
$z = 20;
function mytest(){
    $GLOBALS['y'] = $GLOBALS ['x'] + $GLOBALS['z'];
}
mytest();
echo $y;
?>
//var_dump checks the data type of the variable
<?php
$x = 10.365;
var_dump($x);
?>