package kailanguage.netlook.main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import kailanguage.netlook.util.Netstat;

public class MainPane extends Application {
	final int length = 100;
	Button bt1 = new Button("��λ�������ļ�");
	Button bt2 = new Button("ɱ������ɵ�����");
	Button bt3 = new Button("ˢ��һ��");
	Button bt4 = new Button("ץ������");
	Button bt5 = new Button("�����޸�");
	Label[] label = new Label[length];
	VBox vb = new VBox();
	Netstat netinfo=new Netstat();

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage.setTitle("NetLookͨ�ż��");
		stage.setScene(getScene());
		stage.show();
		startEvent();
	}
	public static void show(String[] args) {
		launch(args);
	}
	public void startEvent() {
		//�¼�����
	}
	private ScrollPane getScrollPane() {
		ScrollPane sp = new ScrollPane();
		for(int i=0;i<netinfo.getSize()&&i<length;i++) {
			label[i]=new Label(netinfo.getList().get(i).toString());
			label[i].setFont(new Font("Arial",15));
			label[i].setTextFill(Color.DARKCYAN);
			vb.getChildren().add(label[i]);
		}
		vb.setStyle("-fx-background-color:#0A1B2A");
		sp.setContent(vb);
		sp.setFitToHeight(false);
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		return sp;
	}

	private HBox getHBox() {
		HBox hb = new HBox();
		hb.setPadding(new Insets(15,12,15,12));
		hb.setSpacing(10);
		hb.getChildren().addAll(bt1,bt2,bt4,bt5,bt3);
		hb.setStyle("-fx-background-color: #336699");
		return hb;
	}
	private HBox getBottom() {
		HBox hb = new HBox();
		hb.setPadding(new Insets(5,2,5,2));
		hb.setSpacing(35);
		hb.getChildren().addAll(new Label("ͨ��Э��"),new Label("����ͨ��IP:�˿�"),new Label("ͨ��Ŀ��IP:�˿�"),new Label("	ͨ��״̬"),new Label("	����PID"),new Label("Ŀ��IP������"));
		hb.setStyle("-fx-background-color: #336690");
		return hb;
	}

	private Scene getScene() {
		BorderPane bp = new BorderPane();
		bp.setCenter(getScrollPane());
		bp.setTop(getHBox());
		bp.setBottom(getBottom());
		Scene scene = new Scene(bp,650,600);
		return scene;
	}
}
