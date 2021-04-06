#Programa que lea un número del día de la semana (entre 1 y 7) e indique el nombre del día.
number = int(input("Ingrese el el número de la semana para conocer el nombre del día = ")) #Definir entrada
nombreDias = ['None','Lunes','Martes','Miércoles','Jueves','Viernes'] #lista para determinar el día
print("El nombre del día número" + " " +str(number) + " es = " + str(nombreDias[number]))