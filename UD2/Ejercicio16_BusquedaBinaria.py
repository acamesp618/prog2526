def busqbin (lista,num):
    izq=0
    dch= len(lista) - 1
    while izq <= dch:
        medio = (izq + dch)//2
                
        if lista[medio] == num:
            return medio
        elif lista[medio] < num:
            izq = medio + 1
        else:
            dch = medio - 1
        
    return -1

numeros = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90]
buscado = int(input("Introduzca un numero objetivo: "))

resultado = busqbin(numeros, buscado)

if resultado != -1:
    print(f"El número {buscado} se encuentra en la posición {resultado}.")
else:
    print(f"El número {buscado} no se encuentra en la lista.")