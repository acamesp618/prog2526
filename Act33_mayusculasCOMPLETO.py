# Escribir en mayuscula
txt=input("Escribe una frase: ")
x = txt.upper()
print(x)



#Funcion
def toUpper(frase):
    x = frase.upper()
    return x

#Procedimiento
def toUpperProc(frase):
    print(frase.upper())

frase = input("Escribe una frase: ")
print (toUpper(frase))
toUpperProc(frase)
