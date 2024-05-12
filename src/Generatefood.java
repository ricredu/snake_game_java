import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Generatefood
{
    public void generateFood(GraphicsContext gc)
    {
        start:
        while (true)
        {
            Main.foodX = (int) (Math.random() * Main.ROWS);
            Main.foodY = (int) (Math.random() * Main.COLUMNS);

            for (Main.Corner snake : Main.snakeBody)
            {
                if (snake.getX() == Main.foodX && snake.getY() == Main.foodY)
                {
                    continue start;
                }
            }

            Main.foodImage = new Image(Main.FOODS_IMAGE[(int) (Math.random() * Main.FOODS_IMAGE.length)]);

            break;
        }
    }
}
