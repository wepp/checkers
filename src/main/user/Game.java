package main.user;

import main.server.vo.Field;
import main.server.vo.Step;

/**
 * Created by Isaiev on 24.09.2015.
 */
public interface Game {

    Step calculateNextStep(Field currentField);

}
