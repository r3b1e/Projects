import java.util.*;
public class direction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter Direction:");
    String dir = sc.nextLine(); // Use sc.nextLine() to read a whole line of text
    int x=0;
    int y=0;
    for(int i=0;i<dir.length();i++){
        char ch=dir.charAt(i);
        switch (ch) {
            case 'E':
            case 'e':
                x++;
                break;
            case 'W':
            case 'w':
                x--;
                break;
            case 'N':
            case 'n':
                y++;
                break;
            case 'S':
            case 's':
                y--;
                break;
            default:
                System.err.println("Wrong Direction");
                break;
        }
    }
    double shortDistance=Math.sqrt(x*x+y*y);
    System.out.println("Shortest Displacement:"+shortDistance);
    }
}