#Dictionaries unordered, changable and indexed
myDic = {
    'person1' : {
    'name' : 'Denis',
    'age' : 21,
    'course' : 'Artificial intelligence',
    'car' : 'mustang',
    'college' : 'coict',
    },
    'person2' : {
    'name':'Frank',
    'age': 21,
    'course' : 'Data science',
    'car':'Range',
    'college':'coict',
    },
    'person3' : {
    'name':'Salim',
    'age': 21,
    'course' : 'programming',
    'car':'ford',
    'college':'coict',
    },
    'person4' : {
    'name':'Karata',
    'age': 19,
    'course' : 'Data science',
    'car':'BMW',
    'college':'coict',
    },
   'person5' : {
    'name':'Omega',
    'age': 21,
    'course' : 'programming',
    'car':'Range',
    'college':'coict',
    }
}
for x,y in myDic.items():
    print(x,y)
print('\n')
# print(myDic.get('person1'))