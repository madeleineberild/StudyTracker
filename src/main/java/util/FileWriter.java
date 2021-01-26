package util;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {

    public void writeToFile(String outputString) throws IOException {
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("history.txt"));
        writer.write(outputString);

        writer.close();
    }

}
