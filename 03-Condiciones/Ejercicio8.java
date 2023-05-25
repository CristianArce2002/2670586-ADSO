import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Igrese un numero (Maximo 9 dígitos): ");

        int numero = entrada.nextInt();

        System.out.print("El numero en palabras es: // ");

        int digito1 = numero / 100000000;
        int digito2 = (numero % 100000000) / 10000000;
        int digito3 = (numero % 10000000) / 1000000;
        int digito4 = (numero % 1000000) / 100000;
        int digito5 = (numero % 100000) / 10000;
        int digito6 = (numero % 10000) / 1000;
        int digito7 = (numero % 1000) / 100;
        int digito8 = (numero % 100) / 10;
        int digito9 = (numero % 10) / 1;

        String un = "un ";

        String n1 = "uno ";
        String n2 = "dos ";
        String n3 = "tres ";
        String n4 = "cuatro ";
        String n5 = "cinco ";
        String n6 = "seis ";
        String n7 = "siete ";
        String n8 = "ocho ";
        String n9 = "nueve ";

        String n10 = "diez ";
        String n20 = "veinte ";
        String n30 = "treinta ";
        String n40 = "cuarenta ";
        String n50 = "cincuenta ";
        String n60 = "sesenta ";
        String n70 = "setenta ";
        String n80 = "ochenta ";
        String n90 = "noventa ";

        String n11 = "once ";
        String n12 = "doce ";
        String n13 = "trece ";
        String n14 = "catorce ";
        String n15 = "quince ";
        String n16 = "dieciseis ";
        String n17 = "diecisiete ";
        String n18 = "dieciocho ";
        String n19 = "diecinueve ";

        String ventiun = "veintiun ";

        String n21 = "veintiuno ";
        String n22 = "veintidos ";
        String n23 = "veintitres ";
        String n24 = "veinticuatro ";
        String n25 = "veinticinco ";
        String n26 = "veintiseis ";
        String n27 = "veintisiete ";
        String n28 = "veintiocho ";
        String n29 = "veintinueve ";

        String ciento = "ciento ";
        String n100 = "cien ";
        String n200 = "doscientos ";
        String n300 = "trescientos ";
        String n400 = "cuatrocientos ";
        String n500 = "quinientos ";
        String n600 = "seiscientos ";
        String n700 = "setecientos ";
        String n800 = "ochocientos ";
        String n900 = "novecientos ";

        String mil = "mil ";
        String millones = "millones ";
        String millon = "millon ";

        String y = "y ";

        if (numero > 999999999) {

            System.out.print("Este numero sobrepasa los 9 digitos, intente de nuevo.");
        } else {

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito1 == 9) {

                System.out.print(n900);

            } else if (digito1 == 8) {

                System.out.print(n800);

            } else if (digito1 == 7) {

                System.out.print(n700);

            } else if (digito1 == 6) {

                System.out.print(n600);

            } else if (digito1 == 5) {

                System.out.print(n500);

            } else if (digito1 == 4) {

                System.out.print(n400);

            } else if (digito1 == 3) {

                System.out.print(n300);

            } else if (digito1 == 2) {

                System.out.print(n200);

            } else if (digito1 == 1 && digito2 == 0 && digito3 == 0) {

                System.out.print(n100);

            } else if (digito1 == 1) {

                if (digito2 != 0 || digito3 != 0) {

                    System.out.print(ciento);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 9) {

                if (digito3 == 0) {

                    System.out.print(n90);

                } else if (digito3 != 0) {

                    System.out.print(n90 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 8) {

                if (digito3 == 0) {

                    System.out.print(n80);

                } else if (digito3 != 0) {

                    System.out.print(n80 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 7) {

                if (digito3 == 0) {

                    System.out.print(n70);

                } else if (digito3 != 0) {

                    System.out.print(n70 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 6) {

                if (digito3 == 0) {

                    System.out.print(n60);

                } else if (digito3 != 0) {

                    System.out.print(n60 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 5) {

                if (digito3 == 0) {

                    System.out.print(n50);

                } else if (digito3 != 0) {

                    System.out.print(n50 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 4) {

                if (digito3 == 0) {

                    System.out.print(n40);

                } else if (digito3 != 0) {

                    System.out.print(n40 + y);
                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 3) {

                if (digito3 == 0) {

                    System.out.print(n30);

                } else if (digito3 != 0) {

                    System.out.print(n30 + y);
                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 2) {

                if (digito3 == 0) {

                    System.out.print(n20);

                } else if (digito3 == 1) {

                    System.out.print(ventiun);

                } else if (digito3 == 2) {

                    System.out.print(n22);

                } else if (digito3 == 3) {

                    System.out.print(n23);

                } else if (digito3 == 4) {

                    System.out.print(n24);

                } else if (digito3 == 5) {

                    System.out.print(n25);

                } else if (digito3 == 6) {

                    System.out.print(n26);

                } else if (digito3 == 7) {

                    System.out.print(n27);

                } else if (digito3 == 8) {

                    System.out.print(n28);

                } else if (digito3 == 9) {

                    System.out.print(n29);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 == 1) {

                if (digito3 == 0) {

                    System.out.print(n10);
                } else if (digito3 == 1) {

                    System.out.print(n11);

                } else if (digito3 == 2) {

                    System.out.print(n12);

                } else if (digito3 == 2) {

                    System.out.print(n12);

                } else if (digito3 == 3) {

                    System.out.print(n13);

                } else if (digito3 == 4) {

                    System.out.print(n14);

                } else if (digito3 == 5) {

                    System.out.print(n15);

                } else if (digito3 == 6) {

                    System.out.print(n16);

                } else if (digito3 == 7) {

                    System.out.print(n17);

                } else if (digito3 == 8) {

                    System.out.print(n18);

                } else if (digito3 == 9) {

                    System.out.print(n19);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito2 != 1 && digito2 != 2) {

                if (digito3 == 1) {

                    System.out.print(un);

                } else if (digito3 == 2) {

                    System.out.print(n2);

                } else if (digito3 == 3) {

                    System.out.print(n3);

                } else if (digito3 == 4) {

                    System.out.print(n4);

                } else if (digito3 == 5) {

                    System.out.print(n5);

                } else if (digito3 == 6) {

                    System.out.print(n6);

                } else if (digito3 == 7) {

                    System.out.print(n7);

                } else if (digito3 == 8) {

                    System.out.print(n8);

                } else if (digito3 == 9) {

                    System.out.print(n9);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (numero > 1000000) {

                if (digito1 == 0 && digito2 == 0 && digito3 == 1){

                    System.out.print(millon);
                    
                }else{

                    System.out.print(millones);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito4 == 9) {

                System.out.print(n900);

            } else if (digito4 == 8) {

                System.out.print(n800);

            } else if (digito4 == 7) {

                System.out.print(n700);

            } else if (digito4 == 6) {

                System.out.print(n600);

            } else if (digito4 == 5) {

                System.out.print(n500);

            } else if (digito4 == 4) {

                System.out.print(n400);

            } else if (digito4 == 3) {

                System.out.print(n300);

            } else if (digito4 == 2) {

                System.out.print(n200);

            } else if (digito4 == 1 && digito5 == 0 && digito6 == 0) {

                System.out.print(n100);

            } else if (digito4 == 1) {

                if (digito5 != 0 || digito6 != 0) {

                    System.out.print(ciento);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 9) {

                if (digito6 == 0) {

                    System.out.print(n90);

                } else if (digito6 != 0) {

                    System.out.print(n90 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 8) {

                if (digito6 == 0) {

                    System.out.print(n80);

                } else if (digito6 != 0) {

                    System.out.print(n80 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 7) {

                if (digito6 == 0) {

                    System.out.print(n70);

                } else if (digito6 != 0) {

                    System.out.print(n70 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 6) {

                if (digito6 == 0) {

                    System.out.print(n60);

                } else if (digito6 != 0) {

                    System.out.print(n60 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 5) {

                if (digito6 == 0) {

                    System.out.print(n50);

                } else if (digito6 != 0) {

                    System.out.print(n50 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 4) {

                if (digito6 == 0) {

                    System.out.print(n40);

                } else if (digito6 != 0) {

                    System.out.print(n40 + y);
                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 3) {

                if (digito6 == 0) {

                    System.out.print(n30);

                } else if (digito6 != 0) {

                    System.out.print(n30 + y);
                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 2) {

                if (digito6 == 0) {

                    System.out.print(n20);

                } else if (digito6 == 1) {

                    System.out.print(ventiun);

                } else if (digito6 == 2) {

                    System.out.print(n22);

                } else if (digito6 == 3) {

                    System.out.print(n23);

                } else if (digito6 == 4) {

                    System.out.print(n24);

                } else if (digito6 == 5) {

                    System.out.print(n25);

                } else if (digito6 == 6) {

                    System.out.print(n26);

                } else if (digito6 == 7) {

                    System.out.print(n27);

                } else if (digito6 == 8) {

                    System.out.print(n28);

                } else if (digito6 == 9) {

                    System.out.print(n29);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 == 1) {

                if (digito6 == 0) {

                    System.out.print(n10);
                } else if (digito6 == 1) {

                    System.out.print(n11);

                } else if (digito6 == 2) {

                    System.out.print(n12);

                } else if (digito6 == 2) {

                    System.out.print(n12);

                } else if (digito6 == 3) {

                    System.out.print(n13);

                } else if (digito6 == 4) {

                    System.out.print(n14);

                } else if (digito6 == 5) {

                    System.out.print(n15);

                } else if (digito6 == 6) {

                    System.out.print(n16);

                } else if (digito6 == 7) {

                    System.out.print(n17);

                } else if (digito6 == 8) {

                    System.out.print(n18);

                } else if (digito6 == 9) {

                    System.out.print(n19);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito5 != 1 && digito5 != 2) {

                if (digito6 == 1) {

                    if (digito5 == 0 && digito4 == 0) {

                        System.out.print(mil);

                    } else {

                        System.out.print(un);

                    }

                } else if (digito6 == 2) {

                    System.out.print(n2);

                } else if (digito6 == 3) {

                    System.out.print(n3);

                } else if (digito6 == 4) {

                    System.out.print(n4);

                } else if (digito6 == 5) {

                    System.out.print(n5);

                } else if (digito6 == 6) {

                    System.out.print(n6);

                } else if (digito6 == 7) {

                    System.out.print(n7);

                } else if (digito6 == 8) {

                    System.out.print(n8);

                } else if (digito6 == 9) {

                    System.out.print(n9);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */
            
            if (numero > 1000){

                if (digito4 != 0 || digito5 != 0 | digito6 != 1 && digito6 != 0) {

                    System.out.print(mil);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito7 == 9) {

                System.out.print(n900);

            } else if (digito7 == 8) {

                System.out.print(n800);

            } else if (digito7 == 7) {

                System.out.print(n700);

            } else if (digito7 == 6) {

                System.out.print(n600);

            } else if (digito7 == 5) {

                System.out.print(n500);

            } else if (digito7 == 4) {

                System.out.print(n400);

            } else if (digito7 == 3) {

                System.out.print(n300);

            } else if (digito7 == 2) {

                System.out.print(n200);

            } else if (digito7 == 1 && digito8 == 0 && digito9 == 0) {

                System.out.print(n100);

            } else if (digito7 == 1) {

                if (digito8 != 0 || digito9 != 0) {

                    System.out.print(ciento);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 9) {

                if (digito9 == 0) {

                    System.out.print(n90);

                } else if (digito9 != 0) {

                    System.out.print(n90 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 8) {

                if (digito9 == 0) {

                    System.out.print(n80);

                } else if (digito9 != 0) {

                    System.out.print(n80 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 7) {

                if (digito9 == 0) {

                    System.out.print(n70);

                } else if (digito9 != 0) {

                    System.out.print(n70 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 6) {

                if (digito9 == 0) {

                    System.out.print(n60);

                } else if (digito9 != 0) {

                    System.out.print(n60 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 5) {

                if (digito9 == 0) {

                    System.out.print(n50);

                } else if (digito9 != 0) {

                    System.out.print(n50 + y);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 4) {

                if (digito9 == 0) {

                    System.out.print(n40);

                } else if (digito9 != 0) {

                    System.out.print(n40 + y);
                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 3) {

                if (digito9 == 0) {

                    System.out.print(n30);

                } else if (digito9 != 0) {

                    System.out.print(n30 + y);
                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 2) {

                if (digito9 == 0) {

                    System.out.print(n20);

                } else if (digito9 == 1) {

                    System.out.print(n21);

                } else if (digito9 == 2) {

                    System.out.print(n22);

                } else if (digito9 == 3) {

                    System.out.print(n23);

                } else if (digito9 == 4) {

                    System.out.print(n24);

                } else if (digito9 == 5) {

                    System.out.print(n25);

                } else if (digito9 == 6) {

                    System.out.print(n26);

                } else if (digito9 == 7) {

                    System.out.print(n27);

                } else if (digito9 == 8) {

                    System.out.print(n28);

                } else if (digito9 == 9) {

                    System.out.print(n29);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 == 1) {

                if (digito9 == 0) {

                    System.out.print(n10);
                } else if (digito9 == 1) {

                    System.out.print(n11);

                } else if (digito9 == 2) {

                    System.out.print(n12);

                } else if (digito9 == 2) {

                    System.out.print(n12);

                } else if (digito9 == 3) {

                    System.out.print(n13);

                } else if (digito9 == 4) {

                    System.out.print(n14);

                } else if (digito9 == 5) {

                    System.out.print(n15);

                } else if (digito9 == 6) {

                    System.out.print(n16);

                } else if (digito9 == 7) {

                    System.out.print(n17);

                } else if (digito9 == 8) {

                    System.out.print(n18);

                } else if (digito9 == 9) {

                    System.out.print(n19);

                }

            }

            /*-------------------------------------------------------------------------------------------------------------- */

            if (digito8 != 1 && digito8 != 2) {

                if (digito9 == 1) {

                    System.out.print(n1);

                } else if (digito9 == 2) {

                    System.out.print(n2);

                } else if (digito9 == 3) {

                    System.out.print(n3);

                } else if (digito9 == 4) {

                    System.out.print(n4);

                } else if (digito9 == 5) {

                    System.out.print(n5);

                } else if (digito9 == 6) {

                    System.out.print(n6);

                } else if (digito9 == 7) {

                    System.out.print(n7);

                } else if (digito9 == 8) {

                    System.out.print(n8);

                } else if (digito9 == 9) {

                    System.out.print(n9);

                }

            }

            System.out.print("//");

        }

    }

}
