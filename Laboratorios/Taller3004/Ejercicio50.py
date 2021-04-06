#Programa que lea n números y calcule su suma y su promedio.
suma = 0
contador = 0
promedio = 0
mas = "true"
while mas == "true": #Bucle para volver a pedir notas hasta que el usuario lo desee
    nota2 = float(input("Ingrese la nota = "))
    if nota2 > 0:
        suma = suma + nota2
        contador+= 1
    mas = str(input("¿Quieres ingresar más notas? true o false = "))
    if mas == "false":
        break
print("El promedio de notas es = " + " "+ str(suma/contador))