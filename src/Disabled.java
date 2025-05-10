public class Disabled extends ButtonDecorator {
    Button button;

    Disabled(Button button){
        this.button = button;
    }

    public String getDescription(){
        return button.getDescription() + ", disabled";
    }
}
