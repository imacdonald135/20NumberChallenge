package seng201.tut2;

import java.util.*;
import java.util.function.Consumer;

public class GameEnvironment {

    private final Consumer<GameEnvironment> setupScreenLauncher;
    private final Consumer<GameEnvironment> mainScreenLauncher;
    private ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
    private final Runnable clearScreen;

    private int currentNumber;

    private boolean needsToPickSlot;

    private int amountOfNumbers;

    private int currentScore = 0;

    private int bestScore = 0;


    public GameEnvironment(Consumer<GameEnvironment> setupScreenLauncher, Consumer<GameEnvironment> mainScreenLauncher, Runnable clearScreen){

        this.mainScreenLauncher = mainScreenLauncher;
        this.setupScreenLauncher = setupScreenLauncher;
        this.clearScreen = clearScreen;
        launchMainScreen();

    }

    public void launchSetupScreen(){

        setupScreenLauncher.accept(this);

    }

    /**
     * Launcher for main screen.
     */
    public void launchMainScreen(){

        mainScreenLauncher.accept(this);

    }

    public void closeSetupScreen(){

        clearScreen.run();

    }

    /**
     * Closes main screen.
     */
    public void closeMainScreen(){

        clearScreen.run();

    }

    public void setCurrentNumber(int i){

        currentNumber = i;

    }

    public int getCurrentNumber(){

        return currentNumber;

    }

    public void setNeedsToPickSlot(boolean b){

        needsToPickSlot = b;

    }

    public boolean getNeedsToPickSlot(){

        return needsToPickSlot;

    }

    public int getRandomNum(){

        Random random = new Random();
        int num = random.nextInt(1000);
        while ((numbers.contains(num))) {
            num = random.nextInt(1000);
        }
        return num;

    }

    public ArrayList<Integer> getNumbers(){

        return numbers;

    }

    public void resetNumbers(){

        numbers = new ArrayList<>(Arrays.asList(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
        currentScore = 0;
    }

    public boolean isSorted(ArrayList<Integer> someNums){

        if (someNums == null || someNums.size() < 2) {
            return true; // A null or single element list is considered in order
        }

        Integer previous = null;
        for (Integer current : someNums) {
            if (current != null) {
                if (previous != null && current < previous) {
                    return false; // The list is not in order
                }
                previous = current;
            }
        }
        return true; // The list is in order

    }

    public boolean insertNumber(int slotNum){

        ArrayList<Integer> numbersCopy = new ArrayList<>(numbers);
        numbersCopy.set(slotNum-1, currentNumber);
        if (isSorted(numbersCopy)){
            numbers.set(slotNum-1, currentNumber);
            currentScore ++;
            if (currentScore >= bestScore){
                bestScore = currentScore;
            }
            return true;
        }
        return false;

    }

    public int getCurrentScore(){

        return currentScore;

    }

    public int getBestScore(){

        return bestScore;

    }

    public boolean gameWon(){
        for (int i = 0; i < 20; i++){
            if (numbers.get(i)==null){
                return false;
            }
        }
        return true;
    }

    public boolean couldInsertNumber(int slotNum, int value){

        ArrayList<Integer> numbersCopy = new ArrayList<>(numbers);
        numbersCopy.set(slotNum-1, value);
        //System.out.println(numbersCopy);
        return isSorted(numbersCopy);

    }

    public boolean gameLost(int value){
        System.out.println(numbers);
        for (int i = 1; i < 21; i++) {
            if (numbers.get(i-1) == null) {
                if(couldInsertNumber(i, value)){
                    System.out.println(i);
                    return false;
                }
            }
        }
        return true;
    }


}
