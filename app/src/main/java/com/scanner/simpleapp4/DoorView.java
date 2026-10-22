package com.scanner.simpleapp4;

import androidx.lifecycle.ViewModel;

import java.util.Random;
public class DoorView extends ViewModel {
    private final Random random = new Random();

    private int win = 0;
    private int lose = 0;
    private int winningDoor;
    private String resultText = "Pick a door!";

    public DoorView() {
        winningDoor = random.nextInt(3) + 1;
    }

    public void choose(int chosenDoor) {
        if (chosenDoor == winningDoor) {
            win++;
            resultText = "You win!!!";
        } else {
            lose++;
            resultText = "You lose!!! the correct door was Door " + winningDoor;
        }
        // Pick a new winning door so the game can be replayed
        winningDoor = random.nextInt(3) + 1;
    }

    public int getWin() { return win; }
    public int getLose() { return lose; }
    public String getResultText() { return resultText; }

}
