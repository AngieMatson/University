#Programa que que permita resolver una ecuación cuadrática de tipo ax2 + bx + c 
#Definir variables
a = float(input("Ingrese el número de a = "))
b = float(input("Ingrese el número de b = "))
c = float(input("Ingrese el número de c = "))
#Definir proceso
discriminante = (b ** 2 ) - 4 * a * c
if discriminante < 0:
    print("La ecuación no tiene soluciones reales")
elif discriminante == 0:
    x = -b / (2*a)
    print("La solución es = ", x)
else:
    x1 = (-b - (discriminante ** 0.5)) / (2 * a)
    x2 = (-b + (discriminante ** 0.5)) / (2 * a)
    print("Las dos soluciones reales son = " + str(x1) + " y " + str(x2))