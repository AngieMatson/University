import time
def calcular_tiempo(function):

    def wrapper(*args, **kwargs):
        start = time.time()
        result = function(*args, **kwargs)
        print("Tiempo total = ", time.time() - start )
        return result
    return wrapper

