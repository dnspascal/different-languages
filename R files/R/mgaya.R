age<-29
if(!(age>18)){
  cat("you are too young")
}else if (age>18 && age <=60){
 print("young guy") 
}else if(age==36 || age<=60){
  print("you are middle age person")
}else{
  print("you are too old")
}
