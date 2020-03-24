package comp1110.ass2.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;

/**
 * A very simple viewer for piece placements in the Metro game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various piece
 * placements.
 */
public class Viewer extends Application {
    /* board layout */
    private static final int SQUARE_SIZE = 60;
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;

    private static final String URI_BASE = "assets/";

    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group tiles = new Group();
    private final Group board = new Group();
    private final Group station_imgs = new Group();
    private final Group tile_imgs = new Group();
    private TextField textField;

    private static final int TILE_SPACING = 150;
    private static final int MARGIN_X = 90;
    private static final int MARGIN_Y = 40;
    private static final int BOARD_MARGIN = 71;
    private static final int BOARD_WIDTH = TILE_SPACING * 3 + BOARD_MARGIN * 2;
    private static final int BOARD_HEIGHT = TILE_SPACING * 3 + BOARD_MARGIN * 2;
    private static final int BOARD_Y = MARGIN_Y;
    private static final int BOARD_X = MARGIN_X;

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */
    void makePlacement(String placement) {
        tile_imgs.getChildren().clear();
        for (int i = 0; i < placement.length(); i += 6) {
            ImageView img = new ImageView();
            img.setImage(new Image(getClass().getResource(URI_BASE + placement.substring(i, i + 4) + ".jpg").toString()));
            img.setFitWidth(SQUARE_SIZE - 1);
            img.setFitHeight(SQUARE_SIZE - 1);
            img.setLayoutX(MARGIN_X - 5 + (placement.charAt(i + 5) - '0' + 1) * SQUARE_SIZE);
            img.setLayoutY(MARGIN_Y - 5 + (placement.charAt(i + 4) - '0' + 1) * SQUARE_SIZE);
            tile_imgs.getChildren().add(img);
        }
        root.getChildren().add(tile_imgs);
    }
    //FIXME Task 4: implement the simple placement viewer
    private void makeStations() {
        for (int i = 1; i <= 8; i++) {
            ImageView img = new ImageView();
            img.setImage(new Image(getClass().getResource(URI_BASE + "station" + i + ".jpg").toString()));
            img.setFitWidth(SQUARE_SIZE - 1);
            img.setFitHeight(SQUARE_SIZE - 1);
            img.setLayoutX(626 - i * SQUARE_SIZE);
            img.setLayoutY(MARGIN_Y - 5);
            img.setRotate(180);
            station_imgs.getChildren().add(img);

            img = new ImageView();
            img.setImage(new Image(getClass().getResource(URI_BASE + "station" + (17 - i) + ".jpg").toString()));
            img.setFitWidth(SQUARE_SIZE - 1);
            img.setFitHeight(SQUARE_SIZE - 1);
            img.setLayoutX(MARGIN_X - 5);
            img.setLayoutY(575 - i * SQUARE_SIZE);
            img.setRotate(90);
            station_imgs.getChildren().add(img);

            img = new ImageView();
            img.setImage(new Image(getClass().getResource(URI_BASE + "station" + (25 - i) + ".jpg").toString()));
            img.setFitWidth(SQUARE_SIZE - 1);
            img.setFitHeight(SQUARE_SIZE - 1);
            img.setLayoutX(626 - i * SQUARE_SIZE);
            img.setLayoutY(MARGIN_Y - 5 + 9 * SQUARE_SIZE);
            station_imgs.getChildren().add(img);

            img = new ImageView();
            img.setImage(new Image(getClass().getResource(URI_BASE + "station" + (i + 24) + ".jpg").toString()));
            img.setFitWidth(SQUARE_SIZE - 1);
            img.setFitHeight(SQUARE_SIZE - 1);
            img.setLayoutX(MARGIN_X - 5 + 9 * SQUARE_SIZE);
            img.setLayoutY(575 - i * SQUARE_SIZE);
            img.setRotate(270);
            station_imgs.getChildren().add(img);
        }

        ImageView img = new ImageView();
        img.setImage(new Image(getClass().getResource(URI_BASE + "centre_station.jpg").toString()));
        img.setFitWidth(SQUARE_SIZE * 2 - 1);
        img.setFitHeight(SQUARE_SIZE * 2 - 1);
        img.setLayoutX(MARGIN_X - 4 + 4 * SQUARE_SIZE);
        img.setLayoutY(MARGIN_Y - 4 + 4 * SQUARE_SIZE);
        station_imgs.getChildren().add(img);

        root.getChildren().add(station_imgs);
    }

    private void makeBoard() {
        board.getChildren().clear();

        Rectangle baseboard = new Rectangle();
        baseboard.setWidth(BOARD_WIDTH + 10);
        baseboard.setHeight(BOARD_HEIGHT + 10);
        baseboard.setLayoutX(BOARD_X - 5);
        baseboard.setLayoutY(BOARD_Y - 5);
        baseboard.setArcWidth(20.0);
        baseboard.setArcHeight(20.0);
        baseboard.setFill(Color.CORNFLOWERBLUE);
        baseboard.setStroke(Color.CYAN);
        baseboard.setOpacity(0.6);

        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(2.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setColor(Color.color(0, 0, 0, .4));
        baseboard.setEffect(dropShadow);

        board.getChildren().add(baseboard);
        tiles.setLayoutX(BOARD_MARGIN);
        tiles.setLayoutY(BOARD_MARGIN);
        board.getChildren().add(tiles);
        Canvas canvas = new Canvas(VIEWER_WIDTH, VIEWER_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawLines(gc);

        board.toBack();
        canvas.toBack();
        root.getChildren().add(board);
        root.getChildren().add(canvas);
    }

    public void drawLines(GraphicsContext gc) {
        //draw lines
        gc.setLineWidth(3);
        gc.setStroke(Color.BROWN);
        int x_shift = 145;
        int y_shift = 95;
        int y_final = SQUARE_SIZE * 8 + y_shift;
        int x_final = SQUARE_SIZE * 8 + x_shift;
        for (int i = 0; i < 9; i++)
            gc.strokeLine(x_shift + i * SQUARE_SIZE, y_shift,
                    x_shift + i * SQUARE_SIZE, y_final);
        for (int i = 0; i < 9; i++)
            gc.strokeLine(x_shift, y_shift + i * SQUARE_SIZE,
                    x_final, y_shift + i * SQUARE_SIZE);


        gc.restore();
    }

    /**
     * Create a basic text field for input and a refresh button.
     */
    private void makeControls() {
        Label label1 = new Label("Placement:");
        textField = new TextField();
        textField.setPrefWidth(300);
        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                makePlacement(textField.getText());
                textField.clear();
            }
        });
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField, button);
        hb.setSpacing(10);
        hb.setLayoutX(130);
        hb.setLayoutY(VIEWER_HEIGHT - 50);
        controls.getChildren().add(hb);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FocusGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);

        root.getChildren().add(controls);

        makeControls();
        makeBoard();
        makeStations();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

