# Programa que muestre por pantalla el área y perímetro de un círculo
#Definir variables y constantes
Pi = 3.1416
radio = float(input("Ingrese el valor del radio del área = "))
#PROCESOS
areaCirculo = Pi * pow(radio, 2)
print("El área del círculo es = " + str(areaCirculo) + "\n")
#Condiciones para hallar el perímetro con las dos fórmulas
perimetro = str(input("¿Quieres hallar el perímetro con el diámetro o con el radio?, 1 o 2 = "))
if perimetro == "1":
    perimetroRadio = 2 * Pi * radio
    print("El perímetro del círculo es = " + str(perimetroRadio) + "\n")
else:
    diametro = float(input("Ingrese el valor del diámetro = "))
    perimetroDiametro = Pi * (diametro/2)
    print("El perímetro del círculo es = " + str(perimetroDiametro) + "\n")

print("¡El programa ha finalizado con éxito!")