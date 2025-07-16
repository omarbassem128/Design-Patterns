public class App {
    public static void main(String[] args) throws Exception {
        TextView rectangle = new RectangularView();
        rectangle = new HorizontalBar(rectangle);
        rectangle = new VerticalBar(rectangle);
        rectangle = new Border(rectangle, 5.5, "Blue");
        System.out.println(rectangle.getDescription());
    }
}
