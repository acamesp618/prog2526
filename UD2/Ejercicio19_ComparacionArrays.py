def comparar_arrays (arr1, arr2):
    #Comparar longitud
    if len(arr1) != len(arr2):
        return False
    
    # Recorrer el array y comparando
    for i in range(len(arr1)):
        if arr1[i] != arr2[i]:
            return False
    
    return True

a = [10, 20, 30]
b = [10, 20, 30]
c = [30, 20, 10]
d = [10, 30]

print(comparar_arrays(a, b))