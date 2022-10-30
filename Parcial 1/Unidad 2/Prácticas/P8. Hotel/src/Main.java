import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /*====== Seleccion de menu ====== */
        int opcion = 0;
        /*====== Variables cantidad de personas por piso ====== */
        int NPpiso1 = 0, NPpiso2 = 0, NPpiso3 = 0, NPpiso4 = 0, NPpiso5 = 0;
        /*====== Estado del programa ====== */
        boolean estadoP = false;

        /*====== Repeticion mientras el usuario no seleccione salir del programa ====== */
        while (!estadoP) {
            System.out.print("================SELECCIONA UNA OPCIÓN================\n");
            System.out.print("1.............Subir personas\n");
            System.out.print("2.............Personas por piso\n");
            System.out.print("3.............Bajar personas de un piso\n");
            System.out.print("4.............Bajar a todos de todos los pisos\n");
            System.out.print("5.............Cantidad de personas en el hotel y cuanas han salido\n");
            System.out.print("6.............Salir\n");
            System.out.print("=====================================================\n");
            System.out.print("\n");
            System.out.print("Opción: ");
            /*====== Solicitando opcion ====== */
            opcion = lector.nextInt();

            /*====== Acciones por opcion ====== */
            if (opcion == 1) {
                /*====== Cantidad de personas a subir y numero de piso ====== */
                int cnPersonas = 0, nPiso = 0;
                /*====== Bandera si n piso no existe ====== */
                boolean vfPiso = false;

                /*====== Solicitando datos ====== */
                System.out.print("Cuantas personas deseas subir: ");
                cnPersonas = lector.nextInt();
                System.out.print("A que piso las necesitas llevar: ");
                nPiso = lector.nextInt();

                /*====== Verificando si el piso ingresado existe ====== */
                while (!vfPiso) {
                    if (nPiso > 5) {
                        System.out.print("El numero de piso ingresado no existe, intenta de nuevo: ");
                        nPiso = lector.nextInt();
                    } else {
                        vfPiso = true;
                    }
                }

                /*====== Subiendo las personas en tandas de 5 por piso seleccionado====== */
                int tandaPersonas = cnPersonas + 5, tanda = 0, diferencia = 0;
                if (nPiso == 1) {
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > cnPersonas) {
                            tanda -= 5;
                            diferencia = cnPersonas - tanda;
                            tanda += diferencia;
                            NPpiso1 += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Subiendo: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Subiendo: 5 personas.");
                            NPpiso1 += 5;
                        }
                    }
                    System.out.println(tanda + " personas subidas. " + NPpiso1 + " personas en el piso " + nPiso);
                } else if (nPiso == 2) {
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > cnPersonas) {
                            tanda -= 5;
                            diferencia = cnPersonas - tanda;
                            tanda += diferencia;
                            NPpiso2 += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Subiendo: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Subiendo: 5 personas.");
                            NPpiso2 += 5;
                        }
                    }
                    System.out.println(tanda + " personas subidas. " + NPpiso2 + " personas en el piso " + nPiso);
                } else if (nPiso == 3) {
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > cnPersonas) {
                            tanda -= 5;
                            diferencia = cnPersonas - tanda;
                            tanda += diferencia;
                            NPpiso3 += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Subiendo: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Subiendo: 5 personas.");
                            NPpiso3 += 5;
                        }
                    }
                    System.out.println(tanda + " personas subidas. " + NPpiso3 + " personas en el piso " + nPiso);
                } else if (nPiso == 4) {
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > cnPersonas) {
                            tanda -= 5;
                            diferencia = cnPersonas - tanda;
                            tanda += diferencia;
                            NPpiso4 += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Subiendo: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Subiendo: 5 personas.");
                            NPpiso4 += 5;
                        }
                    }
                    System.out.println(tanda + " personas subidas. " + NPpiso4 + " personas en el piso " + nPiso);
                } else if (nPiso == 5) {
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > cnPersonas) {
                            tanda -= 5;
                            diferencia = cnPersonas - tanda;
                            tanda += diferencia;
                            NPpiso5 += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Subiendo: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Subiendo: 5 personas.");
                            NPpiso5 += 5;
                        }
                    }
                    System.out.println(tanda + " personas subidas. " + NPpiso5 + " personas en el piso " + nPiso);
                }

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {
                System.out.print("¡Nos vemos!!");
                estadoP = true;
            }
            estadoP = true;
        }
    }

}

