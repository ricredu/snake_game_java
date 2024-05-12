import javafx.scene.canvas.GraphicsContext;

public class DrawFood
{
    public void drawFood(GraphicsContext gc)
    {
        gc.drawImage(Main.foodImage, Main.foodX * Main.SQUARE_SIZE, Main.foodY * Main.SQUARE_SIZE, Main.SQUARE_SIZE, Main.SQUARE_SIZE);
    }
}
