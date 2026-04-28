import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperaturaSensor[][] = new int[3][3];
        for (int i = 0; i < temperaturaSensor.length; i++) {
            System.out.println("registrar temperaturas de la zona " + i);
            for (int j = 0; j < temperaturaSensor[i].length; j++) {
                System.out.print(" ingrese la  temperaturas del sensor " + j + " : ");
                temperaturaSensor[i][j] = sc.nextInt();
            }
        }
        promedioZona(temperaturaSensor);
        System.out.println("promedio general es " + promedioGeneral(temperaturaSensor));
        valoresCriticos(temperaturaSensor);
    }

    public static void promedioZona(int temperaturas[][]) {
        for (int i = 0; i < temperaturas.length; i++) {

            int suma = 0;

            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
            }

            double promedio = (double) suma / temperaturas[i].length;

            System.out.println("Promedio de la zona " + i + ": " + promedio);
        }
    }

    public static double promedioGeneral(int temperaturas[][]) {

        int suma = 0;
        int totalSensores = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
                totalSensores++;
            }
        }

        return (double) suma / totalSensores;


    }

    public static void valoresCriticos(int temperaturas[][]) {
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {

                if (temperaturas[i][j] > 80) {
                    System.out.println("⚠ Valor crítico en zona " + i +
                            " sensor " + j +
                            ": " + temperaturas[i][j]);
                }
            }
        }
    }
}