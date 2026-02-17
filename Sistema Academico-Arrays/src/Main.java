import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double notas[] = new double[10];

for (int i=0; i < notas.length; i++){

            System.out.println("ingrese la nota  numero " + i);
            notas[i]= sc.nextDouble();
        }
System.out.println("el promedio de las notas es: " + promedio(notas));
    }
    public double promedio(double []notas){
        double suma =0;

        for (int i=0; i< notas.length;i++){
            suma +=notas[i];

        }
        return  suma/notas.length;

    }
}