package util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class FileWriter {

    public void writeToFile(String outputString) throws Exception {
        Files.createFile(Paths.get("history.txt"));
        Files.write(Paths.get("history.txt"), Collections.singleton(outputString), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }

}
