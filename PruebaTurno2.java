import  java.util.Scanner;

public class PruebaTurno2{
    public static void main (String [] args){
        int horaInicio;
        int horaFin;
        String nombreDia;
        
        Scanner scanner = new Scanner (System .in);
        
        System.out.print("Introducir inicio turno: ");
        horaInicio =scanner.nextInt ();
        
        System.out.print ("Intrudice fin de turno: ");//print ESCRIBE texto en la salida.
 
        horaFin = scanner.nextInt();
        
        System.out.print ("Día de la semana: ");
       nombreDia = scanner.nextLine();//Scanner no tiene nextString(), no es  nDia=scanner.nextString().
        
        if  (horaInicio >= horaFin) {//while mayor complicación 
            System.out.println("Error");
        }  else {
            System.out.println("Turno válido");
        
        }
           
          scanner.close();  
          
          //Creación de objetos:
        Turno t1 = new Turno ("Lunes ", 9 ,  14 );
        
        Turno t2 = new Turno ("Martes ", 10 , 12);
        
        Turno t3 = new Turno ("Miércoles ", 16 , 20 );
        
        //Creación de array
        Turno[] turnos = {t1,t2,t3};
        for (int i =0; i < turnos.length; i++) {//para recorrer los turnos. Define turnos.
            System.out.println(turnos[i]);
        }
    }
}