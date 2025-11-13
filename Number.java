public class Number{
 public static void main(String[] args){
        int prime =0;
        for(int i = 1; i <= 20; i++){
            for(int j = 1; j<=i-1; j++){
                if(i % j != 0){
                    prime = i;
                }else{
                    System.out.println(i);
                }
            }            
        }
        System.out.print(prime);
    }
}
