import  java.util.Scanner;

public class PruebaTurno1{
    public static void main (String [] args){
        
        
        
        Turno t1 = new Turno ("Lunes ", 9 ,  14 );
        
        Turno t2 = new Turno ("Martes ", 10 , 12);
        
        Turno t3 = new Turno ("Miércoles ", 16 , 20 );
        
        Turno[] turnos = {t1,t2,t3};
        for (int i =0; i < turnos.length; i++) {//para recorrer los turnos. Define turnos.
            System.out.println(turnos[i]);
        }
    }
} //aqui imprime los 3 turnos: dias y horas, sin pedir por scanner