public class Plotter{
    Graph graph;

    public void setGraph(Graph graph){
        this.graph = graph;
    }

    public void drawGraph(){
        graph.plotGraph();
    }
}