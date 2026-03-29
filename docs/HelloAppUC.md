## UC1: Display "Hello World"

### Description
The app displays "Hello World" on the console when executed.

### Preconditions
- App is launched

### Main Flow
1. User runs the application
2. App executes main method
3. App prints "Hello World"
4. App terminates

### Postconditions
- Message is displayed to user

### Code Example
```java
public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

## UC2: Display "Hello" with Command-Line Argument

### Description

The application accepts a user's name as a command-line argument and displays a personalized greeting. This enhances the functionality of UC1 by allowing dynamic user input.

### Disadvantages of Previous Use Case

UC1 only displays a static message ("Hello, World!") and does not allow user input or customization.

### Preconditions

* The application is executed from the command line
* A user may or may not provide a name as an argument

### Main Flow

1. User runs the application
2. Application checks if any command-line arguments are provided
3. If an argument is present, it reads the first argument (`args[0]`)
4. Application prints "Hello, <name>!"
5. If no argument is provided, it prints "Hello, World!"
6. Application terminates

### Postconditions

* A personalized greeting is displayed if a name is provided
* A default greeting is displayed if no input is given

### Code Example

```java
if (args.length > 0) {
    System.out.println("Hello, " + args[0] + "!");
} else {
    System.out.println("Hello, World!");
}
```

### Example Output

**Input:**

```
java HelloApp Alice
```

**Output:**

```
Hello, Alice!
```

**Input:**

```
java HelloApp
```

**Output:**

```
Hello, World!
```

### Concepts Learned

* Command-line arguments (`args[]`)
* Conditional statements (`if-else`)
* String concatenation using `+`
* Basic input validation

# UC3: Display "Hello" with Command-Line Argument or Default Message

## Description
The application accepts a user's name as a command-line argument. If no name is provided, it defaults to "World".

## Main Flow
1. Check if argument exists
2. If yes → use args[0]
3. If no → use "World"
4. Print greeting

## Example
java HelloApp Alice → Hello, Alice!
java HelloApp → Hello, World!

# UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message

## Description
The application accepts multiple names as command-line arguments and displays a greeting for all names. If no names are provided, it defaults to "World".

## Main Flow
1. Check if arguments exist
2. If yes → join all names using comma
3. If no → use "World"
4. Print greeting

## Example
java HelloApp Alice Bob → Hello, Alice, Bob!
java HelloApp → Hello, World!

## Concepts Learned
- Arrays
- String.join()
- Conditional Statements
- Multiple Inputs Handling