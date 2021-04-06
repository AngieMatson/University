#Programa que lea una cantidad variable de números e indicar el promedio de los números pares y el promedio de los números impares.
contador1 = 0
suma1 = 0
contador2 = 0
suma2 = 0
contador3 = 1
mas = "si"
while mas == "si": #Bucle para que itere hasta que el usuario lo desee
    number = int(input("Ingrese un número # " + str(contador3) + " = "))
    mas = str(input("¿Quieres ingresar más números? si o no = "))
    if mas == "si":
        if number % 2 == 0:
            suma1 = suma1 + number
            contador1 += 1
        else:
            suma2 =  suma2 + number
            contador2 += 1
        contador3 += 1
promedioPar = suma1 / contador1
promedioImpar = suma2 / contador2
print("El promedio de los números pares es = " + " " + str(promedioPar) + " y " + "el promedio de los números impares es = " + " " + str(promedioImpar))