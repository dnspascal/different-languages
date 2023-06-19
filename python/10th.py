# lambda function
def my_lambda(n):
    y = lambda a: a * n
    return y


var = my_lambda(11)
print(var(12))
