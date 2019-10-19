package harshpatel.tictactoe;

public class tester {



    public static void main(String args[]){
        Game game = new Game();
        game.setPx("User");
        game.setPo("Computer");
        game.setCurrentplayer("X");
        game.Start();

        game.SingleGameplay(1,1);
        System.out.println(game.gtostring());

        game.SingleGameplay(2,1);
        System.out.println(game.gtostring());

        game.SingleGameplay(1,3);
        System.out.println(game.gtostring());

        game.SingleGameplay(3,2);
        System.out.println(game.gtostring());
    }
}
