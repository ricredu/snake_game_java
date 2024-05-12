import java.util.ArrayList;
import java.util.List;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application
{
    public static  int WIDTH = 800;
    public static  int HEIGHT = WIDTH;
    public static final int ROWS = 20;
    public static final int COLUMNS = ROWS;
    public static final int SQUARE_SIZE = WIDTH / ROWS;
    public static final String[] FOODS_IMAGE = new String[] {"ic_apple.png",
            "ic_berry.png",
            "ic_cherry.png",
            "ic_coconut_.png",
            "ic_orange.png",
            "ic_peach.png",
            "ic_pomegranate.png",
            "ic_tomato.png",
            "ic_watermelon.png"};

    public static List<Corner> snakeBody = new ArrayList<Corner>();
    public static Corner snakeHead;
    public static Image foodImage;
    public static int foodX;
    public static int foodY;
    public static final int RIGHT = 0;
    public static final int LEFT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    public static boolean gameOver;
    public static int currentDirection;
    public static int score = 0;
    public GraphicsContext gc;

    public static void main(String[] args)
    {
         launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        Group root = new Group();
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake Game");
        primaryStage.setResizable(false);
        primaryStage.show();
        gc = canvas.getGraphicsContext2D();
        for (int i = 0; i < 3; i++)
        {
            Main.snakeBody.add(new Main.Corner(5, Main.ROWS / 2));

        }

        Generatefood fg = new Generatefood();
        fg.generateFood(gc);
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(200), e -> run(gc, scene) ));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }


    private void run(GraphicsContext gc, Scene scene)
    {
        if (gameOver)
        {
            gc.setFill(Color.RED);
            gc.setFont(new Font("Digital-7", 70));
            gc.fillText("Game Over", WIDTH / 3.5, HEIGHT / 2);
            return;
        }


        Backround bg = new Backround();
        bg.drawBackground(gc);
        DrawFood dFood = new DrawFood();
        dFood.drawFood(gc);
        EatFood ef = new EatFood();
        ef.eatFood(gc);
        Drawsnake sd = new Drawsnake();
        sd.drawSnake(gc,scene);
        Movesnake sm = new Movesnake();
        sm.move(scene);
        Gameover g = new Gameover();
        g.gameOver();
        Score score = new Score();
        score.drawScore(gc);
    }

    static class Corner
    {
        int x;
        int y;
        public Corner(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
            return y;
        }

    }


}