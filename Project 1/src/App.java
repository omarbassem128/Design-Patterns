public class App {
    public static void main(String[] args) throws Exception {
        TextView rectangle = new RectangularView();
        rectangle = new HorizontalBar(rectangle);
        rectangle = new VerticalBar(rectangle);
        Border rectangleBorder = new Border(rectangle);
        rectangleBorder.setBordercolor("Black");
        rectangleBorder.setBorderwidth(5.7);
        System.out.println(rectangle.getDescription() + rectangleBorder.getDescription());
    }
}
