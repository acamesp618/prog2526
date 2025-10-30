lista=[]
n=int(input("¿Cuantos numeros quieres escribir?: "))
for i in range(n):
    lista.append(int(input("Escribe un numero: ")))

i = len(lista)-1
while i >= 0:
    print(lista[i])
    i = i - 1