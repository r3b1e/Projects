import java.util.*;
public class stonepaperseasor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 3);
        System.out.println("INTRUCTION\n0-Stone\n1-Paper\n2-Seasor");
        System.out.print("Enter Your Choice:");
        int n=sc.nextInt();
        System.out.println("Computer Choice:"+randomNum);
        if(randomNum==n){
            System.out.println("It a Draw");
        }
        else if(n==0 && randomNum==1){
            System.out.println("Computer Wins");
        }
        else if(n==0 && randomNum==2){
            System.out.println("You Win");
        }
        else if(n==1 && randomNum==0){
            System.out.println("You Win");
        }
        else if(n==1 && randomNum==2){
            System.out.println("Computer Wins");
        }
        else if(n==2 && randomNum==0){
            System.out.println("Computer Wins");
        }
        else if(n==2 && randomNum==1){
            System.out.println("You Win");
        }
        else{
            System.out.println("Wrong Coice");
            main(args);
        }
    }
}
