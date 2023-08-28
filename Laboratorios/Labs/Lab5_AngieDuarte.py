Vtotal = 0 ; Vzero = 0 ; maxRows = 1 ; maxLength = 0 ; numDiscs = 0 ; volumePerDisc = 0 ; diameter = 0; length = 0; rows = 0 ; i = 1 ; numRows = 0

from math import sqrt

def findMaxRows(Vtotal,Vzero,maxLength,numDiscs,volumePerDisc, diameter,length,maxRows):
    if (Vzero <= 0):
        return 0
    for i in range(2,1000):
        numDiscs = i*i
        volumePerDisc = Vtotal / numDiscs
        if volumePerDisc <= 10:
            break
        diameter = 0.3 * sqrt(volumePerDisc - Vzero)
        length = diameter * numDiscs
        if length < maxLength:
            maxRows = rows
            maxLength = length
    return maxRows
findMaxRows()

def input(Vtotal,Vzero,i, numRows):
    while i == True:
        Vtotal = input(("Ingrese el volumen total = "))
        Vzero = input(("Ingrese el volumen total = "))
    if Vtotal == 0 and Vzero:
        numRows = findMaxRows(Vtotal,Vzero)
        print("La longitud de filas es = " + numRows)
        i = input("Si quiere ingresar más valores ingrese True o si quiere finalizar False =")
    return 0
input()

