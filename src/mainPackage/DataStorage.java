package mainPackage;
import java.io.Serializable;

public class DataStorage implements Serializable{
    String playerName, playerDialogue, nextStoryDialogue, playerQuestion;
    int playerCP, playerXP, dialogueTracker, questionTracker, playermaxCP;
}
