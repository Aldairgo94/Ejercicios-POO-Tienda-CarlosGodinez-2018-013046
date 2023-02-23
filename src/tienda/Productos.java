
package tienda;

public class Productos{

    public static void main(String[] args) {
        
        TelefonoMovil telefono = new TelefonoMovil();
        Tableta tablet = new Tableta();
        
        
        telefono.setMarca("Apple");
        telefono.setModelo("14 Pro");
        telefono.setCapacidadAlmacenamiento(128);
        telefono.setDuracionBateria(29);
        telefono.setPrecio(10399.00);
        
        tablet.setMarca("Samsung");
        tablet.setModelo("Galaxy Tab S8");
        tablet.setResolucionPantalla("2960 x 1848 WQXGA+ ");
        tablet.setTamanoPantalla(14.6);
        tablet.setPrecio(6299.00);
        
        System.out.println("Productos Disponibles: ");
        System.out.println("Marca: " + telefono.getMarca());
        System.out.println("Modelo: " + telefono.getModelo());
        System.out.println("Capacidad de Almacenamiento: " + telefono.getCapacidadAlmacenamiento()+" Gb");
        System.out.println("Duracion de la Bateria: " + telefono.getDuracionBateria()+ " horas");
        System.out.println("Precio: " + " Q "+ telefono.getPrecio());
        System.out.println(" ");
        System.out.println("Marca: " + tablet.getMarca());
        System.out.println("Modelo: " + tablet.getModelo());
        System.out.println("Resolucion de la Pantalla: " + tablet.getResolucionPantalla());
        System.out.println("Tamano de la Pantalla: " + tablet.getTamanoPantalla()+ " pulgadas");
        System.out.println("Precio: " + " Q "+ tablet.getPrecio());
        
    }

}

