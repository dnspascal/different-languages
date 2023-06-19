# the try/except block allows you do something an recover if something went wrong
def try_try(fruit_name):
    fruits = ['mangoes', 'banana', 'pumpkin', 'apple', 'watermelon', 'papaya', 'tamarind', 'pineapple']
    try:
        print(fruits[fruit_name])
    except:
        print('whoops,something went wrong')
        print('maybe, we don\'t have such kind of fruit  ')
    else:
        print('we got your fruit')
        print('we are still working on it')
    return fruit_name


print(try_try(0))
