#inversor de palabras
palabra= input("Escribe una palabra: ")
print(palabra[::-1])
palindromo= palabra[::-1]

if palindromo == palabra:
    print("La palabra que has escrito es un palíndromo")
print()

#Limpieza de datos
correo=" juan.perez@dominio.com "
print(correo.strip()) #Eliminar espaciois en blanco
print(correo.upper()) #Convertir a mayusculas
print(correo.split('@')) #Separar el dominio usando .split y separador @
print()

#Etiqueta HTML
clase= "titulo"
contenido = "Mi Encabezado"

print(f"<h1 class=\"{clase}\" >{contenido}</h1>")
