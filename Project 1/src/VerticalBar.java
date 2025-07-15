public class VerticalBar extends Decorator {
    TextView textview;
    private double scrollposition;
    
    VerticalBar(TextView textview){
        this.textview = textview;
    }

    @Override
    public String getDescription() {
        return textview.getDescription() + "Vertical-Bar ";
    }

    public void enterVerticalScrollerPosition(double pos){
        scrollposition = pos;
    }

    public double getVerticalScrollPosition(){
        return scrollposition;
    }
}
