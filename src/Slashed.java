public class Slashed extends ButtonDecorator {
    Button button;

    Slashed(Button button){
        this.button = button;
    }

    public String getDescription(){
        return button.getDescription() + ", slashed";
    }
}
