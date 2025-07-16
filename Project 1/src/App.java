public class App {
    public static void main(String[] args) throws Exception {
        TextView rectangle = new RectangularView();
        rectangle = new HorizontalBar(rectangle, 6.6);
        rectangle = new VerticalBar(rectangle, 5.5);
        rectangle = new Border(rectangle, 5.5, "Blue");
        System.out.println(rectangle.getDescription());
    }
}
