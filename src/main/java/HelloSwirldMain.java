import com.swirlds.platform.*;

public class HelloSwirldMain implements SwirldMain {

    /**
     * This should only be called by the Platform.
     */
    @Override
    public void init(Platform platform, long l) {
        Console console = platform.createConsole(true);
        console.out.println("Initialized " + platform.getAddress().getSelfName());
    }

    /**
     * This is where the app manages the screen and I/O, and creates transactions as needed.
     */
    @Override
    public void run() {

    }

    /**
     * The platform calls this method just before creating an event.
     */
    @Override
    public void preEvent() {

    }

    /**
     * Instantiate and return a State object that corresponds to this Main object.
     */
    @Override
    public SwirldState newState() {
        return new HelloSwirldState();
    }

    public static void main(String[] args) {
        Browser.main(args);
    }
}
