#tuples are more like lists but they use parantheses which are optional too
#tuples are immutable you cant change the structure of tuples
#you can change tuple to a list and  list to a tuple
t=1,2,4,5 #this is tuple
print(t)
#changing the tuple to a list 
list(t)
print(t)


def quo_rem(dividend, divisor):
 if not isinstance(dividend, int):
     raise TypeError("dividend must be an integer")
 if not isinstance(divisor, int):
     raise TypeError("divisor must be an integer")
 if divisor == 0:
     raise ZeroDivisionError("divisor is 0")
 return dividend // divisor, dividend % diviso

 print(quo_rem(11, 4))
