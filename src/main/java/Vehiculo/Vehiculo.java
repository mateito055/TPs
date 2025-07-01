public class Vehiculo{
  String marca;
  String modelo;
  int anio;

  public Vehiculo(String marca, String modelo, int anio){
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }
  public void mostrarInformacion(){
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + anio);
  }
}

class Auto extends Vehiculo{
  int nro_puertas;

  public Auto(String marca, String modelo, int anio, int nro_puertas){
    super(marca, modelo, anio);
    this.nro_puertas = nro_puertas;
  }
}      
class Moto extends Vehiculo{
 String Tipo_manubrio;
 public Moto(String marca, String modelo, int anio, String Tipo_manubrio){
   super(marca, modelo, anio);Add commentMore actions
   this.Tipo_manubrio = Tipo_manubrio;
 }

}