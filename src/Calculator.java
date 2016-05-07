import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class calculator extends Application{
	TextField t = new TextField();
	double []text=new double[5];
	String []sym= new String[5];
	static int ii=0;
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		VBox panee = new VBox();
		HBox r1 =new HBox();
		t.setPrefWidth(240);
		t.setPrefHeight(50);
		HBox r2 =new HBox();
		
		Button n1 = new Button("1");
	//	n1.setStyle("-fx-border-color:green");
		n1.setPrefWidth(40);
		n1.setPrefHeight(30);
		Button n2 = new Button("2");
		n2.setPrefWidth(40);
		n2.setPrefHeight(30);
		Button n3 = new Button("3");
		n3.setPrefWidth(40);
		n3.setPrefHeight(30);
		Button s1 = new Button("%");
		s1.setPrefWidth(40);
		s1.setPrefHeight(30);
		Button s2 = new Button("enter");
		s2.setPrefWidth(40);
		s2.setPrefHeight(30);
		Button s3 = new Button("^");
		s3.setPrefWidth(40);
		s3.setPrefHeight(30);
		HBox r3 =new HBox();
		Button n4 = new Button("4");
		n4.setPrefWidth(40);
		n4.setPrefHeight(30);
		Button n5 = new Button("5");
		n5.setPrefWidth(40);
		n5.setPrefHeight(30);
		Button n6 = new Button("6");
		n6.setPrefWidth(40);
		n6.setPrefHeight(30);
		Button s4 = new Button("*");
		s4.setPrefWidth(40);
		s4.setPrefHeight(30);
		Button s5 = new Button("(");
		s5.setPrefWidth(40);
		s5.setPrefHeight(30);
		Button s6 = new Button(")");
		s6.setPrefWidth(40);
		s6.setPrefHeight(30);
		HBox r4 =new HBox();
		Button n7 = new Button("7");
		n7.setPrefWidth(40);
		n7.setPrefHeight(30);
		Button n8 = new Button("8");
		n8.setPrefWidth(40);
		n8.setPrefHeight(30);
		Button n9 = new Button("9");
		n9.setPrefWidth(40);
		n9.setPrefHeight(30);
		Button s7 = new Button("-");
		s7.setPrefWidth(40);
		s7.setPrefHeight(30);
		Button s8 = new Button("x2");
		s8.setPrefWidth(40);
		s8.setPrefHeight(30);
		Button s9 = new Button(":");
		s9.setPrefWidth(40);
		s9.setPrefHeight(30);
		HBox r5 =new HBox();
		Button n0 = new Button("0");
		n0.setPrefWidth(40);
		n0.setPrefHeight(30);
		Button n11 = new Button(".");
		n11.setPrefWidth(40);
		n11.setPrefHeight(30);
		Button n12 = new Button("%");
		n12.setPrefWidth(40);
		n12.setPrefHeight(30);
		Button s0 = new Button("+");
		s0.setPrefWidth(40);
		s0.setPrefHeight(30);
		Button s11 = new Button("=");
		s11.setPrefWidth(80);
		s11.setPrefHeight(30);
		r1.getChildren().add(t);
		r2.getChildren().addAll(n1,n2,n3,s1,s2,s3);
		r3.getChildren().addAll(n4,n5,n6,s4,s5,s6);
		r4.getChildren().addAll(n7,n8,n9,s7,s8,s9);
		r5.getChildren().addAll(n0,n11,n12,s0,s11);
		r1.setAlignment(Pos.CENTER);
		r2.setAlignment(Pos.CENTER);
		r3.setAlignment(Pos.CENTER);
		r4.setAlignment(Pos.CENTER);
		r5.setAlignment(Pos.CENTER);
	    n1.setOnAction(e -> setnum(n1.getText()));
	    n2.setOnAction(e -> setnum(n2.getText()));
	    n3.setOnAction(e -> setnum(n3.getText()));
	    n4.setOnAction(e -> setnum(n4.getText()));
	    n5.setOnAction(e -> setnum(n5.getText()));
	    n6.setOnAction(e -> setnum(n6.getText()));
	    n7.setOnAction(e -> setnum(n7.getText()));
	    n8.setOnAction(e -> setnum(n8.getText()));
	    n9.setOnAction(e -> setnum(n9.getText()));
	    n0.setOnAction(e -> setnum(n0.getText()));
	    s4.setOnAction(e -> setsym(s4.getText()));
	    s7.setOnAction(e -> setsym(s7.getText()));
	    s0.setOnAction(e -> setsym(s0.getText()));
	    s11.setOnAction(e -> result());
		panee.getChildren().addAll(r1,r2,r3,r4,r5);
		  Scene scene = new Scene(panee, 240, 170);
		    primaryStage.setTitle("QUIZ"); // Set the stage title
		    primaryStage.setScene(scene); // Place the scene in the stage
		    primaryStage.show(); // Display the stage
		    primaryStage.setResizable(false);
		  }
		  public void setsym (String s)
		  {
			  text[ii]=Double.parseDouble(t.getText());
			  t.clear();
			  sym[ii]=s;
			  ii++;
		  }
		  public void setnum (String a)
		  {
			 String s=t.getText()+a;
			 t.setText(s);
		  }
		  public void result ()
		  {
		  double sum=0.0;
		  for (int i=0;i<text.length;i++){
			  switch (sym[i]){
					  case "+":
						  sum+=text[i];
						  break;
					  case "-":
						  sum-=text[i];
						  break;
					  case "*":
						  sum*=text[i];
						  break;
					  case "/":
						  sum/=text[i];
						  break;
					default : 
						sum=0.0;
						break;
			  }}
			  
			  t.setText(String.format("%6.2f",sum));
		  }
		  /**
		   * The main method is only needed for the IDE with limited
		   * JavaFX support. Not needed for running from the command line.
		   */
		  public static void main(String[] args) {
		    launch(args);
		  }
	   
            
            
}


