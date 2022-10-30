import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /*====== Seleccion de menu ====== */
        int opcion = 0;
        /*====== Variables cantidad de personas por piso ====== */
        int NPpiso1 = 0, NPpiso2 = 0, NPpiso3 = 0, NPpiso4 = 0, NPpiso5 = 0, PB = 0;
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
                    if (nPiso > 5 || nPiso < 1) {
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
                /*====== Numero de piso ====== */
                int nPiso = 0;
                /*====== Bandera si piso no existe ====== */
                boolean vfPiso = false;
                /*====== Solicitando datos ====== */
                System.out.print("Ingresa el piso que deseas consultar: ");
                nPiso = lector.nextInt();

                /*====== Verificando si el piso ingresado existe ====== */
                while (!vfPiso) {
                    if (nPiso > 5 || nPiso < 1) {
                        System.out.print("El numero de piso ingresado no existe, intenta de nuevo: ");
                        nPiso = lector.nextInt();
                    } else {
                        vfPiso = true;
                    }
                }

                /*====== Mostrando numero de personas por piso ====== */
                if (nPiso == 1) {
                    System.out.println("Hay " + NPpiso1 + " personas en el piso " + nPiso);
                } else if (nPiso == 2) {
                    System.out.println("Hay " + NPpiso2 + " personas en el piso " + nPiso);
                } else if (nPiso == 3) {
                    System.out.println("Hay " + NPpiso3 + " personas en el piso " + nPiso);
                } else if (nPiso == 4) {
                    System.out.println("Hay " + NPpiso4 + " personas en el piso " + nPiso);
                } else if (nPiso == 5) {
                    System.out.println("Hay " + NPpiso5 + " personas en el piso " + nPiso);
                }


            } else if (opcion == 3) {
                /*====== Piso de donde bajar a las personas  ====== */
                int nPiso = 0;
                /*====== Bandera para verificar si el numero de piso existe ====== */
                boolean vfPiso = false;
                /*====== Solicitando dato ====== */
                System.out.print("De que piso deseas bajar a las personas: ");
                nPiso = lector.nextInt();

                /*====== Verificando si el piso ingresado existe ====== */
                while (!vfPiso) {
                    if (nPiso > 5 || nPiso < 1) {
                        System.out.print("El numero de piso ingresado no existe, intenta de nuevo: ");
                        nPiso = lector.nextInt();
                    } else {
                        vfPiso = true;
                    }
                }

                /*====== Bajando personas del piso seleccionado a la planta baja ====== */
                int tanda = 0, diferencia = 0;
                if (nPiso == 1) {
                    int tandaPersonas = NPpiso1 + 5;
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > NPpiso1) {
                            tanda -= 5;
                            diferencia = NPpiso1 - tanda;
                            tanda += diferencia;
                            PB += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Bajando: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Bajando: 5 personas.");
                            PB += 5;
                        }
                    }
                    NPpiso1 = 0;
                    System.out.println(tanda + " personas bajadas. " + PB + " personas en la planta baja y " + NPpiso1 + " personas en el piso " + nPiso);
                } else if (nPiso == 2) {
                    int tandaPersonas = NPpiso2 + 5;
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > NPpiso2) {
                            tanda -= 5;
                            diferencia = NPpiso2 - tanda;
                            tanda += diferencia;
                            PB += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Bajando: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Bajando: 5 personas.");
                            PB += 5;
                        }
                    }
                    NPpiso2 = 0;
                    System.out.println(tanda + " personas bajadas. " + PB + " personas en la planta baja y " + NPpiso2 + " personas en el piso " + nPiso);
                } else if (nPiso == 3) {
                    int tandaPersonas = NPpiso3 + 5;
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > NPpiso3) {
                            tanda -= 5;
                            diferencia = NPpiso3 - tanda;
                            tanda += diferencia;
                            PB += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Bajando: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Bajando: 5 personas.");
                            PB += 5;
                        }
                    }
                    NPpiso3 = 0;
                    System.out.println(tanda + " personas bajadas. " + PB + " personas en la planta baja y " + NPpiso3 + " personas en el piso " + nPiso);
                } else if (nPiso == 4) {
                    int tandaPersonas = NPpiso4 + 5;
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > NPpiso4) {
                            tanda -= 5;
                            diferencia = NPpiso4 - tanda;
                            tanda += diferencia;
                            PB += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Bajando: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Bajando: 5 personas.");
                            PB += 5;
                        }
                    }
                    NPpiso4 = 0;
                    System.out.println(tanda + " personas bajadas. " + PB + " personas en la planta baja y " + NPpiso4 + " personas en el piso " + nPiso);
                } else if (nPiso == 5) {
                    int tandaPersonas = NPpiso5 + 5;
                    while (tandaPersonas > 0) {
                        tandaPersonas -= 5;
                        tanda += 5;
                        if (tanda > NPpiso5) {
                            tanda -= 5;
                            diferencia = NPpiso5 - tanda;
                            tanda += diferencia;
                            PB += diferencia;
                            if (diferencia > 0) {
                                System.out.println("Bajando: " + diferencia + " personas.");
                            }
                        } else {
                            System.out.println("Bajando: 5 personas.");
                            PB += 5;
                        }
                    }
                    NPpiso5 = 0;
                    System.out.println(tanda + " personas bajadas. " + PB + " personas en la planta baja y " + NPpiso5 + " personas en el piso " + nPiso);
                }


            } else if (opcion == 4) {
                /*====== Suma de todos los ocupantes en los pisos 1 --> 5  ====== */
                int CNpisos = NPpiso1 + NPpiso2 + NPpiso3 + NPpiso4 + NPpiso5;

                /*====== Bajando personas de todos los pisos a la planta baja ====== */
                int tanda = 0, diferencia = 0;
                int tandaPersonas = CNpisos + 5;
                while (tandaPersonas > 0) {
                    tandaPersonas -= 5;
                    tanda += 5;
                    if (tanda > CNpisos) {
                        tanda -= 5;
                        diferencia = CNpisos - tanda;
                        tanda += diferencia;
                        PB += diferencia;
                        if (diferencia > 0) {
                            System.out.println("Bajando: " + diferencia + " personas.");
                        }
                    } else {
                        System.out.println("Bajando: 5 personas.");
                        PB += 5;
                    }
                }
                CNpisos = 0;
                NPpiso1 = 0;
                NPpiso2 = 0;
                NPpiso3 = 0;
                NPpiso4 = 0;
                NPpiso5 = 0;
                System.out.println(tanda + " personas bajadas. " + PB + " personas en la planta baja.");
            } else if (opcion == 5) {
                /*====== Suma de todos los ocupantes en los pisos 1 --> 5  ====== */
                int CNpisos = NPpiso1 + NPpiso2 + NPpiso3 + NPpiso4 + NPpiso5;

                System.out.println("Hay " + CNpisos + " perosonas en todo el hotel y han salido " + PB + " personas a lo largo de la jornada.");


            } else if (opcion == 6) {
                System.out.print("¡Nos vemos!!");
                estadoP = true;
            }
//            estadoP = true;
        }
    }

}