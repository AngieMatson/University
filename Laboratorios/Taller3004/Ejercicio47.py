#Progama que imprima los números naturales contenidos entre dos números n y m (verificar que m>n).
number1 = int(input("Ingrese el primer número = "))
number2 = int(input("Ingrese el segundo número = "))
if number2 > number1:
    for i in range(number1,number2):
        print("Los números naturales que hay entre los números ingresados son =" + " " +  str(i))
else:
    print("El segundo número debe ser mayor que el primero porque es el límite.")