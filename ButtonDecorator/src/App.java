public class App {
    public static void main(String[] args) throws Exception {
        Button button = new SquareButton();
        Button button2 = new CircularButton();
        button = new Highlight(button);
        button = new Disabled(button);
        button = new Slashed(button);
        button2 = new Disabled(button2);
        button2 = new Slashed(button2);
        System.out.println(button.getDescription());
        System.out.println(button2.getDescription());
    }
}
