from math import sqrt
def findMaxRows(Vtotal, Vzero): # Función para encontrar lás colums máx
    maxRows = 1 # Se definen variables
    maxLength = 0

    if Vtotal <= Vzero: #Se igualan valores
        return 0
    
    for rows in range(2, 1001): #For para hallar el volumen y calcularlo dependiendo de la longitud
        numDiscs = rows * rows
        volumeDisc = Vtotal // numDiscs
        if volumeDisc <= Vzero:
            break

        diameter = 0.3 * sqrt(volumeDisc - Vzero) #Usar la fórmula importando la librería para hacer la operación del square
        length = diameter * numDiscs
        if length > maxLength:
            maxRows = rows
            maxLength = length

    return maxRows # Retornar lo que se necesita de la función

i = True
while i == True: # Bucle para preguntar si se quieren ingresar más datos
    Vtotal = int(input("Ingrese el volumen total: ")) #Pedir datos al usuario
    Vzero = int(input("Ingrese el volumen sub cero: "))

    if Vtotal == 0 and Vzero == 0:
        break
    numRows = findMaxRows(Vtotal, Vzero)
    print("La longitud de las filas es = ", numRows)  # Output total del programa 
    i = int(input("Si quiere volver a usarlo escribir True = ")) #Pregunta del While

