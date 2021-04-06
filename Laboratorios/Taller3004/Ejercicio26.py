#Programa que lea un número y si este es mayor o igual a 10 devuelva el triple de este, de lo contrario la cuarta parte de este
#Definir variables
number = int(input("Ingrese un número = "))
#Proceso
if number >= 10:
    total = number * 3
    print("El resultado de" + " " + str(number) + " " + "al triple es = " + str(total))
else:
    total = number / 4
    print("El resultado de la cuarta parte de" + " " + str(number) + " " + "es = " + str(total))