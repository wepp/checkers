package main.server.vo;

import java.util.List;

/**
 * Created by Isaiev on 24.09.2015.
 */
public class Step {

    private Check check;
    private List<Position> positionAfteMove;

    public Step(Check check, List<Position> positionAfteMove) {
        this.check = check;
        this.positionAfteMove = positionAfteMove;
    }

    public Check getCheck() {
        return check;
    }

    public List<Position> getPositionAfteMove() {
        return positionAfteMove;
    }
}
