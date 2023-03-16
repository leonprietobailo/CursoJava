public class CalculadoraJava {

  public static void main(String[] args) {

    Math_Class fcn = new Math_Class();

    int v1 = fcn.pedirNumero();
    String operador = fcn.pedirOperador();
    int v2 = fcn.pedirNumero();
    fcn.resultado(v1, v2, operador);
  }

}
