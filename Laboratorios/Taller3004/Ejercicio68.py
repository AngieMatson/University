add = "si"
while add =="si":
    try:
        number = int(input("Ingrese el primer número = "))
        number2 = int(input("Ingrese el segundo número = "))
        division = number / number2
        print("El resultado de la división es = ", division)
    except ZeroDivisionError:
        print("¡Madre mía, Willy, no puedes dividir por!")
    except ValueError:
        print("Entrada no válida, ingrese los valores de nuevo.")
    add = str(input("¿Desea ingresar otro número? si o no = "))
    if add == "no":
        break