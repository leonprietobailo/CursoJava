import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    LocalDateTime fecha = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String fechaHoy = fecha.format(dateTimeFormatter);

    System.out.println("Buenos dias, la fecha actual es:  " + fechaHoy);

    System.out.println("Porfavor, introduzca su nombre: ");
    String nombre = reader.next();


    System.out.println();
    System.out.println("Porfavor, introduzca su estado de ánimo: ");


    System.out.print("1 - Enojado\n" + "2 - Triste\n" + "3 - Feliz\n" + "4 - Preocupado\n"
        + "5 - Aburrido\n" + "6 - Somnoliento\n");

    int estado = reader.nextInt();
    String[] chistes = {"CR7 > LM10", "KB9 > LS9", "Vini Balon de Oro"};
    String chiste = null;

    switch (estado) {
      case 1:
        System.out.println("No se enoje :(");
        break;
      case 2:
        System.out.println("No esté triste :(");
        break;
      case 3:
        System.out.println("Me alegra que esté feliz :)");
        break;
      case 4:
        System.out.println("No se preocupe :(");
        break;
      case 5:
        System.out.println("Voy a contarle un chiste para que deje de aburrirse!: ");
        chiste = chistes[(int) (Math.random() * 3)];
        System.out.println(chiste);
        break;
      case 6:
        System.out.println("Despiertese!");
        break;
    }

    persona p1 = new persona(nombre, estado, chiste);
    System.out.println("********** OUTPUT **********");
    System.out.println("La persona se llama: " + p1.getNombre());
    System.out.println("Su estado de ánimo es el numero: " + p1.getEstadoDeAnimo());
    System.out.println("Su chiste ha sido (null si no ha sido asignado): " + p1.getChiste());



  }

}
