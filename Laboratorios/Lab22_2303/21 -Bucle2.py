''' 
La variable i toma los valores de 0 a 3 y la variable j toma los valores de 0 a i, 
por lo que cada vez el bucle interno se ejecuta un número diferente de veces
'''
for i in range (4):
  for j in range(i):
    print ("i vale", i, "y j vale", j)
