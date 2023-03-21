
public class persona implements interfazPersona {
  String nombre;
  int estadoDeAnimo;
  String chisteEscogido;

  public persona(String nombreI, int estadoDeAnimoI, String chisteEscogidoI) {
    nombre = nombreI;
    estadoDeAnimo = estadoDeAnimoI;
    chisteEscogido = chisteEscogidoI;
  }

  @Override
  public String getNombre() {
    return nombre;
  }

  @Override
  public int getEstadoDeAnimo() {
    return estadoDeAnimo;
  }

  @Override
  public String getChiste() {
    return chisteEscogido;
  }

}
