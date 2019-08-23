package MementoPattern;

public class GameMemento {
    private int state;

    public GameMemento(int state) {
        this.state = state;
    }

    public int getState(){
        return this.state;
    }

}
