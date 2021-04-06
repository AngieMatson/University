''' Programa que le solicite al usuario un número entero positivo, si el usuario digita un valor no permito, 
le debe volver a pedir el número. Una vez ingrese un valor válido deberá imprimir dicho valor '''
agregar = "si"
while agregar == "si":
    number = int(input("Ingrese un número = "))
    if number > 0:
        print("El número ingresado es = ", number)
        break
    else:
        print("No se pueden ingresar número negativos, vuélvalo a intentar")