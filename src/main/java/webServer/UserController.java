package webServer;

public class UserController implements Controller {
    public static Controller getInstance() {
        return new UserController();
    }
}
