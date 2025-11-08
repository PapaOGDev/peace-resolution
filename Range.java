import java.util.Scanner;
public class Range{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if(number>=1 && number<=100){
            System.out.println("In Range");
        }else{
            System.out.println("Out of Range");
        }
    }
}
