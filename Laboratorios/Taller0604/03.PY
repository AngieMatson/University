nota1 = int(input("Ingrese la primera nota = "))
nota2 = int(input("Ingrese la segunda nota = "))
nota3 = int(input("Ingrese la tercera nota = "))
promedio = (nota1 + nota2 + nota3) / 3
if promedio >= 7:
    print("Promocionado :D")
if promedio >= 4 and promedio < 7:
    print("Regular :7")
if promedio < 4:
    print("No habilitado :c")