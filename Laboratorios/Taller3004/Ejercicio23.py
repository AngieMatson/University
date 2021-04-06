#Programa que lea un número y determine si es positivo o negativo
#Definir variables
number = int(input("Ingrese un número = "))
print()
#Proceso
if number > 0:
    print("El número" + " " + str(number) + " " + "es positivo." + "\n")
else:
    if number <0:
        print("El número" + " " + str(number) + " " + "Es negativo." + "\n" )
print("¡El programa ha finalizado con éxito!" + "\n")