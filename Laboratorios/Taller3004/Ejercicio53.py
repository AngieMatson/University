'''Programa que permita leer una cantidad variable de números
y nos indique cuantos fueron mayores a 100 y cuántos menores a 100'''
contador = 1
contador2 = 0
contador3 = 0
menores = []
mayores = []
agregar = "si"
while agregar == "si":
    number = int(input("Ingrese un número " + " " + str(contador) + " = "))
    agregar = str(input("¿Quieres ingresar otro número? si o no = "))
    if number > 100:
        mayores.append(number)
        contador2 += 1
    else:
        if number < 100:
            menores.append(number)
            contador3 += 1
    contador += 1
    if agregar == "no":
        break
print("Hay" + " " + str(contador3) + " " + "números menores a 100 y estos son = " + str(menores))
print("Hay" + " " + str(contador2) + " " + "números mayores a 100 y estos son = " + str(mayores))
