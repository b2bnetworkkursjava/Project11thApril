package pl.agatadziubala.domain;

import lombok.Getter;

@Getter
public enum PositionOfField {

    GOALKEEPER("goalkeeper", 1),
    ATTACKER("attacker", 2),
    DEFENDER("defender", 3);

    private String name;
    private int noOfSectionField;

    PositionOfField(String name, int noOfSectionField) {
        this.name = name;
        this.noOfSectionField = noOfSectionField;
    }


}
