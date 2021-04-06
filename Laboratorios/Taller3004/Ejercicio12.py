#Programa que calcule el tiempo de caída de un objeto 
#Definir variables y constantes
gravedad = 10
pregunta = str(input("¿Quieres hallar el tiempo de caída del objeto con velocidad(v) o con altura(h)?, v o h = "))
#Condiciones para aplicar la dos fírmulas
if pregunta == "h":
    altura = float(input("Ingrese el valor de la altura = "))
    tiempoH = (((2 * altura) / gravedad)**(0.5))
    print("El tiempo de caída del objeto es = " + str(tiempoH) + " [segundos]" + "\n")
else:
    if pregunta == "v":
        vFinal = float(input("Ingrese el valor de la velocidad final = "))
        vInicial = float(input("Ingrese el valor de la velocidad Inicial = "))
        tiempo = (vFinal - vInicial) / gravedad
        print("El tiempo de caída del objeto es = " + str(tiempo) + " [segundos]" + "\n" )