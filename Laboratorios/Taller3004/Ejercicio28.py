#Programa que lea dos números y determine el mayor de ellos.
#Definir variables
number1 = float(input("Ingrese el primer número = "))
number2 = float(input("Ingrese el segundo número ="))
#Proceso
if number1 > number2:
    print(str(number1) + " " + "es mayor que" + " " + str(number2))
else:
    print(str(number2) + " " + "es mayor que" + " " + str(number1))