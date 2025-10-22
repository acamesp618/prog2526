#Contar cuantas 'a' hay en una frase
#Cambiar vocal 'a' a 'x'
def cont(texto):
    a=texto.count("a") + texto.count("A")
    e=texto.count("e") + texto.count("E")
    i=texto.count("i") + texto.count("I")
    o=texto.count("o") + texto.count("O")
    u=texto.count("u") + texto.count("U")
    print("Vocales 'a': ", a)
    print("Vocales 'e': ", e)
    print("Vocales 'i': ", i)
    print("Vocales 'o': ", o)
    print("Vocales 'u': ", u)
    print("Total vocales: ", a+e+i+o+u)
    nuevoTexto=frase.replace("a", "x").replace("A", "X").replace("e", "x").replace("E", "X").replace("i", "x").replace("I", "X").replace("o", "x").replace("O", "X").replace("u", "x").replace("U", "X")
    return nuevoTexto

frase=input("Escribe una frase: ")
print(cont(frase))
