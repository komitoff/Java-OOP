package lab.jar;

public class Main {
    public static void main(String[] args) {
        Jar<Pickle> pickles = new Jar<>();
        pickles.add(new Pickle());
        pickles.add(new Pickle());
        
        Pickle pickle = pickles.remove();
    }
}
