import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import util.FileWriter;

public class TestFileWriter {

    @Test
    public void writeSimpleString() throws Exception {
        FileWriter fw = new FileWriter();
        fw.writeToFile("Hej");
    }

}