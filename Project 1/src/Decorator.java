public abstract class Decorator extends TextView {
    protected TextView textView;

    public Decorator(TextView textView) {
        this.textView = textView;
    }

    @Override
    public abstract String getDescription();
}
