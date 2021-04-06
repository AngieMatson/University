'''Programa que dados 3 números, determine si los números se están incrementando, 
disminuyendo o ninguno de lo anterior de acuerdo con el orden de digitación
'''
line = input( "Ingrese los tres número = ").split()
n1 = int(line[0])
n2 = int(line[1])
n3 = int(line[2])
if (n1 > n2) and (n2 > n3):
    print("Está Disminuyendo.")
else:
    if (n1 < n2) and (n2 < n3):
        print("Está incrementando.")
    else:
        print("No se incrementa ni se disminuye.")
