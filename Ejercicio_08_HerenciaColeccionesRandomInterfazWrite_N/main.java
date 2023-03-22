import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class main {

  public static void main(String[] args) {

    empleado e1 = new empleado("Leon", "Prieto", "12345678Y", "BCN", LocalDate.of(2000, 7, 30),
        LocalDate.of(2015, 8, 1), 25000, "Ingeniero Junior");
    empleado e2 = new empleado("Pedro", "Perez", "18149144Z", "MAD", LocalDate.of(1999, 2, 1),
        LocalDate.of(2016, 5, 14), 24000, "Marinero");
    empleado e3 = new empleado("Jose", "Ruiz", "14963254V", "VAL", LocalDate.of(2001, 5, 19),
        LocalDate.of(2017, 1, 5), 23000, "Militar");
    empleado e4 = new empleado("Miguel", "Plata", "85230975A", "MAH", LocalDate.of(2003, 8, 22),
        LocalDate.of(2020, 9, 30), 22000, "Politico");

    Set<empleado> eSet = new HashSet<>();
    eSet.add(e1);
    eSet.add(e2);
    eSet.add(e3);
    eSet.add(e4);
    eSet.add(e1);

    txtWrite t = new txtWrite();
    t.generarArchivo(eSet);



  }

}
