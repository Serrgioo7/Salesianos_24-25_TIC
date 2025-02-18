def todo():
    numero=int(input("Dime un número entero mayor que cero: "))
    mayor=numero
    menor=numero
    suma=0
    for cont in range(1,6):
        numero=int(input("Dime un número entero mayor que cero: "))
        if(numero>mayor):
            mayor=numero
        if(numero<menor):
            menor=numero
        suma=suma+numero #suma=+suma

    media=float(suma)/cont  #CONVERSION FORZADA DE TIPOS
    diferencia=mayor-menor


        
    print("EL MAYOR ES "+str(mayor))
    print("EL MENOR ES "+str(menor))
    print("La media vale  "+str(media))
    print("La suma vale  "+str(suma))
    print("La diferencia vale "+str(diferencia))
    

todo()
