desayuno = []
while True:
    option = input("""Elije una fruta para tu desayuno:
    1 - Manzanas
    2 - Bananas
    3 - Pera
    4 - Uva
    5 - Sandia
    6 - Granola
    0 - TERMINAR
     = """)
    if option == "1":
        desayuno.append('Manzanas')
        continue
    elif option == "2":
        desayuno.append('Bananas')
        continue
    elif option == "3":
        desayuno.append('Pera')
        continue
    elif option == "4":
        desayuno.append('Uva')
        continue
    elif option == "5":
        desayuno.append('Sandia')
        continue
    elif option == "6":
        desayuno.append('Granola')
        continue
    elif option == "0":
        break
    else:
        print("Debes seleccionar una opcion (1, 2 o 3)")
print("Programa terminado, que disfrutes tu desayuno, y este contiene = " + str(desayuno))