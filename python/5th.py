# conditionals statements
a = 20
b = 20
if a > b:
    print("a is bigger")
elif a == b:
    print("They are equal")
elif b > a:
    print("b is bigger")
else:
    pass
print('\n')
# shorthand if statements

x = 1
y = -2
print("x is bigger") if (x > y) else print("they are equal") if (y == x) else print("y is bigger") if (
            x < y) else print("ok")
