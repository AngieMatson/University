#Decorador
# a(b) --> c
def my_costume_decorator(function): #Funcion_b = saludar

    def wrapper(*args, **kwargs): #parámetros argumentos *args, **kwargs
        return function(*args, **kwargs) #funcion_b
    return wrapper
@my_costume_decorator
def saludar(): #Saludar por medio de @funcion_a se convierte en el parámetro funcion_b
    print('Hola')
#NUEVO
@my_costume_decorator   
def suma(a, b):
    return a + b
print(suma(10, 30))
