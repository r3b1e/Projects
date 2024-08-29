import java.util.Scanner;

public class tictac {
    // public static void comturn(char[][] board, char value){
    //     do{
    //         int comrow = (int) (Math.random() * 3);
    //         int comcol = (int) (Math.random() * 3); 
    //     }while(board[comrow][comcol]!=' ');
    //     board[comrow][comcol]=value;
    // }
    static int row=0;
    static int col=0;
    static char ch=' ';
    public static void display(char[][] board){
        System.out.println("-------");
        for(int i=0;i<board.length;i++){
            System.out.print("|");
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static boolean isComplete(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
               if(board[i][j]==' '){
                return true;
               }
            }
        }
        if(!isCheak(row, col, board, ch)){
         System.out.println(ch+" wins");
        }
        return false;
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
    // public static boolean isTowincol(char[][] board, int c, char val){
    //     if(c==board.length-1){
    //         return false;
    //     }
    //     int counto=0;
    //     int countx=0;
    //     int space=0;
    //     int row=0;
    //     for(int i=0;i<board.length;i++){
    //         if(board[i][c]=='o'){
    //             counto++;
    //         }
    //         else if(board[i][c]=='x'){
    //             countx++;
    //         }
    //         else{
    //             space++;
    //             row=i;
    //         }
    //     }
    //     if((countx==2 || counto==2)&&space==1){
    //         board[row][c]=val;
    //         return true;
    //     }
    //     return isTowincol(board, c+1, val);
    // }
    // public static boolean isTowinrow(char[][] board, int r, char val){
    //     if(r==board.length-1){
    //         return false;
    //     }
    //     int counto=0;
    //     int countx=0;
    //     int space=0;
    //     int col=0;
    //     for(int i=0;i<board.length;i++){
    //         if(board[r][i]=='o'){
    //             counto++;
    //         }
    //         else if(board[r][i]=='x'){
    //             countx++;
    //         }
    //         else{
    //             space++;
    //             col=i;
    //         }
    //     }
    //     if((countx==2 || counto==2)&&space==1){
    //         board[r][col]=val;
    //         return true;
    //     }
    //     return isTowinrow(board, r+1, val);
    // }
    // public static boolean isTowindiarig(char[][] board, char val){
    //     int counto=0;
    //     int countx=0;
    //     int space=0;
    //     int dia=0;
    //     for(int i=0;i<board.length;i++){
    //         if(board[i][i]=='o'){
    //             counto++;
    //         }
    //         else if(board[i][i]=='x'){
    //             countx++;
    //         }
    //         else{
    //             space++;
    //             dia=i;
    //         }
    //     }
    //     if((countx==2 || counto==2)&&space==1){
    //         board[dia][dia]=val;
    //         return true;
    //     }
    //     return false;
    // }
    // public static boolean isTowindialef(char[][] board, char val){
    //     int counto=0;
    //     int countx=0;
    //     int space=0;
    //     int dia=0;
    //     for(int i=0, j=2;i<board.length && j>=0;i++,j--){
    //         if(board[i][j]=='o'){
    //             counto++;
    //         }
    //         else if(board[i][j]=='x'){
    //             countx++;
    //         }
    //         else{
    //             space++;
    //             dia=i;
    //         }
    //     }
    //     if((countx==2 || counto==2)&&space==1){
    //         board[dia][dia]=val;
    //         return true;
    //     }
    //     return false;
    // }
    public static boolean allcondition(char[][] board, char val){
        int counto=0;
        int countx=0;
        int space=0;
        int r=0;
        
        for(int i=0;i<board.length;i++){
            counto=0;
            countx=0;
            space=0;
            for (int j=0;j<board.length;j++){
            if(board[i][j]=='o'){
                counto++;
            }
            else if(board[i][j]=='x'){
                countx++;
            }
            else{
                space++;
                r=j;
            }
        }
        if((countx==2 || counto==2)&&space==1){
            row=i;
            col=r;
            board[i][r]=val;
            return true;
        }
    }
        int c=0;    
        for(int i=0;i<board.length;i++){
            counto=0;
            countx=0;
            space=0;
            for (int j=0;j<board.length;j++){
            if(board[j][i]=='o'){
                counto++;
            }
            else if(board[j][i]=='x'){
                countx++;
            }
            else{
                space++;
                c=j;
            }
        }
        if((countx==2 || counto==2)&&space==1){
            row=c;
            col=i;
            board[c][i]=val;
            return true;
        }
    }
            counto=0;
            countx=0;
            space=0;
            int diaf=0;
    for(int i=0;i<board.length;i++){
                if(board[i][i]=='o'){
                    counto++;
                }
                else if(board[i][i]=='x'){
                    countx++;
                }
                else{
                    space++;
                    diaf=i;
                }
            }
            if((countx==2 || counto==2)&&space==1){
                board[diaf][diaf]=val;
                return true;
            }
            counto=0;
            countx=0;
            space=0;
            int diai=0;
            int diaj=0;
            for(int i=0, j=2;i<board.length && j>=0;i++,j--){
                        if(board[i][j]=='o'){
                            counto++;
                        }
                        else if(board[i][j]=='x'){
                            countx++;
                        }
                        else{
                            space++;
                            diai=i;
                            diaj=j;

                        }
                    }
                    if((countx==2 || counto==2)&&space==1){
                        board[diai][diaj]=val;
                        return true;
                    }

    return false;
    }
    public static void main(String[] args) {
        int computer = (int) (Math.random() * 2);
        int player =((computer==0)?1:0);
        char[][] arr={{' ',' ',' '},
                     {' ',' ',' '},
                     {' ',' ',' '}};
    Scanner sc = new Scanner(System.in);
        char value='o';
        boolean ischeak=false;
        ch=value;
        while(isComplete(arr) && !(ischeak)){
            display(arr);
        if(isCheak(row, col, arr, ch)){
        if(computer==1){
          do{
            row = (int) (Math.random() * 3);
            col = (int) (Math.random() * 3); 
        }while(arr[row][col]!=' ');
        if (!allcondition(arr, value)) {
            arr[row][col] = value;
        }
        ch=value;
          value=((value=='o')?'x':'o');
          computer=0;
        }
        else{
                System.out.println("Player's turn (enter row and column):"+value);
                row = sc.nextInt();
                col = sc.nextInt();
                if(row>2 || col>2){
                    System.out.println("Out oF Boundary, try again.!");
                    row=0;
                    col=0;
                }
                else{
                     if(arr[row][col]==' '){
                       arr[row][col]=value;
                       ch=value;
                       value=((value=='o')?'x':'o');
                       computer=1;
                     }
                     else{
                       System.out.println("Invalid place, try again.!");
                    }
                }
            }
        }
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
