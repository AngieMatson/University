#Programa que lea un número e indique si este es par-positivo, par-negativo, impar-positivo o impar-negativo
#Definir variables
number = int(input("Ingrese un número = "))
if ( number >= 0) and (number % 2 == 0):
    print("El número" + " " + str(number) + " " + "es positivo y par." + "\n")
else:
    if (number < 0) and (number % 2 == 0):
        print("El número" + " " + str(number) + " " + "es negativo y par." + "\n")
    else:
        if (number >= 0) and (number % 2 != 0):
            print("El número" + " " + str(number) + " " + "es positivo e impar." + "\n")
        else:
            if (number < 0) and (number % 2 != 0):
                print("El número" + " " + str(number) + " " + "es negativo e impar." + "\n")
print("¡El programa ha finalizado con éxito!" + "\n")