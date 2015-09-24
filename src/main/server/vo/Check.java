package main.server.vo;

/**
 * Created by Isaiev on 24.09.2015.
 */
public class Check {

    private Position position;
    private boolean isWhite;
    private boolean isQueen = false;

    protected Check(Position position, boolean isWhite) {
        this.position = position;
        this.isWhite = isWhite;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isWhite() {
        return isWhite;
    }

    protected void setPosition(Position position) {
        this.position = position;
    }

    public boolean isQueen() {
        return isQueen;
    }

    protected void setIsQueen(boolean isQueen) {
        this.isQueen = isQueen;
    }
}
