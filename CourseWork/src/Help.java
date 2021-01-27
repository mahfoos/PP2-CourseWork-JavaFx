import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Help {
    public static void HelpBtn(){
        Stage stgHelp = new Stage();

        stgHelp.initModality(Modality.APPLICATION_MODAL); //Cant Accessible Previous Window
        stgHelp.setTitle("Financial Calculator Instructions");
        stgHelp.setWidth(900);
        stgHelp.setHeight(400);

        Label lblPoint1 = new Label();
        lblPoint1.setText("This finance calculator can be used to calculate any number of the following parameters: \n"+
                "future value (FV), number of compounding periods (N), interest rate (I/Y),\n" +
                " annuity payment (PMT), and start principal if the other parameters are known. Each of the following tabs \n" +
                "represents the parameters to be calculated");
        lblPoint1.setStyle("-fx-font-size:20; -fx-font-weight:bold;");
        lblPoint1.setLayoutX(10);
        lblPoint1.setLayoutY(20);

        Label lblPoint2 = new Label();
        lblPoint2.setText("");



        Button btnClose = new Button("CLOSE");
        btnClose.setPrefSize(200,30);
        btnClose.setLayoutX(600);
        btnClose.setLayoutY(300);
        btnClose.setStyle("-fx-font-size:15; -fx-font-weight: bold;-fx-background-color: #2ABB9B;");
        btnClose.setOnAction(event -> stgHelp.close());

        AnchorPane layout = new AnchorPane();
        layout.setStyle("-fx-background-color:#6C7A89");
        layout.getChildren().addAll(btnClose,lblPoint1);

        Scene sceneHelp = new Scene(layout);
        stgHelp.setScene(sceneHelp);
        stgHelp.show();
    }
}
