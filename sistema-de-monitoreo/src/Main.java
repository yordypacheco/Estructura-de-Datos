import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperaturaSensor[][] = new int[3][3];
        for (int i = 0; i < temperaturaSensor.length; i++) {
            System.out.print("registrar temperaturas de la zona" + i);
            for (int j = 0; j < temperaturaSensor.length; i++) {
                System.out.print("ingrese la  temperaturas del sensor " + j);
                temperaturaSensor[i][j] = sc.nextInt();
            }
        }
        promedioZona(temperaturaSensor);
        System.out.println("promedio general es " + promedioGeneral(temperaturaSensor));
        valoresCriticos(temperaturaSensor);
    }

    public static void promedioZona(int temperaturas[][]) {

    }

    public static double promedioGeneral(int temperaturas[][]) {
        return 0;
    }

    public static void valoresCriticos(int temperaturas[][]) {

    }
}