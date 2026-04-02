public class HelloApp {
    public static void main(String[] args) {

        String name;

        if (args.length == 0) {
            name = "World";
        } else {
            // BEST METHOD
            name = String.join(", ", args);
        }

        System.out.println("Hello, " + name + "!");
    }
}