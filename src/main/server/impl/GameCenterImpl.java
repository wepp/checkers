package main.server.impl;

import main.server.GameCenter;
import main.server.vo.Field;
import main.server.vo.Step;

/**
 * Created by Isaiev on 24.09.2015.
 */
public class GameCenterImpl implements GameCenter {

    private Field currentField;
    private boolean isWhitesTurn;
    private static GameCenterImpl gameCenter = new GameCenterImpl();

    private GameCenterImpl(){
        fillField();
    }

    @Override
    public GameCenter getGameCenter() {
        return gameCenter;
    }

    @Override
    public Field getField() {
        return currentField;
    }

    @Override
    public void setNextStep(Step nextStep) {
        if(validateStep(nextStep)) {
            currentField = calculateNextField(nextStep);
            isWhitesTurn = !isWhitesTurn;
        }else{
            sendError("Not valid step");
        }
    }



    private String sendError(String error){return error;};

    private boolean validateStep(Step nextStep){return false;};

    private Field calculateNextField(Step nextStep){return null;};

    private boolean isUserWin(Field currentField){return false;};

    private void fillField(){};
}
