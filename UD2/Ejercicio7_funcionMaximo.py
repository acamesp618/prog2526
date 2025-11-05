def maximo(t):
    maxi= t[0] #Escogemos el primer numero de la lista como maximo
    for e in t:
        if e > maxi: #Comparamos el numero con el escogido
            maxi = e #Si es mayor se sobreescribe
    return maxi

a=[3,4,10,0,22,2,1,0,4,9,5,7]
#invocar a la función
num_mayor = maximo(a)
print(maximo(a))