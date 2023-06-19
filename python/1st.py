#lists
list1=['a','b','c','d']
#clear the list
list1.clear()
list1=[1,2,3,4,5,6]
# takes one argment and adds on the last part
list1.append(7)
smalllist=[8,9,10,11]
#takes one argument but with either more than one element and adds at the end of the list
list1.extend(smalllist)
#return the number of times the element has appeared in the list
y=list1.count(7)
#remove the specified value from the list
list1.remove(10)
#pop remove the element at specified position
list1.pop(0)
#insert the element at specified position
list1.insert(0,1)
list1.insert(9,10)
#reverse the order of the list
list1.reverse()
# sort the list either way
list1.sort(reverse=False)
print(list1)
print(y)
