def busqueda_binaria(lista, objetivo):
    low, high = 0, len(lista) - 1
    while low <= high:
        middle = (low + high) // 2
        if lista[middle] == objetivo:
            return middle
        elif lista[middle] < objetivo:
            low = middle + 1 
        else:
            high = middle - 1
    return -1

posibles_valores = [0.1, 0.15, 0.20, 0.31, 0.35, 0.48, 0.60, 0.69, 0.70, 0.93]
print("Posibles valores: ", posibles_valores)
valor_deseado = float(input("Introduzca el valor para obtener la posición: "))
posicion = busqueda_binaria(posibles_valores, valor_deseado)
print("El elemento está en la posición ", posicion, ".")

        
