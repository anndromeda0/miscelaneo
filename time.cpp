using namespace std;

int main()
{
   //Imprimir Fecha y hora casteado a tipo de dato string
   time_t now = time(0);
   string fecha;
   string hora;

   tm *ltm = localtime(&now);
   fecha = to_string(ltm->tm_mday) + "-" + to_string(ltm->tm_mon) + "-" + to_string(1900 + ltm->tm_year);
   hora = to_string(ltm->tm_hour) + ":" + to_string(ltm->tm_min);
  
   cout << "Fecha: " << fecha  <<endl;
   cout << "Hora: " << hora << endl;

   return 0;
}
