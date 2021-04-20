def maximo(x,y):
  if x>y:
    return x
  else:
    return y

def minimo(x,y):
  if x<y:
    return x
  else:
    return y

#programa principal
x=int(input("Ingrese un número: "))
y=int(input("Ingrese otro número: "))
print(maximo(x-3, minimo(x+2, y-5)))
