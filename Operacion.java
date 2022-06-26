public class Operacion {    
    public void numeroSuerte(int suma){
        Imprimir impr = new Imprimir();
        
        int number = 0;
        int valor = Integer.toString(suma).length();
        if (valor == 4){
            for (int i =0; i<valor; i++){
                String num= String.valueOf(Integer.toString(suma).charAt(i));
                number += Integer.parseInt(num);
            }
        }
        impr.mostrarNumero(number);
    }

    public void suma(int dia,int mes, int year) {
        int suma = 0;
        suma = dia+mes+year;
        numeroSuerte(suma);
    }    
    
}