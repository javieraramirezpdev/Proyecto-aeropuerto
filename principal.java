import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del aeropuerto: ");
        String nombre = sc.nextLine();

        Aeropuerto aeropuerto = new Aeropuerto(nombre, 5); // 5 para prueba

        int opcion;

        do {
            System.out.println("\n--- MENÚ AEROPUERTO ---");
            System.out.println("1. Listar ID de aviones");
            System.out.println("2. Total pasajeros");
            System.out.println("3. Espacios disponibles");
            System.out.println("4. Buscar avión por ID");
            System.out.println("5. Subir pasajeros");
            System.out.println("6. Bajar pasajeros");
            System.out.println("7. Salir");

            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    aeropuerto.listarAviones();
                    break;

                case 2:
                    System.out.println("Total pasajeros: " + aeropuerto.cantidadTotal());
                    break;

                case 3:
                    System.out.println("Espacios disponibles: " + aeropuerto.cantidadEspacios());
                    break;

                case 4:
                    System.out.print("Ingrese ID: ");
                    int idBuscar = sc.nextInt();
                    Avion avion = aeropuerto.buscarAvion(idBuscar);

                    if (avion != null) {
                        avion.mostrarInfo();
                    } else {
                        System.out.println("Avión no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("ID avión: ");
                    int idSubir = sc.nextInt();
                    Avion avionSubir = aeropuerto.buscarAvion(idSubir);

                    if (avionSubir != null) {
                        System.out.print("Cantidad a subir: ");
                        int cant = sc.nextInt();
                        avionSubir.subirPasajeros(cant);
                    }
                    break;

                case 6:
                    System.out.print("ID avión: ");
                    int idBajar = sc.nextInt();
                    Avion avionBajar = aeropuerto.buscarAvion(idBajar);

                    if (avionBajar != null) {
                        System.out.print("Cantidad a bajar: ");
                        int cant = sc.nextInt();
                        avionBajar.bajarPasajeros(cant);
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        sc.close();
    }
}
