import engines.Engine;
import interfaces.*;
import io.ConsoleReader;
import io.ConsoleWriter;
import repositories.BlobRepository;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new ConsoleReader();
        OutputWriter writer = new ConsoleWriter();
        Repository<Blob> blobRepository = new BlobRepository();
        Runnable engine = new Engine();

        engine.run();
    }
}
