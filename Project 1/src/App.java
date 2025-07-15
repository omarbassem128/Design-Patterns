public class App {
    public static void main(String[] args) throws Exception {
        TextView rectangle = new RectangularView();
        rectangle = new HorizontalBar(rectangle);
        ((HorizontalBar) rectangle).setHorizontalScrollPosition(50.0);
        rectangle = new VerticalBar(rectangle);
        ((VerticalBar) rectangle).setVerticalScrollPosition(30.0);
        rectangle = new Border(rectangle);
        ((Border) rectangle).setBorderWidth(5.7);
        ((Border) rectangle).setBorderColor("Black");
        System.out.println(rectangle.getDescription());
    }
}
