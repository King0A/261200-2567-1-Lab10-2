# Adapter Pattern Project

This project demonstrates the Adapter Pattern in Java. The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces.

## Project Structure

The project consists of the following files:

- **src/Main.java**: Contains the main method that demonstrates the usage of the Adapter Pattern. It creates an instance of `XpayImpl`, sets its properties, and then uses the `XpayToPayDAdapter` to create a `PayD` object.
  
- **src/Xpay.java**: Defines the `Xpay` interface, which includes methods for setting credit card details such as `setCreditCardNo`, `setCustomerName`, `setCardExpMonth`, `setCardExpYear`, `setCardCVVNo`, and `setAmount`.
  
- **src/XpayImpl.java**: Implements the `Xpay` interface. It provides concrete implementations for all the methods defined in the `Xpay` interface, allowing the setting of credit card details.
  
- **src/PayD.java**: Defines the `PayD` interface, which includes methods that are expected by the PayD system. The credit card number is represented as a long type.
  
- **src/XpayToPayDAdapter.java**: Implements the adapter class that converts an `Xpay` object into a `PayD` object. It takes an `XpayImpl` instance in its constructor and implements the methods of the `PayD` interface, converting the necessary data types as needed.

## How to Run the Project

1. Ensure you have Java installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the `src` directory.
4. Compile the Java files using the command:
   ```
   javac *.java
   ```
5. Run the `Main` class using the command:
   ```
   java Main
   ```

This will demonstrate the functionality of the Adapter Pattern by showing how `XpayImpl` can be adapted to work with the `PayD` interface through the `XpayToPayDAdapter`.