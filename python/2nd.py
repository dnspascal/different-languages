# tuples are unchangeable
myTuple = ('Toyota', 'Mercedes', 'Ford', 'Lambo', 'Ferrari', 'Bugatti', 'Chevrolet', 'Tesla')
# Changing the tuple to list
myList = list(myTuple)
myList.append("Range")
# converting the list to the tuple
myTuple2 = tuple(myList)
for x in myTuple2:
    print(x)
print(type(myTuple2))
print(type(myList))
print(type(myTuple))
print(myTuple)
print(myList)
