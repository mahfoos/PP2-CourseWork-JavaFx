import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Mortgage {

    public static void MortgageCal(){

        Stage stgMortgage = new Stage();
        stgMortgage.setMaxWidth(1200);
        stgMortgage.setMaxHeight(600);
        stgMortgage.setTitle("Mortgage Calculator");

        Button btnBack = new Button("Back");
        btnBack.setLayoutX(890);
        btnBack.setLayoutY(320);
        btnBack.setPrefSize(100,30);
        btnBack.setStyle("-fx-font-size:15; -fx-font-weight: bold;-fx-background-color: #2ABB9B;");

        btnBack.setOnAction(event -> {stgMortgage.close(); //Back to MainWindow
            MainWindow.FirstWindow();});

        Button btnClose = new Button("Close");
        btnClose.setLayoutX(1000);
        btnClose.setLayoutY(320);
        btnClose.setPrefSize(100,30);
        btnClose.setStyle("-fx-font-size:15; -fx-font-weight: bold;-fx-background-color: #2ABB9B;");

        btnClose.setOnAction(event -> {stgMortgage.close();}); // Stage Close

        //---------------------- Label for Mortgage Calculator ----------------------------------------//
        Label lblHp = new Label("Home Price");
        lblHp.setLayoutX(50);
        lblHp.setLayoutY(60);
        lblHp.setFont(new Font("Calibri", 15));
        lblHp.setStyle(" -fx-font-weight: bold;");

        Label lblDp = new Label("Down payment");
        lblDp.setLayoutX(50);
        lblDp.setLayoutY(100);
        lblDp.setFont(new Font("Calibri", 15));
        lblDp.setStyle(" -fx-font-weight: bold;");

        Label lblLt = new Label("Loan Term");
        lblLt.setLayoutX(50);
        lblLt.setLayoutY(140);
        lblLt.setFont(new Font("Calibri", 15));
        lblLt.setStyle(" -fx-font-weight: bold;");

        Label lblYear = new Label("years");
        lblYear.setLayoutX(270);
        lblYear.setLayoutY(140);
        lblYear.setFont(new Font("Calibri", 15));
        lblYear.setStyle(" -fx-font-weight: bold;");

        Label lblIr = new Label("Interest Rate");
        lblIr.setLayoutX(50);
        lblIr.setLayoutY(180);
        lblIr.setFont(new Font("Calibri", 15));
        lblIr.setStyle(" -fx-font-weight: bold;");

        Label lblSd = new Label("Start Date");
        lblSd.setLayoutX(50);
        lblSd.setLayoutY(220);
        lblSd.setFont(new Font("Calibri", 15));
        lblSd.setStyle(" -fx-font-weight: bold;");


        Label lblAnnual = new Label("Annual Tax & Cost");
        lblAnnual.setLayoutX(175);
        lblAnnual.setLayoutY(250);
        lblAnnual.setFont(new Font("Calibri", 15));
        lblAnnual.setStyle(" -fx-font-weight: bold;");

        Label lblPt = new Label("Property Taxes");
        lblPt.setLayoutX(50);
        lblPt.setLayoutY(270);
        lblPt.setFont(new Font("Calibri", 15));
        lblPt.setStyle(" -fx-font-weight: bold;");

        Label lblHi = new Label("Home Insurance");
        lblHi.setLayoutX(50);
        lblHi.setLayoutY(310);
        lblHi.setFont(new Font("Calibri", 15));
        lblHi.setStyle(" -fx-font-weight: bold;");

        Label lblPmi = new Label("PMI Insurance");
        lblPmi.setLayoutX(50);
        lblPmi.setLayoutY(350);
        lblPmi.setFont(new Font("Calibri", 15));
        lblPmi.setStyle(" -fx-font-weight: bold;");

        Label lblHoa = new Label("HOA Fee");
        lblHoa.setLayoutX(50);
        lblHoa.setLayoutY(390);
        lblHoa.setFont(new Font("Calibri", 15));
        lblHoa.setStyle(" -fx-font-weight: bold;");

        Label lblOther = new Label("Other Costs");
        lblOther.setLayoutX(50);
        lblOther.setLayoutY(430);
        lblOther.setFont(new Font("Calibri", 15));
        lblOther.setStyle(" -fx-font-weight: bold;");

        //---------------------------------- Output Label -----------------------------------------------------//
        Label lblMp = new Label("Monthly Pay: $");
        lblMp.setLayoutX(425);
        lblMp.setLayoutY(50);
        lblMp.setPrefSize(395,25);
        lblMp.setFont(new Font("Arial", 18)); // set the font
        lblMp.setTextFill(Color.WHITE); // Set the color for label
        lblMp.setStyle("-fx-background-color:Green; -fx-padding:3px;");



        Label lblMon = new Label("Monthly");
        lblMon.setLayoutX(640);
        lblMon.setLayoutY(90);
        lblMon.setFont(new Font("Calibri", 15));
        lblMon.setStyle("-fx-font-weight: bold");

        Label lblTot = new Label("Total");
        lblTot.setLayoutX(775);
        lblTot.setLayoutY(90);
        lblTot.setFont(new Font("Calibri", 15));
        lblTot.setStyle("-fx-font-weight: bold");

        Label lblMorPay = new Label("Mortgage Payment");
        lblMorPay.setLayoutX(425);
        lblMorPay.setLayoutY(125);
        lblMorPay.setPrefSize(190, 20);
        lblMorPay.setFont(new Font("Calibri", 15));
        lblMorPay.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");



        Label lblMorPayMon = new Label();
        lblMorPayMon.setLayoutX(618);
        lblMorPayMon.setLayoutY(125);
        lblMorPayMon.setPrefSize(100, 20);
        lblMorPayMon.setFont(new Font("Calibri", 15));
        lblMorPayMon.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblMorPayMon.setAlignment(Pos.CENTER_RIGHT);

        Label lblMorPayTot = new Label();
        lblMorPayTot.setLayoutX(720);
        lblMorPayTot.setLayoutY(125);
        lblMorPayTot.setPrefSize(100, 20);
        lblMorPayTot.setFont(new Font("Calibri", 15));
        lblMorPayTot.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblMorPayTot.setAlignment(Pos.CENTER_RIGHT);

        Label lblPro = new Label("Property Tax");
        lblPro.setLayoutX(425);
        lblPro.setLayoutY(150);
        lblPro.setMinWidth(165);
        lblPro.setFont(new Font("Calibri", 15));
        lblPro.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblProTaxMon = new Label();
        lblProTaxMon.setLayoutX(618);
        lblProTaxMon.setLayoutY(150);
        lblProTaxMon.setMinWidth(100);
        lblProTaxMon.setFont(new Font("Calibri", 15));
        lblProTaxMon.setAlignment(Pos.CENTER_RIGHT);
        lblProTaxMon.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblProTaxTot = new Label();
        lblProTaxTot.setLayoutX(720);
        lblProTaxTot.setLayoutY(150);
        lblProTaxTot.setMinWidth(100);
        lblProTaxTot.setFont(new Font("Calibri", 15));
        lblProTaxTot.setAlignment(Pos.CENTER_RIGHT);
        lblProTaxTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblHoIn = new Label("Home Insurance");
        lblHoIn.setLayoutX(425);
        lblHoIn.setLayoutY(175);
        lblHoIn.setMinWidth(165);
        lblHoIn.setFont(new Font("Calibri", 15));
        lblHoIn.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");


        Label lblHoInMon = new Label();
        lblHoInMon.setLayoutX(618);
        lblHoInMon.setLayoutY(175);
        lblHoInMon.setMinWidth(100);
        lblHoInMon.setFont(new Font("Calibri", 15));
        lblHoInMon.setAlignment(Pos.CENTER_RIGHT);
        lblHoInMon.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblHoInTot = new Label(" ");
        lblHoInTot.setLayoutX(720);
        lblHoInTot.setLayoutY(175);
        lblHoInTot.setMinWidth(100);
        lblHoInTot.setFont(new Font("Calibri", 15));
        lblHoInTot.setAlignment(Pos.CENTER_RIGHT);
        lblHoInTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");


        Label lblHoaFee = new Label("HOA Fee");
        lblHoaFee.setLayoutX(425);
        lblHoaFee.setLayoutY(200);
        lblHoaFee.setMinWidth(165);
        lblHoaFee.setFont(new Font("Calibri", 15));
        lblHoaFee.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");


        Label lblHoaFeeMon = new Label();
        lblHoaFeeMon.setLayoutX(618);
        lblHoaFeeMon.setLayoutY(200);
        lblHoaFeeMon.setMinWidth(100);
        lblHoaFeeMon.setFont(new Font("Calibri", 15));
        lblHoaFeeMon.setAlignment(Pos.CENTER_RIGHT);
        lblHoaFeeMon.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblHoaFeeTot = new Label();
        lblHoaFeeTot.setLayoutX(720);
        lblHoaFeeTot.setLayoutY(200);
        lblHoaFeeTot.setMinWidth(100);
        lblHoaFeeTot.setFont(new Font("Calibri", 15));
        lblHoaFeeTot.setAlignment(Pos.CENTER_RIGHT);
        lblHoaFeeTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblOthCos = new Label("Other Costs");
        lblOthCos.setLayoutX(425);
        lblOthCos.setLayoutY(225);
        lblOthCos.setMinWidth(165);
        lblOthCos.setFont(new Font("Calibri", 15));
        lblOthCos.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");


        Label lblOthCosMon = new Label();
        lblOthCosMon.setLayoutX(618);
        lblOthCosMon.setLayoutY(225);
        lblOthCosMon.setMinWidth(100);
        lblOthCosMon.setFont(new Font("Calibri", 15));
        lblOthCosMon.setAlignment(Pos.CENTER_RIGHT);
        lblOthCosMon.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblOthCosTot = new Label();
        lblOthCosTot.setLayoutX(720);
        lblOthCosTot.setLayoutY(225);
        lblOthCosTot.setMinWidth(100);
        lblOthCosTot.setFont(new Font("Calibri", 15));
        lblOthCosTot.setAlignment(Pos.CENTER_RIGHT);
        lblOthCosTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblTotOut = new Label("Total Out-of-Pocket");
        lblTotOut.setLayoutX(425);
        lblTotOut.setLayoutY(250);
        lblTotOut.setPrefSize(165, 20);
        lblTotOut.setFont(new Font("Calibri", 15));
        lblTotOut.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTotOut.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblTotOutMon = new Label(" ");
        lblTotOutMon.setLayoutX(618);
        lblTotOutMon.setLayoutY(250);
        lblTotOutMon.setPrefSize(100, 20);
        lblTotOutMon.setFont(new Font("Calibri", 15));
        lblTotOutMon.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTotOutMon.setAlignment(Pos.CENTER_RIGHT);
        lblTotOutMon.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblTotOutTot = new Label(" ");
        lblTotOutTot.setLayoutX(720);
        lblTotOutTot.setLayoutY(250);
        lblTotOutTot.setPrefSize(100, 20);
        lblTotOutTot.setFont(new Font("Calibri", 15));
        lblTotOutTot.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblTotOutTot.setAlignment(Pos.CENTER_RIGHT);
        lblTotOutTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblHouPri = new Label("House Price");
        lblHouPri.setLayoutX(425);
        lblHouPri.setLayoutY(300);
        lblHouPri.setPrefSize(295, 20);
        lblHouPri.setFont(new Font("Calibri", 15));
        lblHouPri.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblHouPri.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblHouPriTot = new Label(" ");
        lblHouPriTot.setLayoutX(723);
        lblHouPriTot.setLayoutY(300);
        lblHouPriTot.setPrefSize(98, 20);
        lblHouPriTot.setFont(new Font("Calibri", 15));
        lblHouPriTot.setStyle("-fx-font-weight: bold; -fx-background-color:#e1ebe4;");
        lblHouPriTot.setAlignment(Pos.CENTER_RIGHT);
        lblHouPriTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");


        Label lblLoAm = new Label("Loan Amount");
        lblLoAm.setLayoutX(425);
        lblLoAm.setLayoutY(325);
        lblLoAm.setMinWidth(275);
        lblLoAm.setFont(new Font("Calibri", 15));
        lblLoAm.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblLoAmTot = new Label();
        lblLoAmTot.setLayoutX(723);
        lblLoAmTot.setLayoutY(325);
        lblLoAmTot.setPrefSize(100, 20);
        lblLoAmTot.setFont(new Font("Calibri", 15));
        lblLoAmTot.setAlignment(Pos.CENTER_RIGHT);
        lblLoAmTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblDowPay = new Label("Down Payment");
        lblDowPay.setLayoutX(425);
        lblDowPay.setLayoutY(350);
        lblDowPay.setMinWidth(275);
        lblDowPay.setFont(new Font("Calibri", 15));
        lblDowPay.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblDowPayTot = new Label();
        lblDowPayTot.setLayoutX(723);
        lblDowPayTot.setLayoutY(350);
        lblDowPayTot.setPrefSize(100, 20);
        lblDowPayTot.setFont(new Font("Calibri", 15));
        lblDowPayTot.setAlignment(Pos.CENTER_RIGHT);
        lblDowPayTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblTotMor = new Label("Total of 360 Mortgage Payments");
        lblTotMor.setLayoutX(425);
        lblTotMor.setLayoutY(375);
        lblTotMor.setMinWidth(275);
        lblTotMor.setFont(new Font("Calibri", 15));
        lblTotMor.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblTotMorTot = new Label();
        lblTotMorTot.setLayoutX(723);
        lblTotMorTot.setLayoutY(375);
        lblTotMorTot.setPrefSize(100, 20);
        lblTotMorTot.setFont(new Font("Calibri", 15));
        lblTotMorTot.setAlignment(Pos.CENTER_RIGHT);
        lblTotMorTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblTotInt = new Label("Total Interest");
        lblTotInt.setLayoutX(425);
        lblTotInt.setLayoutY(400);
        lblTotInt.setMinWidth(275);
        lblTotInt.setFont(new Font("Calibri", 15));
        lblTotInt.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblTotIntTot = new Label();
        lblTotIntTot.setLayoutX(723);
        lblTotIntTot.setLayoutY(400);
        lblTotIntTot.setPrefSize(100, 20);
        lblTotIntTot.setFont(new Font("Calibri", 15));
        lblTotIntTot.setAlignment(Pos.CENTER_RIGHT);
        lblTotIntTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblMorPayDat = new Label("Mortgage Payoff Date");
        lblMorPayDat.setLayoutX(425);
        lblMorPayDat.setLayoutY(425);
        lblMorPayDat.setMinWidth(275);
        lblMorPayDat.setFont(new Font("Calibri", 15));
        lblMorPayDat.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        Label lblMorPayDatTot = new Label();
        lblMorPayDatTot.setLayoutX(723);
        lblMorPayDatTot.setLayoutY(425);
        lblMorPayDatTot.setPrefSize(100, 20);
        lblMorPayDatTot.setFont(new Font("Calibri", 15));
        lblMorPayDatTot.setAlignment(Pos.CENTER_RIGHT);
        lblMorPayDatTot.setStyle("-fx-font-weight: bold; -fx-background-color:#EEEEEE;");

        // TextField
        TextField txtHp = new TextField();
        txtHp.setLayoutX(165);
        txtHp.setLayoutY(60);
        txtHp.setPrefWidth(100);

        TextField txtDp = new TextField();
        txtDp.setLayoutX(165);
        txtDp.setLayoutY(100);
        txtDp.setPrefWidth(100);

        ComboBox comboDp = new ComboBox();
        comboDp.setLayoutX(270);
        comboDp.setLayoutY(100);
        comboDp.setPrefWidth(70);
        comboDp.setValue("%");
        comboDp.getItems().addAll("%", "$");
        comboDp.setOnAction(event -> {
            double homePrice = Double.parseDouble(txtHp.getText());
            double downPayment =  Double.parseDouble(txtDp.getText());
            if(comboDp.getValue() == "$"){

                double homePriceValue = (downPayment/100) * homePrice;
                txtDp.setText(String.valueOf(homePriceValue));
            }else {
                double homePriceValue = (downPayment/homePrice) * 100;
                txtDp.setText(String.valueOf(homePriceValue));
            }

        });

        TextField txtLt = new TextField();
        txtLt.setLayoutX(165);
        txtLt.setLayoutY(140);
        txtLt.setPrefWidth(100);

        TextField txtIr = new TextField();
        txtIr.setLayoutX(165);
        txtIr.setLayoutY(180);
        txtIr.setPrefWidth(100);

        ComboBox comboBox = new ComboBox();
        comboBox.setLayoutX(165);
        comboBox.setLayoutY(220);
        comboBox.setValue("Jul");
        final String[] month = {"Jul"};
        comboBox.getItems().addAll("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");

        comboBox.setOnAction(event -> {

            month[0] = (String) comboBox.getValue();
        });

        TextField txtYear = new TextField("2020");
        txtYear.setLayoutX(240);
        txtYear.setLayoutY(220);
        txtYear.setPrefWidth(80);

        TextField txtPt = new TextField();
        txtPt.setLayoutX(165);
        txtPt.setLayoutY(270);
        txtPt.setPrefWidth(100);

        ComboBox comboPt = new ComboBox();
        comboPt.setLayoutX(270);
        comboPt.setLayoutY(270);
        comboPt.setPrefWidth(70);
        comboPt.setValue("%");
        comboPt.getItems().addAll("%", "$");
        comboPt.setOnAction(event -> {
            double homePrice = Double.parseDouble(txtHp.getText());
            double propertyTex =  Double.parseDouble(txtPt.getText());
            if(comboPt.getValue() == "$"){

                double homePriceValue = (propertyTex/100) * homePrice;
                txtPt.setText(String.valueOf(homePriceValue));
            }else {
                double homePriceValue = (propertyTex/homePrice) * 100;
                txtPt.setText(String.valueOf(homePriceValue));
            }

        });

        TextField txtHi = new TextField();
        txtHi.setLayoutX(165);
        txtHi.setLayoutY(310);
        txtHi.setPrefWidth(100);

        ComboBox comboHi = new ComboBox();
        comboHi.setLayoutX(270);
        comboHi.setLayoutY(310);
        comboHi.setPrefWidth(70);
        comboHi.setValue("$");
        comboHi.getItems().addAll("%", "$");
        comboHi.setOnAction(event -> {
            double homePrice = Double.parseDouble(txtHp.getText());
            double homeInsurance =  Double.parseDouble(txtHi.getText());
            if(comboHi.getValue() == "$"){

                double homePriceValue = (homeInsurance/100) * homePrice;
                txtHi.setText(String.valueOf(homePriceValue));
            }else {
                double homePriceValue = (homeInsurance/homePrice) * 100;
                txtHi.setText(String.valueOf(homePriceValue));
            }

        });

        TextField txtPmi = new TextField();
        txtPmi.setLayoutX(165);
        txtPmi.setLayoutY(350);
        txtPmi.setPrefWidth(100);

        ComboBox comboPmi = new ComboBox();
        comboPmi.setLayoutX(270);
        comboPmi.setLayoutY(350);
        comboPmi.setPrefWidth(70);
        comboPmi.setValue("$");
        comboPmi.getItems().addAll("%", "$");
        comboPmi.setOnAction(event -> {
            double homePrice = Double.parseDouble(txtHp.getText());
            double pmiInsurance =  Double.parseDouble(txtPmi.getText());
            if(comboPmi.getValue() == "$"){

                double homePriceValue = (pmiInsurance/100) * homePrice;
                txtPmi.setText(String.valueOf(homePriceValue));
            }else {
                double homePriceValue = (pmiInsurance/homePrice) * 100;
                txtPmi.setText(String.valueOf(homePriceValue));
            }

        });

        TextField txtHoa = new TextField();
        txtHoa.setLayoutX(165);
        txtHoa.setLayoutY(390);
        txtHoa.setPrefWidth(100);

        ComboBox comboHoa = new ComboBox();
        comboHoa.setLayoutX(270);
        comboHoa.setLayoutY(390);
        comboHoa.setPrefWidth(70);
        comboHoa.setValue("%");
        comboHoa.getItems().addAll("%", "$");
        comboHoa.setOnAction(event -> {
            double homePrice = Double.parseDouble(txtHp.getText());
            double hoaFee =  Double.parseDouble(txtHoa.getText());
            if(comboHoa.getValue() == "$"){

                double homePriceValue = (hoaFee/100) * homePrice;
                txtHoa.setText(String.valueOf(homePriceValue));
            }else {
                double homePriceValue = (hoaFee/homePrice) * 100;
                txtHoa.setText(String.valueOf(homePriceValue));
            }

        });


        TextField txtOther = new TextField();
        txtOther.setLayoutX(165);
        txtOther.setLayoutY(430);
        txtOther.setPrefWidth(100);

        ComboBox comboOther = new ComboBox();
        comboOther.setLayoutX(270);
        comboOther.setLayoutY(430);
        comboOther.setPrefWidth(70);
        comboOther.setValue("$");
        comboOther.getItems().addAll("%", "$");
        comboOther.setOnAction(event -> {
            double homePrice = Double.parseDouble(txtHp.getText());
            double otherCost =  Double.parseDouble(txtOther.getText());
            if(comboOther.getValue() == "$"){

                double homePriceValue = (otherCost/100) * homePrice;
                txtOther.setText(String.valueOf(homePriceValue));
            }else {
                double homePriceValue = (otherCost/homePrice) * 100;
                txtOther.setText(String.valueOf(homePriceValue));
            }

        });

        //Button for Calculate
        Button btnCal = new Button("Calculate");
        btnCal.setLayoutX(140);
        btnCal.setLayoutY(490);
        btnCal.setPrefSize(120,30);
        btnCal.setStyle("-fx-font-size:15;-fx-font-color:white; -fx-background-color: #2ABB9B; -fx-font-weight: bold;");

        Alert alertMor = new Alert(Alert.AlertType.CONFIRMATION);
        btnCal.setOnAction(event -> {
            try {

                double homePrice = Double.parseDouble(txtHp.getText());
                double interestRate = Double.parseDouble(txtIr.getText());
                double loanTerm = Double.parseDouble(txtLt.getText());
                double downPay = Double.parseDouble(txtDp.getText());
                if (comboDp.getValue() == "%") {
                    downPay = (downPay / 100) * homePrice;
                }

                double homeInsurance = Double.parseDouble(txtHi.getText());
                if (comboHi.getValue() == "%") {
                    homeInsurance = (homeInsurance / 100) * homePrice;
                }

                double otherCost = Double.parseDouble(txtOther.getText());
                if (comboOther.getValue() == "%") {
                    otherCost = (otherCost / 100) * homePrice;
                }

                double propertyTax = Double.parseDouble(txtPt.getText());
                if (comboPt.getValue() == "%") {
                    propertyTax = (propertyTax / 100) * homePrice;
                }
                double hoaFees = Double.parseDouble(txtHoa.getText());


                double year = Double.parseDouble(txtYear.getText());


                double loanAmount = homePrice - downPay;
                double monthlyPay = ((interestRate / 100) / 12 * loanAmount) / (1 - Math.pow((1 + (interestRate / 100) / 12), -12 * loanTerm));
                double mortgageTotPay = (loanTerm * 12) * monthlyPay;
                double propertyTaxOut = propertyTax / 12;
                double propTaxTot = propertyTaxOut * (loanTerm * 12);
                double homeInsOut = homeInsurance / 12;
                double homInsTot = homeInsOut * (loanTerm * 12);
                double otherCostOut = otherCost / 12;
                double otherTot = otherCostOut * (loanTerm * 12);
                double totalInterest = mortgageTotPay - loanAmount;
                double totM = loanTerm * 12;
                double hoaFeesOut = hoaFees / 12;
                double hoaFeeTot = hoaFeesOut * (loanTerm * 12);
                double outOfMon = monthlyPay + propertyTaxOut + homeInsOut + otherCostOut + hoaFeesOut;
                double outOfTot = mortgageTotPay + propTaxTot + homInsTot + otherTot + hoaFeeTot;
                int date = (int) (year + loanTerm);

                lblMp.setText(String.format("Monthly Pay: $ " + "%.2f", monthlyPay));
                lblHouPriTot.setText(String.format("$" + "%.2f", homePrice)); // House Price
                lblDowPayTot.setText(String.format("$" + "%.2f", downPay));  // Down Payment
                lblLoAmTot.setText(String.format("$" + "%.2f", loanAmount)); // Loan Amount
                lblMorPayMon.setText(String.format("$" + "%.2f", monthlyPay)); // Mortgage Monthly Pay
                lblMorPayTot.setText(String.format("$" + "%.2f", mortgageTotPay)); // Total Mortgage Pay
                lblProTaxMon.setText(String.format("$" + "%.2f", propertyTaxOut)); // Month Property Tax
                lblProTaxTot.setText(String.format("$" + "%.2f", propTaxTot)); // Total Property Tax
                lblHoInMon.setText(String.format("$" + "%.2f", homeInsOut)); // Monthly Home Insurance
                lblHoInTot.setText(String.format("$" + "%.2f", homInsTot)); // Total Home Insurance
                lblOthCosMon.setText(String.format("$" + "%.2f", otherCostOut)); // Monthly Other Cost
                lblOthCosTot.setText(String.format("$" + "%.2f", otherTot)); // Total other Cost
                lblTotIntTot.setText(String.format("$" + "%.2f", totalInterest)); // Total Interest
                lblTotMorTot.setText(String.format("$" + "%.2f", mortgageTotPay)); // Total of Mor
                lblTotMor.setText(String.format("Total of " + (int) totM + " Mortgage Payments"));
                lblTotOutMon.setText(String.format("$" + "%.2f", outOfMon));
                lblTotOutTot.setText(String.format("$" + "%.2f", outOfTot));
                lblHoaFeeMon.setText(String.format("$" + "%.2f", hoaFeesOut));
                lblHoaFeeTot.setText(String.format("$" + "%.2f", hoaFeeTot));
                lblMorPayDatTot.setText(month[0] + " " + date);
            }catch (Exception exception){
                alertMor.setAlertType(Alert.AlertType.CONFIRMATION);
                alertMor.setHeaderText("Please Enter Valid Integer Value");
                alertMor.show();
            }
        });




        AnchorPane ancMor = new AnchorPane();
        ancMor.setPrefSize(1000,500);
        ancMor.getChildren().addAll(lblHp, lblDp, lblLt, lblYear, lblIr,txtYear, lblSd, lblPt, lblHi, lblPmi, lblHoa, lblOther,
                txtHp, txtDp, comboDp, txtLt, txtIr, comboBox, txtPt, txtHi, txtPmi, txtHoa, txtOther, comboHi,
                comboHoa, comboOther, comboPmi, comboPt, lblAnnual, btnCal,
                lblMp, lblMon, lblTot, lblMorPay, lblMorPayMon, lblMorPayTot, lblPro, lblProTaxMon, lblProTaxTot, lblHoIn, lblHoInMon,
                lblHoInTot, lblHoaFee, lblHoaFeeMon, lblHoaFeeTot, lblOthCos, lblOthCosMon, lblOthCosTot, lblTotOut, lblTotOutMon, lblTotOutTot,
                lblHouPri, lblHouPriTot, lblLoAm, lblLoAmTot, lblDowPay, lblDowPayTot, lblTotMor, lblTotMorTot, lblTotInt, lblTotIntTot,
                lblMorPayDat, lblMorPayDatTot);

        // Keyboard for finance Calculator
        // Keyboard for finance Calculator
        VBox keyBord = new VBox();
        keyBord.setPrefSize(200, 280);
        keyBord.setLayoutX(900);
        keyBord.setLayoutY(40);

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
        anc.getChildren().addAll(ancMor,keyBord,btnBack,btnClose);           // exit,help,vbox
        anc.setPrefSize(1200,600);
        anc.setStyle("-fx-background-color:#6C7A89;");
        Scene sc = new Scene(anc);
        stgMortgage.setScene(sc);
        stgMortgage.show();
    }
}

