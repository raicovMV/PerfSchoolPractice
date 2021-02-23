import utils.WriteToFile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {

    String regularExpression = "^[A-Za-z][\\w]{7,29}$";

    public void nameValidator(List<String> list) throws IOException {
        BufferedWriter bw = WriteToFile.writeToFile();
        bw.write("Total numbers of user names is: " + list.size());
        bw.newLine();
        Pattern pattern = Pattern.compile(regularExpression);
        for (String s:list) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){

                bw.write(s + " : is Valid");
                bw.newLine();
            }else {bw.write(s + " : is Invalid");
            bw.newLine();}
        }
        bw.close();
    }
}