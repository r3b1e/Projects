import java.util.Arrays;
import java.util.Scanner;

public class tictactoi {
    public static void display(char[][] board){
        for(int i=0;i<board.length;i++){
            System.out.print("|");
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static boolean isCheak(int r,int c,char[][] board,char value){
        if(board[0][c]==value && board[1][c]==value && board[2][c]==value){
            return false;
          }
        else if(board[r][0]==value && board[r][1]==value && board[r][2]==value){
            return false;
          }
        else if(board[0][0]==value && board[1][1]==value && board[2][2]==value){
            return false;
          }
        else if(board[0][2]==value && board[1][1]==value && board[2][0]==value){
            return false;
          }
          return true;
    } 
    public static boolean isComplete(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
               if(board[i][j]==' '){
                return true;
               }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] arr={{' ',' ',' '},
                     {' ',' ',' '},
                     {' ',' ',' '}};
    Scanner sc = new Scanner(System.in);
    boolean ischeak=false;
    char value='o';
    char ch=value;
    int row=0;
    int col=0;
    while(isComplete(arr) && !(ischeak)){
    display(arr);
    if(isCheak(row, col, arr, ch)){
    System.out.println("Enter Row and Column for "+value);
    row = sc.nextInt();
    col = sc.nextInt();
    if(row>2 || col>2){
        System.out.println("Out oF Boundary!");
        row=0;
        col=0;
    }
    else{
         if(arr[row][col]==' '){
           arr[row][col]=value;
           ch=value;
           value=((value=='o')?'x':'o');
         }
         else{
           System.out.println("Invalid place!");
        }
    }}
    else{
        System.out.println(ch+" wins");
        ischeak=true;
    }
}
 display(arr);
if(!isComplete(arr)){
    System.out.println("Its a Draw");
}
   }
}
