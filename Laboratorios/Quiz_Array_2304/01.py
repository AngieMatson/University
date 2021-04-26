#EJERCICIO PROPUESTO
lista_multiplos = []
agregar = "True"
while agregar == "True": #Un bucle para que calcule todas las veces que requiera el usuario
    tamaño_arreglo = int(input("Ingrese el tamaño del arreglo = "))
    numero_multiplos = int(input("Ingrese el número de múltiplos = "))
    for i in range (1,tamaño_arreglo+1): #Se determina un range el cual va desde 1, y el mimos valor que se ingresa en la variable se va incrementenado en 1.
        lista_multiplos.append(i*numero_multiplos)
    print ("Los" + " " + str(tamaño_arreglo) + " " + "múltiplos de " + " " + str(numero_multiplos) + " " + "son = " + " " + ", ".join(map(str,lista_multiplos)))
    agregar = str(input("Quieres agregar más valores? True or False = "))
print('Ha terminado el programa exitosamente.')