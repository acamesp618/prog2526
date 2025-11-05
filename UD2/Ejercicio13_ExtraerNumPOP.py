def esPrimo(numero):
    if numero <= 1:
        return False
    if numero == 2:
        return True
    i = 2
    while i < numero:
        if numero % i == 0:
            return False
        i += 1
    return True

numeros=[1,2,3,4,5,6,7,8,9,10]
primos=[]
i=0
while i < len(numeros):
    if esPrimo(numeros[i]):
        primos.append(numeros.pop(i))
    else:
        i = i + 1

print("La lista original es: ", numeros)
print("La lista de primos es: ", primos)
