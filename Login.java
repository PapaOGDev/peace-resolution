import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        String username = "Oluwagbogo";
        String pin = "234671";
        Scanner input = new Scanner(System.in);
        System.out.println("Ehter your username: ");
        String newUsername = input.nextLine();
        System.out.println("Enter your 6-digit pin: ");
        String newPin = input.nextLine();
//        String converted = ((int) newPin);
//        System.out.print(converted);
        if(pin == newPin && username == newUsername){
                System.out.print("Login successful");
        }else{
                System.out.print("Login failed");
        }
    }
}
