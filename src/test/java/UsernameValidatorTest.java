import org.junit.jupiter.api.Test;
import utils.ReadFromFile;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {

    UsernameValidator usernameValidator = new UsernameValidator();

    @Test
    void nameValidator() throws IOException {
        usernameValidator.nameValidator(ReadFromFile.getFileReader());
    }
}