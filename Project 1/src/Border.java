public class Border extends Decorator {
    TextView textview;
    private double borderwidth;
    private String bordercolor;

    Border(TextView textview){
        super(textview);
        this.textview = textview;
    }

    public void setBorderWidth(double borderwidth) {
        this.borderwidth = borderwidth;
    }

    public void setBorderColor(String bordercolor) {
        this.bordercolor = bordercolor;
    }

    @Override
    public String getDescription() {
        return " border-width= "+ borderwidth + " border-color= " + bordercolor;
    }
}
