def es_manzana(pregunta):
    respuesta = input(pregunta + " (sí/no): ")

    if pregunta == "¿Es roja?":
        if respuesta.lower().strip() == "sí":
            return es_manzana("¿Es redonda?")
        else: 
            return "Podría ser un plátano 🍌."
    elif pregunta == "¿Es redonda?":
        if respuesta.lower().strip() == "sí":
            return "¡Podría ser una manzana 🍎!"
        else:
            return "Podría ser una fresa 🍓"
        
resultado = es_manzana("¿Es roja?")
print("Resultado: ", resultado)

def revertir_resultado(pila):
    if pila == []:
        inversa = pila
    else:
        inversa = [pila[-1]] + revertir_resultado(pila[:-1])
    return inversa

# Nuevo método: .join ayuda a unir las cadenas y poner un seperador entre ellas.
revertir = "".join(revertir_resultado(list(resultado)))
print(revertir)