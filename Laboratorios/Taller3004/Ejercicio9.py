#Programa que halle el áare de un hexágono
#Planteamiento incial
#preguntaInicial = str(input("¿Quieres hallar el área de un hexágono regular o irregular? 1 o 2 =    "))
#if preguntaInicial == 1:
    #Definir variabñe
medidaLado = float(input("Ingrese el valor de uno de los lados del hexágono = "))
apotema = float(input("Ingrese el valor de la apotema del hexágono = "))
    #Proceso
perimetro = medidaLado * 6
hexaRegular = perimetro  * apotema / 2
print("El área del hexágono regular es = " + str(hexaRegular) + "\n")

      
        