import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in); //Creates a scanner obejct
        System.out.println("Enter your name");
        String user = sc.nextLine(); //Reads users input
        System.out.println("Nice to meet you " + user);
        //Hi this is to test if this change will update in Jenkins
        //Test 2.0
    }
}
