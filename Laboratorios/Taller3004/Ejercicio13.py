'''
determine la distancia recorrida por un objeto luego de una cantidad de tiempo, 
si se sabe que va en línea recta y además se conoce su aceleración y su velocidad.
'''
#Definir variables
pregunta = str(input("¿Quieres hallar la distancia recorrida de un objeto? si o no = "))
if pregunta == "si":
    tiempo = float(input("Ingrese el valor del tiempo en hora = "))
    aceleracion = float(input("Ingrese el valor de la aceleración = "))
    velocidad = float(input("Ingrese el valor de la velocidad = "))
    #Proceso
    distancia = (velocidad * tiempo) + 1/2 *(aceleracion*pow(tiempo, 2))
    #IMPRIMIR
    print()
    print("La distancia recorrida por el objeto es = " + str(distancia) + " [m]" )
    print("¡El programa se ha terminado de ejecutar con éxito!")
else:
    print("Finish!!")