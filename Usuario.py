def usuario():
    nombre=raw_input("Nombre: ")
    apellido1=raw_input("Primer apellido: ")
    apellido2=raw_input("Segundo apellido: ")
    ano=raw_input("Año de nacimiento: ")
    usuario=apellido1[0:3]+apellido2[0:3]+nombre[0:3]+ano[2:4]
    print("USUARIO:" + usuario+'@gmail.com')

usuario()
