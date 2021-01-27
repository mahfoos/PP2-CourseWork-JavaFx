import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Finance {
    public static void FinanceCal(){

        Stage FinanceWindow = new Stage();
        FinanceWindow.setMaxWidth(900);
        FinanceWindow.setMaxHeight(450);
        FinanceWindow.setTitle("Financial Calculator");


        //------------------ Back Button ------------------------//
        Button btnBack = new Button("Back");
        btnBack.setLayoutX(646);
        btnBack.setLayoutY(300);
        btnBack.setPrefSize(100,30);
        btnBack.setStyle("-fx-font-size:15; -fx-font-weight: bold;-fx-background-color: #2ABB9B;");

        //----------------- Help Button ----------------------//
        Button btnHelp = new Button("Help");
        btnHelp.setLayoutX(750);
        btnHelp.setLayoutY(300);
        btnHelp.setPrefSize(100,30);
        btnHelp.setStyle("-fx-font-size:15; -fx-font-weight: bold;-fx-background-color: #2ABB9B;");

        //---------------- Close Button ---------------------//
        Button btnClose = new Button("Close");
        btnClose.setLayoutX(700);
        btnClose.setLayoutY(340);
        btnClose.setPrefSize(100,30);
        btnClose.setStyle("-fx-font-size:15; -fx-font-weight: bold; -fx-background-color: #2ABB9B;");

        btnBack.setOnAction(event -> {FinanceWindow.close();
            MainWindow.FirstWindow();});
        btnClose.setOnAction(event -> {FinanceWindow.close();});
        btnHelp.setOnAction(event -> {Help.HelpBtn();});

        //--------------------------- Finance Calculator ----------------------------------------------//
        TabPane tabPaneFinance = new TabPane();
        tabPaneFinance.setStyle("-fx-background-color:#6C7A89;");
        tabPaneFinance.setPrefSize(600, 600);
        tabPaneFinance.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE); // Removing close button in tabs

        //--------------------------- Future Value Tab ------------------------------------------------//
        Tab tabFv = new Tab("FV");
        tabFv.setStyle("-fx-font-size:15; -fx-font-weight: bold;");

        //--------------------------- Label For Future Value Tab ------------------------------------//
        Label lblN = new Label("N (# of Periods)");
        lblN.setLayoutX(53);
        lblN.setLayoutY(50);
        lblN.setFont(new Font("Calibri", 15));
        lblN.setStyle(" -fx-font-weight: bold;");

        Label lblSp = new Label("Start Principal");
        lblSp.setLayoutX(62);
        lblSp.setLayoutY(90);
        lblSp.setFont(new Font("Calibri", 15));
        lblSp.setStyle(" -fx-font-weight: bold;");

        Label lblIy = new Label("I/Y (interest)");
        lblIy.setLayoutX(72);
        lblIy.setLayoutY(130);
        lblIy.setFont(new Font("Calibri", 15));
        lblIy.setStyle(" -fx-font-weight: bold;");

        Label lblPmt = new Label("PMT (Annuity Payment)");
        lblPmt.setLayoutX(10);
        lblPmt.setLayoutY(170);
        lblPmt.setFont(new Font("Calibri", 15));
        lblPmt.setStyle(" -fx-font-weight: bold;");

        //------------------------------------- Output Label For Future Value Tab ------------------------//
        Label lblResult = new Label("Results");
        lblResult.setLayoutX(300);
        lblResult.setLayoutY(50);
        lblResult.setFont(new Font("Arial", 18)); // set the font
        lblResult.setTextFill(Color.WHITE); // Set the color for label
        lblResult.setStyle("-fx-background-color:Green; -fx-padding:3px;");
        lblResult.setPrefSize(290, 20);

        Label lblFv = new Label("FV (Future Value)");
        lblFv.setLayoutX(300);
        lblFv.setLayoutY(80);
        lblFv.setFont(new Font("Calibri", 15));
        lblFv.setStyle("-fx-background-color:#e1ebe4;");
        lblFv.setPrefSize(180, 20);

        Label lblPv = new Label("PV (Present Value)");
        lblPv.setLayoutX(300);
        lblPv.setLayoutY(105);
        lblPv.setFont(new Font("Calibri", 15));
        lblPv.setStyle("-fx-background-color:#e1ebe4;");
        lblPv.setPrefSize(180, 20);

        Label lblNOut = new Label("N (Number of Periods)");
        lblNOut.setLayoutX(300);
        lblNOut.setLayoutY(130);
        lblNOut.setFont(new Font("Calibri", 15));
        lblNOut.setStyle("-fx-background-color:#e1ebe4;");
        lblNOut.setPrefSize(180, 20);

        Label lblIyOut = new Label("I/Y (Interest Rate)");
        lblIyOut.setLayoutX(300);
        lblIyOut.setLayoutY(155);
        lblIyOut.setFont(new Font("Calibri", 15));
        lblIyOut.setStyle("-fx-background-color:#e1ebe4;");
        lblIyOut.setPrefSize(180, 20);

        Label lblPer = new Label("PMT (Periodic Payment)");
        lblPer.setLayoutX(300);
        lblPer.setLayoutY(180);
        lblPer.setFont(new Font("Calibri", 15));
        lblPer.setStyle("-fx-background-color:#e1ebe4;");
        lblPer.setPrefSize(180, 20);


        Label lblSi = new Label("Starting Investment");
        lblSi.setLayoutX(300);
        lblSi.setLayoutY(205);
        lblSi.setFont(new Font("Calibri", 15));
        lblSi.setStyle("-fx-background-color:#e1ebe4;");
        lblSi.setPrefSize(180, 20);

        Label lblTp = new Label("Total Principal");
        lblTp.setLayoutX(300);
        lblTp.setLayoutY(230);
        lblTp.setFont(new Font("Calibri", 15));
        lblTp.setStyle("-fx-background-color:#e1ebe4;");
        lblTp.setPrefSize(180, 20);

        Label lblTi = new Label("Total Interest");
        lblTi.setLayoutX(300);
        lblTi.setLayoutY(255);
        lblTi.setFont(new Font("Calibri", 15));
        lblTi.setStyle("-fx-background-color:#e1ebe4;");
        lblTi.setPrefSize(180, 20);

        //------------------------------ Empty Label For Output Display --------------------------------//
        Label lblFvOut = new Label();
        lblFvOut.setLayoutX(482);
        lblFvOut.setLayoutY(80);
        lblFvOut.setFont(new Font("Calibri", 15));
        lblFvOut.setStyle("-fx-background-color:#e1ebe4;");
        lblFvOut.setPrefSize(108, 20);
        lblFvOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblPvOut = new Label();
        lblPvOut.setLayoutX(482);
        lblPvOut.setLayoutY(105);
        lblPvOut.setFont(new Font("Calibri", 15));
        lblPvOut.setStyle("-fx-background-color:#e1ebe4;");
        lblPvOut.setPrefSize(108, 20);
        lblPvOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblNOutput = new Label();
        lblNOutput.setLayoutX(482);
        lblNOutput.setLayoutY(130);
        lblNOutput.setFont(new Font("Calibri", 15));
        lblNOutput.setStyle("-fx-background-color:#e1ebe4;");
        lblNOutput.setPrefSize(108, 20);
        lblNOutput.setAlignment(Pos.CENTER_RIGHT);

        Label lblIyOutput = new Label();
        lblIyOutput.setLayoutX(482);
        lblIyOutput.setLayoutY(155);
        lblIyOutput.setFont(new Font("Calibri", 15));
        lblIyOutput.setStyle("-fx-background-color:#e1ebe4;");
        lblIyOutput.setPrefSize(108, 20);
        lblIyOutput.setAlignment(Pos.CENTER_RIGHT);

        Label lblPerOut = new Label();
        lblPerOut.setLayoutX(482);
        lblPerOut.setLayoutY(180);
        lblPerOut.setFont(new Font("Calibri", 15));
        lblPerOut.setStyle("-fx-background-color:#e1ebe4;");
        lblPerOut.setPrefSize(108, 20);
        lblPerOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblSiOut = new Label();
        lblSiOut.setLayoutX(482);
        lblSiOut.setLayoutY(205);
        lblSiOut.setFont(new Font("Calibri", 15));
        lblSiOut.setStyle("-fx-background-color:#e1ebe4;");
        lblSiOut.setPrefSize(108, 20);
        lblSiOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblTpOut = new Label();
        lblTpOut.setLayoutX(482);
        lblTpOut.setLayoutY(230);
        lblTpOut.setFont(new Font("Calibri", 15));
        lblTpOut.setStyle("-fx-background-color:#e1ebe4;");
        lblTpOut.setPrefSize(108, 20);
        lblTpOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblTiOut = new Label();
        lblTiOut.setLayoutX(482);
        lblTiOut.setLayoutY(255);
        lblTiOut.setFont(new Font("Calibri", 15));
        lblTiOut.setStyle("-fx-background-color:#e1ebe4;");
        lblTiOut.setPrefSize(108, 20);
        lblTiOut.setAlignment(Pos.CENTER_RIGHT);

        //----------------------------------- TextField For Future Value Tab -------------------------//
        TextField txtN = new TextField();
        txtN.setLayoutX(160);
        txtN.setLayoutY(50);
        txtN.setPrefWidth(100);

        TextField txtSp = new TextField();
        txtSp.setLayoutX(160);
        txtSp.setLayoutY(90);
        txtSp.setPrefWidth(100);

        TextField txtIy = new TextField();
        txtIy.setLayoutX(160);
        txtIy.setLayoutY(130);
        txtIy.setPrefWidth(100);

        TextField txtPmt = new TextField();
        txtPmt.setLayoutX(160);
        txtPmt.setLayoutY(170);
        txtPmt.setPrefWidth(100);

        //--------------------- Calculate Button of Future Value Tab -------------------------//
        Button btnCalFv = new Button("Calculate");
        btnCalFv.setLayoutX(110);
        btnCalFv.setLayoutY(250);
        btnCalFv.setPrefSize(120,30);
        btnCalFv.setStyle("-fx-font-size:15;-fx-font-color:white; -fx-background-color: #2ABB9B; -fx-font-weight: bold;");

        Alert alertFv = new Alert(Alert.AlertType.CONFIRMATION);
        btnCalFv.setOnAction(event -> {
            try {
                //-------------------Getting Value From TextField -------------------------------//
                double noPeriods = Double.parseDouble(txtN.getText());
                double startPrinc = Double.parseDouble(txtSp.getText());
                double interest = Double.parseDouble(txtIy.getText());
                double pmt = Double.parseDouble(txtPmt.getText());

                //----------------- Formula for Future Value Tab -----------------------------//
                double futureValue = ((pmt) * (Math.pow(1 + (interest / 100), noPeriods) - 1)) / (interest / 100) + startPrinc * (Math.pow(1 + interest / 100, noPeriods));
                double presentValue = futureValue * Math.pow((1 + (interest / 100)), -noPeriods);
                double totalPrincipal = startPrinc + (pmt * noPeriods);
                double totalInterest = futureValue - totalPrincipal;

                //---------------- Setting the Output into Empty Label ---------------------//
                lblFvOut.setText(String.format("$" + "%.2f", futureValue));
                lblPvOut.setText(String.format("$" + "%.2f", presentValue));
                lblNOutput.setText(String.format("%.3f", noPeriods));
                lblIyOutput.setText(String.format("%.3f", interest));
                lblPerOut.setText(String.format("$" + "%.2f", pmt));
                lblSiOut.setText(String.format("$" + "%.2f", startPrinc));
                lblTpOut.setText(String.format("$" + "%.2f", totalPrincipal));
                lblTiOut.setText(String.format("$" + "%.2f", totalInterest));
            }catch (Exception exception){
                alertFv.setAlertType(Alert.AlertType.CONFIRMATION);
                alertFv.setHeaderText("Please Enter Valid Integer Value");
                alertFv.show();
            }

        });

        AnchorPane ancFutureValue = new AnchorPane(); // Creating Anchor Pane
        //------------ Add the elements into AnchorPane
        ancFutureValue.getChildren().addAll(lblN, lblIy, lblSp, lblPmt, txtN, txtSp, txtIy, txtPmt, btnCalFv,
                lblTiOut, lblTi, lblTpOut, lblTp, lblSiOut, lblSi, lblPerOut, lblPer, lblIyOutput,
                lblIyOut, lblNOutput, lblNOut, lblPvOut, lblPv, lblFvOut, lblFv, lblResult);

        tabFv.setContent(ancFutureValue); // Add the Anchor Pane into Future value Tab

        //------------------------- PMT Tab ---------------------------------------------------//
        Tab tabPmt = new Tab("PMT");
        tabPmt.setStyle("-fx-font-size:15; -fx-font-weight: bold;");

        //------------------------ Label For PMT Tab -----------------------------------------//
        Label fv = new Label("FV (Future Value)");
        fv.setLayoutX(53);
        fv.setLayoutY(50);
        fv.setFont(new Font("Calibri", 15));
        fv.setStyle(" -fx-font-weight: bold;");

        Label lblN2 = new Label("N (# of Periods)");
        lblN2.setLayoutX(62);
        lblN2.setLayoutY(90);
        lblN2.setFont(new Font("Calibri", 15));
        lblN2.setStyle(" -fx-font-weight: bold;");

        Label lblSp2 = new Label("Start Principal");
        lblSp2.setLayoutX(63);
        lblSp2.setLayoutY(130);
        lblSp2.setFont(new Font("Calibri", 15));
        lblSp2.setStyle(" -fx-font-weight: bold;");

        Label lblIy2 = new Label("I/Y (interest)");
        lblIy2.setLayoutX(72);
        lblIy2.setLayoutY(170);
        lblIy2.setFont(new Font("Calibri", 15));
        lblIy2.setStyle(" -fx-font-weight: bold;");

        //------------------------------- Output Label For PMT Tab ----------------------------//
        Label lblResult2 = new Label("Results");
        lblResult2.setLayoutX(300);
        lblResult2.setLayoutY(50);
        lblResult2.setFont(new Font("Arial", 18)); // set the font
        lblResult2.setTextFill(Color.WHITE); // Set the color for label
        lblResult2.setStyle("-fx-background-color:Green; -fx-padding:3px;");
        lblResult2.setPrefSize(290, 20);

        Label lblFv2 = new Label("FV (Future Value)");
        lblFv2.setLayoutX(300);
        lblFv2.setLayoutY(80);
        lblFv2.setFont(new Font("Calibri", 15));
        lblFv2.setStyle("-fx-background-color:#e1ebe4;");
        lblFv2.setPrefSize(180, 20);

        Label lblPv2 = new Label("PV (Present Value)");
        lblPv2.setLayoutX(300);
        lblPv2.setLayoutY(105);
        lblPv2.setFont(new Font("Calibri", 15));
        lblPv2.setStyle("-fx-background-color:#e1ebe4;");
        lblPv2.setPrefSize(180, 20);

        Label lblNOut2 = new Label("N (Number of Periods)");
        lblNOut2.setLayoutX(300);
        lblNOut2.setLayoutY(130);
        lblNOut2.setFont(new Font("Calibri", 15));
        lblNOut2.setStyle("-fx-background-color:#e1ebe4;");
        lblNOut2.setPrefSize(180, 20);

        Label lblIyOut2 = new Label("I/Y (Interest Rate)");
        lblIyOut2.setLayoutX(300);
        lblIyOut2.setLayoutY(155);
        lblIyOut2.setFont(new Font("Calibri", 15));
        lblIyOut2.setStyle("-fx-background-color:#e1ebe4;");
        lblIyOut2.setPrefSize(180, 20);

        Label lblPer2 = new Label("PMT (Periodic Payment)");
        lblPer2.setLayoutX(300);
        lblPer2.setLayoutY(180);
        lblPer2.setFont(new Font("Calibri", 15));
        lblPer2.setStyle("-fx-background-color:#e1ebe4;");
        lblPer2.setPrefSize(180, 20);


        Label lblSi2 = new Label("Starting Investment");
        lblSi2.setLayoutX(300);
        lblSi2.setLayoutY(205);
        lblSi2.setFont(new Font("Calibri", 15));
        lblSi2.setStyle("-fx-background-color:#e1ebe4;");
        lblSi2.setPrefSize(180, 20);

        Label lblTp2 = new Label("Total Principal");
        lblTp2.setLayoutX(300);
        lblTp2.setLayoutY(230);
        lblTp2.setFont(new Font("Calibri", 15));
        lblTp2.setStyle("-fx-background-color:#e1ebe4;");
        lblTp2.setPrefSize(180, 20);

        Label lblTi2 = new Label("Total Interest");
        lblTi2.setLayoutX(300);
        lblTi2.setLayoutY(255);
        lblTi2.setFont(new Font("Calibri", 15));
        lblTi2.setStyle("-fx-background-color:#e1ebe4;");
        lblTi2.setPrefSize(180, 20);

        //----------------- Empty Label For Set the Output ------------------------------------//
        Label lblFvOut2 = new Label();
        lblFvOut2.setLayoutX(482);
        lblFvOut2.setLayoutY(80);
        lblFvOut2.setFont(new Font("Calibri", 15));
        lblFvOut2.setStyle("-fx-background-color:#e1ebe4;");
        lblFvOut2.setPrefSize(108, 20);
        lblFvOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblPvOut2 = new Label();
        lblPvOut2.setLayoutX(482);
        lblPvOut2.setLayoutY(105);
        lblPvOut2.setFont(new Font("Calibri", 15));
        lblPvOut2.setStyle("-fx-background-color:#e1ebe4;");
        lblPvOut2.setPrefSize(108, 20);
        lblPvOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblNOutput2 = new Label();
        lblNOutput2.setLayoutX(482);
        lblNOutput2.setLayoutY(130);
        lblNOutput2.setFont(new Font("Calibri", 15));
        lblNOutput2.setStyle("-fx-background-color:#e1ebe4;");
        lblNOutput2.setPrefSize(108, 20);
        lblNOutput2.setAlignment(Pos.CENTER_RIGHT);

        Label lblIyOutput2 = new Label();
        lblIyOutput2.setLayoutX(482);
        lblIyOutput2.setLayoutY(155);
        lblIyOutput2.setFont(new Font("Calibri", 15));
        lblIyOutput2.setStyle("-fx-background-color:#e1ebe4;");
        lblIyOutput2.setPrefSize(108, 20);
        lblIyOutput2.setAlignment(Pos.CENTER_RIGHT);

        Label lblPerOut2 = new Label();
        lblPerOut2.setLayoutX(482);
        lblPerOut2.setLayoutY(180);
        lblPerOut2.setFont(new Font("Calibri", 15));
        lblPerOut2.setStyle("-fx-background-color:#e1ebe4;");
        lblPerOut2.setPrefSize(108, 20);
        lblPerOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblSiOut2 = new Label();
        lblSiOut2.setLayoutX(482);
        lblSiOut2.setLayoutY(205);
        lblSiOut2.setFont(new Font("Calibri", 15));
        lblSiOut2.setStyle("-fx-background-color:#e1ebe4;");
        lblSiOut2.setPrefSize(108, 20);
        lblSiOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblTpOut2 = new Label();
        lblTpOut2.setLayoutX(482);
        lblTpOut2.setLayoutY(230);
        lblTpOut2.setFont(new Font("Calibri", 15));
        lblTpOut2.setStyle("-fx-background-color:#e1ebe4;");
        lblTpOut2.setPrefSize(108, 20);
        lblTpOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblTiOut2 = new Label(" ");
        lblTiOut2.setLayoutX(482);
        lblTiOut2.setLayoutY(255);
        lblTiOut2.setFont(new Font("Calibri", 15));
        lblTiOut2.setStyle("-fx-background-color:#e1ebe4;");
        lblTiOut2.setPrefSize(108, 20);
        lblTiOut2.setAlignment(Pos.CENTER_RIGHT);

        //------------------------------- TextFields For PMT Tab --------------------------------------//
        TextField txtFv = new TextField();
        txtFv.setLayoutX(160);
        txtFv.setLayoutY(50);
        txtFv.setPrefWidth(100);


        TextField txtN2 = new TextField();
        txtN2.setLayoutX(160);
        txtN2.setLayoutY(90);
        txtN2.setPrefWidth(100);

        TextField txtSp2 = new TextField();
        txtSp2.setLayoutX(160);
        txtSp2.setLayoutY(130);
        txtSp2.setPrefWidth(100);

        TextField txtIy2 = new TextField();
        txtIy2.setLayoutX(160);
        txtIy2.setLayoutY(170);
        txtIy2.setPrefWidth(100);

        //------------------------------------- Calculate Button For PMT Tab --------------------------//
        Button btnCalPmt = new Button("Calculate");
        btnCalPmt.setLayoutX(110);
        btnCalPmt.setLayoutY(250);
        btnCalPmt.setPrefSize(120,30);
        btnCalPmt.setStyle("-fx-font-size:15; -fx-background-color: #2ABB9B; -fx-font-weight: bold;");

        Alert alertPmt = new Alert(Alert.AlertType.CONFIRMATION); // Alert Box
        btnCalPmt.setOnAction(event -> {
            try {

                //---------------------- Getting Value From TextField -----------------------------------//
                double noPeriods = Double.parseDouble(txtN2.getText());
                double startPrinc = Double.parseDouble(txtSp2.getText());
                double interest = Double.parseDouble(txtIy2.getText());
                double futureValue = Double.parseDouble(txtFv.getText());

                //---------------------- Formulas & Calculation For PMT Tab ------------------------------------------//
                double presentValue = futureValue * Math.pow((1 + (interest / 100)), -noPeriods);
                double pmt = (futureValue - (startPrinc * (Math.pow(1 + interest / 100, noPeriods)))) / ((Math.pow(1 + interest / 100, noPeriods) - 1) / (interest / 100));
                double totalPrincipal = startPrinc + (pmt * noPeriods);
                double totalInterest = futureValue - totalPrincipal;

                //--------------------- Setting Output into Empty Label -------------------------------------------//
                lblFvOut2.setText(String.format("$" + "%.2f", futureValue));
                lblPvOut2.setText(String.format("$" + "%.2f", presentValue));
                lblNOutput2.setText(String.format("%.3f", noPeriods));
                lblIyOutput2.setText(String.format("%.3f", interest));
                lblPerOut2.setText(String.format("$" + "%.2f", pmt));
                lblSiOut2.setText(String.format("$" + "%.2f", startPrinc));
                lblTpOut2.setText(String.format("$" + "%.2f", totalPrincipal));
                lblTiOut2.setText(String.format("$" + "%.2f", totalInterest));
            }catch (Exception exception){
                alertPmt.setAlertType(Alert.AlertType.CONFIRMATION);
                alertPmt.setHeaderText("Please Enter Valid Integer Value");
                alertPmt.show();
            }

        });

        AnchorPane ancPmt = new AnchorPane();
        ancPmt.getChildren().addAll(fv, txtN2, lblSp2, lblIy2, txtFv, txtSp2, txtIy2, lblTiOut2, lblTi2, lblTpOut2, btnCalPmt,
                lblTp2,lblSi2, lblPerOut2, lblPer2, lblSiOut2, lblIyOutput2, lblIyOut2, lblNOutput2, lblNOut2, lblPvOut2, lblPv2,
                lblFvOut2, lblFv2, lblResult2, lblN2);
        tabPmt.setContent(ancPmt);


        //---------------------------------- N Tab -----------------------------------------------//
        Tab tabN = new Tab("N");
        tabN.setStyle("-fx-font-size:15; -fx-font-weight: bold;");

        //--------------------------------- Label For N Tab -------------------------------------//
        Label fv3 = new Label("FV (Future Value)");
        fv3.setLayoutX(45);
        fv3.setLayoutY(50);
        fv3.setFont(new Font("Calibri", 15));
        fv3.setStyle(" -fx-font-weight: bold;");

        Label lblSp4 = new Label("Start Principal");
        lblSp4.setLayoutX(62);
        lblSp4.setLayoutY(90);
        lblSp4.setFont(new Font("Calibri", 15));
        lblSp4.setStyle(" -fx-font-weight: bold;");

        Label lblIy4 = new Label("I/Y (Interest)");
        lblIy4.setLayoutX(72);
        lblIy4.setLayoutY(130);
        lblIy4.setFont(new Font("Calibri", 15));
        lblIy4.setStyle(" -fx-font-weight: bold;");

        Label lblPmt4 = new Label("PMT (Annuity Payment)");
        lblPmt4.setLayoutX(10);
        lblPmt4.setLayoutY(170);
        lblPmt4.setFont(new Font("Calibri", 15));
        lblPmt4.setStyle(" -fx-font-weight: bold;");

        //---------------------------------- Output Label For N Tab -----------------------------//
        Label lblResult4 = new Label("Results");
        lblResult4.setLayoutX(300);
        lblResult4.setLayoutY(50);
        lblResult4.setFont(new Font("Arial", 18)); // set the font
        lblResult4.setTextFill(Color.WHITE); // Set the color for label
        lblResult4.setStyle("-fx-background-color:Green; -fx-padding:3px;");
        lblResult4.setPrefSize(290, 20);

        Label lblFv4 = new Label("FV (Future Value)");
        lblFv4.setLayoutX(300);
        lblFv4.setLayoutY(80);
        lblFv4.setFont(new Font("Calibri", 15));
        lblFv4.setStyle("-fx-background-color:#e1ebe4;");
        lblFv4.setPrefSize(180, 20);

        Label lblPv4 = new Label("PV (Present Value)");
        lblPv4.setLayoutX(300);
        lblPv4.setLayoutY(105);
        lblPv4.setFont(new Font("Calibri", 15));
        lblPv4.setStyle("-fx-background-color:#e1ebe4;");
        lblPv4.setPrefSize(180, 20);

        Label lblNOut4 = new Label("N (Number of Periods)");
        lblNOut4.setLayoutX(300);
        lblNOut4.setLayoutY(130);
        lblNOut4.setFont(new Font("Calibri", 15));
        lblNOut4.setStyle("-fx-background-color:#e1ebe4;");
        lblNOut4.setPrefSize(180, 20);

        Label lblIyOut4 = new Label("I/Y (Interest Rate)");
        lblIyOut4.setLayoutX(300);
        lblIyOut4.setLayoutY(155);
        lblIyOut4.setFont(new Font("Calibri", 15));
        lblIyOut4.setStyle("-fx-background-color:#e1ebe4;");
        lblIyOut4.setPrefSize(180, 20);

        Label lblPer4 = new Label("PMT (Periodic Payment)");
        lblPer4.setLayoutX(300);
        lblPer4.setLayoutY(180);
        lblPer4.setFont(new Font("Calibri", 15));
        lblPer4.setStyle("-fx-background-color:#e1ebe4;");
        lblPer4.setPrefSize(180, 20);


        Label lblSi4 = new Label("Starting Investment");
        lblSi4.setLayoutX(300);
        lblSi4.setLayoutY(205);
        lblSi4.setFont(new Font("Calibri", 15));
        lblSi4.setStyle("-fx-background-color:#e1ebe4;");
        lblSi4.setPrefSize(180, 20);

        Label lblTp4 = new Label("Total Principal");
        lblTp4.setLayoutX(300);
        lblTp4.setLayoutY(230);
        lblTp4.setFont(new Font("Calibri", 15));
        lblTp4.setStyle("-fx-background-color:#e1ebe4;");
        lblTp4.setPrefSize(180, 20);

        Label lblTi4 = new Label("Total Interest");
        lblTi4.setLayoutX(300);
        lblTi4.setLayoutY(255);
        lblTi4.setFont(new Font("Calibri", 15));
        lblTi4.setStyle("-fx-background-color:#e1ebe4;");
        lblTi4.setPrefSize(180, 20);

        //--------------------- Empty Label For Set the Output N Tab -------------------------------//
        Label lblFvOut4 = new Label();
        lblFvOut4.setLayoutX(482);
        lblFvOut4.setLayoutY(80);
        lblFvOut4.setFont(new Font("Calibri", 15));
        lblFvOut4.setStyle("-fx-background-color:#e1ebe4;");
        lblFvOut4.setPrefSize(108, 20);
        lblFvOut4.setAlignment(Pos.CENTER_RIGHT);


        Label lblPvOut4 = new Label();
        lblPvOut4.setLayoutX(482);
        lblPvOut4.setLayoutY(105);
        lblPvOut4.setFont(new Font("Calibri", 15));
        lblPvOut4.setStyle("-fx-background-color:#e1ebe4;");
        lblPvOut4.setPrefSize(108, 20);
        lblPvOut4.setAlignment(Pos.CENTER_RIGHT);

        Label lblNOutput4 = new Label();
        lblNOutput4.setLayoutX(482);
        lblNOutput4.setLayoutY(130);
        lblNOutput4.setFont(new Font("Calibri", 15));
        lblNOutput4.setStyle("-fx-background-color:#e1ebe4;");
        lblNOutput4.setPrefSize(108, 20);
        lblNOutput4.setAlignment(Pos.CENTER_RIGHT);

        Label lblIyOutput4 = new Label();
        lblIyOutput4.setLayoutX(482);
        lblIyOutput4.setLayoutY(155);
        lblIyOutput4.setFont(new Font("Calibri", 15));
        lblIyOutput4.setStyle("-fx-background-color:#e1ebe4;");
        lblIyOutput4.setPrefSize(108, 20);
        lblIyOutput4.setAlignment(Pos.CENTER_RIGHT);

        Label lblPerOut4 = new Label();
        lblPerOut4.setLayoutX(482);
        lblPerOut4.setLayoutY(180);
        lblPerOut4.setFont(new Font("Calibri", 15));
        lblPerOut4.setStyle("-fx-background-color:#e1ebe4;");
        lblPerOut4.setPrefSize(108, 20);
        lblPerOut4.setAlignment(Pos.CENTER_RIGHT);

        Label lblSiOut4 = new Label();
        lblSiOut4.setLayoutX(482);
        lblSiOut4.setLayoutY(205);
        lblSiOut4.setFont(new Font("Calibri", 15));
        lblSiOut4.setStyle("-fx-background-color:#e1ebe4;");
        lblSiOut4.setPrefSize(108, 20);
        lblSiOut4.setAlignment(Pos.CENTER_RIGHT);

        Label lblTpOut4 = new Label();
        lblTpOut4.setLayoutX(482);
        lblTpOut4.setLayoutY(230);
        lblTpOut4.setFont(new Font("Calibri", 15));
        lblTpOut4.setStyle("-fx-background-color:#e1ebe4;");
        lblTpOut4.setPrefSize(108, 20);
        lblTpOut4.setAlignment(Pos.CENTER_RIGHT);

        Label lblTiOut4 = new Label();
        lblTiOut4.setLayoutX(482);
        lblTiOut4.setLayoutY(255);
        lblTiOut4.setFont(new Font("Calibri", 15));
        lblTiOut4.setStyle("-fx-background-color:#e1ebe4;");
        lblTiOut4.setPrefSize(108, 20);
        lblTiOut4.setAlignment(Pos.CENTER_RIGHT);


        //---------------------------------- TextField For N Tab -------------------------------//
        TextField txtFv3 = new TextField();
        txtFv3.setLayoutX(160);
        txtFv3.setLayoutY(50);
        txtFv3.setPrefWidth(100);

        TextField txtSp4 = new TextField();
        txtSp4.setLayoutX(160);
        txtSp4.setLayoutY(90);
        txtSp4.setPrefWidth(100);

        TextField txtIy4 = new TextField();
        txtIy4.setLayoutX(160);
        txtIy4.setLayoutY(130);
        txtIy4.setPrefWidth(100);

        TextField txtPmt4 = new TextField();
        txtPmt4.setLayoutX(160);
        txtPmt4.setLayoutY(170);
        txtPmt4.setPrefWidth(100);

        //--------------------------------- Calculate Button For N Tab -----------------------------------//
        Button btnCalN = new Button("Calculate");
        btnCalN.setLayoutX(110);
        btnCalN.setLayoutY(250);
        btnCalN.setPrefSize(120,30);
        btnCalN.setStyle("-fx-font-size:15; -fx-background-color: #2ABB9B; -fx-font-weight: bold;");

        Alert alertN = new Alert(Alert.AlertType.CONFIRMATION);
        btnCalN.setOnAction(event -> {
            try {

                double startPrinc = Double.parseDouble(txtSp4.getText());
                double interest = Double.parseDouble(txtIy4.getText());
                double pmt = Double.parseDouble(txtPmt4.getText());
                double futureValue = Double.parseDouble(txtFv3.getText());

                double noOfPeriods = Math.log((futureValue + pmt * 100 / interest) / (startPrinc + pmt * 100 / interest)) / (Math.log(1 + interest / 100));
                double presentValue = futureValue * Math.pow((1 + (interest / 100)), -noOfPeriods);
                double totalPrincipal = startPrinc + (pmt * noOfPeriods);
                double totalInterest = futureValue - totalPrincipal;

                lblFvOut4.setText(String.format("$" + "%.2f", futureValue));
                lblPvOut4.setText(String.format("$" + "%.2f", presentValue));
                lblNOutput4.setText(String.format("%.2f", noOfPeriods));
                lblIyOutput4.setText(String.format("%.2f", interest));
                lblPerOut4.setText(String.format("$" + "%.2f", pmt));
                lblSiOut4.setText(String.format("$" + "%.2f", startPrinc));
                lblTpOut4.setText(String.format("$" + "%.2f", totalPrincipal));
                lblTiOut4.setText(String.format("$" + "%.2f", totalInterest));
            }catch (Exception exception){
                alertN.setAlertType(Alert.AlertType.CONFIRMATION);
                alertN.setHeaderText("Please Enter Valid Numaric Value");
                alertN.show();
            }

        });




        AnchorPane ancN = new AnchorPane(); // Creating AnchorPane
        ancN.getChildren().addAll(fv3, lblSp4, lblIy4, lblPmt4, txtFv3, txtSp4, txtIy4, txtPmt4, btnCalN, lblTiOut4, lblTi4, lblTpOut4,
                lblTp4, lblSiOut4, lblSi4, lblPerOut4, lblPer4, lblIyOutput4, lblIyOut4, lblNOutput4, lblNOut4, lblPvOut4, lblPv4,
                lblFvOut4, lblFv4, lblResult4);

        tabN.setContent(ancN);
        //-------------------------------- Start Principal Tab ------------------------------//
        Tab tabSp = new Tab("Start Principal");
        tabSp.setStyle("-fx-font-size:15; -fx-font-weight: bold;");

        Label fv4 = new Label("FV (Future Value)");
        fv4.setLayoutX(46);
        fv4.setLayoutY(50);
        fv4.setFont(new Font("Calibri", 15));
        fv4.setStyle(" -fx-font-weight: bold;");

        Label lblN5 = new Label("N (# of Periods)");
        lblN5.setLayoutX(54);
        lblN5.setLayoutY(90);
        lblN5.setFont(new Font("Calibri", 15));
        lblN5.setStyle(" -fx-font-weight: bold;");

        Label lblIy5 = new Label("I/Y (Interest)");
        lblIy5.setLayoutX(71);
        lblIy5.setLayoutY(130);
        lblIy5.setFont(new Font("Calibri", 15));
        lblIy5.setStyle(" -fx-font-weight: bold;");

        Label lblPmt5 = new Label("PMT (Annuity Payment)");
        lblPmt5.setLayoutX(10);
        lblPmt5.setLayoutY(170);
        lblPmt5.setFont(new Font("Calibri", 15));
        lblPmt5.setStyle(" -fx-font-weight: bold;");

        // Fixed Label
        Label lblResult5 = new Label("Results");
        lblResult5.setLayoutX(300);
        lblResult5.setLayoutY(50);
        lblResult5.setFont(new Font("Arial", 18)); // set the font
        lblResult5.setTextFill(Color.WHITE); // Set the color for label
        lblResult5.setStyle("-fx-background-color:Green; -fx-padding:3px;");
        lblResult5.setPrefSize(290, 20);

        Label lblFv5 = new Label("FV (Future Value)");
        lblFv5.setLayoutX(300);
        lblFv5.setLayoutY(80);
        lblFv5.setFont(new Font("Calibri", 15));
        lblFv5.setStyle("-fx-background-color:#e1ebe4;");
        lblFv5.setPrefSize(180, 20);

        Label lblPv5 = new Label("PV (Present Value)");
        lblPv5.setLayoutX(300);
        lblPv5.setLayoutY(105);
        lblPv5.setFont(new Font("Calibri", 15));
        lblPv5.setStyle("-fx-background-color:#e1ebe4;");
        lblPv5.setPrefSize(180, 20);

        Label lblNOut5 = new Label("N (Number of Periods)");
        lblNOut5.setLayoutX(300);
        lblNOut5.setLayoutY(130);
        lblNOut5.setFont(new Font("Calibri", 15));
        lblNOut5.setStyle("-fx-background-color:#e1ebe4;");
        lblNOut5.setPrefSize(180, 20);

        Label lblIyOut5 = new Label("I/Y (Interest Rate)");
        lblIyOut5.setLayoutX(300);
        lblIyOut5.setLayoutY(155);
        lblIyOut5.setFont(new Font("Calibri", 15));
        lblIyOut5.setStyle("-fx-background-color:#e1ebe4;");
        lblIyOut5.setPrefSize(180, 20);

        Label lblPer5 = new Label("PMT (Periodic Payment)");
        lblPer5.setLayoutX(300);
        lblPer5.setLayoutY(180);
        lblPer5.setFont(new Font("Calibri", 15));
        lblPer5.setStyle("-fx-background-color:#e1ebe4;");
        lblPer5.setPrefSize(180, 20);


        Label lblSi5 = new Label("Starting Investment");
        lblSi5.setLayoutX(300);
        lblSi5.setLayoutY(205);
        lblSi5.setFont(new Font("Calibri", 15));
        lblSi5.setStyle("-fx-background-color:#e1ebe4;");
        lblSi5.setPrefSize(180, 20);

        Label lblTp5 = new Label("Total Principal");
        lblTp5.setLayoutX(300);
        lblTp5.setLayoutY(230);
        lblTp5.setFont(new Font("Calibri", 15));
        lblTp5.setStyle("-fx-background-color:#e1ebe4;");
        lblTp5.setPrefSize(180, 20);

        Label lblTi5 = new Label("Total Interest");
        lblTi5.setLayoutX(300);
        lblTi5.setLayoutY(255);
        lblTi5.setFont(new Font("Calibri", 15));
        lblTi5.setStyle("-fx-background-color:#e1ebe4;");
        lblTi5.setPrefSize(180, 20);
        //Output Label
        Label lblFvOut5 = new Label();
        lblFvOut5.setLayoutX(482);
        lblFvOut5.setLayoutY(80);
        lblFvOut5.setFont(new Font("Calibri", 15));
        lblFvOut5.setStyle("-fx-background-color:#e1ebe4;");
        lblFvOut5.setPrefSize(108, 20);
        lblFvOut5.setAlignment(Pos.CENTER_RIGHT);

        Label lblPvOut5 = new Label();
        lblPvOut5.setLayoutX(482);
        lblPvOut5.setLayoutY(105);
        lblPvOut5.setFont(new Font("Calibri", 15));
        lblPvOut5.setStyle("-fx-background-color:#e1ebe4;");
        lblPvOut5.setPrefSize(108, 20);
        lblPvOut5.setAlignment(Pos.CENTER_RIGHT);

        Label lblNOutput5 = new Label();
        lblNOutput5.setLayoutX(482);
        lblNOutput5.setLayoutY(130);
        lblNOutput5.setFont(new Font("Calibri", 15));
        lblNOutput5.setStyle("-fx-background-color:#e1ebe4;");
        lblNOutput5.setPrefSize(108, 20);
        lblNOutput5.setAlignment(Pos.CENTER_RIGHT);

        Label lblIyOutput5 = new Label();
        lblIyOutput5.setLayoutX(482);
        lblIyOutput5.setLayoutY(155);
        lblIyOutput5.setFont(new Font("Calibri", 15));
        lblIyOutput5.setStyle("-fx-background-color:#e1ebe4;");
        lblIyOutput5.setPrefSize(108, 20);
        lblIyOutput5.setAlignment(Pos.CENTER_RIGHT);

        Label lblPerOut5 = new Label();
        lblPerOut5.setLayoutX(482);
        lblPerOut5.setLayoutY(180);
        lblPerOut5.setFont(new Font("Calibri", 15));
        lblPerOut5.setStyle("-fx-background-color:#e1ebe4;");
        lblPerOut5.setPrefSize(108, 20);
        lblPerOut5.setAlignment(Pos.CENTER_RIGHT);

        Label lblSiOut5 = new Label();
        lblSiOut5.setLayoutX(482);
        lblSiOut5.setLayoutY(205);
        lblSiOut5.setFont(new Font("Calibri", 15));
        lblSiOut5.setStyle("-fx-background-color:#e1ebe4;");
        lblSiOut5.setPrefSize(108, 20);
        lblSiOut5.setAlignment(Pos.CENTER_RIGHT);

        Label lblTpOut5 = new Label();
        lblTpOut5.setLayoutX(482);
        lblTpOut5.setLayoutY(230);
        lblTpOut5.setFont(new Font("Calibri", 15));
        lblTpOut5.setStyle("-fx-background-color:#e1ebe4;");
        lblTpOut5.setPrefSize(108, 20);
        lblTpOut5.setAlignment(Pos.CENTER_RIGHT);

        Label lblTiOut5 = new Label();
        lblTiOut5.setLayoutX(482);
        lblTiOut5.setLayoutY(255);
        lblTiOut5.setFont(new Font("Calibri", 15));
        lblTiOut5.setStyle("-fx-background-color:#e1ebe4;");
        lblTiOut5.setPrefSize(108, 20);
        lblTiOut5.setAlignment(Pos.CENTER_RIGHT);

        //TextField of Start Principal
        TextField txtFv4 = new TextField();
        txtFv4.setLayoutX(160);
        txtFv4.setLayoutY(50);
        txtFv4.setPrefWidth(100);

        TextField txtN5 = new TextField();
        txtN5.setLayoutX(160);
        txtN5.setLayoutY(90);
        txtN5.setPrefWidth(100);

        TextField txtIy5 = new TextField();
        txtIy5.setLayoutX(160);
        txtIy5.setLayoutY(130);
        txtIy5.setPrefWidth(100);

        TextField txtPmt5 = new TextField();
        txtPmt5.setLayoutX(160);
        txtPmt5.setLayoutY(170);
        txtPmt5.setPrefWidth(100);

        Button btnCalSp = new Button("Calculate");
        btnCalSp.setLayoutX(110);
        btnCalSp.setLayoutY(250);
        btnCalSp.setPrefSize(120,30);
        btnCalSp.setStyle("-fx-font-size:15; -fx-background-color: #2ABB9B; -fx-font-weight: bold;");

        Alert alertSp = new Alert(Alert.AlertType.CONFIRMATION);
        btnCalSp.setOnAction(event -> {
            try {
                double noPeriods = Double.parseDouble(txtN5.getText());
                double interest = Double.parseDouble(txtIy5.getText());
                double pmt = Double.parseDouble(txtPmt5.getText());
                double futureValue = Double.parseDouble(txtFv4.getText());


                double presentValue = futureValue * Math.pow((1 + (interest / 100)), -noPeriods);
                double startPrinc = (futureValue - ((pmt * (Math.pow(1 + interest / 100, noPeriods) - 1)) / (noPeriods / 100))) / (Math.pow(1 + interest / 100, noPeriods));
                double totalPrincipal = startPrinc + (pmt * noPeriods);
                double totalInterest = futureValue - totalPrincipal;

                lblFvOut5.setText(String.format("$" + "%.2f", futureValue));
                lblPvOut5.setText(String.format("$" + "%.2f", presentValue));
                lblNOutput5.setText(String.format("%.2f", noPeriods));
                lblIyOutput5.setText(String.format("%.2f", interest));
                lblPerOut5.setText(String.format("$" + "%.3f", pmt));
                lblSiOut5.setText(String.format("$" + "%.2f", startPrinc));
                lblTpOut5.setText(String.format("$" + "%.2f", totalPrincipal));
                lblTiOut5.setText(String.format("$" + "%.2f", totalInterest));
            }catch (Exception exception){
                alertSp.setAlertType(Alert.AlertType.CONFIRMATION);
                alertSp.setHeaderText("Please Enter Valid Integer Value");
                alertSp.show();
            }

        });


        AnchorPane ancSp = new AnchorPane(); // Creating AnchorPane
        ancSp.getChildren().addAll(fv4, lblN5, lblIy5, lblPmt5, txtFv4, txtN5, txtIy5, txtPmt5, btnCalSp, lblTiOut5, lblTi5, lblTpOut5,
                lblTp5, lblSiOut5, lblSi5, lblPerOut5, lblPer5, lblIyOutput5, lblIyOut5, lblNOutput5, lblNOut5, lblPvOut5, lblPv5,
                lblFvOut5, lblFv5, lblResult5);

        tabSp.setContent(ancSp);
        // Keyboard for finance Calculator
        VBox keyBord = new VBox();
        keyBord.setPrefSize(200, 280);
        keyBord.setLayoutX(650);
        keyBord.setLayoutY(20);

        HBox box1 = new HBox();
        box1.setPrefSize(100, 70);
        box1.setSpacing(5);

        HBox box2 = new HBox();
        box2.setPrefSize(100, 70);
        box2.setSpacing(5);

        HBox box3 = new HBox();
        box3.setPrefSize(100, 70);
        box3.setSpacing(5);

        HBox box4 = new HBox();
        box4.setPrefSize(100, 70);
        box4.setSpacing(5);

        Button btnNum1 = new Button();
        btnNum1.setText("1");
        btnNum1.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum1.setPrefSize(60, 60);
        btnNum1.setFocusTraversable(false);
        Alert alertNo1 = new Alert(Alert.AlertType.ERROR);
        btnNum1.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum1.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"1");
            }catch (Exception exception){
                alertNo1.setAlertType(Alert.AlertType.ERROR);
                alertNo1.setHeaderText("Please Choose Right TextField");
                alertNo1.show();
                }

        });

        Button btnNum2 = new Button();
        btnNum2.setText("2");
        btnNum2.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum2.setPrefSize(60, 60);
        btnNum2.setFocusTraversable(false);
        Alert alertNo2 = new Alert(Alert.AlertType.ERROR);
        btnNum2.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum2.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"2");
            }catch (Exception exception){
                alertNo2.setAlertType(Alert.AlertType.ERROR);
                alertNo2.setHeaderText("Please Choose Right TextField");
                alertNo2.show();
            }

        });


        Button btnNum3 = new Button();
        btnNum3.setText("3");
        btnNum3.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum3.setPrefSize(60, 60);
        btnNum3.setFocusTraversable(false);
        Alert alertNo3 = new Alert(Alert.AlertType.ERROR);
        btnNum3.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum3.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"3");
            }catch (Exception exception){
                alertNo3.setAlertType(Alert.AlertType.ERROR);
                alertNo3.setHeaderText("Please Choose Right TextField");
                alertNo3.show();
            }

        });

        Button btnNum4 = new Button();
        btnNum4.setText("4");
        btnNum4.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum4.setPrefSize(60, 60);
        btnNum4.setFocusTraversable(false);
        Alert alertNo4 = new Alert(Alert.AlertType.ERROR);
        btnNum4.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum4.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"4");
            }catch (Exception exception){
                alertNo4.setAlertType(Alert.AlertType.ERROR);
                alertNo4.setHeaderText("Please Choose Right TextField");
                alertNo4.show();
            }

        });

        Button btnNum5 = new Button();
        btnNum5.setText("5");
        btnNum5.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum5.setPrefSize(60, 60);
        btnNum5.setFocusTraversable(false);
        Alert alertNo5 = new Alert(Alert.AlertType.ERROR);
        btnNum5.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum5.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"5");
            }catch (Exception exception){
                alertNo5.setAlertType(Alert.AlertType.ERROR);
                alertNo5.setHeaderText("Please Choose Right TextField");
                alertNo5.show();
            }

        });

        Button btnNum6 = new Button();
        btnNum6.setText("6");
        btnNum6.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum6.setPrefSize(60, 60);
        btnNum6.setFocusTraversable(false);
        Alert alertNo6 = new Alert(Alert.AlertType.ERROR);
        btnNum6.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum6.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"6");
            }catch (Exception exception){
                alertNo6.setAlertType(Alert.AlertType.ERROR);
                alertNo6.setHeaderText("Please Choose Right TextField");
                alertNo6.show();
            }

        });

        Button btnNum7 = new Button();
        btnNum7.setText("7");
        btnNum7.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum7.setPrefSize(60, 60);
        btnNum7.setFocusTraversable(false);
        Alert alertNo7 = new Alert(Alert.AlertType.ERROR);
        btnNum7.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum7.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"7");
            }catch (Exception exception){
                alertNo7.setAlertType(Alert.AlertType.ERROR);
                alertNo7.setHeaderText("Please Choose Right TextField");
                alertNo7.show();
            }

        });

        Button btnNum8 = new Button();
        btnNum8.setText("8");
        btnNum8.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum8.setPrefSize(60, 60);
        btnNum8.setFocusTraversable(false);
        Alert alertNo8 = new Alert(Alert.AlertType.ERROR);
        btnNum8.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum8.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"8");
            }catch (Exception exception){
                alertNo8.setAlertType(Alert.AlertType.ERROR);
                alertNo8.setHeaderText("Please Choose Right TextField");
                alertNo8.show();
            }

        });

        Button btnNum9 = new Button();
        btnNum9.setText("9");
        btnNum9.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum9.setPrefSize(60, 60);
        btnNum9.setFocusTraversable(false);
        Alert alertNo9 = new Alert(Alert.AlertType.ERROR);
        btnNum8.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum8.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"9");
            }catch (Exception exception){
                alertNo9.setAlertType(Alert.AlertType.ERROR);
                alertNo9.setHeaderText("Please Choose Right TextField");
                alertNo9.show();
            }

        });

        Button btnNum0 = new Button();
        btnNum0.setText("0");
        btnNum0.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnNum0.setPrefSize(60, 60);
        btnNum0.setFocusTraversable(false);
        Alert alertNo0 = new Alert(Alert.AlertType.ERROR);
        btnNum0.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnNum0.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText()+"0");
            }catch (Exception exception){
                alertNo0.setAlertType(Alert.AlertType.ERROR);
                alertNo0.setHeaderText("Please Choose Right TextField");
                alertNo0.show();
            }

        });

        Button btnPoint = new Button();
        btnPoint.setText(".");
        btnPoint.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnPoint.setPrefSize(60, 60);
        btnPoint.setFocusTraversable(false);
        Alert alertPoint = new Alert(Alert.AlertType.ERROR);
        btnPoint.setOnAction(event -> {
            try {
                TextField txtFinance = (TextField) btnPoint.getScene().getFocusOwner();
                txtFinance.setText(txtFinance.getText() + ".");
            }catch (Exception exception){
                alertPoint.setAlertType(Alert.AlertType.ERROR);
                alertPoint.setHeaderText("Please Choose Right TextField");
                alertPoint.show();
            }

        });

        Button btnClear = new Button();
        btnClear.setText("C");
        btnClear.setStyle("-fx-font-size:20; -fx-font-weight: bold;");
        btnClear.setPrefSize(60, 60);
        btnClear.setFocusTraversable(false);
        Alert alertClear = new Alert(Alert.AlertType.ERROR);
        btnClear.setOnAction(event -> {
            try {
                TextField textFinance = (TextField) btnClear.getScene().getFocusOwner();
                String clear = textFinance.getText().substring(0, textFinance.getText().length() - 1);
                textFinance.setText(clear);
            }catch (Exception exception){
                alertClear.setAlertType(Alert.AlertType.ERROR);
                alertClear.setHeaderText("Please Choose Right TextField");
                alertClear.show();
            }

        });

        keyBord.getChildren().addAll(box1, box2, box3, box4);
        box1.getChildren().addAll(btnNum1, btnNum2, btnNum3);
        box2.getChildren().addAll(btnNum4, btnNum5, btnNum6);
        box3.getChildren().addAll(btnNum7, btnNum8, btnNum9);
        box4.getChildren().addAll(btnClear, btnNum0, btnPoint);


        AnchorPane anc = new AnchorPane();
        anc.getChildren().addAll(tabPaneFinance,btnBack,btnHelp,keyBord,btnClose);
        anc.setPrefSize(900,450);
        tabPaneFinance.getTabs().addAll(tabFv,tabPmt,tabN,tabSp);

        anc.setStyle("-fx-background-color:#6C7A89;");
        Scene sc = new Scene(anc);
        FinanceWindow.setScene(sc);
        FinanceWindow.show();

    }
}

