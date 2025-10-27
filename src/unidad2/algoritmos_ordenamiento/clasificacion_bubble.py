def burbuja(lista):
    longitud = len(lista)
    for i in range(longitud - 1):
        for j in range(longitud - i - 1):
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]
    return lista

puntaje_confianza = [0.9, 0.30, 0.10, 0.50, 0.33, 0.80, 1.0, 0.45, 0.69, 0.77]
print("Puntaje de confianza: ", puntaje_confianza)
ordenar = burbuja(puntaje_confianza)
print("Puntaje ordenado: ", ordenar)
print("Mayor puntaje: ", max(puntaje_confianza))
print("Menor puntaje: ", min(puntaje_confianza))