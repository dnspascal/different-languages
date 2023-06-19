//traits in php

<?php 
trait message2{
    public function msg2(){
        echo"OOP reduces code duplication!";
    }

}

trait message1{
    public function msg1(){
        echo "OOP is fun";
    }
}



class MyClass{
    use message2;
    use message1;

}

$obj = new MyClass();
$obj->msg1();
$obj->msg2();
?>