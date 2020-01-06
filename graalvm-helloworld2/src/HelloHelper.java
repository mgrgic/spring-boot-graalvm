import java.util.Arrays;

public class HelloHelper {
  public String sayHello(String... names) {
    return "Hello " + String.join(", ", Arrays.asList(names)) + "!";
  }
}
