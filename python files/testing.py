x = "*150*00#"
a = "first"
b = "second"
c = "third"
d = "fourth"
e = "fifth"
f = "sixth"

y = input("enter the ussd code:")

if x == y:
    print("1.", a, "\n", "2.", b, "\n", "3.", c, "\n", "4.", d, "\n", "5.", e, "\n","6.", f, "\n")
else:
    print("invalid input")
z = int(input())
if z == 1:
    print('yes')
elif z == 2:
    print('no')
elif z == 3:
    print('big no')
elif z == 4:
    print('big yes')


