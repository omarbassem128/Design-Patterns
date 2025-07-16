public class Border extends Decorator {
    TextView textview;
    double borderwidth;
    String bordercolor;

    Border(TextView textview, double borderwidth, String bordercolor){
        this.textview = textview;
        this.borderwidth = borderwidth;
        this.bordercolor = bordercolor;
    }

    @Override
    public String getDescription() {
        return textview.getDescription() + " border-width= "+ borderwidth + " border-color= " + bordercolor;
    }
}
