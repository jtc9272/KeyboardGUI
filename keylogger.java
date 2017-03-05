import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

import java.applet.Applet;

import static javafx.geometry.Pos.CENTER;
import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.GRAY;
import static javafx.scene.paint.Color.WHITE;
import javafx.scene.paint.Color;

/**
 * Created by James Clee on 7/1/2016.
 */
public class keylogger extends Application implements Observer {
    public ArrayList keys;
    public GridPane keyboard;
    public HashMap<String, Button> keystore;
    public Label unbound;

    public void update(Observable o, Object arg) {

    }

    public void start(Stage stage){
        long starttime = System.nanoTime();
        keystore = new HashMap<String, Button>();
        unbound = new Label();
        unbound.setText("Unbound keys pressed:      ");


        keyboard = new GridPane();
        BorderPane mainPane = new BorderPane();
        mainPane.setCenter(keyboard);
        GridPane grid1 = new GridPane();
        ArrayList keys = new ArrayList<>();

        //set keybinds
        keys.add("w");
        keys.add("a");
        keys.add("s");
        keys.add("d");
        keys.add("1");
        keys.add("2");
        keys.add("3");
        keys.add("4");
        keys.add("5");
        keys.add("f");
        keys.add("g");
        keys.add("e");
        keys.add("r");
        keys.add("b");

        //keyboard row 1
        Button r1 = new Button();
        createKey(r1,"1");
        keystore.put("1",r1);
        Button r2 = new Button();
        createKey(r2,"2");
        keystore.put("2",r2);
        Button r3 = new Button();
        createKey(r3,"3");
        keystore.put("3",r3);
        Button r4 = new Button();
        createKey(r4,"4");
        keystore.put("4",r4);
        Button r5 = new Button();
        createKey(r5,"5");
        keystore.put("5",r5);
        Button r6 = new Button();
        createKey(r6,"6");
        keystore.put("6",r6);
        Button r7 = new Button();
        createKey(r7,"7");
        keystore.put("7",r7);
        Button r8 = new Button();
        createKey(r8,"8");
        keystore.put("8",r8);
        Button r9 = new Button();
        createKey(r9,"9");
        keystore.put("9",r9);
        Button r0 = new Button();
        createKey(r0,"0");
        keystore.put("0",r0);

        //keyboard row 2
        Button rq = new Button();
        createKey(rq,"q");
        keystore.put("q",rq);
        Button rw = new Button();
        createKey(rw,"w");
        keystore.put("w",rw);
        Button re = new Button();
        createKey(re,"e");
        keystore.put("e",re);
        Button rr = new Button();
        createKey(rr,"r");
        keystore.put("r",rr);
        Button rt = new Button();
        createKey(rt,"t");
        keystore.put("t",rt);
        Button ry = new Button();
        createKey(ry,"y");
        keystore.put("y",ry);
        Button ru = new Button();
        createKey(ru,"u");
        keystore.put("u",ru);
        Button ri = new Button();
        createKey(ri,"i");
        keystore.put("i",ri);
        Button ro = new Button();
        createKey(ro,"o");
        keystore.put("o",ro);
        Button rp = new Button();
        createKey(rp,"p");
        keystore.put("p",rp);

        //keyboard row 3
        Button ra = new Button();
        createKey(ra,"a");
        keystore.put("a",ra);
        Button rs = new Button();
        createKey(rs,"s");
        keystore.put("s",rs);
        Button rd = new Button();
        createKey(rd,"d");
        keystore.put("d",rd);
        Button rf = new Button();
        createKey(rf,"f");
        keystore.put("f",rf);
        Button rg = new Button();
        createKey(rg,"g");
        keystore.put("g",rg);
        Button rh = new Button();
        createKey(rh,"h");
        keystore.put("h",rh);
        Button rj = new Button();
        createKey(rj,"j");
        keystore.put("j",rj);
        Button rk = new Button();
        createKey(rk,"k");
        keystore.put("k",rk);
        Button rl = new Button();
        createKey(rl,"l");
        keystore.put("l",rl);

        //keyboard row 4
        Button rz = new Button();
        createKey(rz,"z");
        keystore.put("z",rz);
        Button rx = new Button();
        createKey(rx,"x");
        keystore.put("x",rx);
        Button rc = new Button();
        createKey(rc,"c");
        keystore.put("c",rc);
        Button rv = new Button();
        createKey(rv,"v");
        keystore.put("v",rv);
        Button rb = new Button();
        createKey(rb,"b");
        keystore.put("b",rb);
        Button rn = new Button();
        createKey(rn,"n");
        keystore.put("n",rn);
        Button rm = new Button();
        createKey(rm,"m");
        keystore.put("m",rm);

        GridPane.setConstraints(r1,0,0);
        GridPane.setConstraints(r2,1,0);
        GridPane.setConstraints(r3,2,0);
        GridPane.setConstraints(r4,3,0);
        GridPane.setConstraints(r5,4,0);
        GridPane.setConstraints(r6,5,0);
        GridPane.setConstraints(r7,6,0);
        GridPane.setConstraints(r8,7,0);
        GridPane.setConstraints(r9,8,0);
        GridPane.setConstraints(r0,9,0);
        GridPane.setConstraints(rq,0,1);
        GridPane.setConstraints(rw,1,1);
        GridPane.setConstraints(re,2,1);
        GridPane.setConstraints(rr,3,1);
        GridPane.setConstraints(rt,4,1);
        GridPane.setConstraints(ry,5,1);
        GridPane.setConstraints(ru,6,1);
        GridPane.setConstraints(ri,7,1);
        GridPane.setConstraints(ro,8,1);
        GridPane.setConstraints(rp,9,1);
        GridPane.setConstraints(ra,0,2);
        GridPane.setConstraints(rs,1,2);
        GridPane.setConstraints(rd,2,2);
        GridPane.setConstraints(rf,3,2);
        GridPane.setConstraints(rg,4,2);
        GridPane.setConstraints(rh,5,2);
        GridPane.setConstraints(rj,6,2);
        GridPane.setConstraints(rk,7,2);
        GridPane.setConstraints(rl,8,2);
        GridPane.setConstraints(rz,0,3);
        GridPane.setConstraints(rx,1,3);
        GridPane.setConstraints(rc,2,3);
        GridPane.setConstraints(rv,3,3);
        GridPane.setConstraints(rb,4,3);
        GridPane.setConstraints(rn,5,3);
        GridPane.setConstraints(rm,6,3);
        grid1.setHgap(10);
        grid1.setVgap(10);
        grid1.setPadding(new Insets(0, 10, 0, 10));
        grid1.setAlignment(CENTER);
        grid1.getChildren().addAll(r1,r2,r3,r4,r5,r6,r7,r8,r9,r0,rq,rw,re,rr,rt,ry,ru,ri,ro,rp,ra,rs,rd,rf,rg,rh,rj,rk,rl,rz,rx,rc,rv,rb,rn,rm);
        mainPane.setCenter(grid1);

        /**Button getBinds = new Button();
        getBinds.setText("Add File");
        getBinds.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scanner config = new Scanner(new FileReader("staffnumbers.txt"));
            }});*/

        final TextField textBox = new TextField();
        textBox.setPromptText("Input");

        textBox.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                String n = ke.getText();
                Button b = keystore.get(n);
                if (keys.contains(n)){
                    b.setStyle("-fx-base : #00FF00");}
                else {
                    b.setStyle("-fx-base : #FF0000");
                    String uk = unbound.getText();
                    long keypressed = System.nanoTime() - starttime;
                    uk += "\n"+n+" pressed at "+keypressed;
                    unbound.setText(uk);
                    mainPane.setRight(unbound);
                }
                textBox.setText("");
            }
        });

        textBox.setOnKeyReleased(new EventHandler<KeyEvent>(){
                public void handle (KeyEvent k1){
                    String n = k1.getText();
                    Button b1 = keystore.get(n);
                    b1.setStyle("-fx-base : #D3D3D3");
                    textBox.setText("");
        }
        });

        mainPane.setTop(textBox);
        mainPane.setRight(unbound);

        Group group = new Group();
        group.getChildren().add(mainPane);
        Scene scene = new Scene( group );

        stage.setTitle( "Key Input Display" );
        stage.setScene( scene );
        stage.show();
    }

    public Node createKey(Button r, String c){
        r.setPrefHeight(40);
        r.setPrefWidth(40);
        r.setText(c);
        r.setStyle("-fx-base : #D3D3D3");

        return r;
    }

    public void listener(){
        keys.add('w');
        keys.add('a');
        keys.add('s');
        keys.add('d');
        keys.add('1');
        keys.add('2');
        keys.add('3');
        keys.add('4');
        keys.add('5');
    }
    public static void main(String[] args){
        Application.launch(args);
    }

}
