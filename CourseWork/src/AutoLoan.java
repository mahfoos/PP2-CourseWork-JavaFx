import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class AutoLoan {
    public static void AutoLoanCal() {

        Stage stgAutoLoan = new Stage();
        stgAutoLoan.setMaxWidth(1100);
        stgAutoLoan.setMaxHeight(550);
        stgAutoLoan.setTitle("AutoLoan Calculator");

        Button btnBack = new Button("Back");
        btnBack.setLayoutX(790);
        btnBack.setLayoutY(350);
        btnBack.setPrefSize(100,30);
        btnBack.setStyle("-fx-font-size:15; -fx-font-weight: bold;-fx-background-color: #2ABB9B;");

        btnBack.setOnAction(event -> {stgAutoLoan.close();
            MainWindow.FirstWindow();});

        Button btnClose = new Button("Close");
        btnClose.setLayoutX(900);
        btnClose.setLayoutY(350);
        btnClose.setPrefSize(100,30);
        btnClose.setStyle("-fx-font-size:15; -fx-font-weight: bold;-fx-background-color: #2ABB9B;");

        btnClose.setOnAction(event -> {stgAutoLoan.close();});

        //------------------------ Creating TabPane for Loan Calculator -----------------------------//
        TabPane tabLoan = new TabPane();
        tabLoan.setPrefSize(750, 600);
        tabLoan.setStyle("-fx-background-color:#6C7A89;");
        tabLoan.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        //----------------------- Total price tab --------------------------------------------------//
        Tab tabTotalPrice = new Tab("Total Price");
        tabTotalPrice.setStyle("-fx-font-size:15; -fx-font-weight: bold;");

        //------------------------ Label of Total Price Tab ---------------------------------------//
        Label lblAutoPrice = new Label("Auto Price");
        lblAutoPrice.setLayoutX(40);
        lblAutoPrice.setLayoutY(50);
        lblAutoPrice.setFont(new Font("Calibri", 15));
        lblAutoPrice.setStyle(" -fx-font-weight: bold;");

        Label lblLoanTerm = new Label("Loan Term");
        lblLoanTerm.setLayoutX(40);
        lblLoanTerm.setLayoutY(90);
        lblLoanTerm.setFont(new Font("Calibri", 15));
        lblLoanTerm.setStyle(" -fx-font-weight: bold;");


        Label lblIr = new Label("Interest Rate");
        lblIr.setLayoutX(40);
        lblIr.setLayoutY(130);
        lblIr.setFont(new Font("Calibri", 15));
        lblIr.setStyle(" -fx-font-weight: bold;");

        Label lblDownPay = new Label("Down Payment");
        lblDownPay.setLayoutX(40);
        lblDownPay.setLayoutY(170);
        lblDownPay.setFont(new Font("Calibri", 15));
        lblDownPay.setStyle(" -fx-font-weight: bold;");

        Label lblTradVal = new Label("Trade-in Value");
        lblTradVal.setLayoutX(40);
        lblTradVal.setLayoutY(210);
        lblTradVal.setFont(new Font("Calibri", 15));
        lblTradVal.setStyle(" -fx-font-weight: bold;");

        Label lblYState = new Label("Your State");
        lblYState.setLayoutX(40);
        lblYState.setLayoutY(250);
        lblYState.setFont(new Font("Calibri", 15));
        lblYState.setStyle(" -fx-font-weight: bold;");

        Label lblSalTex = new Label("Sales Tex");
        lblSalTex.setLayoutX(40);
        lblSalTex.setLayoutY(290);
        lblSalTex.setFont(new Font("Calibri", 15));
        lblSalTex.setStyle(" -fx-font-weight: bold;");

        Label lblTitle = new Label("Title, Registration\nand Other Fees");
        lblTitle.setLayoutX(40);
        lblTitle.setLayoutY(330);
        lblTitle.setFont(new Font("Calibri", 15));
        lblTitle.setStyle(" -fx-font-weight: bold;");

        //------------------------------- Label for Output Total Price Tab ----------------------------------//
        Label lblMpOut = new Label(" Monthly Pay: $");
        lblMpOut.setLayoutX(350);
        lblMpOut.setLayoutY(50);
        lblMpOut.setPrefSize(385, 25);
        lblMpOut.setFont(new Font("Arial", 18)); // set the font
        lblMpOut.setTextFill(Color.WHITE); // Set the color for label
        lblMpOut.setStyle("-fx-background-color:Green; -fx-font-weight: bold; -fx-padding:3px;");


        Label lblTl = new Label("Total Loan Amount");
        lblTl.setLayoutX(350);
        lblTl.setLayoutY(80);
        lblTl.setMinWidth(275);
        lblTl.setFont(new Font("Calibri", 15));
        lblTl.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblSt = new Label("Sale Tax");
        lblSt.setLayoutX(350);
        lblSt.setLayoutY(105);
        lblSt.setMinWidth(275);
        lblSt.setFont(new Font("Calibri", 15));
        lblSt.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblUp = new Label("Upfront Payment");
        lblUp.setLayoutX(350);
        lblUp.setLayoutY(130);
        lblUp.setMinWidth(275);
        lblUp.setFont(new Font("Calibri", 15));
        lblUp.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblTotLoPay = new Label("Total of 60 Loan Payments");
        lblTotLoPay.setLayoutX(350);
        lblTotLoPay.setLayoutY(155);
        lblTotLoPay.setMinWidth(275);
        lblTotLoPay.setFont(new Font("Calibri", 15));
        lblTotLoPay.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");


        Label lblTotLoIn = new Label("Total Loan Interest");
        lblTotLoIn.setLayoutX(350);
        lblTotLoIn.setLayoutY(180);
        lblTotLoIn.setMinWidth(275);
        lblTotLoIn.setFont(new Font("Calibri", 15));
        lblTotLoIn.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");


        Label lblTc = new Label("Total Cost (price, interest, tax, fees)");
        lblTc.setLayoutX(350);
        lblTc.setLayoutY(205);
        lblTc.setMinWidth(275);
        lblTc.setFont(new Font("Calibri", 15));
        lblTc.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblTlOut = new Label();
        lblTlOut.setLayoutX(635);
        lblTlOut.setLayoutY(80);
        lblTlOut.setMinWidth(100);
        lblTlOut.setFont(new Font("Calibri", 15));
        lblTlOut.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTlOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblStOut = new Label();
        lblStOut.setLayoutX(635);
        lblStOut.setLayoutY(105);
        lblStOut.setMinWidth(100);
        lblStOut.setFont(new Font("Calibri", 15));
        lblStOut.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblStOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblUpOut = new Label();
        lblUpOut.setLayoutX(635);
        lblUpOut.setLayoutY(130);
        lblUpOut.setMinWidth(100);
        lblUpOut.setFont(new Font("Calibri", 15));
        lblUpOut.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblUpOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblTotLoPayOut = new Label();
        lblTotLoPayOut.setLayoutX(635);
        lblTotLoPayOut.setLayoutY(155);
        lblTotLoPayOut.setMinWidth(100);
        lblTotLoPayOut.setFont(new Font("Calibri", 15));
        lblTotLoPayOut.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTotLoPayOut.setAlignment(Pos.CENTER_RIGHT);


        Label lblTotLoInOut = new Label();
        lblTotLoInOut.setLayoutX(635);
        lblTotLoInOut.setLayoutY(180);
        lblTotLoInOut.setMinWidth(100);
        lblTotLoInOut.setFont(new Font("Calibri", 15));
        lblTotLoInOut.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTotLoInOut.setAlignment(Pos.CENTER_RIGHT);

        Label lblTcOut = new Label();
        lblTcOut.setLayoutX(635);
        lblTcOut.setLayoutY(205);
        lblTcOut.setMinWidth(100);
        lblTcOut.setFont(new Font("Calibri", 15));
        lblTcOut.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTcOut.setAlignment(Pos.CENTER_RIGHT);


        //------------------------------------- TextField For Total Price Tab ------------------------------//
        TextField txtAp = new TextField();
        txtAp.setLayoutX(145);
        txtAp.setLayoutY(50);
        txtAp.setPrefWidth(100);

        TextField txtLt = new TextField();
        txtLt.setLayoutX(145);
        txtLt.setLayoutY(90);
        txtLt.setPrefWidth(100);

        TextField txtIr = new TextField();
        txtIr.setLayoutX(145);
        txtIr.setLayoutY(130);
        txtIr.setPrefWidth(100);

        TextField txtDp = new TextField();
        txtDp.setLayoutX(145);
        txtDp.setLayoutY(170);
        txtDp.setPrefWidth(100);

        TextField txtTv = new TextField();
        txtTv.setLayoutX(145);
        txtTv.setLayoutY(210);
        txtTv.setPrefWidth(100);

        ComboBox comboSt = new ComboBox();
        comboSt.setLayoutX(145);
        comboSt.setLayoutY(250);
        comboSt.setPrefWidth(120);
        comboSt.setValue("--Select--");
        comboSt.getItems().addAll("--Select--", "Califorina", "Colombo", "kandy", "Trincomalee", "Kinniya");

        TextField txtSt = new TextField();
        txtSt.setLayoutX(145);
        txtSt.setLayoutY(290);
        txtSt.setPrefWidth(100);

        TextField txtTitle = new TextField();
        txtTitle.setLayoutX(145);
        txtTitle.setLayoutY(330);
        txtTitle.setPrefWidth(100);

        //--------------------------------- Calculate Button For Total Price Tab----------------------//
        Button btnCalTp = new Button("Calculate");
        btnCalTp.setLayoutX(90);
        btnCalTp.setLayoutY(390);
        btnCalTp.setPrefSize(120,30);
        btnCalTp.setStyle("-fx-font-size:15;-fx-font-color:white; -fx-background-color: #2ABB9B; -fx-font-weight: bold;");

        Alert alertTp = new Alert(Alert.AlertType.CONFIRMATION);

        btnCalTp.setOnAction(event -> {
            try {

                //------------------------- Assigning Variable to TextField-----------------------------------//
                double autoPrice = Double.parseDouble(txtAp.getText());
                double downPay = Double.parseDouble(txtDp.getText());
                double salesTex = Double.parseDouble(txtSt.getText());
                double titleFee = Double.parseDouble(txtTitle.getText());
                double interestRate = Double.parseDouble(txtIr.getText());
                double loanTerm = Double.parseDouble(txtLt.getText());
                double tradeValue = Double.parseDouble(txtTv.getText());

                //------------------------ Formulas for Auto Price Tab ------------------------------------//
                double totLoanAmount = autoPrice - downPay;
                double salTex = (salesTex / 100) * autoPrice;
                double upFront = downPay + salTex + titleFee;
                double monthPay = ((interestRate / 100) / 12 * (autoPrice - downPay - tradeValue)) / (1 - Math.pow((1 + (interestRate / 100) / 12), -loanTerm));
                double totLoanPay = loanTerm * monthPay;
                double totLoanInterest = totLoanPay - totLoanAmount;
                double totCost = autoPrice + totLoanInterest + salTex + titleFee;

                //---------------------- Setting Output into Variable ------------------------------------//
                lblTlOut.setText(String.format("%.2f", totLoanAmount));//
                lblStOut.setText(String.format("$" + "%.2f", salTex));//
                lblUpOut.setText(String.format("$" + "%.2f", upFront));//
                lblMpOut.setText(String.format("Monthly Pay: $" + "%.2f", monthPay));//
                lblTotLoPayOut.setText(String.format("$" + "%.2f", totLoanPay));
                lblTotLoInOut.setText(String.format("$" + "%.2f", totLoanInterest));
                lblTcOut.setText(String.format("$" + "%.2f", totCost));
                lblTotLoPay.setText(String.format("Total of " + (int) loanTerm + "Loan Payments"));
            }catch (Exception exception){
                alertTp.setAlertType(Alert.AlertType.CONFIRMATION);
                alertTp.setHeaderText("Please Enter Valid Integer Value");
                alertTp.show();
            }


        });

        AnchorPane ancAutoTp = new AnchorPane();
        ancAutoTp.getChildren().addAll(lblAutoPrice, lblLoanTerm, lblIr, lblDownPay, lblTradVal,
                lblYState, lblSalTex, lblTitle,
                txtAp, txtLt, txtIr, txtDp, txtTv, txtSt, comboSt, txtTitle, lblTl, lblSt, lblMpOut, btnCalTp,
                lblUp, lblTotLoPay, lblTotLoIn, lblTc, lblTlOut, lblStOut, lblUpOut, lblTotLoPayOut, lblTotLoInOut, lblTcOut);

        tabTotalPrice.setContent(ancAutoTp);

        //-------------------------- Monthly Pay Tab --------------------------------------------------//
        Tab tabMonthlyPay = new Tab("Monthly Payment");
        tabMonthlyPay.setStyle("-fx-font-size:15; -fx-font-weight: bold;");

        //--------------------------- Label of Monthly Payment Tab ---------------------------------------//
        Label lblMonth = new Label("Monthly pay");
        lblMonth.setLayoutX(40);
        lblMonth.setLayoutY(50);
        lblMonth.setFont(new Font("Calibri", 15));
        lblMonth.setStyle(" -fx-font-weight: bold;");

        Label lblLoanTerm2 = new Label("Loan Term");
        lblLoanTerm2.setLayoutX(40);
        lblLoanTerm2.setLayoutY(90);
        lblLoanTerm2.setFont(new Font("Calibri", 15));
        lblLoanTerm2.setStyle(" -fx-font-weight: bold;");

        Label lblIr2 = new Label("Interest Rate");
        lblIr2.setLayoutX(40);
        lblIr2.setLayoutY(130);
        lblIr2.setFont(new Font("Calibri", 15));
        lblIr2.setStyle(" -fx-font-weight: bold;");

        Label lblDownPay2 = new Label("Down Payment");
        lblDownPay2.setLayoutX(40);
        lblDownPay2.setLayoutY(170);
        lblDownPay2.setFont(new Font("Calibri", 15));
        lblDownPay2.setStyle(" -fx-font-weight: bold;");

        Label lblTradVal2 = new Label("Trade-in Value");
        lblTradVal2.setLayoutX(40);
        lblTradVal2.setLayoutY(210);
        lblTradVal2.setFont(new Font("Calibri", 15));
        lblTradVal2.setStyle(" -fx-font-weight: bold;");

        Label lblYState2 = new Label("Your State");
        lblYState2.setLayoutX(40);
        lblYState2.setLayoutY(250);
        lblYState2.setFont(new Font("Calibri", 15));
        lblYState2.setStyle(" -fx-font-weight: bold;");

        Label lblSalTex2 = new Label("Sales Tex");
        lblSalTex2.setLayoutX(40);
        lblSalTex2.setLayoutY(290);
        lblSalTex2.setFont(new Font("Calibri", 15));
        lblSalTex2.setStyle(" -fx-font-weight: bold;");

        Label lblTitle2 = new Label("Title, Registration\nand Other Fees");
        lblTitle2.setLayoutX(40);
        lblTitle2.setLayoutY(330);
        lblTitle2.setFont(new Font("Calibri", 15));
        lblTitle2.setStyle(" -fx-font-weight: bold;");

        //---------------------------------------- Output Label For Monthly Price Tab --------------------------//
        Label lblVehPrice = new Label(" Vehicle Price: $");
        lblVehPrice.setLayoutX(350);
        lblVehPrice.setLayoutY(50);
        lblVehPrice.setPrefSize(385, 25);
        lblVehPrice.setFont(new Font("Arial", 18)); // set the font
        lblVehPrice.setTextFill(Color.WHITE); // Set the color for label
        lblVehPrice.setStyle("-fx-background-color:Green;-fx-font-weight: bold; -fx-padding:3px;");

        Label lblTl2 = new Label("Total Loan Amount");
        lblTl2.setLayoutX(350);
        lblTl2.setLayoutY(80);
        lblTl2.setMinWidth(275);
        lblTl2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblSt2 = new Label("Sale Tax");
        lblSt2.setLayoutX(350);
        lblSt2.setLayoutY(105);
        lblSt2.setMinWidth(275);
        lblSt2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblUp2 = new Label("Upfront Payment");
        lblUp2.setLayoutX(350);
        lblUp2.setLayoutY(130);
        lblUp2.setMinWidth(275);
        lblUp2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblTotLoPay2 = new Label("Total of 60 Loan Payments");
        lblTotLoPay2.setLayoutX(350);
        lblTotLoPay2.setLayoutY(155);
        lblTotLoPay2.setMinWidth(275);
        lblTotLoPay2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblTotLoIn2 = new Label("Total Loan Interest");
        lblTotLoIn2.setLayoutX(350);
        lblTotLoIn2.setLayoutY(180);
        lblTotLoIn2.setMinWidth(275);
        lblTotLoIn2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblTc2 = new Label("Total Cost (price, interest, tax, fees)");
        lblTc2.setLayoutX(350);
        lblTc2.setLayoutY(205);
        lblTc2.setMinWidth(275);
        lblTc2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");

        Label lblTlOut2 = new Label();
        lblTlOut2.setLayoutX(635);
        lblTlOut2.setLayoutY(80);
        lblTlOut2.setMinWidth(100);
        lblTlOut2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTlOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblStOut2 = new Label();
        lblStOut2.setLayoutX(635);
        lblStOut2.setLayoutY(105);
        lblStOut2.setMinWidth(100);
        lblStOut2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblStOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblUpOut2 = new Label();
        lblUpOut2.setLayoutX(635);
        lblUpOut2.setLayoutY(130);
        lblUpOut2.setMinWidth(100);
        lblUpOut2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblUpOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblTotLoPayOut2 = new Label();
        lblTotLoPayOut2.setLayoutX(635);
        lblTotLoPayOut2.setLayoutY(155);
        lblTotLoPayOut2.setMinWidth(100);
        lblTotLoPayOut2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTotLoPayOut2.setAlignment(Pos.CENTER_RIGHT);


        Label lblTotLoInOut2 = new Label();
        lblTotLoInOut2.setLayoutX(635);
        lblTotLoInOut2.setLayoutY(180);
        lblTotLoInOut2.setMinWidth(100);
        lblTotLoInOut2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTotLoInOut2.setAlignment(Pos.CENTER_RIGHT);

        Label lblTcOut2 = new Label(" ");
        lblTcOut2.setLayoutX(635);
        lblTcOut2.setLayoutY(205);
        lblTcOut2.setMinWidth(100);
        lblTcOut2.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTcOut2.setAlignment(Pos.CENTER_RIGHT);

        //----------------------------------- TextField For Monthly Price Tab -----------------------------//
        TextField txtMonthly = new TextField();
        txtMonthly.setLayoutX(145);
        txtMonthly.setLayoutY(50);
        txtMonthly.setPrefWidth(100);

        TextField txtLt2 = new TextField();
        txtLt2.setLayoutX(145);
        txtLt2.setLayoutY(90);
        txtLt2.setPrefWidth(100);

        TextField txtIr2 = new TextField();
        txtIr2.setLayoutX(145);
        txtIr2.setLayoutY(130);
        txtIr2.setPrefWidth(100);

        TextField txtDp2 = new TextField();
        txtDp2.setLayoutX(145);
        txtDp2.setLayoutY(170);
        txtDp2.setPrefWidth(100);

        TextField txtTv2 = new TextField();
        txtTv2.setLayoutX(145);
        txtTv2.setLayoutY(210);
        txtTv2.setPrefWidth(100);

        ComboBox comboSt2 = new ComboBox();
        comboSt2.setLayoutX(145);
        comboSt2.setLayoutY(250);
        comboSt2.setPrefWidth(120);
        comboSt2.setValue("--Select--");
        comboSt2.getItems().addAll("--Select--", "Califorina", "Colombo", "kandy", "Trincomalee", "Kinniya");

        TextField txtSt2 = new TextField();
        txtSt2.setLayoutX(145);
        txtSt2.setLayoutY(290);
        txtSt2.setPrefWidth(100);

        TextField txtTitle2 = new TextField("$");
        txtTitle2.setLayoutX(145);
        txtTitle2.setLayoutY(330);
        txtTitle2.setPrefWidth(100);

        //-------------------------------- Calculate Button For Monthly Price Tab ---------------------------//
        Button btnLoanTab2 = new Button("Calculate");
        btnLoanTab2.setLayoutX(90);
        btnLoanTab2.setLayoutY(390);
        btnLoanTab2.setPrefSize(120,30);
        btnLoanTab2.setStyle("-fx-font-size:15;-fx-font-color:white; -fx-background-color: #2ABB9B; -fx-font-weight: bold;");

        Alert alertMonth = new Alert(Alert.AlertType.CONFIRMATION);
        btnLoanTab2.setOnAction(event -> {
            try {


                double monthPay = Double.parseDouble(txtMonthly.getText());
                double loanTerm = Double.parseDouble(txtLt2.getText());
                double interestRate = Double.parseDouble(txtIr2.getText());
                double downPay = Double.parseDouble(txtDp2.getText());
                double tradeValue = Double.parseDouble(txtTv2.getText());
                double saleTex = Double.parseDouble(txtSt2.getText());
                double tittleFee = Double.parseDouble(txtTitle2.getText());

                double vehicleFee = (((monthPay * (1 - Math.pow((1 + (interestRate / 100) / 12), -loanTerm))) * 12) / (interestRate / 100)) + downPay + tradeValue;
                double totLoanAmount = vehicleFee - (downPay + tradeValue);
                double salesTax = (vehicleFee - tradeValue) * (saleTex / 100);
                double upFrontOut = downPay + salesTax + tittleFee;
                double totLoanPay = loanTerm * monthPay;
                double totLoanInterest = totLoanPay - totLoanAmount;
                double totCost = vehicleFee + totLoanInterest + salesTax + tittleFee;

                lblVehPrice.setText(String.format("Vehicle Price: $ " + "%.2f", vehicleFee));
                lblTlOut2.setText(String.format("$" + "%.2f", totLoanAmount)); //Total Loan Amount
                lblStOut2.setText(String.format("$" + "%.2f", salesTax)); //Sale Tax
                lblUpOut2.setText(String.format("$" + "%.2f", upFrontOut)); //Upfront Payment
                lblTotLoPayOut2.setText(String.format("$" + "%.2f", totLoanPay)); //Total of 60 Loan Payment
                lblTotLoInOut2.setText(String.format("$" + "%.2f", totLoanInterest)); //Total Loan Interest
                lblTotLoPay2.setText(String.format("Total of " + (int) loanTerm + "Loan Payments"));
                lblTcOut2.setText(String.format("$" + "%.2f", totCost)); //Total Cost(Price, Interest,tax,fees)
            }catch (Exception exception){
                alertMonth.setAlertType(Alert.AlertType.CONFIRMATION);
                alertMonth.setHeaderText("Please Enter Valid Integer Value");
                alertMonth.show();
            }

        });

        AnchorPane ancMonthly = new AnchorPane();
        ancMonthly.getChildren().addAll(lblMonth, lblLoanTerm2, lblIr2, lblDownPay2, lblTradVal2, lblYState2, lblSalTex2, lblTitle2,
                txtMonthly, txtLt2, txtIr2, txtDp2, txtTv2, comboSt2, txtSt2, txtTitle2, lblTl2, lblSt2, lblVehPrice, btnLoanTab2,
                lblUp2, lblTotLoPay2, lblTotLoIn2, lblTc2, lblTlOut2, lblStOut2, lblUpOut2, lblTotLoPayOut2, lblTotLoInOut2, lblTcOut2);

        tabMonthlyPay.setContent(ancMonthly);


        tabLoan.getTabs().addAll(tabTotalPrice, tabMonthlyPay);

        //------------------------------------- Keyboard For Auto Loan Calculator ----------------------------//
        VBox keyBord = new VBox();
        keyBord.setPrefSize(200, 280);
        keyBord.setLayoutX(800);
        keyBord.setLayoutY(70);

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

        AnchorPane ancAutLo = new AnchorPane(tabLoan,keyBord,btnBack,btnClose);
        ancAutLo.setPrefSize(1100, 550);
        ancAutLo.setStyle("-fx-background-color:#6C7A89;");
        Scene sc = new Scene(ancAutLo);
        stgAutoLoan.setScene(sc);
        stgAutoLoan.show();
    }
}
