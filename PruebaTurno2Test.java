//Fase 2 del microproyecto 2: Crear turnos a partir de entrada por teclado.
//Guardarlos en un array dinámicamente (aunque sea fijo al principio).
//Así verás cómo variables locales, objetos y arrays interactúan.
//Preparación para después detectar solapamientos.
import java.util.Scanner;

public class PruebaTurno2Test{
    public static void main (String [] args){
 
        Scanner scanner= new Scanner (System.in);
        
              
        //Creación de array
        Turno[] turnos = new Turno[3];// 3 plazas vacías
        //System.out.println(turnos[0]); valor null
        //turnos[i] = new Turno(nombreDia, horaInicio, horaFin);
        //Concepto clave: en un array, cada posición se accede por su índice (int), no por nombre de variable ni tipo de dato del objeto que guardas.
        //uchos principiantes confunden tipo de la variable de control con tipo del objeto que guardas en el array.
        for (int i =0; i < turnos.length; i++) {//para recorrer los turnos. Define turnos.
            // AQUÍ VAMOS A CREAR EL OBJ Turno. System.out.println(turnos[i]);
            
             // --- pedir datos al usuario ---
            System.out.print("Día del turno: ");
            String dia = scanner.next (); // ← completar

            System.out.print("Hora inicio: ");
            int horaInicio = scanner.nextInt (); // ← completar

            System.out.print("Hora fin: ");
            int horaFin = scanner.nextInt (); // ← completar

            // --- crear objeto Turno y meterlo en la posición i ---
            turnos[i] = new Turno  (dia, horaInicio, horaFin); // ← completar
        }

        // Recorrer array para mostrar turnos
        for (int i = 0; i < turnos.length; i++) {
            System.out.println(turnos [i]); // ← completar
        }

        scanner.close();
            
 
         }
    }
