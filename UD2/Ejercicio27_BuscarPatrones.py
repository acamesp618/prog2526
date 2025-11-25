import re

data = """
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Código de cliente: ABC123456
Teléfono de emergencia: 601 234 567
Archivos encontrados: a_1.txt, b 22.py, c_333.pdf, d_4444.jpg
"""

#Buscar todos los emails (tienen el patron @ y .)
patron_email = r'\w+@\w+\.\w+' #Con el + se repite lo anterior 1 o mas
print(re.findall(patron_email, data))


#Buscar las fechas con formato DD-MM-AAAA
patron_fecha = r'\d{2}-\d{2}-\d{4}'
print(re.findall(patron_fecha, data))

#Buscar el Código de cliente
patron_cliente= r'\w{3}\d{6}'
print(re.findall(patron_cliente, data))

#Buscar todos los nombres de archivo que terminan en .py.
patron_archivo= r'\w+\s\w+\.py'
print(re.findall(patron_archivo, data))
