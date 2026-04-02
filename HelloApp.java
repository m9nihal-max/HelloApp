public class HelloApp {
    public static void main(String[] args) {

        String name;

        if (args.length == 0) {
            name = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Add all names with ", "
            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }

            // Remove last ", "
            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                name = "World";
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}