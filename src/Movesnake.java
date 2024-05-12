import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Movesnake
{

    public void move(Scene scene)
    {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>()
        {

            @Override
            public void handle(KeyEvent event)
            {
                KeyCode code = event.getCode();
                if (code == KeyCode.RIGHT || code == KeyCode.D)
                {
                    if (Main.currentDirection != Main.LEFT)
                    {
                        Main.currentDirection = Main.RIGHT;
                    }
                }
                else if (code == KeyCode.LEFT || code == KeyCode.A)
                {
                    if (Main.currentDirection != Main.RIGHT)
                    {
                        Main.currentDirection = Main.LEFT;
                    }
                }
                else if (code == KeyCode.UP || code == KeyCode.W)
                {
                    if (Main.currentDirection !=Main. DOWN)
                    {
                        Main.currentDirection =Main. UP;
                    }
                }
                else if (code == KeyCode.DOWN || code == KeyCode.S)
                {
                    if (Main.currentDirection !=Main.UP)
                    {
                        Main.currentDirection = Main.DOWN;
                    }
                }
            }

        });

        for (int i = Main.snakeBody.size() - 1; i >= 1; i--)
        {
            Main.snakeBody.get(i).x = Main.snakeBody.get(i - 1).x;
            Main.snakeBody.get(i).y = Main.snakeBody.get(i - 1).y;
        }

        switch (Main.currentDirection)
        {
            case Main.RIGHT:
                Main.snakeHead.x++;
                break;
            case Main.LEFT:
                Main.snakeHead.x--;
                break;
            case Main. UP:
                Main.snakeHead.y--;
                break;
            case Main. DOWN:
                Main.snakeHead.y++;
                break;
        }

    }







}
