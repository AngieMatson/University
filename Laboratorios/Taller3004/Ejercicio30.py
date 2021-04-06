#Programa que lea tres números y determine el mayor y el menor de ellos.
#Definir variables
number1 = float(input("Ingrese el primer número = "))
number2 = float(input("Ingrese el segundo número = "))
number3 = float(input("Ingrese el tercer número = "))
#Proceso
if (number1 > number2) and (number1 > number3) and (number2 > number3):
    print("El número mayor es = " + str(number1) + " y el número menor es = " + str(number3) + "\n")
else:
    if (number1 > number2) and (number1 > number3) and (number3 > number2):
        print("El número mayor es = " + str(number1) + " y el número menor es = " + str(number2) + "\n")
    else:
        if (number2 > number1) and (number2 > number3) and (number1 > number3):
            print("El número mayor es = " + str(number2) + " y el número menor es = " + str(number3) + "\n")
        else:
            if (number2 > number1) and (number2 > number3) and (number3 > number1):
                print("El número mayor es = " + str(number2) + " y el número menor es = " + str(number1) + "\n")
            else:
                if (number3 > number1) and (number3 > number2) and (number2 > number1):
                    print("El número mayor es = " + str(number3) + " y el número menor es = " + str(number1) + "\n")
                else:
                    if (number3 > number1) and (number3 > number2) and (number1 > number2):
                        print("El número mayor es = " + str(number3) + " y el número menor es = " + str(number2) + "\n")
print("El programa finalizó con exitosamente" + "\n")
