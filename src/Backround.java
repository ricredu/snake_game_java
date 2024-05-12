import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Backround
{
    public void drawBackground(GraphicsContext gc)
    {
        for (int i = 0; i < Main.ROWS; i++)
        {
            for (int j = 0; j < Main.COLUMNS; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    gc.setFill(Color.web("AAD751"));
                }
                else
                {
                    gc.setFill(Color.web("A2D149"));
                }
                gc.fillRect(i * Main.SQUARE_SIZE, j * Main.SQUARE_SIZE, Main.SQUARE_SIZE, Main.SQUARE_SIZE);
            }
        }
    }
}
