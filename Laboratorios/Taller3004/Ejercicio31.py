#Programa que lea tres números y determine si la suma del primero y el segundo es mayor o menor que el tercero
#Definir variables
number1 = float(input("Ingrese el primer número = "))
number2 = float(input("Ingrese el segundo número = "))
number3 = float(input("Ingrese el tercer valor = "))
#Proceso
total = number1 + number2
if total > number3:
    print("La suma de los dos primero números es mayor que el tercer número ingresado, la suma total es = " , total)
else:
    if total < number3:
        print("La suma de los dos primero números es menor que el tercer número ingresado, la suma total es = " , total)
    else:
        if total == number3:
            print("La suma de los dos primero números es igual al tercer número ingresado, la suma total es = " , total)