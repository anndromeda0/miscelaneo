#include <iostream>
//Encriptacion Cesar para proyecto, no se toma en cuenta ultima letra alfabetica comience de nuevo con letra A
string cifradoCesar(string password, string palabra){
    string palabraCodificada="";

    const int largoPassword = password.length();
    char* passArray = new char(largoPassword);
    strcpy(passArray,password.c_str());
    int codificador = 0; //Entero que se utilizara para generar un digito 0-10 para metodo Cesar

    //Obtener numero codificador
    for(int i = 0 ; i<largoPassword; i++){
        codificador+=int(passArray[i])%2;
    }

    const int largoPalabra = palabra.length();

    //char* palabraArray = new char(largoPalabra + 1);
    //strcpy(palabraArray,palabra.c_str());

    char palabraArray[palabra.length()+1];
    strcpy(palabraArray, palabra.c_str());

    for(int j=0;j<largoPalabra;j++){
        palabraCodificada = palabraCodificada + char(int(palabraArray[j])+codificador);
    }


return palabraCodificada;
}

int main () 
{
    return 0;
}
