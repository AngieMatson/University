#Programa que lea 3 números e indique si al menos 2 de ellos son iguales.
number1 = int(input("Ingrese el primer número = ")) #Definir entradas
number2 = int(input("Ingrese el segundo número = "))
number3 = int(input("Ingrese el tercer número = "))
if (number1 == number2) or (number1 == number3) or (number2 == number1) or (number2 == number3): #Establecer condiciones
    print("Al menos 2 de los número ingresados son iguales.")
else:
    if (number1 != number2) or (number1 != number3) or (number2 != number1) or (number2 != number3):
        print("No hay al menos 2 número iguales.")