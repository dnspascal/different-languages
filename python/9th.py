# inheritance
# parent class
class Person:
    def __init__(self, fname, lname):
        self.f = fname
        self.l = lname

    def printname(self):
        print(self.f + " " + self.l)


x = Person("Denis", "Mgaya")
x.printname()


# child class
class Student(Person):
    pass


obj = Student("Davis", "Pascal")
obj.printname()
