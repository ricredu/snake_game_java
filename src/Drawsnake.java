import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Drawsnake
{
    public void drawSnake(GraphicsContext gc , Scene scene)
    {

        Main.snakeHead = Main.snakeBody.get(0);
        gc.setFill(Color.web("4674E9"));
        gc.fillRoundRect(Main.snakeHead.getX() * Main.SQUARE_SIZE, Main.snakeHead.getY() * Main.SQUARE_SIZE, Main.SQUARE_SIZE - 1, Main.SQUARE_SIZE - 1, 35, 35);


        for (int i = 1; i < Main.snakeBody.size(); i++)
        {
            gc.fillRoundRect(Main.snakeBody.get(i).getX() * Main.SQUARE_SIZE, Main.snakeBody.get(i).getY() * Main.SQUARE_SIZE, Main.SQUARE_SIZE - 1,Main.SQUARE_SIZE - 1, 20, 20);
        }

    }
}
