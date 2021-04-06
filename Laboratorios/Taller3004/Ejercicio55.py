'''Programa que permita leer sólo números positivos hasta reunir 10 números pares o veinte veces el número 5. 
Indicar luego la totalidad de números leídos,
la cantidad de pares, de impares y la cantidad de números 5.'''
contador = 0
contadorPar = 0
contadorImpar = 0
contadorCinco = 0
agregar = "si"
while agregar == "si":
    number = int(input("Ingrese un número para calcular los 10 números pares(se puede ingresar varias veces el 5) "+ " " + str(contador) + " = "))
    if number % 2 == 0:
        contadorPar += 1
    else:
        if number == 5:
            contadorCinco += 1
        else:
            if number % 2 != 0:
                contadorImpar += 1
    contador += 1
    if contadorPar == 10:
        break
    if contadorCinco == 20:
        break
print("Hay" + " " + str(contador) + " " + " números en total." + "\n" + "Hay" + " " + str(contadorPar) + " " + "números pares." + "\n" + "Hay" + " " + str(contadorImpar) + " " + "números impares." + "\n" + "Hay" + " "+ str(contadorCinco) + " " + "números 5.")