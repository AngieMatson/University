'''
Determine la energía (en Julios) de un objeto si se conoce la masa de un objeto (en kg) y la velocidad de la luz (en m/s).
'''
pregunta = str(input("¿Quieres hallar la energía de un objeto? si o no = "))
if pregunta == "si":
    # Variables y constantes
    masa = float(input("Ingres el valor de la masa del objeto en kg = "))
    velocidadLuz = 299792.458 
    #Procesos
    energia = masa * (pow(velocidadLuz, 2))
    print("La energía del objeto es = " + str(energia) + " Julios [J]")
    print("¡El programa se ha terminado de ejecutar con éxito!")
else:
    print("Finish!!!")