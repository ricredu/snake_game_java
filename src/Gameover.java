public class Gameover
{
    public void gameOver()
    {
        if (Main.snakeHead.x < 0 || Main.snakeHead.y < 0 || Main.snakeHead.x * Main.SQUARE_SIZE >= Main.WIDTH || Main.snakeHead.y * Main.SQUARE_SIZE >= Main.HEIGHT)
        {
            Main.gameOver = true;
        }

        //destroy itself
        for (int i = 1; i < Main.snakeBody.size(); i++)
        {
            if (Main.snakeHead.x == Main.snakeBody.get(i).getX() && Main.snakeHead.getY() == Main.snakeBody.get(i).getY())
            {
                Main.gameOver = true;
                break;
            }
        }
    }
}
