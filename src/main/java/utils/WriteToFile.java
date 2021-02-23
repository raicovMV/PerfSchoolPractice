package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static final String writeFilePath = "src/main/resources/output/result";

    //Output: Build BufferedWriter
    public static BufferedWriter writeToFile() throws IOException {
        return new BufferedWriter(new FileWriter(writeFilePath));
    }
}
