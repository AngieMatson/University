#Programa que dado un número entre 0 y 10, imprima el nombre del número. Ejemplo: 1 ---> UNO
#Definir variables y listas
number = int(input("Ingrese un número entre 0 y 10 = "))
nombreNumber = ['Cero', 'Uno', 'Dos', 'Tres', 'Cuatro', 'Cinco', 'Seis', 'Siete', 'Ocho','Nueve', 'Diez']
print("El nombre del número" + " " + str(number) + " " + "es = " + str(nombreNumber[number]))