package Modifiers;

import Soldier.Soldier;

public class Attribute {
    String attr_name;
    int value;

    public Attribute(String attr_name, int value) {
        this.attr_name = attr_name;
        this.value = value;
    }

    void addModifierToSoldier(Soldier soldier){
        switch (this.attr_name){
            case "MaxHP":

            case "Attack":
            case "MeleeDefense":
            case "RangeDefence":
        }
    }
}
