# Turno
//Este repositorio es para aprender sobre el mecanismo del objeto y probar su límite
public class Turno {

private int horaInicio; //estados : qdescriben cómo es Turno (objeto).
private int horaFin;//cada uno tiene sus propios valores para esas V.
private String nombreDia; // V de instancia= estado almacecnado<-- Atribts son las V que lo guardan       
// atribts= V de instancia = estado almacenado
        
public Turno(String dia, int horaInicio, int horaFin) {//accions dl OBJ+Constructor+método ESP // Constructr es el mecanismo qcrea el OBJ y establece su estado inicial.
        if  (horaInicio >= horaFin) { //while se usa-->necesitas que el estado cambie dentro del bucle
            throw new IllegalArgumentException("Turno inválido");
        } 
        this.nombreDia=dia;
        this.horaInicio= horaInicio;
        this.horaFin= horaFin;
         
//en main: Turno 1 --> Lunes,9,14; Turno 2 --> Martes, 16,20
        
 }
public String getDia (){
        
 return nombreDia;
    }
    
 public int gerHoraInicio (){
        
  return horaInicio;
    }
    
public int getHoraFin (){
        
  return horaFin;
        
} public void mostrarTurno() {
    System.out.println(nombreDia + " de " + horaInicio + " a " + horaFin);
}

        
}
    
        
