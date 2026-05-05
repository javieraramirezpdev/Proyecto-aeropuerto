public class Aeropuerto {

    private String nombre;
    private Avion[] aviones;

    // Constructor
    public Aeropuerto(String nombre, int cantidadAviones) {
        this.nombre = nombre;
        this.aviones = new Avion[cantidadAviones];

        for (int i = 0; i < cantidadAviones; i++) {
            aviones[i] = new Avion(); // aleatorio
        }
    }

    // Listar IDs
    public void listarAviones() {
        for (Avion a : aviones) {
            System.out.println("ID Avión: " + a.getId());
        }
    }

    // Total pasajeros
    public int cantidadTotal() {
        int total = 0;
        for (Avion a : aviones) {
            total += a.getPasajerosActuales();
        }
        return total;
    }

    // Espacios disponibles
    public int cantidadEspacios() {
        int espacios = 0;
        for (Avion a : aviones) {
            espacios += (a.getCantidadMaxima() - a.getPasajerosActuales());
        }
        return espacios;
    }

    // Buscar avión por ID
    public Avion buscarAvion(int id) {
        for (Avion a : aviones) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
}
