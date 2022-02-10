package com.ejemplos.tareaMoverCirculo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class PrimaryController implements Initializable {

	// tope Y Arriba = 25
	// tope Y abajo=425
	@FXML
	private Circle circle;

	/*private void moverAbajo(ActionEvent event) {

		if (circle.getLayoutY() != 420) {
			Timeline timeLine = new Timeline();

			timeLine.getKeyFrames()
					.add(new KeyFrame(Duration.millis(1530), new KeyValue(circle.layoutYProperty(), 200)));
			timeLine.getKeyFrames()
					.add(new KeyFrame(Duration.millis(2070), new KeyValue(circle.layoutYProperty(), 420)));

			timeLine.play();
		}

	}*/

	@FXML
	private void moverArriba(ActionEvent event) {
		if (circle.getLayoutY() != 30) {

			circle.setLayoutX(30);
		}

		Timeline timeLine1 = new Timeline();
		timeLine1.getKeyFrames().add(new KeyFrame(Duration.millis(1530), new KeyValue(circle.layoutYProperty(), 70)));
		timeLine1.getKeyFrames().add(new KeyFrame(Duration.millis(2070), new KeyValue(circle.layoutYProperty(), 25)));

		timeLine1.getKeyFrames().add(new KeyFrame(Duration.millis(2070), new KeyValue(circle.layoutXProperty(), 120)));
		///////////
		Timeline timeLine2 = new Timeline();
		timeLine2.getKeyFrames().add(new KeyFrame(Duration.millis(1530), new KeyValue(circle.layoutYProperty(), 200)));
		timeLine2.getKeyFrames().add(new KeyFrame(Duration.millis(2070), new KeyValue(circle.layoutYProperty(), 420)));

		timeLine2.getKeyFrames().add(new KeyFrame(Duration.millis(2070), new KeyValue(circle.layoutXProperty(), 204)));

		SequentialTransition sq = new SequentialTransition(timeLine1, timeLine2);
		sq.play();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
}
