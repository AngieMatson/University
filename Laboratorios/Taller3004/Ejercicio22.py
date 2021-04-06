#Programa que lea un número y determine si es par o impar.
#Definir variables y proceso con ciclo
agregar = "true"
while agregar == "true":
    numero = int(input("Ingrese un número = "))
    if numero > 0:
        if numero % 2 == 0:
            print("El número" + " " + str(numero) + " " + "es par." + "\n")
        else:
            if numero % 2 != 0:
                print("El número" + " " + str(numero) + " " + "es impar." + "\n")
        agregar = str(input("¿Quieres ingresar otro número? true o false = "))
    else:
        print("El número ingresado es negativo, no se permiten número negativos." + "\n")
print("¡El programa ha finalizado con éxito!" + "\n")