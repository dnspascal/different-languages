brands=['toyota','ford','lamborghin','benz','chevrolet']
try:
#the remove function take off the item in the list and return nothing
	brands.remove('crown')
	print('the brand was present and removed ')
except:
    print("there is no such a brand")
else:
	print(brands)


#unpacking the list
#means making the new list inside the big list
#use asterik (*)
#list with no astrick can take only one item from the list
starting_list, *another_list=brands
print(starting_list)
print(*another_list)

first_list,*middle_list,final_list=brands
print(first_list)
print(*middle_list)
print(final_list)