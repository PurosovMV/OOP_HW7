import controller.Controller;
import view.*;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.buttonClick();
    }
}