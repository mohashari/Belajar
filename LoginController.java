package workshop.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import workshop.main.MainLogin;

public class LoginController implements Initializable {

	private MainLogin mainLogin;	
	
	@FXML
	private TextField userNameTxt;
	
	@FXML
	private TextField passwordTxt;
	
	
	@FXML
	private Button buttonLogin;

		
	
	
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		// TODO Auto-generated method stub
		
	}
	public void onLogin(){
	
		
		if(userNameTxt.getText().equals("ashari") && passwordTxt.getText().equals("ashari")){
			this.mainLogin.getPrimaryStage().setScene(this.mainLogin.getHomeScene());
		}
		
		}
		public void setMainLogin(MainLogin mainLogin){
			this.mainLogin = mainLogin; 
		}

	}
