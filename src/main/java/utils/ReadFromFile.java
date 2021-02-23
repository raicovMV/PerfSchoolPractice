package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    public static String inputPath = "src/main/resources/input/userName";

    //Input: Get List of userNames from file
    public static List<String> getFileReader() throws IOException {
        List<String> userNameList = new ArrayList<String>();

        BufferedReader reader = new BufferedReader((new FileReader(inputPath)));
        String line;
        while ((line = reader.readLine()) !=null){
            userNameList.add(line);
        }
        return userNameList;
    }

}
