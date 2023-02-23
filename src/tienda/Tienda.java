
package tienda;

abstract class ProductoElectronico {

         double precio;
         String marca;
         String modelo;

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    

}


class TelefonoMovil extends ProductoElectronico {
    
    int CapacidadAlmacenamiento;
    int DuracionBateria;

    public int getCapacidadAlmacenamiento() {
        return CapacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int CapacidadAlmacenamiento) {
        this.CapacidadAlmacenamiento = CapacidadAlmacenamiento;
    }

    public int getDuracionBateria() {
        return DuracionBateria;
    }

    public void setDuracionBateria(int DuracionBateria) {
        this.DuracionBateria = DuracionBateria;
    }
        
    }

class Tableta extends ProductoElectronico{

double tamanoPantalla;
String resolucionPantalla;

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }



}
