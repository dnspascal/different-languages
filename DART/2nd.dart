class Employee { 
 String name = ""; 
 //getter method 
 String get emp_name { 
 return name; 
 } 
 
 //setter method
 void set emp_name(String name) { 
 this.name = name; 
 } 
 
 //function definition
 void result()
 {
 print(name);
 }
 
} 
void main() { 
 //object creation
 Employee emp = new Employee(); 
 emp.name="Linah Mbilinyi";
 emp.result(); //function call
}
