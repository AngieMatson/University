contador = 1
suma = 0
while contador <= 3:
    nota = float(input("Ingrese la nota" + " " + str(contador) + " = "))
    if (nota >= 0) and (nota <= 10):
            if contador == 1:
                suma += nota
            if contador == 2:
                suma += nota
            if contador == 3:
                suma += nota
            contador += 1
            promedio = suma / 3
if promedio >= 7:
    print("Obtuvo un promedio de " + str(promedio) + " y es promocionado.")
elif promedio >= 4 and  promedio < 7:
    print("Obtuvo un promedio de " + str(promedio) + " y es regular.")
else:
    print("Obtuvo un promedio de " + str(promedio) + " y no está habilitado.")  