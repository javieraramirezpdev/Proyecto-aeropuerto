import java.util.Random;

public class Avion {

    private static int contadorID = 1;

    private int id;
    private int cantidadMaxima;
    private int pasajerosActuales;
    private boolean estado;

    // Constructor con parámetros
    public Avion(int cantidadMaxima, int pasajerosActuales) {
        this.id = contadorID++;
        this.cantidadMaxima = cantidadMaxima;
        this.pasajerosActuales = pasajerosActuales;
        this.estado = true;
    }

    // Constructor aleatorio
    public Avion() {
        Random rand = new Random();
        this.id = contadorID++;
        this.cantidadMaxima = rand.nextInt(101) + 50; // entre 50 y 150
        this.pasajerosActuales = rand.nextInt(cantidadMaxima + 1);
        this.estado = true;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public boolean getEstado() {
        return estado;
    }

    // Subir pasajeros
    public void subirPasajeros(int cantidad) {
        if (cantidad > 0 && pasajerosActuales + cantidad <= cantidadMaxima) {
            pasajerosActuales += cantidad;
            System.out.println("Pasajeros subidos correctamente.");
        } else {
            System.out.println("No se pueden subir pasajeros.");
        }
    }

    // Bajar pasajeros
    public void bajarPasajeros(int cantidad) {
        if (cantidad > 0 && pasajerosActuales - cantidad >= 0) {
            pasajerosActuales -= cantidad;
            System.out.println("Pasajeros bajados correctamente.");
        } else {
            System.out.println("No se pueden bajar pasajeros.");
        }
    }

    // Mostrar info
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Capacidad máxima: " + cantidadMaxima);
        System.out.println("Pasajeros actuales: " + pasajerosActuales);
        System.out.println("Estado: " + estado);
    }
}
