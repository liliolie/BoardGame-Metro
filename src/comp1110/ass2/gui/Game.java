package comp1110.ass2.gui;

import comp1110.ass2.Metro;
import javafx.application.Application;
import javafx.application.Platform;
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
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.*;

/**
 * A very simple viewer for piece placements in the Metro game.
 * <p>
 * NOTE: This class is separate from your main game class.  This
 * class does not play a game, it just illustrates various piece
 * placements.
 */
public class Game extends Application {
    /* board layout */
    private static final int SQUARE_SIZE = 60;
    private static final int VIEWER_WIDTH = 1024;
    private static final int VIEWER_HEIGHT = 768;
    private static final String URI_BASE = "assets/";
    private static final int TILE_SPACING_X = 75;
    private static final int TILE_SPACING_Y = 102;
    private static final int MARGIN_X = 90;
    private static final int MARGIN_Y = 40;
    private static final int TILE_MARGIN_X = VIEWER_WIDTH - 320;
    private static final int TILE_MARGIN_Y = 62;
    private static final int BOARD_MARGIN = 71;
    private static final int BOARD_WIDTH = 450 + BOARD_MARGIN * 2;
    private static final int BOARD_HEIGHT = 450 + BOARD_MARGIN * 2;
    private static final int BOARD_Y = MARGIN_Y;
    private static final int BOARD_X = MARGIN_X;
    private static final List<String> TILES_ORDER = new ArrayList<>();

    private final Group root = new Group();
    private final Group controls = new Group();
    private final Group tiles = new Group();
    private final Group board = new Group();
    private final Group station_imgs = new Group();
    private final Group board_imgs = new Group();
    private final Group draggable_tiles = new Group();
    private final Group tiles_counter = new Group();

    private String placement = "";
    private Map<String, Integer> remain_tiles = new HashMap<>();
    private List<Text> txt_cnts = new ArrayList<>();

    class Tile extends ImageView {
        String type = "";
        int homeX, homeY;
        double mouseX, mouseY;

        Tile(String type) {
            this.type = type;
            setImage(new Image(getClass().getResource(URI_BASE + type + ".jpg").toString()));
            setLocation(type);
            setOnScroll(event -> {
                //System.out.println("holding piece" );
                event.consume();
            });
            setOnMousePressed(event -> {
                mouseX = event.getSceneX();
                mouseY = event.getSceneY();
            });
            setOnMouseDragged(event -> {
                toFront();
                double movementX = event.getSceneX() - mouseX;
                double movementY = event.getSceneY() - mouseY;
                setLayoutX(getLayoutX() + movementX);
                setLayoutY(getLayoutY() + movementY);
                mouseX = event.getSceneX();
                mouseY = event.getSceneY();
                event.consume();
            });
            setOnMouseReleased(event -> {
                snapToGrid();
                checkCompleted();
            });
        }

