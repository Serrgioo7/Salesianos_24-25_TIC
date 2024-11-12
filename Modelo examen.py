def piramide_invertida(altura):
    for i in range(altura, 0, -1):
        print(" " * (altura - i) + "*" * (2 * i - 1))

# Ejemplo de uso
piramide_invertida(4)
