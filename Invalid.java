// "Invalid" class file
// If the user selects something that isn't available
public class Invalid implements Shape {

  @Override
  public void draw() {
    System.out.println();
    System.out.println("No such shape exists!");
    System.out.println();
  }
}