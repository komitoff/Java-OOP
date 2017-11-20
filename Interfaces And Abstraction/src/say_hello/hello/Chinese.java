package say_hello.hello;

public class Chinese extends BasePerson   implements Person{

    private static final String GREETING = "Djydjybydjy";
    private String name;

    Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return GREETING;
    }

}
