public class Ejercicio2 {
    public static void main(String[] args) {

        int año_aleatorio = (int) Math.floor(Math.random() * 9999 + 1);

        int mes_aleatorio = (int) Math.floor(Math.random() * 12 + 1);

        int dia_aleatorio = 0;

        boolean bisiesto = false;

        if (año_aleatorio % 4 == 0) {
            if (año_aleatorio % 100 == 0) {
                if (año_aleatorio % 400 == 0) {
                    bisiesto = true;
                }
            } else if (año_aleatorio % 400 != 0) {
                bisiesto = true;
            }
        }

        if (mes_aleatorio == 1 || mes_aleatorio == 3 || mes_aleatorio == 5 || mes_aleatorio == 7 || mes_aleatorio == 8
                || mes_aleatorio == 10 || mes_aleatorio == 12) {

            dia_aleatorio = (int) Math.floor(Math.random() * 31 + 1);

        } else if (mes_aleatorio == 2) {

            if (bisiesto == true) {
                dia_aleatorio = (int) Math.floor(Math.random() * 29 + 1);
            } else {
                dia_aleatorio = (int) Math.floor(Math.random() * 28 + 1);
            }
        } else {
            dia_aleatorio = (int) Math.floor(Math.random() * 30 + 1);
        }

        int fecha = (dia_aleatorio * 100 + mes_aleatorio) * 10000 + año_aleatorio;

        System.out.print("La fecha generada es: ");

        if (fecha < 10000000) {
            System.out.print("0");
        }
        
        System.out.print(fecha);

    }

}
