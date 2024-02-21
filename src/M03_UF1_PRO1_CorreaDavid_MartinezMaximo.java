import java.util.Scanner;

public class M03_UF1_PRO1_CorreaDavid_MartinezMaximo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        String[][] clientes = new String[100][3];
        int contador_clientes = 0;
        boolean acceso_administrador = false;

        String[][] libros = new String[100][3];
        int contador_libros = 0;

        do {
            System.out.println(" ");
            // Imprimir título subrayado
            System.out.println("\u001B[32m===================\u001B[0m");
            System.out.println("\u001B[32mSoftware Biblioteca\u001B[0m");
            System.out.println("\u001B[32m===================\u001B[0m");
            System.out.println(" ");
            // Mostrar opciones principales
            System.out.println("1. Acceder como administrador");
            System.out.println("2. Acceder como cliente");
            System.out.println("3. Salir");
            System.out.print("\u001B[33mIngrese su opción: \u001B[0m");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para acceder como administrador
                    System.out.print("\u001B[33mIntroduzca la contraseña de administrador (contraseña = contraseña): \u001B[0m");
                    String contrasena_admin = scanner.next();

                    if (contrasena_admin.equals("contraseña")) {
                        acceso_administrador = true;
                        int opcion_admin;
                        do {
                            // Menú administrador
                            System.out.println(" ");
                            System.out.println("\u001B[35m==================\u001B[0m");
                            System.out.println("\u001B[35mMenú Administrador\u001B[0m");
                            System.out.println("\u001B[35m==================\u001B[0m");
                            System.out.println("1. Ver cantidad de clientes");
                            System.out.println("2. Ver información de un cliente");
                            System.out.println("3. Ver cantidad de libros");
                            System.out.println("4. Ver información de un libro");
                            System.out.println("5. Añadir libro");
                            System.out.println("6. Modificar libro");
                            System.out.println("7. Borrar libro");
                            System.out.println("8. Informacion General");
                            System.out.println("9. Volver al menú principal");
                            System.out.print("\u001B[33mIngrese su opción: \u001B[0m");
                            opcion_admin = scanner.nextInt();

                            switch (opcion_admin) {
                                case 1:
                                    System.out.println(" ");
                                    System.out.println("\u001B[34mCantidad de clientes: \u001B[0m" + contador_clientes);

                                    break;
                                case 2:
                                    if (contador_clientes > 0) {
                                        System.out.println(" ");
                                        System.out.print("\u001B[33mIngrese el número del cliente que desea ver: \u001B[0m");
                                        int numero_cliente = scanner.nextInt();
                                        if (numero_cliente >= 1 && numero_cliente <= contador_clientes) {
                                            System.out.println(" ");
                                            System.out.println("\u001B[34mInformación del Cliente " + numero_cliente + ":\u001B[0m");
                                            System.out.println("\u001B[34mNombre: \u001B[0m" + clientes[numero_cliente - 1][0]);
                                            System.out.println("\u001B[34mApellido: \u001B[0m" + clientes[numero_cliente - 1][1]);
                                            System.out.println("\u001B[34mEdad: \u001B[0m" + clientes[numero_cliente - 1][2]);
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("Número de cliente no válido.");
                                        }
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("No hay clientes registrados.");
                                    }
                                    break;
                                case 3:
                                    System.out.println(" ");
                                    System.out.println("\u001B[34mCantidad de libros: " + contador_libros);
                                    break;
                                case 4:
                                    if (contador_libros > 0) {
                                        System.out.println(" ");
                                        System.out.print("\u001B[33mIngrese el número del libro que desea ver: \u001B[0m");
                                        int numero_libro = scanner.nextInt();
                                        if (numero_libro >= 1 && numero_libro <= contador_libros) {
                                            System.out.println(" ");
                                            System.out.println("\u001B[34mInformación del Libro " + numero_libro + ":\u001B[0m");
                                            System.out.println("\u001B[34mTítulo: \u001B[0m" + libros[numero_libro - 1][0]);
                                            System.out.println("\u001B[34mNúmero de Páginas: \u001B[0m" + libros[numero_libro - 1][1]);
                                            System.out.println("\u001B[34mAutor: \u001B[0m" + libros[numero_libro - 1][2]);
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("Número de libro no válido.");
                                        }
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("No hay libros registrados.");
                                    }
                                    break;
                                case 5:
                                    // Añadir libro
                                    System.out.println(" ");
                                    System.out.print("\u001B[33mIngrese el título del libro: \u001B[0m");
                                    scanner.nextLine();  // Consumir el salto de línea pendiente
                                    libros[contador_libros][0] = scanner.nextLine();  // Permitir espacios en el título
                                    System.out.print("\u001B[33mIngrese el número de páginas del libro: \u001B[0m");

                                    // Validar que el número de páginas sea un valor numérico
                                    while (!scanner.hasNextInt()) {
                                        System.out.println("\u001B[31mError: Ingrese un número válido para las páginas.\u001B[0m");
                                        System.out.print("\u001B[33mIngrese el número de páginas del libro: \u001B[0m");
                                        scanner.next();  // Consumir entrada no válida
                                    }
                                    libros[contador_libros][1] = scanner.next();

                                    System.out.print("\u001B[33mIngrese el autor del libro: \u001B[0m");
                                    scanner.nextLine();  // Consumir el salto de línea pendiente
                                    libros[contador_libros][2] = scanner.nextLine();  // Permitir espacios en el autor
                                    contador_libros++;
                                    System.out.println(" ");
                                    System.out.println("Libro añadido correctamente.");
                                    break;
                                case 6:
                                    // Modificar libro
                                    if (contador_libros > 0) {
                                        System.out.println(" ");
                                        System.out.print("\u001B[33mIngrese el número del libro que desea modificar: \u001B[0m");
                                        int numero_libro_modificar = scanner.nextInt();
                                        if (numero_libro_modificar >= 1 && numero_libro_modificar <= contador_libros) {
                                            System.out.println(" ");
                                            System.out.print("\u001B[33mIngrese el nuevo título del libro: \u001B[0m");
                                            libros[numero_libro_modificar - 1][0] = scanner.next();
                                            System.out.print("\u001B[33mIngrese el nuevo número de páginas del libro: \u001B[0m");
                                            libros[numero_libro_modificar - 1][1] = scanner.next();
                                            System.out.print("\u001B[33mIngrese el nuevo autor del libro: \u001B[0m");
                                            libros[numero_libro_modificar - 1][2] = scanner.next();
                                            System.out.println("Libro modificado correctamente.");
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("Número de libro no válido.");
                                        }
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("No hay libros registrados.");
                                    }
                                    break;
                                case 7:
                                    // Borrar libro
                                    if (contador_libros > 0) {
                                        System.out.println(" ");
                                        System.out.print("\u001B[33mIngrese el número del libro que desea borrar: \u001B[0m");
                                        int numero_libro_borrar = scanner.nextInt();
                                        if (numero_libro_borrar >= 1 && numero_libro_borrar <= contador_libros) {
                                            // Mover todos los libros a partir de la posición del libro a borrar
                                            for (int i = numero_libro_borrar - 1; i < contador_libros - 1; i++) {
                                                libros[i][0] = libros[i + 1][0];
                                                libros[i][1] = libros[i + 1][1];
                                                libros[i][2] = libros[i + 1][2];
                                            }
                                            contador_libros--;
                                            System.out.println(" ");
                                            System.out.println("Libro borrado correctamente.");
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("Número de libro no válido.");
                                        }
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("No hay libros registrados.");
                                    }
                                    break;
                                case 8:
                                    // Información General
                                    int opcion_informacion_general;
                                    do {
                                        System.out.println(" ");
                                        System.out.println("\u001B[33m===========================\u001B[0m");
                                        System.out.println("\u001B[33mInformación General\u001B[0m");
                                        System.out.println("\u001B[33m===========================\u001B[0m");
                                        System.out.println("1. Media de edad de los clientes");
                                        System.out.println("2. Volver al menú administrador");
                                        System.out.print("\u001B[33mIngrese su opción: \u001B[0m");
                                        opcion_informacion_general = scanner.nextInt();

                                        switch (opcion_informacion_general) {
                                            case 1:
                                                // Media de edad de los clientes
                                                if (contador_clientes > 0) {
                                                    int suma_edad = 0;
                                                    for (int i = 0; i < contador_clientes; i++) {
                                                        suma_edad += Integer.parseInt(clientes[i][2]);
                                                    }
                                                    double media_edad = (double) suma_edad / contador_clientes;
                                                    System.out.println(" ");
                                                    System.out.println("\u001B[34mMedia de edad de los clientes: \u001B[0m" + media_edad);
                                                } else {
                                                    System.out.println(" ");
                                                    System.out.println("No hay clientes registrados.");
                                                }
                                                break;
                                            case 2:
                                                break; // Volver al menú administrador
                                            default:
                                                System.out.println(" ");
                                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                                        }
                                    } while (opcion_informacion_general != 2);
                                    break;
                                case 9:
                                    break; // Volver al menú principal
                                default:
                                    System.out.println(" ");
                                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                            }
                        } while (opcion_admin != 9);
                    } else {
                        System.out.println(" ");
                        System.out.println("Contraseña incorrecta. Acceso denegado.");
                    }
                    break;
                case 2:
                    // Lógica para acceder como cliente
                    System.out.println(" ");
                    System.out.print("\u001B[33mIngrese su nombre: \u001B[0m");
                    clientes[contador_clientes][0] = scanner.next();
                    System.out.print("\u001B[33mIngrese sus apellido: \u001B[0m");
                    clientes[contador_clientes][1] = scanner.next();
                    System.out.print("\u001B[33mIngrese su edad: \u001B[0m");
                    clientes[contador_clientes][2] = scanner.next();
                    contador_clientes++;

                    System.out.println(" ");
                    System.out.println("¡Bienvenido, " + clientes[contador_clientes - 1][0] + "! Su información ha sido registrada.");

                    int opcion_cliente;
                    boolean cuenta_borrada = false;

                    do {
                        // Mostrar menú cliente
                        System.out.println(" ");
                        System.out.println("\u001B[36m============\u001B[0m");
                        System.out.println("\u001B[36mMenú Cliente\u001B[0m");
                        System.out.println("\u001B[36m============\u001B[0m");
                        System.out.println("1. Cantidad de libros");
                        System.out.println("2. Ver información de un libro");
                        System.out.println("3. Borrar cuenta");
                        System.out.println("4. Volver al menú principal");
                        System.out.print("\u001B[33mIngrese su opción: \u001B[0m");
                        opcion_cliente = scanner.nextInt();

                        switch (opcion_cliente) {
                            case 1:
                                System.out.println(" ");
                                System.out.println("\u001B[34mCantidad de libros: \u001B[0m" + contador_libros);
                                break;
                            case 2:
                                // Ver información de un libro
                                if (contador_libros > 0) {
                                    System.out.println(" ");
                                    System.out.print("\u001B[33mIngrese el número del libro que desea ver: \u001B[0m");
                                    int numeroLibro = scanner.nextInt();
                                    if (numeroLibro >= 1 && numeroLibro <= contador_libros) {
                                        System.out.println(" ");
                                        System.out.println("\u001B[34mInformación del Libro " + numeroLibro + "\u001B[0m:");
                                        System.out.println("\u001B[34mTítulo: \u001B[0m" + libros[numeroLibro - 1][0]);
                                        System.out.println("\u001B[34mNúmero de Páginas: \u001B[0m" + libros[numeroLibro - 1][1]);
                                        System.out.println("\u001B[34mAutor: \u001B[0m" + libros[numeroLibro - 1][2]);
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("Número de libro no válido.");
                                    }
                                } else {
                                    System.out.println(" ");
                                    System.out.println("No hay libros registrados.");
                                }
                                break;
                            case 3:
                                // Borrar cuenta
                                if (contador_clientes > 0) {
                                    System.out.println(" ");
                                    System.out.print("\u001B[33m¿Está seguro de que desea borrar su cuenta? (1 para sí, cualquier otro número para no): \u001B[0m");
                                    int confirmacionBorrarCuenta = scanner.nextInt();
                                    if (confirmacionBorrarCuenta == 1) {
                                        // Mover todos los clientes a partir de la posición del cliente a borrar
                                        for (int i = contador_clientes - 1; i >= 0; i--) {
                                            if (i > 0) {
                                                clientes[i][0] = clientes[i - 1][0];
                                                clientes[i][1] = clientes[i - 1][1];
                                                clientes[i][2] = clientes[i - 1][2];
                                            }
                                        }
                                        contador_clientes--;
                                        System.out.println(" ");
                                        System.out.println("Cuenta borrada correctamente.");
                                        cuenta_borrada = true;
                                        break; // Salir del bucle del menú cliente
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("Operación cancelada.");
                                    }
                                } else {
                                    System.out.println(" ");
                                    System.out.println("No hay cuentas registradas.");
                                }
                                break;
                            case 4:
                                break; // Volver al menú principal
                            default:
                                System.out.println(" ");
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }

                    } while (opcion_cliente != 4 && !cuenta_borrada);
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Error. Opción no válida. Por favor, elija de nuevo.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}