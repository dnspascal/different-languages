# loops
i = 0
while i<6:
    i += 1
    if i == 3:
        continue
    print(i)
else:
    print("now i is greate than six")
print('\n')
# for loop
fruits=['mango','banana','peach','strawberry','cherry','pineapple','apple','watermelon','cucumber','orange']
for x in fruits:
    if x == 'banana':
        continue
    print(x)
print('\n')
# the range() function start at 0 by default and increment by one by default and ends at specified value
for index in range(20,50,5):
    print(index)
else:
    print("Finally Finished!!")

wanyama = ['omega','salim','karata','denis','frank']
courses = ['IS143','IS158','IS171','IS181','CS175','CS173','DS113']
marks = ['A']
marks2 = ['B']
marks3 = ['C']
for a in wanyama:
    for b in courses:
        for c in marks:
            for d in marks2:
                for e in marks3:
                    pass
                    print(a,b,c,d)
    print('\n')