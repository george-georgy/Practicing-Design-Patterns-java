package behavioral.State.problem;

public class CanvasProblem {
    private ToolType currentTool;

    // 1 - Hardcoded conditionals (if-else statements)
    // 2 - Violates the Open/Closed Principle (OCP)

    // we want mouseDown and mouseUp behaves differently depending on current tool
    public void mouseDown(){
        if(currentTool == ToolType.SELECTION)
            System.out.println("Selection icon");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("Brush icon");
        else if (currentTool == ToolType.ERASER) {
            System.out.println("Eraser icon");
        }

    }
    public void mouseUp(){
        if(currentTool == ToolType.SELECTION)
            System.out.println("Draw dashed rectangle");
        else if (currentTool == ToolType.BRUSH)
            System.out.println("Draw a line");
        else if (currentTool == ToolType.ERASER) {
            System.out.println("Erase something");
        }
    }

    public ToolType getToolType() {
        return currentTool;
    }

    public void setToolType(ToolType toolType) {
        this.currentTool = toolType;
    }
}
