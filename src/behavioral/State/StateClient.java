package behavioral.State;

public class StateClient {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setToolType((new BrushTool()));
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
