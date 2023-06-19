

void main(){
  //STRINGS
  //UTF-16 ENCODING
  var greeting= "Hello";
  print(greeting.codeUnits);
  //FOR CHARACTERS GREATER THAN 655336 WEW USE RUNES FOR SIMPLICITY RATHER THAN SORROUGATE PAIR
  var dart = '🎯';
  print(dart.runes);
  //STRING CONCATENATION
  final message = StringBuffer();
message.write("my name");
message.write(" is denis");
message.write("  I study computer scince");
message.toString();
print(message);


//STRIMG INTERPOLATION
var myName="denis";
print("My name is $myName");

//TYPE OBJECT
Object? name="denis"; print(name);
name=12;
print(name);

}