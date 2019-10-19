package harshpatel.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
   Game game;
   int turn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    private void displayThis(int id, String newContent){
        View view = findViewById(id);
        TextView textview = (TextView) view;
        textview.setText(newContent);
    }
    private String getInput(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getSpinnerInput(int id){
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String mySpinner = spinner.getSelectedItem().toString();
        return mySpinner;
    }

    public void StartRestart(View view){
        game = new Game();
        game.setPx(getInput(R.id.PlayerX));
        game.setPo(getInput(R.id.PlayerO));
        game.setCurrentplayer(getSpinnerInput(R.id.spinner));
        displayThis(R.id.LabelAnswer,game.Start());
        this.turn= game.turn;

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

  /*  public void Play(View view){
        game.setRow(Integer.parseInt(getSpinnerInput(R.id.Row)));
        game.setCol(Integer.parseInt(getSpinnerInput(R.id.Col)));
        displayThis(R.id.LabelAnswer,game.tostring());
    }
    */

    public void button00(View view){

        Button button = (Button) findViewById(R.id.button00);

        if(!game.cantrue){
            game.Gameplay(1,1);
            if(game.turn%2==0){
                button.setText("O");

            }
            else if(game.turn%2!=0) {
                button.setText("X");

            }
    }else if(game.cantrue){
            game.cantrue= false;
        }

        displayThis(R.id.LabelAnswer,game.tostring());
    }


    public void button01(View view){

        Button button = (Button) findViewById(R.id.button01);
        game.Gameplay(1,2);
        if(!game.cantrue){

            if(game.turn%2==0){
                button.setText("O");
            }
            else if(game.turn%2!=0) {
                button.setText("X");
            }
        }else if(game.cantrue){
            game.cantrue= false;
        }
        displayThis(R.id.LabelAnswer,game.tostring());

    }

    public void button02(View view){

        Button button = (Button) findViewById(R.id.button02);
        game.Gameplay(1,3);
        if(!game.cantrue){

            if(game.turn%2==0){
                button.setText("O");
            }
            else if(game.turn%2!=0) {
                button.setText("X");
            }
        }else if(game.cantrue){
            game.cantrue= false;
        }
        displayThis(R.id.LabelAnswer,game.tostring());
    }


    public void button10(View view){

        Button button = (Button) findViewById(R.id.button10);
        game.Gameplay(2,1);
        if(!game.cantrue){
            if(game.turn%2==0){
                button.setText("O");
            }
            else if(game.turn%2!=0) {
                button.setText("X");
            }
        }else if(game.cantrue){
            game.cantrue= false;
        }
        displayThis(R.id.LabelAnswer,game.tostring());
    }


    public void button11(View view) {

        Button button = (Button) findViewById(R.id.button11);
        game.Gameplay(2, 2);
        if (!game.cantrue) {
            if (game.turn%2 == 0) {
                button.setText("O");
            } else if (game.turn % 2 != 0) {
                button.setText("X");
            }
        } else if (game.cantrue) {
            game.cantrue = false;
        }
        displayThis(R.id.LabelAnswer,game.tostring());
    }
        public void button12(View view){

            Button button = (Button) findViewById(R.id.button12);
            game.Gameplay(2,3);
            if(!game.cantrue){
                if(game.turn%2==0){
                    button.setText("O");
                }
                else if(game.turn%2!=0) {
                    button.setText("X");
                }
            }else if(game.cantrue){
                game.cantrue= false;
            }

            displayThis(R.id.LabelAnswer,game.tostring());
        }

    public void button20(View view){

        Button button = (Button) findViewById(R.id.button20);
        game.Gameplay(3,1);
        if(!game.cantrue){
            if(game.turn%2==0){
                button.setText("O");
            }
            else if(game.turn%2!=0) {
                button.setText("X");
            }
        }else if(game.cantrue){
            game.cantrue= false;
        }
        displayThis(R.id.LabelAnswer,game.tostring());
    }

    public void button21(View view){

        Button button = (Button) findViewById(R.id.button21);
        game.Gameplay(3,2);
        if(!game.cantrue){
            if(game.turn%2==0){
                button.setText("O");
            }
            else if(game.turn%2!=0) {
                button.setText("X");
            }
        }else if(game.cantrue){
            game.cantrue= false;
        }
        displayThis(R.id.LabelAnswer,game.tostring());
    }

    public void button22(View view){

        Button button = (Button) findViewById(R.id.button22);
        game.Gameplay(3,3);
        if(!game.cantrue){
            if(game.turn%2==0){
                button.setText("O");
            }
            else if(game.turn%2!=0) {
                button.setText("X");
            }
        }else if(game.cantrue){
            game.cantrue= false;
        }
        displayThis(R.id.LabelAnswer,game.tostring());
    }

    }



