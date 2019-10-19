package harshpatel.tictactoe;

import android.widget.Button;

import java.util.Random;

public class Game {

    Random num = new Random();
    char board[][]= new char[3][3];
    String Px = null;
    String Po = null;
    int row = -1;
    int col = -1;
    boolean gp = false;
    boolean ow= false;
    String fp = null;
    String currentplayer = null;
    int turn = 0;
    int gm = 0;
    boolean cantrue= false;
    boolean first = true;

    Game(){

    }

    public boolean isGp() {
        return gp;
    }

    public void setPo(String po) {
        Po = po;
    }

    public void setPx(String px) {
        Px = px;
    }

    public void setCol(int col) {
        this.col = col-1;
    }

    public void setRow(int row) {
        this.row = row-1;
    }

    // makes a new board (start/Restart Button)
    String Start(){
        String a = "";
        for(int b = 0; b<3; b++){
            for (int c = 0; c<3; c++){
                board[b][c]='.';
                //a = a + board[b][c];
            }
          //  a = a + "\n";

        }
        if(first){
            if (turn % 2 != 0) {
                a = a + "First Player to Play is " + this.Po + "\n";
            } else if (turn % 2 == 0) {
                a = a + "First Player to Play is " + this.Px + "\n";
            }

        }

        return a;
    }
    // prints out board
    String board(){
        String a = "";
        for(int b = 0; b<3; b++){
            for (int c = 0; c<3; c++){
                a = a + board[b][c];
            }
            a = a + "\n";

        }

        return a;
    }

    boolean tie = false;
    void tie(){
        if(cturn==9 && !gp){
            tie = true;
        }
    }
    String tostring() {
        String a = "";

        if (!gp) {
            if(!tie) {
                if (!ow) {

                    if (turn % 2 != 0) {
                        a = a + "Next Player to Play is " + this.Po + "\n";
                    } else if (turn % 2 == 0) {
                        a = a + "Next Player to Play is " + this.Px + "\n";
                    }
                } else if (ow) {
                    a = a + "Position is occupied ";
                    ow = false;
                    if (turn % 2 != 0) {
                        a = a + "Player " + this.Po + " Choose another position \n";

                    } else if (turn % 2 == 0) {
                        a = a + "Player " + this.Px + " Choose another position \n";

                    }
                }
            }
            else if(tie){
                a = a + " TIE GAME";
                gp = true;
                gm = 1;
            }
        } else if (gp==true) {
            cantrue = true;
            if(gm == 0){
                if (turn % 2 == 0) {
                    a = a + "Player " + this.Po + " Is The Winner \n";
                    Singleplayer.cpuscore++;
                } else if (turn % 2 != 0) {
                    a = a + "Player " + this.Px + " Is The Winner \n";
                    Singleplayer.userscore++;
                }
                gm = 1;
            }
            else if(gm ==1 ){
                a = a + " GAME IS OVER!!";
            }


        }

        return a;
    }

    int cturn = 0;

    String gtostring(){
        String a = board();
        return a;

    }
    void Gameplay(int r, int c){
        setRow(r);
        setCol(c);
        if(gp==false){
            if (turn % 2 != 0) {
                setposO();
                WinO();
                tie();
                // check if win or not gp = that
                if (!ow) {
                    turn++;
                }

            } else if (turn % 2 == 0) {
                setPosX();
                WinX();
                tie();
                // check if win or not gp = that
                if (!ow) {//owerwrite
                    turn++;
                }
            }}
    }

    int cpu_turn = 0;

