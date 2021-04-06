#Programa que dado un número menor a un 100.000 determine la cantidad de dígitos que tiene. Por ejemplo 1093 tiene 4 dígitos.
#Defoinir variables
number = int(input("Ingrese un número menor a 100000 = ")) # Definir Entrada
contador = 0
while number != 0:
    number = number // 10
    contador += 1
print("La cantidad de dígitos del número ingresado son = " + str(contador) + " " + "dígitos") 