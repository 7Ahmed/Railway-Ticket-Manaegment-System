import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Show {
	
	Stage stage=new Stage();
	Scene scene;
	
	static String trainame, name,phone,cnic,From,to,timings="",date,type;
	static String local,bussiness,economy,price;
	public Show(){
		stage.setTitle("Pakistan Railway Ticket");
		stage.setWidth(550);
		stage.setHeight(550);
		stage.setResizable(false);
		addComponents();
		stage.setScene(scene);
		stage.show();
	}
	private void addComponents() {
		// TODO Auto-generated method stub
		Text user = new Text("Pakistan Railway Ticket");
		Text txttrain = new Text("Train Name: ");
		Text trainname = new Text(Show.trainame);
		Text txtprice = new Text("Price : ");
		Label price= new Label(Show.price);
		Text name = new Text("Name: ");
		Text tname = new Text(Show.name); 
		Text phone = new Text("Phone: ");
		Text tpass = new Text(Show.phone);
		Text cnic =  new Text("CNIC: ");
		Text tcnic = new Text(Show.cnic);
		Text D = new Text("Date: ");
		Text tdate = new Text(Show.date);
		//Text bclass = new Text();
		//Text local = new Text();
		Text txttype = new Text(Show.type);
		Text from =new Text(Show.From);
		Text to=new Text("to");
		Text txtto=new Text(Show.to);
		Text timings = new Text("Timings: ");
		Text ttime = new Text(Show.timings);
	
		
		Button add = new Button("ADD");
		
		Font f;
		f= Font.font("Calibri",FontWeight.BOLD, 16);
		GridPane gd = new GridPane();
		gd.add(user,0,1);
		user.setFont(Font.font("Arial", 20));
		GridPane.setMargin(user,new Insets(0,0,0,150));
		
		gd.add(name,0,2);
		name.setFont(f);
		gd.add(tname,0,2);
		tname.setFont(f);
		GridPane.setMargin(tname,new Insets(0,0,0,50));
		
		gd.add(phone,0,3);
		phone.setFont(f);
		gd.add(tpass,0,3);
		tpass.setFont(f);
		GridPane.setMargin(tpass,new Insets(0,0,0,50));
		
		gd.add(D,0,4);
		D.setFont(f);
		gd.add(tdate,0,4);
		tdate.setFont(f);
		GridPane.setMargin(tdate,new Insets(0,0,0,50));
		
		gd.add(cnic,0,5);
		cnic.setFont(f);
		gd.add(tcnic,0,5);
		tcnic.setFont(f);
		GridPane.setMargin(tcnic,new Insets(0,0,0,50));
		
		
		gd.add(txttype,0,6);
		txttype.setFont(f);
		/*gd.add(teducation,0,8);
		teducation.setFont(f);
		GridPane.setMargin(teducation ,new Insets(0,0,0,70));*/
		
		gd.add(from,0,7);
		from.setFont(f);
		gd.add(to,0,7);
		to.setFont(f);
		GridPane.setMargin(to ,new Insets(0,0,0,50));
		gd.add(txtto,0,7);
		txtto.setFont(f);
		GridPane.setMargin(txtto ,new Insets(0,0,0,90));
		
		
		
		
		gd.add(timings,0,8);
		timings.setFont(f);
		gd.add(ttime,0,8);
		ttime.setFont(f);
		GridPane.setMargin(ttime ,new Insets(0,0,0,50));
		
		gd.add(txttrain, 0, 9);
		txttrain.setFont(f);
		trainname.setFont(f);
		gd.add(trainname, 0, 9);
		GridPane.setMargin(trainname ,new Insets(0,0,0,80));
		
		gd.add(txtprice, 0, 10);
		gd.add(price, 0, 10);
		GridPane.setMargin(price ,new Insets(0,0,0,80));
		
		gd.add(add,0,11);
		GridPane.setMargin(add,new Insets(30,0,0,0));
		
		gd.setHgap(10);
		gd.setVgap(10);
		scene = new Scene(gd);
		
		add.setOnAction(x->{
			
			stage.hide();
			new Main();
		});
		
		
	}
	public static void checkRoute(int i) {
		
		
		if(i==1)
		{
			Alert msg = new Alert(AlertType.WARNING);
			msg.setHeaderText("Wrong Destination");
			msg.setContentText("Please select correct Destination");
			msg.show();
		}
		else
		{
			Alert msg =new Alert(AlertType.INFORMATION);
			msg.setHeaderText(null);
			msg.setContentText("Your Ticket Is Cofirm");
			msg.show();
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	

