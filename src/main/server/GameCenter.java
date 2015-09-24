package main.server;

import main.server.vo.Field;
import main.server.vo.Step;

/**
 * Created by Isaiev on 24.09.2015.
 */
public interface GameCenter {

    Field getField ();
    void setNextStep(Step nextStep);
    GameCenter getGameCenter();

}
