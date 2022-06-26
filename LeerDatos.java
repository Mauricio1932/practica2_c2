import java.util.Scanner;

class leerDatos {
    int dia;
    int mes;
    int year;
    
    static Scanner entrada = new Scanner(System.in);
    static Operacion opera = new Operacion();

    public void leerFecha(){
        do{
            System.out.println("Introduce dia de nacimiento 1 al 31 : ");
            dia = entrada.nextInt();
        }while(dia<1||dia>31);
        do {
            System.out.println("Introduce mes de nacimiento 1 al 12: ");
            mes = entrada.nextInt();
        } while (mes<1||mes>12);
        do{
            System.out.println("Introduce Año de nacimiento 1950 al 2022: ");
            year = entrada.nextInt();
        }while(year <1950 || year >2022);
        
        opera.suma(dia,mes, year);
    }
}
