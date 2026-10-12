Compilar Java

javac -cp .:mssql-jdbc-12.8.1.jre8.jar Conexion.java

Ejecutar Java
java -cp .:mssql-jdbc-12.8.1.jre8.jar Conexion

Eliminar ultimo caracter:
truncate -s -1 archivo.txt


Bash para reemplazar linea de un html por texto en un archivo:

//bash
sed -i '213{
r salida
d
}' index.html
//bash


salida es el archivo con el texto de salida
index.html sera el archivo donde se desea reemplazar la linea
