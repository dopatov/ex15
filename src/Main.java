import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int edad,media_edad,suma_edad,mayor_edad,mayor_175;
        double altura,media_altura,suma_alt;
        Scanner sc =new Scanner(System.in);

        mayor_edad=0;
        media_altura=0;
        mayor_175=0;
        suma_edad=0;
        suma_alt=0;

        System.out.println("Hello World!");

        for (int i=1; i<=5;i++){

            System.out.println("introduzca la edad del alumno " +i +": ");
            edad=sc.nextInt();

            System.out.println("introduzca la altura del alumno " +i +": ");
            altura=sc.nextDouble();

            if (edad>18){
                mayor_edad++;
            }
            if (altura>1.75){
                mayor_175++;
            }
            suma_alt=suma_alt+altura;
            suma_edad=suma_edad+edad;
        }
        media_altura=suma_alt/5;
        media_edad=suma_edad/5;
        System.out.println("la media de altura de los alumnos es: " +media_altura);
        System.out.println("la media de edad de los alumnos es: " +media_edad);
        System.out.println("el numero de alumnos mayores de edad: " +mayor_edad);
        System.out.println("el numero de alumnos mas altos que 1,75" +mayor_175);
    }
}
