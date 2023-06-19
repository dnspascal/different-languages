void main(){
final hoursSinceMidnight = DateTime.now().hour;
print(hoursSinceMidnight);
print(hoursSinceMidnight.runtimeType);
print(hoursSinceMidnight is double);
var integer=100;
var decimal= 12.3;
integer=decimal.toInt();
print(integer);

//CHANGING DATA TYPE AT RUNTIME
const firstNumber=10;
const secondNumber=12.34;
final total=(firstNumber+secondNumber).toInt();
print(total);

//TYPE CASTING FROM NUM TO INTEGER
num someNumber=3;
final someInt=someNumber as int;
print(someInt.isEven);
}