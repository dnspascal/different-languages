#sets are unordered and unindexed
mySet={'denis','karata','ndagula','salim','omega'}
# adding one item in the set
mySet.add("mgaya")
# adding more than one item use the function update
mySet.update(['Heri','Frank','Lugata','Mchomvu'])
# To remove an item use the remove function or discard function
# difference between discard and remove , if the item to be removed is not present discard wont raise an error

mySet.remove('denis')
mySet.discard('mgaya')
mySet.discard('johngora')
# using pop function to remove the last item in the set
x=mySet.pop()
print("poped item is\t"+x)
print('\n')
print(mySet)
print(type(mySet))
for x in mySet:
    print(x)
print('\n')
print('\n')

firstSet={1,2,3,4,5,6,7,8,9,0}
secondSet={4,6,5,8}
#checking the subset of the set
y=secondSet.issubset(firstSet)
#other function of sets in python

#symmetric_difference()  
#symmetric_difference_update()
#rdifference()
#difference_update()
#issuperset()
#isdisjoint()
#intersection()
#intersection_update()
#union()

print(y)

