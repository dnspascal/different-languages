<?php
class fruit{
    public $name;
//    public $color;

    function set_name($name){
        $this->name=$name;
    }

    function get_name(){
        return $this->name;
    }
}

$apple =new fruit();
 
$apple->set_name("apple");
echo $apple->get_name();
