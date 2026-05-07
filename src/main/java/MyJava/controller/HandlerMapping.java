package MyJava.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
    private static HandlerMapping instance;

    private HandlerMapping() { }

    public static HandlerMapping getInstance() {
        if (instance == null)
            instance = new HandlerMapping();
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
                break;
        }

        return controller;
    }
}
