public class HorizontalBar extends Decorator {
    TextView textview;
    private double scrollposition;
    
    HorizontalBar(TextView textview){
        super(textview);
        this.textview = textview;
    }

    @Override
    public String getDescription() {
        return textview.getDescription() + "Horizontal-Bar ";
    }

    public void setHorizontalScrollPosition(double pos){
        scrollposition = pos;
    }

    public double getHorizontalScrollPosition(){
        return scrollposition;
    }
}
