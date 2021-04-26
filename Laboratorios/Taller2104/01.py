#Prepara un array con 6 elementos, que pida 6 datos y luego los muestre en orden contrario al que se han introducido:
datos = [0,0,0,0,0,0]
for i in range(1,7):
    datos[i-1] = int( input( "Dime el dato número {}: ".format(i) ))
print ("Los datos al revés son: ")
for i in range(6,0,-1):
    print ( datos[i-1] )
