brands=['nike','Airforce','adidas','macqueen','jordan','puma','rebook','fila','yeezy','balenciaga']
brands1=brands
del brands[1]
#pop function takes only one argument
print(brands1.index('balenciaga'))
print(brands.index('adidas'))
brands1.pop(0)
print(brands)
print('\n\n')
print(brands1)