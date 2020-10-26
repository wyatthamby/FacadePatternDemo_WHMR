// ShapeMaker program
// The layer of complexity that exists between the 
public class ShapeMaker {
   public Shape rectangle;
   public Shape square;
   public Shape circle;
   public Shape invalid;

   public ShapeMaker() {
      rectangle = new Rectangle();
      square = new Square();
      circle = new Circle();
      invalid = new Invalid();
   }

   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
   public void drawCircle(){
      circle.draw();
   }
   public void drawInvalid() {
      invalid.draw();
   }
}