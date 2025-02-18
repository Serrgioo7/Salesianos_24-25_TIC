#Leo cinco números y me dice la media de los cinco
def media_numeros():
    #definimos una variable ACUMULADORA, es decir una variable que recoge la suma
    #de los números hasta el momento
    suma=0 #inicializar la variable.
    for cont in range(1,6):
        numero=int(input("Dime un número entero mayor que cero: "))
        suma=suma+numero #suma=+suma
       
    print("La suma vale  "+str(suma))

media_numeros()
