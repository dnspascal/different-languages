my_list=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
print(my_list[0:len(my_list):2]) #last argument stands for the steps 
print(my_list[::5])#same thing
#copy is an built in function that copies the value from one variable to the other 
letters=my_list.copy()
print(letters)

for letter in[1,2,3,4,5]:
	letters.insert(0,letter)
print(letters)
#if we want to insert items at the multiple items in yhe middle of the loop
index=4
for number in[6,7,8,9,0]:
 letters.insert(index,number)
 index+=4
print(letters)