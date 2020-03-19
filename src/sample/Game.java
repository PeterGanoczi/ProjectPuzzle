package sample;

public class Game {

    private Field field;
    private State state;

    public Game(){
        this.field=new Field();
        this.state=State.READY;
    }


}
