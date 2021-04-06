#Programa que determine si un año dado es o no bisiesto.
#Definir variables
anio = int(input("Ingrese el año  = "))
#Proceso
if anio % 4 != 0: 
    print("El año" + " "+ str(anio) + " " + "no es un año bisiesto")
elif (anio % 4 == 0 )  and (anio % 100 != 0): #No es divisible entre 100 y 400
    print("El año" + " " +str(anio) + " " + "es bisiesto")
elif (anio % 4 == 0) and ( anio % 100 == 0) and (anio % 400 !=0): #Divisible entre 4 y 100 pero no entre 400
    print("El año" + " " +str(anio) + " " + "no es un año bisiesto")
elif (anio % 4 == 0) and (anio % 100 == 0) and (anio % 400 == 0):
    print("El año" + " " + str(anio) + " " + "es bisiesto")

