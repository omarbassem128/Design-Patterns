public class VerticalBar extends Decorator {
    TextView textview;
    private double scrollposition;
    
    VerticalBar(TextView textview, double scrollposition){
        this.textview = textview;
        this.scrollposition = scrollposition;
    }

    @Override
    public String getDescription() {
        return textview.getDescription() + " Vertical-Bar with scroll position = " + scrollposition;
    }
/* 
    public void setVerticalScrollPosition(double pos){
        scrollposition = pos;
    }

    public double getVerticalScrollPosition(){
        return scrollposition;
    } */
}
