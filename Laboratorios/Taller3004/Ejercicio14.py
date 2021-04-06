'''
determine la velocidad final de un objeto luego de un tiempo, 
si se sabe que va en línea recta y además se conoce su aceleración
'''
pregunta = str(input("¿Quieres hallar la velocidad final de un objeto? si o no = "))
if pregunta == "si":
    velocidadInicial = float(input("Ingrese el valor de la velocidad inicial = "))
    aceleracion = float(input("Ingrese el valor de la aceleración = "))
    tiempo = float(input("Ingrese el valor del tiempo en segundos = "))
    #PROCESOS
    velocidadFinal = velocidadInicial + (aceleracion * tiempo)
    print("La velocidad final del objeto es = ", velocidadFinal)
    print("¡El programa se ha terminado de ejecutar con éxito!")
else:
    print("Finish!!")