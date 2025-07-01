public class MainVehiculo {
  public static void main(String[] args) {
    Auto auto = new Auto("Toyota", "Corolla", 2020, 4);
    auto.mostrarInformacion();
    System.out.println("Número de puertas: " + auto.nro_puertas);
    Moto moto = new Moto("Honda", "CBR", 2021, "Deslizante");
    moto.mostrarInformacion();
    System.out.println("Tipo de manubrio: " + moto.Tipo_manubrio);
  }
}