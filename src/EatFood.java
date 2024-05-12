import javafx.scene.canvas.GraphicsContext;

public class EatFood
{
    public void eatFood(GraphicsContext gc)
    {


        if (Main.snakeHead!=null && Main.snakeHead.getX() == Main.foodX && Main.snakeHead.getY() == Main.foodY) {
            Main.snakeBody.add(new Main.Corner(-1, -1));
            Generatefood fg = new Generatefood();
            fg.generateFood(gc);
            Main.score += 5;
        }
    }
}
