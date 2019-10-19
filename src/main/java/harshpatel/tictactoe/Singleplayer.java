package harshpatel.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Singleplayer extends AppCompatActivity {
    Game game=new Game();

    static int userscore = 0;
    static int cpuscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);
    }

    private void displayThis(int id, String newContent){
        View view = findViewById(id);
        TextView textview = (TextView) view;
        textview.setText(newContent);
    }

    public void NewRound(View view){

        game = new Game();

        game.setPx("User");
        game.setPo("Computer");
        game.setCurrentplayer("X");
        displayThis(R.id.LabelAnswer,game.Start());
        displayThis(R.id.PlayerScore, "User :"+userscore);
        displayThis(R.id.cpuscore, "Computer :"+cpuscore);

        Button button01 = (Button)findViewById(R.id.button01);
        button01.setText("");
        Button button00 = (Button)findViewById(R.id.button00);
        button00.setText("");
        Button button02 = (Button)findViewById(R.id.button02);
        button02.setText("");
        Button button10 = (Button)findViewById(R.id.button10);
        button10.setText("");
        Button button11 = (Button)findViewById(R.id.button11);
        button11.setText("");
        Button button12 = (Button)findViewById(R.id.button12);
        button12.setText("");
        Button button20 = (Button)findViewById(R.id.button21);
        button20.setText("");
        Button button21 = (Button)findViewById(R.id.button20);
        button21.setText("");
        Button button22 = (Button)findViewById(R.id.button22);
        button22.setText("");

    }

    public void StartRestart(View view){
        game = new Game();
        userscore=0;
        cpuscore=0;
        game.setPx("User");
        game.setPo("Computer");
        game.setCurrentplayer("X");
        displayThis(R.id.LabelAnswer,game.Start());
        displayThis(R.id.PlayerScore, "User :"+userscore);
        displayThis(R.id.cpuscore, "Computer :"+cpuscore);

        Button button01 = (Button)findViewById(R.id.button01);
        button01.setText("");
        Button button00 = (Button)findViewById(R.id.button00);
        button00.setText("");
        Button button02 = (Button)findViewById(R.id.button02);
        button02.setText("");
        Button button10 = (Button)findViewById(R.id.button10);
        button10.setText("");
        Button button11 = (Button)findViewById(R.id.button11);
        button11.setText("");
        Button button12 = (Button)findViewById(R.id.button12);
        button12.setText("");
        Button button20 = (Button)findViewById(R.id.button21);
        button20.setText("");
        Button button21 = (Button)findViewById(R.id.button20);
        button21.setText("");
        Button button22 = (Button)findViewById(R.id.button22);
        button22.setText("");

    }

  /*
  public void Play(View view){
        game.setRow(Integer.parseInt(getSpinnerInput(R.id.Row)));
        game.setCol(Integer.parseInt(getSpinnerInput(R.id.Col)));
        displayThis(R.id.LabelAnswer,game.tostring());
    }
    */

    void setbutton(int r , int c){

        if(r ==0&& c ==0){
            Button button = (Button)findViewById(R.id.button00);
            button.setText("O");

        }
        else if(r==0 && c==1){
            Button button01 = (Button)findViewById(R.id.button01);
            button01.setText("O");
        }
        else if(r==0&& c==2){
            Button button01 = (Button)findViewById(R.id.button02);
            button01.setText("O");
        }
        else if(r==1&& c==0){
            Button button10 = (Button)findViewById(R.id.button10);
            button10.setText("O");
        }
        else if(r==1&& c==1){
            Button button = (Button)findViewById(R.id.button11);
            button.setText("O");
        }
        else if(r==1&& c==2){
            Button button = (Button)findViewById(R.id.button12);
            button.setText("O");
        }
        else if(r==2&& c==0){
            Button button = (Button)findViewById(R.id.button20);
            button.setText("O");
        }
        else if(r==2&&c==1){
            Button button = (Button)findViewById(R.id.button21);
            button.setText("O");
        }
        else if(r==2&& c==2){
            Button button = (Button)findViewById(R.id.button22);
            button.setText("O");
        }
    }
    int r = 0;
    int c = 0;
        String a = "hi";

    public void button00(View view){

        Button button = (Button) findViewById(R.id.button00);
        if(game.board[0][0]=='.'&& !game.gp){

            game.SingleGameplay(1, 1);


            button.setText("X");
            this.r = game.r;
            this.c = game.c;
            setbutton(r, c);
        }

        displayThis(R.id.LabelAnswer,game.tostring());

    }


    public void button01(View view){

        Button button = (Button) findViewById(R.id.button01);
        if(game.board[0][1]=='.'&& !game.gp) {
            game.SingleGameplay(1, 2);
            button.setText("X");
            this.r = game.r;
            this.c = game.c;
            setbutton(r, c);
        }

        displayThis(R.id.LabelAnswer,game.tostring());

    }

    public void button02(View view){

        Button button = (Button) findViewById(R.id.button02);
        if(game.board[0][2]=='.'&& !game.gp) {
            game.SingleGameplay(1, 3);
            button.setText("X");
            this.r = game.r;
            this.c = game.c;
            setbutton(r, c);
        }





        displayThis(R.id.LabelAnswer,game.tostring());
    }


    public void button10(View view){

        Button button = (Button) findViewById(R.id.button10);
        if(game.board[1][0]=='.'&& !game.gp) {
            game.SingleGameplay(2, 1);
            button.setText("X");
            this.r = game.r;
            this.c = game.c;
            setbutton(r, c);
        }


                displayThis(R.id.LabelAnswer,game.tostring());
    }


    public void button11(View view) {

        Button button = (Button) findViewById(R.id.button11);
        if(game.board[1][1]=='.'&& !game.gp) {
            game.SingleGameplay(2, 2);
            button.setText("X");
            this.r = game.row;
            this.c = game.col;
            setbutton(r, c);

        }




        displayThis(R.id.LabelAnswer,game.tostring());
    }
    public void button12(View view){

        Button button = (Button) findViewById(R.id.button12);
       if(game.board[1][2]=='.'&& !game.gp) {
           game.SingleGameplay(2, 3);
           button.setText("X");
           this.r = game.r;
           this.c = game.c;
           setbutton(r, c);
       }





        displayThis(R.id.LabelAnswer,game.tostring());
    }

    public void button20(View view){

        Button button = (Button) findViewById(R.id.button20);
        if(game.board[2][0]=='.'&& !game.gp) {
            game.SingleGameplay(3, 1);
            button.setText("X");
            this.r = game.r;
            this.c = game.c;
            setbutton(r, c);
        }





        displayThis(R.id.LabelAnswer,game.tostring());
    }

    public void button21(View view){

        Button button = (Button) findViewById(R.id.button21);
        if(game.board[2][1]=='.'&& !game.gp) {
            game.SingleGameplay(3, 2);
            button.setText("X");
            this.r = game.r;
            this.c = game.c;
            setbutton(r, c);
        }

        displayThis(R.id.LabelAnswer,game.tostring());
    }

    public void button22(View view){

        Button button = (Button) findViewById(R.id.button22);
        if(game.board[2][2]=='.'&& !game.gp) {
            game.SingleGameplay(3, 3);
            button.setText("X");
            this.r = game.r;
            this.c = game.c;
            setbutton(r, c);
        }

        displayThis(R.id.LabelAnswer,game.tostring());
    }


}
