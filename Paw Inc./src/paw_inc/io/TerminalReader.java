package paw_inc.io;

public class TerminalReader {
    public static String[] parseLine(String line, String separator) {
        return line.split(separator);
    }
}
