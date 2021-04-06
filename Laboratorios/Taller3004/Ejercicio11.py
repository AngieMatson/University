#Programa que intnercambie los valores ingresados
#Definir variables
a = float(input("Ingrese el primer número de a = "))
b = float(input("Ingrese el segundo número de b = "))
#Procesos
a, b = b, a
#Imprimir
print("El nuevo valor de a es = ",a)
print("El nuevo valor de b es = ",b)