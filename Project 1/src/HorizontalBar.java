public class HorizontalBar extends Decorator {
    TextView textview;
    
    HorizontalBar(TextView textview){
        this.textview = textview;
    }

    @Override
    public String getDescription() {
        return textview.getDescription() + "Horizontal Bar";
    }

    public void setHorizontaScrollPosition(double pos){
        scrollPosition = pos;
    }

    public double getHorizontalScrollPosition(){
        return scrollPosition;
    }
}
