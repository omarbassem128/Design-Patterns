public class VerticalBar extends Decorator {
    TextView textview;
    
    VerticalBar(TextView textview){
        this.textview = textview;
    }

    @Override
    public String getDescription() {
        return textview.getDescription() + "Vertical Bar";
    }

    public void enterVerticalScrollerPosition(double pos){
        scrollPosition = pos;
    }

    public double getVerticalScrollPosition(){
        return scrollPosition;
    }
}
