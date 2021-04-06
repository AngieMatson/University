#Programa que imprima la parte entera y decimal por aparte de un número ingresado por el usuario
#Definir variables
decimal = float(input("Ingrese un número decimal = "))
print()
#Proceso separar parte entera
entero = int(decimal)
print("La parte entera es = " + str(entero) + "\n")
#Proceso para separar la parte decimal de la entera
decimal2 = float(entero - decimal)
print("La parte decimal es = " + str(decimal2) + "\n")