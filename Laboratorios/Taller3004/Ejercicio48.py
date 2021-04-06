#Programa que determine la suma de los números naturales contenidos entre dos números n y m (verificar que m>n)
suma = 0
number1 = int(input("Ingrese el primer número = "))
number2 = int(input("Ingrese el segundo número = "))
if number2 > number1:
    for i in range(number1,number2):
        suma = suma + i
    print("La suma de los números naturales que hay entre los dos números ingresados es = ", suma)
else:
    print("El segundo número debe ser mayor que el primero porque es el límite.")