<?php

use MyClass as GlobalMyClass;

class MyClass{
  protected static function getWebsiteName(){

    return "w3Schools.com";
  }  
}

class MyClass2 extends MyClass{
    public $websiteName;
    public function __construct()
    {
     $this->websiteName = parent::getWebsiteName();   
    }
}




?>