        private void setLocation(String type) {
            setFitHeight(SQUARE_SIZE - 0.8);
            setFitWidth(SQUARE_SIZE - 0.8);

            if (type.equals("aacb")) {
                setLayoutX(TILE_MARGIN_X + 0 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 0 * TILE_SPACING_Y);
            } else if (type.equals("cbaa")) {
                setLayoutX(TILE_MARGIN_X + 1 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 0 * TILE_SPACING_Y);
            } else if (type.equals("acba")) {
                setLayoutX(TILE_MARGIN_X + 2 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 0 * TILE_SPACING_Y);
            } else if (type.equals("baac")) {
                setLayoutX(TILE_MARGIN_X + 3 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 0 * TILE_SPACING_Y);
            } else if (type.equals("aaaa")) {
                setLayoutX(TILE_MARGIN_X + 0 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 1 * TILE_SPACING_Y);
            } else if (type.equals("cbcb")) {
                setLayoutX(TILE_MARGIN_X + 1 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 1 * TILE_SPACING_Y);
            } else if (type.equals("bcbc")) {
                setLayoutX(TILE_MARGIN_X + 2 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 1 * TILE_SPACING_Y);
            } else if (type.equals("cccc")) {
                setLayoutX(TILE_MARGIN_X + 3 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 1 * TILE_SPACING_Y);
            } else if (type.equals("bbbb")) {
                setLayoutX(TILE_MARGIN_X + 0 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 2 * TILE_SPACING_Y);
            } else if (type.equals("dacc")) {
                setLayoutX(TILE_MARGIN_X + 1 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 2 * TILE_SPACING_Y);
            } else if (type.equals("cdac")) {
                setLayoutX(TILE_MARGIN_X + 2 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 2 * TILE_SPACING_Y);
            } else if (type.equals("ccda")) {
                setLayoutX(TILE_MARGIN_X + 3 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 2 * TILE_SPACING_Y);
            } else if (type.equals("accd")) {
                setLayoutX(TILE_MARGIN_X + 0 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 3 * TILE_SPACING_Y);
            } else if (type.equals("dbba")) {
                setLayoutX(TILE_MARGIN_X + 1 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 3 * TILE_SPACING_Y);
            } else if (type.equals("adbb")) {
                setLayoutX(TILE_MARGIN_X + 2 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 3 * TILE_SPACING_Y);
            } else if (type.equals("badb")) {
                setLayoutX(TILE_MARGIN_X + 3 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 3 * TILE_SPACING_Y);
            } else if (type.equals("bbad")) {
                setLayoutX(TILE_MARGIN_X + 0 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 4 * TILE_SPACING_Y);
            } else if (type.equals("ddbc")) {
                setLayoutX(TILE_MARGIN_X + 1 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 4 * TILE_SPACING_Y);
            } else if (type.equals("cddb")) {
                setLayoutX(TILE_MARGIN_X + 2 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 4 * TILE_SPACING_Y);
            } else if (type.equals("bcdd")) {
                setLayoutX(TILE_MARGIN_X + 3 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 4 * TILE_SPACING_Y);
            } else if (type.equals("dbcd")) {
                setLayoutX(TILE_MARGIN_X + 0 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 5 * TILE_SPACING_Y);
            } else if (type.equals("adad")) {
                setLayoutX(TILE_MARGIN_X + 1 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 5 * TILE_SPACING_Y);
            } else if (type.equals("dada")) {
                setLayoutX(TILE_MARGIN_X + 2 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 5 * TILE_SPACING_Y);
            } else if (type.equals("dddd")) {
                setLayoutX(TILE_MARGIN_X + 3 * TILE_SPACING_X);
                setLayoutY(TILE_MARGIN_Y + 5 * TILE_SPACING_Y);
            }
            homeX = (int) Math.round(getLayoutX());
            homeY = (int) Math.round(getLayoutY());
        }

        private void snapToGrid() {
            if (mouseX < 135 || mouseY < 65 || mouseX > 640 || mouseY > 590) {
                setLayoutX(homeX);
                setLayoutY(homeY);
            } else {
                int x, y;
                x = (int) Math.round((getLayoutX() - MARGIN_X) / (SQUARE_SIZE + 0.0f));
                y = (int) Math.round((getLayoutY() - MARGIN_Y) / (SQUARE_SIZE + 0.0f));
                //System.out.println(x + " " + y);
                if (4 <= x && x <= 5 && 4 <= y && y <= 5) {
                    setLayoutX(homeX);
                    setLayoutY(homeY);
                    return;
                }
                setLayoutX(x * SQUARE_SIZE + MARGIN_X - 4);
                setLayoutY(y * SQUARE_SIZE + MARGIN_Y - 4.3);
                placement += type;
                int remain = remain_tiles.get(type) - 1;
                remain_tiles.put(type, remain);
                if (remain != 0)
                    draggable_tiles.getChildren().add(new Tile(type));
                freshCounters(type, remain);
            }
        }

    }

    private void makeDraggableTiles() {
        draggable_tiles.getChildren().clear();
        for (String s : Metro.list0)
            draggable_tiles.getChildren().add(new Tile(s));
        for (String s : Metro.list1)
            draggable_tiles.getChildren().add(new Tile(s));
        for (String s : Metro.list2)
            draggable_tiles.getChildren().add(new Tile(s));
        draggable_tiles.toFront();
    }

    private void freshCounters(String type, int remain) {
        Text txtView = txt_cnts.get(TILES_ORDER.indexOf(type));
        if (remain == 0) txtView.setVisible(false);
        txtView.setText("" + remain);
    }

