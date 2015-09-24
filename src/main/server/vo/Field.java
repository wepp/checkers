package main.server.vo;

import java.util.List;

/**
 * Created by Isaiev on 24.09.2015.
 */
public class Field {
    List<Check> allChecks;

    public Field() {
    }

    public List<Check> getAllChecks() {
        return allChecks;
    }

    protected void setAllChecks(List<Check> allChecks) {
        this.allChecks = allChecks;
    }
}
