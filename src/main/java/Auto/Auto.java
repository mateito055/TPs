public class Auto {
        private String marca;
        private String modelo;
        private int anio;
        private boolean encendido;
        public Auto(String marca, String modelo, int anio) {
                this.marca = marca;
                this.modelo = modelo;
                this.anio = anio;
                this.encendido = false;
}
        public void encender() {
                if (!encendido) {
                        encendido = true;
                        System.out.println("El + marca + modelo + está encendido.");
                } else {
                        System.out.println("El auto ya está encendido.");
                }
        }
        public void apagar() {
                if (encendido) {
                        encendido = false;
                        System.out.println("El auto se apagó.");
                } else {
                        System.out.println("El auto ya está apagado.");
                }
        }
        public void mostrarInfo() {
                System.out.println("Marca: " + marca);
                System.out.println("Modelo:" + modelo);
                System.out.println("Año: " + anio);
                System.out.println("Estado:" + (encendido ? "Encendido": "Apagado"));
        }
}

