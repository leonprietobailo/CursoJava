package Ejercicio_03;

public class main {

  public static void main(String[] args) {

    /*
     * String [] nombre = String {}; String [] apellido = String {}; String [] localidad = String
     * {}; String [] posicion = String {}; String [] sueldo = String {};
     */
    genArchivo gA = new genArchivo();

    empleado[] emp = new empleado[3];

    emp[0] = new empleado("Leon", "Prieto", "Ribes", "Junior", 20000);
    emp[1] = new empleado("Albert", "Rincon", "Bcn", "Becario", 20001);
    emp[2] = new empleado("Josep", "Pieres", "Menorca", "Comercial", 20002);

    gA.generarArchivo(emp);



  }

}
