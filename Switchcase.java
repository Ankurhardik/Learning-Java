import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.nextLine();
        switch(fruit){
            case "Mango":
            System.out.println("king");
            break;
            case "Apple":
            System.out.println("Doctor");
            break;
            case "Orange":
            System.out.println("Juice");
            break;
            default:
            System.out.println("enter a valid fruit");
        }
    }
}
