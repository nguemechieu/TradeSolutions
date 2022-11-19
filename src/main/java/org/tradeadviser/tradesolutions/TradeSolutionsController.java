package org.tradeadviser.tradesolutions;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class TradeSolutionsController   implements Initializable {
    public TextField emailId;
    public TextField firstnameId;
    public TextField lastnameId;
    public TextField middleNameId;
    public Label dLbl;
    public Button cancelId;
    public Button registerId;
    Stage tradeSolutionsStage;
    Scene tradeSolutionsScene;
    Users users;



    @FXML
private     TextField usernameId;

    public void getUsername() {
        if(!usernameId.isVisible()) {
           users.setUsername( usernameId.getText());
        }
    }
    @FXML
   private PasswordField passId;
    public void getPassWord()  {
        if(!passId.isVisible()) {
           users.setPassword( passId.getText());
        }



    }
    @FXML
  private   CheckBox rememberId;

    public void getRememberMe() {
        if(!rememberId.isSelected()) {
           users.RememberMe(rememberId.isSelected());
        }

    }

    @FXML
  private   Hyperlink ForgotPasswordId;
    public void getForgotPasswordId() {
        if(!ForgotPasswordId.isVisited()) {
            FXMLLoader fxmlLoader = new FXMLLoader(TradeSolutions.class.getResource("ForgotPassword.fxml"));
            try {

                tradeSolutionsScene.getWindow().getOnCloseRequest();
                tradeSolutionsStage =new Stage( );
                tradeSolutionsScene = new Scene(fxmlLoader.load(), 1540, 780);
                tradeSolutionsStage.setTitle("Forgot Password");
                tradeSolutionsStage.setScene(tradeSolutionsScene);
                tradeSolutionsStage.show();
                users = new Users();
                users.setUsername(usernameId.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    @FXML
    Button createAccount;
    public void getCreateAccount() {
        if(!createAccount.isDefaultButton()) {
            FXMLLoader fxmlLoader = new FXMLLoader(TradeSolutions.class.getResource("CreateAccount.fxml"));
              try {
                   tradeSolutionsStage =new Stage();
                tradeSolutionsScene = new Scene(fxmlLoader.load(), 1540, 780);
                tradeSolutionsStage.setTitle("Registration");
                tradeSolutionsStage.setScene(tradeSolutionsScene);
                tradeSolutionsStage.show();


                users = new Users();
                users.setUsername(usernameId.getText());


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
@FXML private Button loginBtn;
    public void getLogin() {
        if (!loginBtn.isDefaultButton()) {

                FXMLLoader fxmlLoader = new FXMLLoader(TradeSolutions.class.getResource("Welcome.fxml"));
                try {

                    tradeSolutionsStage= new Stage();
                    tradeSolutionsScene = new Scene(fxmlLoader.load(), 1540, 780);
                    tradeSolutionsStage.setTitle("Welcome to Trade Solution");
                    tradeSolutionsStage.setScene(tradeSolutionsScene);
                    tradeSolutionsStage.show();
                    users = new Users();
                    users.setUsername(usernameId.getText());


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }



//        System.out.println(" Login failed");
        }}


    private final Polygon polygon = new Polygon();
    private int numberOfSides = 3;

    private void paint() {
        ObservableList<Double> list = polygon.getPoints();
        list.clear();
        final double WIDTH = 400, HEIGHT = 400;
        double centerX = WIDTH / 4, centerY = HEIGHT / 4;
        double radius = Math.min(WIDTH, HEIGHT) * 0.4;

        // Add points to the polygon list
        for (int i = 0; i < numberOfSides; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / numberOfSides));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / numberOfSides));
        }
    }


    public void regularPolygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;

        BorderPane  borderPane = new BorderPane();


        polygon.setTranslateX(borderPane.getWidth()+170);
        polygon.setTranslateY(borderPane.getHeight()+70);

        borderPane.getChildren().add(polygon);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLUE);
        paint();

    }




    private void volumeDecrease() {
        numberOfSides--;
        paint();
        isLabel();
    }

    private void volumeIncrease() {

        numberOfSides++;
        paint();
        isLabel();

    }




    public void initialize(URL url, ResourceBundle resourceBundle) {
        regularPolygon(numberOfSides);//Calling regularPolygon Method to create new polygon


        volumeDecrease();
        volumeIncrease();

    }









    @FXML private  Label label;
    public void isLabel() {
        if(numberOfSides==1){
            label.setText("Minimal size reached!");
        }else if(numberOfSides>=15) {
            label.setText("Maximum size reached");
        }
    }


    public void getEmail(ActionEvent event) {
    }

    public void getPassword(ActionEvent event) {
    }

    public void getMiddlenameId(ActionEvent event) {
    }

    public void getFirstname(ActionEvent event) {
    }

    public void getLastname(ActionEvent event) {
    }

    public void getRegister(ActionEvent event) {
    }
}

