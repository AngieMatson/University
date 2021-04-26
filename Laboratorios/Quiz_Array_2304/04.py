#EJERCICIO - MEJORA 1
datos = []
limite = int(input("¿Cuántos números desea ingresar? = "))
for i in range(0,limite):
    n=(int(input("Ingrese un número = ")))
    datos.append(n)
print(datos)
#EJERCICIO 2
datoss= [2, -10, 52, 1012]
for i in range(0, len(datoss)):
    print(datoss[i], end=" ")
print()
#EJERCICIO 3
datos  = []
datoss = datos.insert(1, 11)
for i in range(0, len(datos)):
    print(datos[i], end=" ")
print()
#EJERCICIO 4
datos = [1,5,99,2]
datos.remove(5)
for i in range(0, len(datos)):
    print(datos[i], end=" ")
print()
#EJERCICIO 5
datos = []
datos = datos + [21, 22]
for i in range(0, len(datos)):
    print(datos[i], end=" ")
print()


