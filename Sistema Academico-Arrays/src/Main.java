import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos estudiantes quiere registrar");
        int contar;
        contar=sc.nextInt();

        double notas[] = new double[contar];

        for (int i = 0; i < notas.length; i++) {

            System.out.println("ingrese la nota  numero " + i);
            notas[i] = sc.nextDouble();
        }
        System.out.println("el promedio de las notas es: " + promedio(notas));
        System.out.println("la nota maxima del curso es : " + NotaMaxima(notas));
        System.out.println("la nota minima del curso es : " + NotaMinima(notas));
        System.out.println("la nota minima del curso es : " + NotaMinima(notas));
        System.out.println("cantidad de estudiantes que aprobaron : " + EstudianteAprobado(notas));



    }

    public static double promedio(double[] notas) {
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];

        }
        return suma / notas.length;

    }

    public static double NotaMaxima(double notas[]) {
        double NotaMax = 0;
        for (double nota : notas) {
            if (nota > NotaMax) {
                NotaMax = nota;
            }

        }
        return NotaMax;
    }

    public static double NotaMinima(double notas[]) {
        double NotaMin = 5;
        for (double nota : notas) {
            if (nota < NotaMin) {
                NotaMin = nota;
            }

        }
        return NotaMin;
    }

    public static byte EstudianteAprobado(double notas[]) {
        byte cant = 0;
        for (double nota : notas) {
            if (nota >= 3) {
                cant++;
            }

        }
        return cant;
    }
}