        int r = 0;
        int c = 0;
    void cpu(){
        cpu_turn++;

        // if conditions a lot for all posibilities.

            // defend
            // side check of row one

            if(board[0][1]=='X'&& board[0][2]=='X'&& board[0][0]=='.'){
                r = 0;
                c = 0;
            }
            else if(board[0][1]=='X'&& board[0][0] =='X'&& board[0][2]=='.'){
                r = 0;
                c = 2;
            }
            else if(board[0][2]=='X'&& board[0][0] =='X'&& board[0][1]=='.'){
                r = 0;
                c = 1;
            }
            //2nd row
            else if(board[1][0]=='X'&& board[1][1] =='X'&& board[1][2]=='.'){
                r = 1;
                c = 2;
            }
            else if(board[1][1]=='X'&& board[1][2] =='X'&& board[1][0]=='.'){
                r = 1;
                c = 0;
            }
            else if(board[1][0]=='X'&& board[1][2] =='X'&& board[1][1]=='.'){
                r = 1;
                c = 1;
            }
            // 3rd row
            else if(board[2][1]=='X'&& board[2][0] =='X'&& board[2][2]=='.'){
                r = 2;
                c = 2;
            }else if(board[2][1]=='X'&& board[2][2] =='X'&& board[2][0]=='.'){
                r = 2;
                c = 0;
            }else if(board[2][0]=='X'&& board[2][2] =='X'&& board[2][1]=='.'){
                r = 2;
                c = 1;
            }
            // diagonal 1
            else if(board[0][0]=='X'&& board[1][1] =='X'&& board[2][2]=='.'){
                r = 2;
                c = 2;
            }else if(board[1][1]=='X'&& board[2][2] =='X'&& board[0][0]=='.'){
                r = 0;
                c = 0;
            }else if(board[2][2]=='X'&& board[0][0] =='X'&& board[1][0]=='.'){
                r = 1;
                c = 1;
            }
            // diagonal 2
            else if(board[0][2]=='X'&& board[1][1] =='X'&& board[2][0]=='.'){
                r = 2;
                c = 0;
            }else if(board[2][0]=='X'&& board[1][1] =='X'&& board[0][2]=='.'){
                r = 0;
                c = 2;
            }else if(board[2][0]=='X'&& board[0][2] =='X'&& board[1][1]=='.'){
                r = 1;
                c = 1;
            }
            // up down 1st col
            else if(board[0][0]=='X'&& board[1][0] =='X'&& board[2][0]=='.'){
                r = 2;
                c = 0;
            }else if(board[2][0]=='X'&& board[0][0] =='X'&& board[1][0]=='.'){
                r = 1;
                c = 0;
            }else if(board[1][0]=='X'&& board[2][0] =='X'&& board[0][0]=='.'){
                r = 0;
                c = 0;
            }
            //  2nd coloum
            else if(board[0][1]=='X'&& board[1][1] =='X'&& board[2][1]=='.'){
                r = 2;
                c = 1;
            }else if(board[2][1]=='X'&& board[0][1] =='X'&& board[1][1]=='.'){
                r = 1;
                c = 1;
            }else if(board[1][1]=='X'&& board[2][1] =='X' && board[0][1]=='.'){
                r = 0;
                c = 1;
            }
            // 3rd coloum
            else if(board[0][2]=='X'&& board[1][2] =='X'&& board[2][2]=='.'){
                r = 2;
                c = 2;
            }else if(board[2][2]=='X'&& board[0][2] =='X'&& board[1][2]=='.'){
                r = 1;
                c = 2;
            }else if(board[1][2]=='X'&& board[2][2] =='X'&& board[0][2]=='.'){
                r = 0;
                c = 2;
            }
            // advance
            else if(board[0][0]=='O'&& board[1][1] =='O'&& board[2][2]=='.'){
                r = 2;
                c = 2;
            }else if(board[1][1]=='O'&& board[2][2] =='O'&& board[0][0]=='.'){
                r = 0;
                c = 0;
            }else if(board[2][2]=='O'&& board[0][0] =='O'&& board[1][0]=='.'){
                r = 1;
                c = 1;
            }

            else if(board[0][2]=='O'&& board[1][1] =='O'&& board[2][0]=='.'){
                r = 2;
                c = 0;
            }else if(board[2][0]=='O'&& board[1][1] =='O'&& board[0][2]=='.'){
                r = 0;
                c = 2;
            }else if(board[2][0]=='O'&& board[0][2] =='O'&& board[1][1]=='.'){
                r = 1;
                c = 1;
            }
            // up down 1st col
            else if(board[0][0]=='O'&& board[1][0] =='O'&& board[2][0]=='.'){
                r = 2;
                c = 0;
            }else if(board[2][0]=='O'&& board[0][0] =='O'&& board[1][0]=='.'){
                r = 1;
                c = 0;
            }else if(board[1][0]=='O'&& board[2][0] =='O'&& board[0][0]=='.'){
                r = 0;
                c = 0;
            }
            //  2nd coloum
            else if(board[0][1]=='O'&& board[1][1] =='O'&& board[2][1]=='.'){
                r = 2;
                c = 1;
            }else if(board[2][1]=='O'&& board[0][1] =='O'&& board[1][1]=='.'){
                r = 1;
                c = 1;
            }else if(board[1][1]=='O'&& board[2][1] =='O' && board[0][1]=='.'){
                r = 0;
                c = 1;
            }
            // 3rd coloum
            else if(board[0][2]=='O'&& board[1][2] =='O'&& board[2][2]=='.'){
                r = 2;
                c = 2;
            }else if(board[2][2]=='O'&& board[0][2] =='O'&& board[1][2]=='.'){
                r = 1;
                c = 2;
            }else if(board[1][2]=='O'&& board[2][2] =='O'&& board[0][2]=='.'){
                r = 0;
                c = 2;
            }

            // simple positioning
            else if(board[1][1]=='.'){
                r = 1;
                c = 1;
            }
            else if(board[1][0]=='.'){
                r = 1;
                c = 0;

            }
            else if(board[2][1]=='.'){
                r = 2;
                c = 1;
            }

            else if(board[0][0]=='.'){
                r = 0;
                c = 0;
            }
            else if(board[1][2]=='.'){
                r = 1;
                c = 2;
            }
            else if(board[2][2]=='.'){
                r = 2;
                c = 2;
            }
            else if(board[0][1]=='.'){
                r = 0;
                c = 1;
            }
            else if(board[2][0]=='.'){
                r = 2;
                c = 0;
            }
            else if(board[0][2]=='.'){
                r = 0;
                c = 2;
            }



        // set position after cpu determined row(r) and col(c)
        setRow(r+1);
        setCol(c+1);
        setposO();
    }

