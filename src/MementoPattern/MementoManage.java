package MementoPattern;

import java.util.Iterator;
import java.util.Stack;

public class MementoManage {

    Stack<GameMemento> stack;

    public MementoManage() {
        stack = new Stack<GameMemento>();
    }

    public void addMemento(GameMemento gm) {
        stack.push(gm);
    }

    public Iterator<GameMemento> getGameMementos() {
        return stack.iterator();
    }

}
