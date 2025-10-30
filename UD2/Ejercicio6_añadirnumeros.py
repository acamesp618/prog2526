lista=[]
n=int(input("¿Cuantos numeros quieres escribir?: "))
for i in range(n):
    lista.append(int(input("Escribe un numero: ")))
#(longitud-1 porque tenemos 4 elementos
#-1 porque no recoge el valor anterior
#-1 para que vaya restando)
for i in range (len(lista)-1, -1, -1):
    print(lista[i])