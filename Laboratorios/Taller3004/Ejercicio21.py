#Programa que dado un numero de 4 cifras, reordene sus dígitos de manera inversa. Por ejemplo 3245 ---> 5423
#Definir variables
mas = "true"
#Proceso
while mas == "true":
    numero = int(input("Ingrese un número de 4 cifras = "))
    if (numero >= 1000) and (numero <= 9999):
        #El módulo se usa para poder tener la última cifra
        n4 = numero % 10
        n3 = int((numero % 100) / 10)
        n2 = int((numero % 1000 / 100))
        n1 = int((numero - (numero % 1000)) / 1000)
        print("El número inverso es = " + str(n4) + str(n3) + str(n2) + str(n1) + "\n")
        mas = str(input("¿Quieres ingresar más números? true o false = "))
    else:
        print("Número ingresado es menor o mayor a un número de 4 cifras" + "\n")
print("¡El programa ha finalizado con éxito!" + "\n")
