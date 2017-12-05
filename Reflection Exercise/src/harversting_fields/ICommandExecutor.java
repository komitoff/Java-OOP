package harversting_fields;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public interface ICommandExecutor {
    void execute(String line);

    void printFields(Stream<Field> fieldStream);

}