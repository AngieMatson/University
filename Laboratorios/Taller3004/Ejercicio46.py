#Programa que dado un número n, imprima los números entre 1 y n siguiendo la siguiente secuencia: 1   -2   3  -4   5  -6...
numero=int(input("Ingrese un numero límte = "))
lista_Positivos = []
lista_Negativos = []
for n in range(1,numero,2):
    lista_Positivos.append(n)
for i in range(0,numero,2):
    lista_Negativos.append(-i)
unir = tuple(zip(lista_Negativos, lista_Positivos)) #Función zip
print("La secuencia de números es =", unir)