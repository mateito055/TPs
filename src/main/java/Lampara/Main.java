public class Main {
  public static void main(String[] args) {
    Lampara lampara = new Lampara("rojo" , "alta", false);
    lampara.encender();
    lampara.mostrarEstado();
    lampara.apagar();
    lampara.mostrarEstado();
    lampara.encender();
    lampara.mostrarEstado();
    lampara.apagar();
    lampara.mostrarEstado();
  }
}
