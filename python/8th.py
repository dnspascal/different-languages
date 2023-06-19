class person:
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def my_func(self):
        print("Hello my name is " +""+ self.name)


p1 = person("Denis", 21)
p1.my_func()
print(p1.name,'\t', p1.age)
del p1.age
