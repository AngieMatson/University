#Programa que lea 10 números y calcule su suma y su promedio.
contador = 1
suma = 0
while contador <= 10: #Ciclo
    number = int(input("Ingrese la nota" + " " + str(contador) + " = "))
    if contador == 1:
        suma += number
    if contador == 2:
        suma += number
    if contador == 3:
        suma += number
    if contador == 4:
        suma += number
    if contador == 5:
        suma += number
    if contador == 6:
        suma += number
    if contador == 7:
        suma += number
    if contador == 8:
        suma += number
    if contador == 9:
        suma += number
    if contador == 10:
        suma += number
    contador += 1
print("El promedio de las notas es =" + " " +str(suma/10))
