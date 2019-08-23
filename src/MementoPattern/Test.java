package MementoPattern;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Game game = new Game(0);
        System.out.println("当前状态："+ game.getState());
        game.gotoNextState();
        System.out.println("当前状态："+ game.getState());
        game.gotoNextState();
        System.out.println("当前状态："+ game.getState());

        MementoManage mm = game.getMm();
        Iterator<GameMemento> gm_it = mm.getGameMementos();
        while(gm_it.hasNext()) {
            System.out.println("历史记录："+ gm_it.next().getState());
        }

    }

}
