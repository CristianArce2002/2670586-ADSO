import java.util.Scanner;

public class Ejercicio9 {

  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    System.out.print("Igrese una fecha (dia/mes/año): ");

    int fecha = entrada.nextInt();

    String longitud = String.valueOf(fecha);

    int cantidad = longitud.length();

    int digito1 = fecha / 10000000;
    int digito2 = (fecha % 10000000) / 1000000;
    int digito3 = (fecha % 1000000) / 100000;
    int digito4 = (fecha % 100000) / 10000;
    int digito5 = (fecha % 10000) / 1000;
    int digito6 = (fecha % 1000) / 100;
    int digito7 = (fecha % 100) / 10;
    int digito8 = (fecha % 10) / 1;

    System.out.print("                   "); 
    System.out.print(digito1);
    System.out.print(digito2);
    System.out.print("/");
    System.out.print(digito3);
    System.out.print(digito4);
    System.out.print("/");
    System.out.print(digito5);
    System.out.print(digito6);
    System.out.print(digito7);
    System.out.println(digito8);

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
    String y = "y ";

    String m1 = "Enero ";
    String m2 = "Febrero ";
    String m3 = "Marzo ";
    String m4 = "Abril ";
    String m5 = "Mayo ";
    String m6 = "Junio ";
    String m7 = "Julio ";
    String m8 = "Agosto ";
    String m9 = "Septiembre ";
    String m10 = "Octubre ";
    String m11 = "Noviembre ";
    String m12 = "Diciembre ";

