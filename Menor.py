#Leo cinco n�meros y me dice cu�l es el menor
def menor():
    menor=int(input("Dime un numero entero mayor que cero:"))

    #inicializar variable
    for cont in range(1,6):
        numero=int(input("Dime un n�mero entero mayor que cero: "))
        if(numero<menor):
            menor=numero
    print("EL MENOR ES "+str(menor))

menor()
