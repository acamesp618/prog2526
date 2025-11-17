def comparar_arrays (arr1, arr2, arr3, arr4):
    #Comparar longitudes de los arrays
    if len(arr1) != len(arr2) or len(arr3) != len(arr2) or len(arr4) != len(arr3):
        return False
    
    #Recorrer arrays y comparar contenido
    for i in range(len(arr1)):
        if arr1[i] != arr2[i] or arr2[i] != arr3[i] or arr3[i] != arr4[i]:
            return False
    
    #Si son iguales de contenido
    return True



#Crea un array llamado original con los números del 1 al 5.
original = [1, 2, 3, 4, 5]

#Crea una copia llamada copia1 utilizando el método copy
copia1 = original.copy()

#Crea otra copia llamada copia2 usando slicing
copia2 = original[:]

#Crea otra copia de manera manual llamada copia3
copia3 = []
for i in original:
    copia3.append(i)

#for i in range(len(original)):
#    copia3.append(original[i])

print("copia3: ", copia3)

#Asigna el array original a una variable llamada copia4.
#¿Qué pasa si eliminas el último elemento de copia4?
#¿y si eliminas el primer elemento de copia3?

copia4= original
copia4.remove(5)
print("original: ", original)
print("copia4: ", copia4)

copia3.remove(1)
print("original: ", original)
print("copia3: ", copia3)

#Compara los 4 arrays usando el algoritmo del ejercicio 17
print(comparar_arrays(copia1, copia2, copia3, copia4))

