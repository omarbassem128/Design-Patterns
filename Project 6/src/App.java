public class App {
    public static void main(String[] args) throws Exception {
        Plotter plotter1 = new Plotter();
        Plotter plotter2 = new Plotter();
        Plotter plotter3 = new Plotter();
        plotter1.setGraph(new Bar());
        plotter2.setGraph(new Line());
        plotter3.setGraph(new Pie());
        plotter1.drawGraph();
        plotter2.drawGraph();
        plotter3.drawGraph();


    }
}
