public class Highlight extends ButtonDecorator {
    Button button;

    public Highlight(Button button){
        this.button = button;
    }

    public String getDescription(){
        return button.getDescription() + ", highlighted";
    }
}
