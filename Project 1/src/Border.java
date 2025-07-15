public class Border extends Decorator {
    TextView textview;
    private double borderwidth;
    private String bordercolor;

    Border(TextView textview){
        this.textview = textview;
    }

    public void setBorderwidth(double borderwidth) {
        this.borderwidth = borderwidth;
    }

    public void setBordercolor(String bordercolor) {
        this.bordercolor = bordercolor;
    }

    @Override
    public String getDescription() {
        return " border-width= "+ borderwidth + " border-color= " + bordercolor;
    }
}
