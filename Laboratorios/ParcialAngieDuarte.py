import numpy as np
# Sólo se almacenan en listas
resultado = []
# Se definen por fuera por si se requiere testear con otros valores
min = 5
max = 7
semilla = []
while True:
    semilla = []  # Reiniciar semilla
    while True:
        digito = input("Ingrese un dígito o escriba (exit) si no quiere agg más = ")
        if digito.lower() == "exit":  # lower por si acaso se escribe con mayúsculas
            break
        semilla.append(digito)  # se agrega dígito a dígito en la lista
    # Principal Tester
    if len(semilla) > max:
        print("SEMILLA NO ACEPTADA" + "\n" + "ERROR: MÁXIMO DE DÍGITOS SOBREPASADO")
        continue
    elif len(semilla) < min:
        print("SEMILLA NO ACEPTADA" + "\n" + "ERROR: MÍNIMO DE DÍGITOS NO ALCANZADO ")
        continue
    else:
        print(semilla)
    if digito == "exit":
        break

# Verificar cuántas veces está repetido un dígito
for i in range(len(semilla)):
    for j in range(i + 1, len(semilla)):
        if semilla[i] == semilla[j]:
            print("El dígito " + str(semilla[i]) + " está repetido en las posiciones " + str(i) + " y " + str(j))

        # Verificar si hay números repetidos más de 3 veces
cont = 1
for i in range(1, len(semilla)):
    if semilla[i] == semilla[i - 1]:  # Se resta porque se inicializa en 1 y así poder comparar
        cont += 1
        if cont >= 3:
            print("SEMILLA NO VÁLIDA" + "\n" + "ERROR: HAY MÁS DE 3 DÍGITOS REPETIDOS ")
    else:
        cont = 1
        break  #

semilla2 = []
while True:
    semilla2 = []  # Reiniciar semilla
    while True:
        digito = input("Ingrese un dígito o escriba (exit) si no quiere agg más = ")
        if digito.lower() == "exit":  # lower por si acaso se escribe con mayúsculas
            break
        semilla2.append(digito)  # se agrega dígito a dígito en la lista
    # Principal Tester
    if len(semilla2) > max:
        print("SEMILLA NO ACEPTADA" + "\n" + "ERROR: MÁXIMO DE DÍGITOS SOBREPASADO")
        continue
    elif len(semilla2) < min:
        print("SEMILLA NO ACEPTADA" + "\n" + "ERROR: MÍNIMO DE DÍGITOS NO ALCANZADO ")
        continue
    else:
        print(semilla2)
    if digito == "exit":
        break

# Verificar cuántas veces está repetido un dígito
for i in range(len(semilla2)):
    for j in range(i + 1, len(semilla2)):
        if semilla2[i] == semilla2[j]:
            print("El dígito " + str(semilla2[i]) + " está repetido en las posiciones " + str(i) + " y " + str(j))

        # Verificar si hay números repetidos más de 3 veces
cont = 0
for i in range(1, len(semilla2)):
    if semilla2[i] == semilla2[i - 1]:  # Se resta porque se inicializa en 1 y así poder comparar
        cont += 1
        if cont >= 3:
            print("SEMILLA NO VÁLIDA" + "\n" + "ERROR: HAY MÁS DE 3 DÍGITOS REPETIDOS ")
    else:
        cont = 1
        break

# Algoritmo de productos medios
# pseudoaleatorios a Generar
cantNum = 4 + 5 + 5 + 9 + 4 + 6
print("La cantidad de números pseudoaleatorios que se deben generar son = " + str(cantNum))

if len(semilla) != len(semilla2):
    print("ERROR")

#Hallar el centro del producto
def center(xi):
    if len(xi) % 2 != 0:
            xi.insert(-1,0)
    else:
        xi == xi
    c = xi[-1,4]
    return c

# CONVERTIR Lista String a Lista Int
intSemilla = list(map(int, semilla))
intSemilla2 = list(map(int, semilla2))
# Print para testear la conversión de listas a int
print(intSemilla)
print(intSemilla2)
       
# Parte matemática
xi = []
xi_int = list(map(int, xi))
def Algoritmo(cantNum, semilla, intSemilla, intSemilla2,xi_int):
    size = len(str(semilla))
    x0 = intSemilla
    x1 = intSemilla2
    ri = []
    for _ in range(1, cantNum + 1):
        #Multiplicación con numpy
        xi =  str(np.multiply(x0,x1))
        x0 = x1
        #Hallar el centro
        if len(xi) % 2 != 0:
            xi.insert(-1,0)
        c = xi_int[-1,4]
        #iterar ri
        x1 = int(c)
        ri.append(float("0." + str(c)))
    return ri
resultado = Algoritmo(cantNum, semilla, intSemilla, intSemilla2,xi_int)

#PD: Casi se logra :')