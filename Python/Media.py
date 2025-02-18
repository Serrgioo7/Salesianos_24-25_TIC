#Leo cinco números y me dice la media de los cinco
def propiades_numeros():
    
    suma=0 #inicializar la variable.
    for cont in range(1,6):
        numero=int(input("Dime un número entero mayor que cero: "))
        suma=suma+numero #suma=+suma

    media=float(suma)/cont  #CONVERSION FORZADA DE TIPOS
    print("La media vale  "+str(media))

