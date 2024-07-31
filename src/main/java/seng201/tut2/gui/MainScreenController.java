package seng201.tut2.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import seng201.tut2.GameEnvironment;

import java.util.ArrayList;
import java.util.Arrays;

public class MainScreenController {

    private final GameEnvironment gameEnvironment;

    @FXML
    Button slot1;
    @FXML
    Button slot2;
    @FXML
    Button slot3;
    @FXML
    Button slot4;
    @FXML
    Button slot5;
    @FXML
    Button slot6;
    @FXML
    Button slot7;
    @FXML
    Button slot8;
    @FXML
    Button slot9;
    @FXML
    Button slot10;
    @FXML
    Button slot11;
    @FXML
    Button slot12;
    @FXML
    Button slot13;
    @FXML
    Button slot14;
    @FXML
    Button slot15;
    @FXML
    Button slot16;
    @FXML
    Button slot17;
    @FXML
    Button slot18;
    @FXML
    Button slot19;
    @FXML
    Button slot20;
    @FXML
    Label numberLabel;
    @FXML
    Button generateButton;
    @FXML
    Button resetButton;
    @FXML
    Label lostLable;
    @FXML
    Label lostLabel1;
    @FXML
    Label winLabel1;
    @FXML
    Label winLabel2;
    @FXML
    Label currentScoreLabel;
    @FXML
    Label bestScoreLabel;

    /**
     * The constructor for the SetupController, takes a game environment as a parameter.
     * @param g the game environment.
     */
    public MainScreenController(GameEnvironment g){

        gameEnvironment = g;

    }

    public void initialize(){

        updateValues();
        int number = gameEnvironment.getRandomNum();
        gameEnvironment.setCurrentNumber(number);
        numberLabel.setText("You next number is: "+number);
        gameEnvironment.setNeedsToPickSlot(true);
        generateButton.setDisable(true);
        winLabel1.setOpacity(0);
        winLabel2.setOpacity(0);
        lostLable.setOpacity(0);
        lostLabel1.setOpacity(0);
        resetButton.setDisable(true);
        resetButton.setOpacity(0);
        lostLable.setDisable(true);
        lostLabel1.setDisable(true);

    }

    public void gameWon(){
        winLabel2.setOpacity(100);
        winLabel1.setOpacity(100);
        numberLabel.setOpacity(0);
        lostLabel1.setOpacity(100);
        resetButton.setOpacity(100);
        resetButton.setDisable(false);
    }

    public void onResetClicked(){

        gameEnvironment.resetNumbers();
        int number = gameEnvironment.getRandomNum();
        gameEnvironment.setCurrentNumber(number);
        numberLabel.setText("You next number is: "+number);
        numberLabel.setOpacity(100);
        gameEnvironment.setNeedsToPickSlot(true);
        generateButton.setDisable(true);
        updateValues();
        lostLable.setOpacity(0);
        lostLabel1.setOpacity(0);
        resetButton.setDisable(true);
        resetButton.setOpacity(0);
        lostLable.setDisable(true);
        lostLabel1.setDisable(true);
        winLabel2.setOpacity(0);
        winLabel1.setOpacity(0);

    }

    public void updateValues(){

        ArrayList<Button> slotButtons = new ArrayList<>(Arrays.asList(slot1, slot2, slot3, slot4, slot5, slot6, slot7, slot8, slot9, slot10, slot11, slot12, slot13, slot14, slot15, slot16, slot17, slot18, slot19, slot20));
        for (int i = 0; i < 20; i++){
            if (gameEnvironment.getNumbers().get(i)==null){
                slotButtons.get(i).setText("");
            } else {
                slotButtons.get(i).setText("" + gameEnvironment.getNumbers().get(i));
            }
        }
        currentScoreLabel.setText(""+gameEnvironment.getCurrentScore());
        bestScoreLabel.setText(""+gameEnvironment.getBestScore());

    }

    public void slotSelected1(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(1);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected2(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(2);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected3(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(3);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected4(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(4);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected5(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(5);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected6(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(6);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected7(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(7);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected8(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(8);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected9(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(9);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected10(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(10);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected11(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(11);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected12(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(12);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected13(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(13);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected14(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(14);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected15(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(15);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected16(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(16);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected17(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(17);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected18(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(18);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected19(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(19);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void slotSelected20(){

        if(gameEnvironment.getNeedsToPickSlot()) {

            boolean goodSlot = gameEnvironment.insertNumber(20);

            if (goodSlot) {

                generateButton.setDisable(false);
                gameEnvironment.setNeedsToPickSlot(false);
                updateValues();
                if (gameEnvironment.gameWon()){
                    gameWon();
                }

            }

        }

    }

    public void onGenerateButtonPressed(){

        int number = gameEnvironment.getRandomNum();
        gameEnvironment.setCurrentNumber(number);
        numberLabel.setText("Your next number is: "+gameEnvironment.getCurrentNumber());
        gameEnvironment.setNeedsToPickSlot(true);
        generateButton.setDisable(true);
        if (gameEnvironment.gameLost(number)){
            lostLable.setDisable(false);
            lostLabel1.setDisable(false);
            resetButton.setDisable(false);
            resetButton.setOpacity(100);
            lostLabel1.setOpacity(100);
            lostLable.setOpacity(100);
        }

    }

}
