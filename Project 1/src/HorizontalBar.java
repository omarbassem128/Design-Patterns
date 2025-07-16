public class HorizontalBar extends Decorator {
    TextView textview;
    private double scrollposition;
    
    HorizontalBar(TextView textview, double scrollposition){
        this.textview = textview;
        this.scrollposition = scrollposition;

    }

    @Override
    public String getDescription() {
        return textview.getDescription() + " Horizontal-Bar with scroll position = " + scrollposition;
    }
/* 
    public void setHorizontalScrollPosition(double pos){
        scrollposition = pos;
    }

    public double getHorizontalScrollPosition(){
        return scrollposition;
    } */
}
