#Programa que dados dos números, verifique si ambos están entre 0 y 5 o retorne false sino es cierto
mas = "true"
while mas == "true": #Se establece un bucle
    numero1 = int(input("Ingrese el primer número = "))
    numero2 = int(input("Ingrese el segundo número = "))
    if (numero1 >= 0 and numero1 <= 5) and (numero2 >= 0 and numero2 <= 5):
        print("Los números" + " " + str(numero1) + " y " + str(numero2) + " " + "sí están en el rango.")
    else:
        print("Los números" + " " +  str(numero1) + " y " + str(numero2) + " = False")