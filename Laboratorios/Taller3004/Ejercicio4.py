#Programa que de por pantalla suma, resta, multiplicación, divisón de dos números ingresados por el usuario
#Definir variables
number1 = float(input("Ingrese el primer número = ") )
number2 = float(input("Ingrese el segundo número = "))
print()
#Procesos
def calculadora(number1,number2):
    print("El resultado de la suma es = " + str(number1 + number2) + "\n")
    print("El resultado de la resta es = " + str(number1 - number2) + "\n")
    print("El resultado de la multiplicación es = " + str(number1 * number2) +"\n")
    print("El resultado de la división es = " + str(number1 / number2) + "\n")
    print("El resultado del módulo es = " + str(number1 % number2) + "\n")
calculadora(number1,number2)