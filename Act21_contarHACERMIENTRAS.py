# Hacer mientras
n=int(input("¿Hasta que numero quieres contar?: "))
i=1
while True: #Entra siempre
    if i < n:
        print (i, end=', ')
    #para que el ultimo numero no tenga "," al final
    elif i == n:
        print(i)
    else:
        break
    i += 1
