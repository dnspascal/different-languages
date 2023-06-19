def division(index,divisor):
 y=index//divisor
 try:
		print(brands[y])
 except IndexError as error:
		print(f'Try again:\n{error}')
 except ZeroDivisionError:
		print("did you mean to divide by 0")
 except:
	    print('something went wrong')
 else:
		print('we have what you are looking for')
		print('we are working on it')
		print('welcome')
brands=['hp','dell','alienware','Macbook','lenovo','asus','mis','samsung','lg']
division(0,2)