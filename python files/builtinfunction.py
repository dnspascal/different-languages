#the "abs function" result the positive number
import

a=-12
print(abs(a))
# abs=absolute function

#round() function round of the number to its nearest
b=34.56
c=34.99
d=34.11
e=34.49
print(round(b),"\t", round(c),"\t", round(d),"\t", round(e))

#rounding off to the desired number of decimal places
f=34.345677787
g=34.997857697
#round off to 2 and 4 decimal places respectively
print(round(f,2),"\t",round(g,4)) 

#second parameter  can be negative  and it round off the number before the decimal places
h=34353637.67786564
j=34753637.675844986
print(round(h,-3),"\t",round(j,-6))
#max and min function returns the maximum value and the minimum value respectively
print("\n\n")
print(max(a,b,c,d,e,f,g,h,j))
print(min(a,b,c,d,e,f,g,h,j))