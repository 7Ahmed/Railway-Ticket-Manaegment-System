import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
 
	Stage stage;
	Scene scene;
	@Override
	public void start(Stage s) throws Exception {
		// TODO Auto-generated method stub
		stage = s;
		stage.setTitle("Railway Manegemnet System");
		stage.setHeight(400);
		stage.setWidth(800);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
private void addComponents() {
		// TODO Auto-generated method stub
	Font f;
	f= Font.font("Calibri",FontWeight.BOLD, 14);
	Label train=new Label("Trains:");
	train.setStyle("-fx-font: normal bold 24px 'serif'");
	Button btn1=new Button("GREEN LINE");
	Button btn2=new Button("KARAKORAM");
	Button btn3=new Button("PAKISTAN EXPRESS");
	Button btn4=new Button("SHALIMARR EXPRESS");
    btn1.setPrefSize(100, 50);
	btn2.setPrefSize(100, 50);
	btn3.setPrefSize(150, 50);
	btn4.setPrefSize(150, 50);
	btn1.setFont(f);
	btn2.setFont(f);
	btn3.setFont(f);
	btn4.setFont(f);
	btn1.setStyle("-fx-background-color: Grey; -fx-textfill: white;");
	btn2.setStyle("-fx-background-color: Grey; -fx-textfill: white;");
	btn3.setStyle("-fx-background-color: Grey; -fx-textfill: white;");
	btn4.setStyle("-fx-background-color: Grey; -fx-textfill: white;");
	
    GridPane g=new GridPane();
    g.setAlignment(Pos.BASELINE_CENTER);
	Text t=new Text("Railway Ticket Booking:");
	t.setStyle("-fx-font: normal bold 36px 'serif' ");
	Text t1=new Text("TRAINS:");
	t1.setStyle("-fx-font: normal bold 36px 'serif' ");
	
	HBox hb=new HBox();
	//hb.setStyle("-fx-background-color: MAROON;");
	hb.setPadding(new Insets(140,0,0,20));
    hb.getChildren().addAll(btn1,btn2,btn3,btn4);
	hb.setSpacing(10);
	
    BorderPane bd=new BorderPane();
   // bd.setStyle("-fx-background-color: MAROON;");
   
    bd.setTop(t);
    bd.setAlignment(t,Pos.CENTER);
    bd.setLeft(t1);
    bd.setAlignment(t1, Pos.CENTER_LEFT);
    bd.setCenter(hb);
   // bd.setStyle("-fx-background-image: url('pic_1528453509.jpg'); "
    //		+ "-fx-background-position: center center; "
    	//	+ "-fx-background-repeat: stretch;");
    //Setting image
    Image image = new Image("file:/C:\\Users\\dell\\Desktop\\p.jpg");    
    //Setting the image view 
    ImageView imageView = new ImageView(image); 
    BackgroundSize bsize =new BackgroundSize(800, 400, true, true, true, true);
    bd.setBackground(new Background(new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,bsize)));
    
   
	scene=new Scene(bd);
	//scene.getStylesheets().add("Mystyle.css");
	

	btn1.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Show.trainame = "GREEN LINE";
			Show.economy = "3500";
			Show.local = "2000";
			Show.bussiness = "6000";
			new Ticket();
		}
		
		
		
		
		
	});
	btn2.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Show.trainame = "KARAKORAM";
			Show.economy = "3000";
			Show.local = "1500";
			Show.bussiness = "5000";
			new Ticket();
		}
		
		
		
		
		
	});
	btn3.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Show.trainame = "PAKISTAN EXPRESS";
			Show.economy = "2500";
			Show.local = "1000";
			Show.bussiness = "4500";
			new Ticket();
		}
		
		
		
		
		
	});
	btn4.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			
			Show.trainame = "SHALIMARR EXPRESS";
			Show.economy = "2200";
			Show.local = "1000";
			Show.bussiness = "4000";
			new Ticket();
		}
		
		
		
		
		
	});
	
	

	}






public static void main(String[] args) {
	// TODO Auto-generated method stub
launch(args);
}


}

