public class Lampara{
  private String color;
  private String intensidad;
  private boolean encendida;
  public Lampara(String color, String intensidad, boolean encendida){
          this.color = color;
          this.intensidad = intensidad;
          this.encendida = false;
  }
        public void encender(){
                if (encendida = true){
                System.out.println("la lampara ya está encendida con una intensidad " + intensidad + " y de color " + color );
                } else  {
                        System.out.println("la lampara se encendió");
                }
        }
        public void apagar(){
             if (encendida = false){
             System.out.println("la lampara ya está apagada");

        } else {
               System.out.println("la lampara se apagó");
        }
        }
        public void mostrarEstado(){
                if (encendida){
                        System.out.println("la lampara está encendida");
                }
                else{
                        System.out.println("la lampara está apagada");
                }


        }
}
