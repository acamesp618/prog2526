import math

print("Elige uno de los siguientes:")
print("suma --> +")
print("resta --> -")
print("multiplicacion --> *")
print("division --> /")
print("raiz cuadrada --> V")
calc=input()

num1=int(input("Escriba un numero:"))


match calc:
    case '+':
        num2=int(input("Escriba otro numero:"))
        print("Resultado:",num1+num2)
    case '-':
        num2=int(input("Escriba otro numero:"))
        print("Resultado:",num1-num2)
    case '*':
        num2=int(input("Escriba otro numero:"))
        print("Resultado:",num1*num2)
    case '/':
        num2=int(input("Escriba otro numero:"))
        print("Resultado:",num1/num2)
    case 'V':
         print("Resultado:",math.sqrt(num1))
    case _:
        print("Error")
