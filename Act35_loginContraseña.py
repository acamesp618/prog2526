nombre = input ("Nombre de usuario: ")
CLAVE_CORRECTA = "adrykampos"
clave = input ("Introduzca la contraseña: ")
while (len(clave) < 8 or clave != CLAVE_CORRECTA): #Comparar la longitud de clave con 8
    clave = input ("Introduzca la contraseña: ")

print("Bienvenido!")
