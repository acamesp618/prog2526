print("Elige uno de los siguientes:")
print("suma --> +")
print("resta --> -")
print("multiplicacion --> *")
print("division --> /")
calc=input()

num1=int(input("Escriba un numero:"))
num2=int(input("Escriba otro numero:"))

match calc:
    case '+':
         print("Resultado:",num1+num2)
    case '-':
         print("Resultado:",num1-num2)
    case '*':
         print("Resultado:",num1*num2)
    case '/':
         print("Resultado:",num1/num2)
    case _:
        print("Error")
