# Par o impar
def paroimpar (n):
    if n % 2 != 0: 
        print("IMPAR")
    else:
        print("PAR")

# Programa principal
n=int(input("Escribe un numero: "))

print(paroimpar(n)) #invocación
    
