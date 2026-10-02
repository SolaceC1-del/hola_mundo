import java.util.Scanner;
public class HolaMundo {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dame tu nombre");
        String nombre = sc.nextLine();
        System.out.println("dame tu edad");
        int edad = sc.nextInt();
        System.out.println("tu nombre es: " + nombre + " y tu edad es: " + edad);
    
    }

    
}






