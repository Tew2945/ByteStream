
package bytesteams;


public class LAB1 {

    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();

        Rectangle rectangle = new Rectangle();
        RedShapeDecorator redCircleDecorator2 = new RedShapeDecorator(rectangle);
        redCircleDecorator2.draw();
    }
}
