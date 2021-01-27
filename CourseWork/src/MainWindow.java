import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainWindow {
    public static void FirstWindow() {
        Stage primary = new Stage();
        primary.setMaxWidth(500);
        primary.setMaxHeight(400);
        primary.setTitle("First Window");  // Primary Window

        //--------------------- Main Window Buttons ------------------------------------------//
        Button btnFinancial = new Button("Financial Calculator");
        btnFinancial.setLayoutX(150);
        btnFinancial.setLayoutY(100);
        btnFinancial.setPrefSize(200,20);
        btnFinancial.setTextFill(Color.WHITE);
        btnFinancial.setStyle("-fx-font-weight: bold;-fx-font-size:15;-fx-background-color: #2ABB9B;");

        Button btnMortgage = new Button("Mortgage Calculator");
        btnMortgage.setLayoutX(150);
        btnMortgage.setLayoutY(150);
        btnMortgage.setPrefSize(200,20);
        btnMortgage.setTextFill(Color.WHITE);
        btnMortgage.setStyle("-fx-background-color: #2ABB9B;-fx-font-size:15;-fx-font-weight: bold;");


        Button btnLoan = new Button("Auto Loan Calculator");
        btnLoan.setLayoutX(150);
        btnLoan.setLayoutY(200);
        btnLoan.setPrefSize(200,20);
        btnLoan.setTextFill(Color.WHITE);
        btnLoan.setStyle("-fx-background-color: #2ABB9B;-fx-font-size:15; -fx-font-weight: bold;");


        btnFinancial.setOnAction(event ->{primary.close();Finance.FinanceCal();});
        btnMortgage.setOnAction(event -> {primary.close();Mortgage.MortgageCal();});
        btnLoan.setOnAction(event -> {primary.close();AutoLoan.AutoLoanCal();});


        AnchorPane ancMain = new AnchorPane(btnFinancial,btnMortgage,btnLoan);
        ancMain.setPrefSize(500,400);
        ancMain.setStyle("-fx-background-color:#6C7A89;");
        Scene sc = new Scene(ancMain);
        primary.setScene(sc);
        primary.show();  // Show the Primary Stage
    }
}
