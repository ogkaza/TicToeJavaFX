package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {
	@FXML
	public Button b1;
	@FXML
	public Button b2;
	@FXML
	public Button b3;
	@FXML
	public Button b4;
	@FXML
	public Button b5;
	@FXML
	public Button b6;
	@FXML
	public Button b7;
	@FXML
	public Button b8;
	@FXML
	public Button b9;
	@FXML
	public Button bRes;
	@FXML
	public Label myText;
	
	int counter = 0;
	char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	
	public void click1(ActionEvent actionEvent) {
		if(board[0][0] == ' ' && !isWin()) {
			b1.setText(isHonest(counter));
	        board[0][0] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public void click2(ActionEvent actionEvent) {
		if(board[0][1] == ' ' && !isWin()) {
			b2.setText(isHonest(counter));
	        board[0][1] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public void click3(ActionEvent actionEvent) {
		if(board[0][2] == ' ' && !isWin()) {
			b3.setText(isHonest(counter));
	        board[0][2] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public void click4(ActionEvent actionEvent) {
		if(board[1][0] == ' ' && !isWin()) {
			b4.setText(isHonest(counter));
	        board[1][0] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public void click5(ActionEvent actionEvent) {
		if(board[1][1] == ' ' && !isWin()) {
			b5.setText(isHonest(counter));
	        board[1][1] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public void click6(ActionEvent actionEvent) {
		if(board[1][2] == ' ' && !isWin()) {
			b6.setText(isHonest(counter));
	        board[1][2] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public void click7(ActionEvent actionEvent) {
		if(board[2][0] == ' ' && !isWin()) {
			b7.setText(isHonest(counter));
	        board[2][0] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public void click8(ActionEvent actionEvent) {
		if(board[2][1] == ' ' && !isWin()) {
			b8.setText(isHonest(counter));
	        board[2][1] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public void click9(ActionEvent actionEvent) {
		if(board[2][2] == ' ' && !isWin()) {
			b9.setText(isHonest(counter));
	        board[2][2] = isHonest(counter).charAt(0);
	        isWin();
	        changePlayerTurn();
	        counter++;
		}
    }
	
	public String isHonest(int counter) {
		if(counter % 2 == 0) {
			return "X";
		} else {
			return "O";
		}
	}
	
	public void changePlayerTurn() {

		if((counter % 2 != 0) && !(counter > 7)) {
			myText.setText("Ход игрока X");
			if(isWin()) {
				myText.setText("Победа игрока O");
			}
		} else if((counter % 2 == 0) && !(counter > 7)) {
			myText.setText("Ход игрока O");
			if(isWin()) {
				myText.setText("Победа игрока X");
			}
		} else {
			myText.setText("Ничья");
		}
	}
	
	public void reset(ActionEvent actionEvent) {
		b1.setText(" ");
		b1.setStyle(null);
		b2.setText(" ");
		b2.setStyle(null);
		b3.setText(" ");
		b3.setStyle(null);
		b4.setText(" ");
		b4.setStyle(null);
		b5.setText(" ");
		b5.setStyle(null);
		b6.setText(" ");
		b6.setStyle(null);
		b7.setText(" ");
		b7.setStyle(null);
		b8.setText(" ");
		b8.setStyle(null);
		b9.setText(" ");
		b9.setStyle(null);
		counter = 0;
		myText.setText("Ход игрока X");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	public boolean isWin() {
		if((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') || (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')) {
			b1.setStyle("-fx-background-color: #98FB98");
			b2.setStyle("-fx-background-color: #98FB98");
			b3.setStyle("-fx-background-color: #98FB98");
			return true;
		} else if((board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') || (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')) {
			b4.setStyle("-fx-background-color: #98FB98");
			b5.setStyle("-fx-background-color: #98FB98");
			b6.setStyle("-fx-background-color: #98FB98");
			return true;
		} else if((board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') || (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')) {
			b7.setStyle("-fx-background-color: #98FB98");
			b8.setStyle("-fx-background-color: #98FB98");
			b9.setStyle("-fx-background-color: #98FB98");
			return true;
		} else if((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') || (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')) {
			b1.setStyle("-fx-background-color: #98FB98");
			b4.setStyle("-fx-background-color: #98FB98");
			b7.setStyle("-fx-background-color: #98FB98");
			return true;
		} else if((board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')) {
			b2.setStyle("-fx-background-color: #98FB98");
			b5.setStyle("-fx-background-color: #98FB98");
			b8.setStyle("-fx-background-color: #98FB98");
			return true;
		} else if((board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') || (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')) {
			b3.setStyle("-fx-background-color: #98FB98");
			b6.setStyle("-fx-background-color: #98FB98");
			b9.setStyle("-fx-background-color: #98FB98");
			return true;
		} else if((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')) {
			b1.setStyle("-fx-background-color: #98FB98");
			b5.setStyle("-fx-background-color: #98FB98");
			b9.setStyle("-fx-background-color: #98FB98");
			return true;
		} else if((board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') || (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {
			b3.setStyle("-fx-background-color: #98FB98");
			b5.setStyle("-fx-background-color: #98FB98");
			b7.setStyle("-fx-background-color: #98FB98");
			return true;
		} else {
			return false;
		}
	}
}