    private void makeCounters() {
        tiles_counter.getChildren().clear();
        Text counter;
        for (String s : Metro.list0) remain_tiles.put(s, 4);
        for (String s : Metro.list1) remain_tiles.put(s, 3);
        for (String s : Metro.list2) remain_tiles.put(s, 2);
        TILES_ORDER.addAll(Metro.list0);
        TILES_ORDER.addAll(Metro.list1);
        TILES_ORDER.addAll(Metro.list2);
        for (int k = 0, i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                counter = new Text("" + remain_tiles.get(TILES_ORDER.get(k++)));
                counter.setFont(Font.font("Timer New Roman",
                        FontWeight.BOLD, FontPosture.ITALIC, 15));
                counter.setFill(Color.rgb(200, 120, 30));
                counter.setLayoutX(TILE_MARGIN_X + TILE_SPACING_X * j + 24);
                counter.setLayoutY(TILE_MARGIN_Y + TILE_SPACING_Y * i - 17);
                txt_cnts.add(counter);
                tiles_counter.getChildren().add(counter);
            }
        }
    }

    public boolean checkCompleted() {
        return false;
    }

    /**
     * Draw a placement in the window, removing any previously drawn one
     *
     * @param placement A valid placement string
     */
    void makePlacement(String placement) {
        board_imgs.getChildren().clear();
        for (int i = 0; i < placement.length(); i += 6) {
            ImageView img = new ImageView();
            img.setImage(new Image(getClass().getResource(URI_BASE + placement.substring(i, i + 4) + ".jpg").toString()));
            img.setFitWidth(SQUARE_SIZE - 1);
            img.setFitHeight(SQUARE_SIZE - 1);
            img.setLayoutX(MARGIN_X - 5 + (placement.charAt(i + 5) - '0' + 1) * SQUARE_SIZE);
            img.setLayoutY(MARGIN_Y - 5 + (placement.charAt(i + 4) - '0' + 1) * SQUARE_SIZE);
            board_imgs.getChildren().add(img);
        }
        root.getChildren().add(board_imgs);
    }

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
        img.setFitWidth(SQUARE_SIZE - 1);
        img.setFitHeight(SQUARE_SIZE - 1);
        img.setLayoutX(MARGIN_X - 5 + 4 * SQUARE_SIZE);
        img.setLayoutY(MARGIN_Y - 5 + 4 * SQUARE_SIZE);
        img.setRotate(270);
        station_imgs.getChildren().add(img);
        img = new ImageView();
        img.setImage(new Image(getClass().getResource(URI_BASE + "centre_station.jpg").toString()));
        img.setFitWidth(SQUARE_SIZE - 1);
        img.setFitHeight(SQUARE_SIZE - 1);
        img.setLayoutX(MARGIN_X - 5 + 4 * SQUARE_SIZE);
        img.setLayoutY(MARGIN_Y - 5 + 5 * SQUARE_SIZE);
        img.setRotate(180);
        station_imgs.getChildren().add(img);
        img = new ImageView();
        img.setImage(new Image(getClass().getResource(URI_BASE + "centre_station.jpg").toString()));
        img.setFitWidth(SQUARE_SIZE - 1);
        img.setFitHeight(SQUARE_SIZE - 1);
        img.setLayoutX(MARGIN_X - 5 + 5 * SQUARE_SIZE);
        img.setLayoutY(MARGIN_Y - 5 + 4 * SQUARE_SIZE);
        station_imgs.getChildren().add(img);
        img = new ImageView();
        img.setImage(new Image(getClass().getResource(URI_BASE + "centre_station.jpg").toString()));
        img.setFitWidth(SQUARE_SIZE - 1);
        img.setFitHeight(SQUARE_SIZE - 1);
        img.setLayoutX(MARGIN_X - 5 + 5 * SQUARE_SIZE);
        img.setLayoutY(MARGIN_Y - 5 + 5 * SQUARE_SIZE);
        img.setRotate(90);
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
        baseboard.setOpacity(0.7);

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

        ImageView bgimage = new ImageView();
        bgimage.setImage(new Image(getClass().getResource(URI_BASE + "bg.jpg").toString()));
        bgimage.setFitWidth(VIEWER_WIDTH);
        bgimage.setFitHeight(VIEWER_HEIGHT);
        bgimage.setOpacity(0.66);

        root.getChildren().add(board);
        root.getChildren().add(canvas);
        root.getChildren().add(bgimage);
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
        Text label1 = new Text("Press R to restart game, Q to exit, have fun!");
        label1.setFont(Font.font("Timer New Roman",
                FontWeight.SEMI_BOLD, FontPosture.ITALIC, 17));
        label1.setLayoutX(160);
        label1.setLayoutY(VIEWER_HEIGHT - 74);
//        Button button = new Button("Start");
//        button.setOnAction(e -> {
//            makePlacement("");
//            makeDraggableTiles();
//            makeCounters();
//        });
//        button.setFont(Font.font("Timer New Roman",
//                FontWeight.SEMI_BOLD, FontPosture.ITALIC, 14));
//        button.setLayoutX(405);
//        button.setLayoutY(VIEWER_HEIGHT - 75);
        controls.getChildren().add(label1);
    }

    private void setUpHotKeys(Scene scene) {
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.R) {
                makePlacement("");
                makeDraggableTiles();
                makeCounters();
                event.consume();
            } else if (event.getCode() == KeyCode.Q) {
                // exit game
                Platform.exit();
                event.consume();
            }
        });
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FocusGame Viewer");
        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
        root.getChildren().addAll(controls, draggable_tiles, tiles_counter);
        setUpHotKeys(scene);
        makeControls();
        makeBoard();
        makeStations();
        makeDraggableTiles();
        makeCounters();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
