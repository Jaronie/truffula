import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }


  // Prints all lines in blue with no reset towards color.
  @Test
  void testPrintlnWithBlueNoReset() {
    //Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream, ConsoleColor.BLUE);


    //Act
      String message = "Woah, I'm blue.";
      printer.println(message, false);
      String message2 = "I'm.. still blue!";
      printer.print(message2);

      String expectedOutput = ConsoleColor.BLUE + message + System.lineSeparator() + ConsoleColor.BLUE + message2 + ConsoleColor.RESET;

    //Assert
    assertEquals(expectedOutput, outputStream.toString());
  }

  // Prints first in blue, resets the color in a new line, then prints in red.
    @Test
  void testPrintWithBlueResetThenRed() {
    //Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream, ConsoleColor.BLUE);


    //Act
      String message = "Woah, I'm blue.";
      printer.println(message, true);
      printer.setCurrentColor(ConsoleColor.RESET);
      String message2 = "I'm.. no longer blue.";
      printer.println(message2,true);
      printer.setCurrentColor(ConsoleColor.RED);
      String message3 = "It's okay. Now I'm red!";



      printer.print(message3);


      String expectedOutput = ConsoleColor.BLUE +
      message + 
      System.lineSeparator() + ConsoleColor.RESET + 
      ConsoleColor.RESET + message2 + 
      System.lineSeparator() + ConsoleColor.RESET +
      ConsoleColor.RED + message3 + ConsoleColor.RESET;


    //Assert
    assertEquals(expectedOutput, outputStream.toString());
  }


}
