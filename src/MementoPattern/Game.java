package MementoPattern;

public class Game {

    private int state;
    private MementoManage mm;

    public Game(int state) {
        this.state = state;
        this.mm = new MementoManage();
    }

    public void gotoNextState() {
        saveState();
        state++;
    }

    public void saveState() {
        mm.addMemento(new GameMemento(state));
    }

    public int getState() {
        return this.state;
    }

    public MementoManage getMm() {
        return mm;
    }

}