    void SingleGameplay(int r , int c){

        setRow(r);
        setCol(c);
        if(!gp){
                setPosX();
                WinX();
                tie();
                // check if win or not gp = that
                if (!ow) {
                    turn++;
                }


        }
        // cpu sets o position here.
        if(!gp){

                cpu();
                WinO();
                tie();

                if(!ow){
                    turn++;
                }

        }
    }

    int getTurn(){
        return this.turn;
    }

    void WinO(){
        if(board[0][0]=='O' && board[0][1]=='O' && board[0][2]=='O' ){
            this.gp = true;
        }
        else if(board[0][0]=='O' && board[1][1]=='O' && board[2][2]=='O'){
            this.gp = true;
        }
        else if(board[0][0]=='O' && board[1][0]=='O' && board[2][0]=='O'){
            this.gp = true;
        }
        else if(board[0][1]=='O' && board[1][1]=='O' && board[2][1]=='O'){
            this.gp = true;
        }
        else if(board[0][2]=='O' && board[1][2]=='O' && board[2][2]=='O'){
            this.gp = true;
        }
        else if(board[1][0]=='O' && board[1][1]=='O' && board[1][2]=='O'){
            this.gp = true;
        }
        else if(board[2][0]=='O' && board[2][1]=='O' && board[2][2]=='O'){
            this.gp = true;
        }
        else if(board[0][2]=='O' && board[1][1]=='O' && board[2][0]=='O'){
            this.gp = true;
        }



    }

    void WinX(){
        if(board[0][0]=='X' && board[0][1]=='X' && board[0][2]=='X' ){
            this.gp = true;
        }
        else if(board[0][0]=='X' && board[1][1]=='X' && board[2][2]=='X'){
            this.gp = true;
        }
        else if(board[0][0]=='X' && board[1][0]=='X' && board[2][0]=='X'){
            this.gp = true;
        }
        else if(board[0][1]=='X' && board[1][1]=='X' && board[2][1]=='X'){
            this.gp = true;
        }
        else if(board[0][2]=='X' && board[1][2]=='X' && board[2][2]=='X'){
            this.gp = true;
        }
        else if(board[1][0]=='X' && board[1][1]=='X' && board[1][2]=='X'){
            this.gp = true;
        }
        else if(board[2][0]=='X' && board[2][1]=='X' && board[2][2]=='X'){
            this.gp = true;
        }
        else if(board[0][2]=='X' && board[1][1]=='X' && board[2][0]=='X'){
            this.gp = true;
        }



    }

    void setCurrentplayer(String name){
        if (name.equals("X")){
            this.turn = 2;
        }
        else if(name.equals("O")){
            this.turn = 1;
        }
        else {
            this.turn = 3;
        }
    }

    void setPosX(){
        cturn++;
        if(board[row][col]=='.') {

            char x = 'X';
            board[row][col] = 'X';
        }
        else{
            this.ow = true;
        }
    }
    void setposO(){
        cturn++;
        if(board[row][col]=='.') {

            board[row][col] = 'O';

        }
        else{
            this.ow = true;
        }

    }



}

