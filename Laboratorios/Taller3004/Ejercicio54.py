'''Progrma que permita leer una cantidad variable de números indicando finalmente lo siguiente:
cuántos números fueron positivos
• cuántos fueron negativos
• cuantos fueron pares
• cuantos fueron impares
• cuántos fueron múltiplos de ocho'''
contador = 1
contador2 = 0
contador3 = 0
contador4 = 0
contador5 = 0
negativos = []
pares = []
impares = []
mOcho = []
agregar = "si"
while agregar == "si":
    number = int(input("Ingrese un número " + " " + str(contador) + " = "))
    agregar = str(input("¿Quieres ingresar otro número? si o no = "))
    if number < 0:
        negativos.append(number)
        contador2 += 1
    else:
        if (number % 2 == 0) and (number // 8 != 0):
            pares.append(number)
            contador3 += 1
            mOcho.append(number)
            contador5 += 1
        else:
            if number % 2 != 0:
                impares.append(number)
                contador4 += 1
    contador += 1
    if agregar == "no":
        break
print("Hay" + " " + str(contador2) + " " + "números negativos y esos son =" + str(negativos))
print("Hay" + " " + str(contador3) + " " + "números pares y esos son =" + str(pares))
print("Hay" + " " + str(contador5) + " " + "números múltiplos de ocho y esos son =" + str(mOcho))
print("Hay" + " " + str(contador4) + " " + "números impares y esos son =" + str(impares))