    if (cantidad > 8 || cantidad < 7) {

      System.out.print("Ingrese un dia valido, intente de nuevo.");

    } else if (digito1 >= 3 && digito2 > 1) {

      System.out.print("Ingrese un dia valido, intente de nuevo.");

    } else if (digito3 > 1) {

      System.out.print("Ingrese un mes valido, intente de nuevo.");

    } else if (digito3 == 1 && digito4 > 2) {

      System.out.print("Ingrese un mes valido, intente de nuevo.");

    } else if (digito3 == 0 && digito4 < 1) {

      System.out.print("Ingrese un mes valido, intente de nuevo.");

    } else if (digito5 == 0 && digito6 == 0 && digito7 == 0 && digito8 == 0) {

      System.out.print("Ingrese un año valido, intente de nuevo.");

    } else {

      System.out.print("La fecha escrita es: // ");

      if (digito1 == 3) {

        if (digito2 == 0) {

          System.out.print(n30);

        } else if (digito2 != 0) {

          System.out.print(n30 + y);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito1 == 2) {

        if (digito2 == 0) {

          System.out.print(n20);

        } else if (digito2 == 1) {

          System.out.print(n21);

        } else if (digito2 == 2) {

          System.out.print(n22);

        } else if (digito2 == 3) {

          System.out.print(n23);

        } else if (digito2 == 4) {

          System.out.print(n24);

        } else if (digito2 == 5) {

          System.out.print(n25);

        } else if (digito2 == 6) {

          System.out.print(n26);

        } else if (digito2 == 7) {

          System.out.print(n27);

        } else if (digito2 == 8) {

          System.out.print(n28);

        } else if (digito2 == 9) {

          System.out.print(n29);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito1 == 1) {

        if (digito2 == 0) {

          System.out.print(n10);
        } else if (digito2 == 1) {

          System.out.print(n11);

        } else if (digito2 == 2) {

          System.out.print(n12);

        } else if (digito2 == 2) {

          System.out.print(n12);

        } else if (digito2 == 3) {

          System.out.print(n13);

        } else if (digito2 == 4) {

          System.out.print(n14);

        } else if (digito2 == 5) {

          System.out.print(n15);

        } else if (digito2 == 6) {

          System.out.print(n16);

        } else if (digito2 == 7) {

          System.out.print(n17);

        } else if (digito2 == 8) {

          System.out.print(n18);

        } else if (digito2 == 9) {

          System.out.print(n19);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito1 != 1 && digito1 != 2) {

        if (digito2 == 1) {

          System.out.print(n1);

        } else if (digito2 == 2) {

          System.out.print(n2);

        } else if (digito2 == 3) {

          System.out.print(n3);

        } else if (digito2 == 4) {

          System.out.print(n4);

        } else if (digito2 == 5) {

          System.out.print(n5);

        } else if (digito2 == 6) {

          System.out.print(n6);

        } else if (digito2 == 7) {

          System.out.print(n7);

        } else if (digito2 == 8) {

          System.out.print(n8);

        } else if (digito2 == 9) {

          System.out.print(n9);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      System.out.print("de ");

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito3 == 1) {

        if (digito4 == 0) {

          System.out.print(m10);
        } else if (digito4 == 1) {

          System.out.print(m11);

        } else if (digito4 == 2) {

          System.out.print(m12);

        }

      }

      if (digito3 != 1 && digito3 != 2) {

        if (digito4 == 1) {

          System.out.print(m1);

        } else if (digito4 == 2) {

          System.out.print(m2);

        } else if (digito4 == 3) {

          System.out.print(m3);

        } else if (digito4 == 4) {

          System.out.print(m4);

        } else if (digito4 == 5) {

          System.out.print(m5);

        } else if (digito4 == 6) {

          System.out.print(m6);

        } else if (digito4 == 7) {

          System.out.print(m7);

        } else if (digito4 == 8) {

          System.out.print(m8);

        } else if (digito4 == 9) {

          System.out.print(m9);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      System.out.print("del ");

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito5 == 1) {

        System.out.print(mil);

      } else if (digito5 == 2) {

        System.out.print(n2);

      } else if (digito5 == 3) {

        System.out.print(n3);

      } else if (digito5 == 4) {

        System.out.print(n4);

      } else if (digito5 == 5) {

        System.out.print(n5);

      } else if (digito5 == 6) {

        System.out.print(n6);

      } else if (digito5 == 7) {

        System.out.print(n7);

      } else if (digito5 == 8) {

        System.out.print(n8);

      } else if (digito5 == 9) {

        System.out.print(n9);

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito5 != 1 && digito5 != 0) {

        System.out.print("mil ");

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito6 == 9) {

        System.out.print(n900);

      } else if (digito6 == 8) {

        System.out.print(n800);

      } else if (digito6 == 7) {

        System.out.print(n700);

      } else if (digito6 == 6) {

        System.out.print(n600);

      } else if (digito6 == 5) {

        System.out.print(n500);

      } else if (digito6 == 4) {

        System.out.print(n400);

      } else if (digito6 == 3) {

        System.out.print(n300);

      } else if (digito6 == 2) {

        System.out.print(n200);

      } else if (digito6 == 1 && digito7 == 0 && digito7 == 0) {

        System.out.print(n100);

      } else if (digito6 == 1) {

        if (digito7 != 0 || digito7 != 0) {

          System.out.print(ciento);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 9) {

        if (digito8 == 0) {

          System.out.print(n90);

        } else if (digito8 != 0) {

          System.out.print(n90 + y);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 8) {

        if (digito8 == 0) {

          System.out.print(n80);

        } else if (digito8 != 0) {

          System.out.print(n80 + y);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 7) {

        if (digito8 == 0) {

          System.out.print(n70);

        } else if (digito8 != 0) {

          System.out.print(n70 + y);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 6) {

        if (digito8 == 0) {

          System.out.print(n60);

        } else if (digito8 != 0) {

          System.out.print(n60 + y);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 5) {

        if (digito8 == 0) {

          System.out.print(n50);

        } else if (digito8 != 0) {

          System.out.print(n50 + y);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 4) {

        if (digito8 == 0) {

          System.out.print(n40);

        } else if (digito8 != 0) {

          System.out.print(n40 + y);
        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 3) {

        if (digito8 == 0) {

          System.out.print(n30);

        } else if (digito8 != 0) {

          System.out.print(n30 + y);
        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 2) {

        if (digito8 == 0) {

          System.out.print(n20);

        } else if (digito8 == 1) {

          System.out.print(ventiun);

        } else if (digito8 == 2) {

          System.out.print(n22);

        } else if (digito8 == 3) {

          System.out.print(n23);

        } else if (digito8 == 4) {

          System.out.print(n24);

        } else if (digito8 == 5) {

          System.out.print(n25);

        } else if (digito8 == 6) {

          System.out.print(n26);

        } else if (digito8 == 7) {

          System.out.print(n27);

        } else if (digito8 == 8) {

          System.out.print(n28);

        } else if (digito8 == 9) {

          System.out.print(n29);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 == 1) {

        if (digito8 == 0) {

          System.out.print(n10);
        } else if (digito8 == 1) {

          System.out.print(n11);

        } else if (digito8 == 2) {

          System.out.print(n12);

        } else if (digito8 == 2) {

          System.out.print(n12);

        } else if (digito8 == 3) {

          System.out.print(n13);

        } else if (digito8 == 4) {

          System.out.print(n14);

        } else if (digito8 == 5) {

          System.out.print(n15);

        } else if (digito8 == 6) {

          System.out.print(n16);

        } else if (digito8 == 7) {

          System.out.print(n17);

        } else if (digito8 == 8) {

          System.out.print(n18);

        } else if (digito8 == 9) {

          System.out.print(n19);

        }

      }

      /*-------------------------------------------------------------------------------------------------------------- */

      if (digito7 != 1 && digito7 != 2) {

        if (digito8 == 1) {

          System.out.print(n1);

        } else if (digito8 == 2) {

          System.out.print(n2);

        } else if (digito8 == 3) {

          System.out.print(n3);

        } else if (digito8 == 4) {

          System.out.print(n4);

        } else if (digito8 == 5) {

          System.out.print(n5);

        } else if (digito8 == 6) {

          System.out.print(n6);

        } else if (digito8 == 7) {

          System.out.print(n7);

        } else if (digito8 == 8) {

          System.out.print(n8);

        } else if (digito8 == 9) {

          System.out.print(n9);

        }

      }

      System.out.print("//");

    }

  }

}
