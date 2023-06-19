//ENUMS AND THE SWITCH CONTROL OF FLOW
enum Family {
  father,
  mother,
  child1,
  child2,
  child3,
}

void main() {
  var familyWinner = Family.mother;

  switch (familyWinner) {
    case Family.father:
      print("Father is the winner");
      break;
    case Family.mother:
      print("Mother is the winner");
      break;
    case Family.child1:
      print("Child one id the winner");
      break;
    case Family.child2:
      print("Child two is thw nwinner");
      break;
    case Family.child3:
      print("Last born id the winner");
      break;
    default:
      print("All mgaya family missed it");
  }

  print(Family.mother.index);
}
