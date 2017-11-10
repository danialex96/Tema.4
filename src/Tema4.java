import java.util.Scanner;

public class Tema4 {


    public static void main(String[] args) {
        float temperatura;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Temperatura in Fahrenheit");
        temperatura = in.nextInt();

        temperatura = ((temperatura - 32) * 5) / 9;

        System.out.println("Temperatura in Celsius = " + temperatura);


    }
}
