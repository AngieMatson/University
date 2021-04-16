direccion=input("Ingrese el correo de email = ")
def validar(direccion):
    if direccion.find('@' and ('.com' or '.co')) >= 0:
        print("Dirección válida")
    else:
        print("Dirección inválida")
validar(direccion)