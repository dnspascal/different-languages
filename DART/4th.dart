import 'dart:mirrors';
main() {
 var someInt = 1;
 print(reflect(someInt).type.reflectedType.toString()); // prints: int
}