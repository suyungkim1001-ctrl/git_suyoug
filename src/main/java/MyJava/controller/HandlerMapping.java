package MyJava.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
    private static HandlerMapping instance = new HandlerMapping();

    private HandlerMapping() { }

    public static HandlerMapping getInstance() {
        return instance;
    }

    public Controller createController(int no) {
        Controller controller = null;

        switch (no) {
            case 1:
                controller = new AppendController();
                break;
            case 2:
                controller = new DeleteController();
                break;
            case 3:
                controller = new UpdateController();
                break;
            case 4:
                controller = new PrintAllController();
                break;
            default:
                // 1~4 이외의 번호나 0번은 null을 반환하도록 둠
                break;
        }

        return controller;
    }
}
