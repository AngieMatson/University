#Programa que dado un número determine la cantidad de números entre los cuales se puede dividir es decir sus factores.
number1 = []
agregar = "si"
while agregar == "si":
    number = int(input("Ingrese un número = "))
    for i in range (1,number + 1):
        if number % i == 0:
            number1.append(i)
    print("Los divisores de" + " " + str(number) + " " + " son = " + str(number1))
    agregar = str(input("¿Quieres ingresar un nuevo número? si o no =  "))
    if agregar == "no":
        break
print("El programa ha finalizado.")