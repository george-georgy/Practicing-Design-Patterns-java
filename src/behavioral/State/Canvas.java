package behavioral.State;


// we want mouseDown and mouseUp behaves differently depending on current tool
// we do not want a lot of "if" statement
// this class open for extension close for modification.

public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getToolType() {
        return currentTool;
    }

    public void setToolType(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
