lista=[1,2,3,4,5,6,7,8,9,10]
print("La lista originial es: ",lista)

for e in lista:
    if e % 2 == 0:
        lista.remove(e)

print("La lista modificada es: ",lista)