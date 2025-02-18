# Función que verifica si un correo electrónico es válido
def es_valido(correo):
    # Comprobar que hay un "@" y un "." después del "@"
    if "@" in correo and "." in correo.split("@")[-1]:
        return True
    return False

# Pedir al usuario que introduzca una lista de correos electrónicos separados por comas
correos = raw_input("Introduce una lista de correos electrónicos separados por comas: ")

# Dividir la cadena de correos en una lista
lista_correos = correos.split(",")

#Comprobar la validez de cada correo y mostrar el resultado
for correo in lista_correos:
    correo = correo.strip()  # Eliminar espacios extra alrededor del correo
    if es_valido(correo):
        print("{correo} - Válido")
    else:
        print("{correo} - Inválido")
