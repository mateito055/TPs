public class Casa{
  private int ventana;
  private int puerta;
  private boolean seVendio;
  private boolean seCompro;

public Casa(int ventana, int puerta, boolean seVendio, boolean seCompro){
  this.ventana = ventana;
  this.puerta = puerta;
  this.seVendio = seVendio;
  this.seCompro = seCompro;
}

  public void venderse(){
      if (seVendio = true){
          System.out.println("la casa ya se vendió");
      }else {
          System.out.println("la casa no se vendió");
      }


  }
  public void comprarse(){
      if (seCompro = true){
          System.out.println("la casa ya se compró");
      }else {
          System.out.println("la casa no se compró");
      }
  }

}