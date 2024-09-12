
import java.util.scanner;
public class example2{
    public static void main (string[]args)
    {
        scanner sc = new scanner(system.in);
        //asking for the user name
        system.out.println("whats your name bwana");
        string name = sc.nextline();
        //asking the nigga his age
        system.out.println("how old are you papa");
        int age = sc.nextline();
        //we are asking how much he earns 
        system.out.println("how much do you earn monthly");
        double income = sc.nextline();
        //asking favorite color
        system.out
        .println("whats your favorite color");
        string color = sc.nextline();


        //print information
        system.out.println("name;" +name);
        system.out.println("age;" +age);
        system.out.println("income;" +income);
        system.out.println("color"+color);
        scanner.close();
    }
}
