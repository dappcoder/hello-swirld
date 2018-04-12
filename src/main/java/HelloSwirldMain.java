import com.swirlds.platform.*;

public class HelloSwirldMain implements SwirldMain {

    @Override
    public void init(Platform platform, long l) {
        Console console = platform.createConsole(true);
        console.out.println("Initialized " + platform.getAddress().getSelfName());
    }

    @Override
    public void run() {

    }

    @Override
    public void preEvent() {

    }

    @Override
    public SwirldState newState() {
        return new HelloSwirldState();
    }

    public static void main(String[] args) {
        Browser.main(args);
    }
}
