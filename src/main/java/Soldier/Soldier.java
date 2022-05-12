package Soldier;

import java.util.List;
import java.util.Vector;

public class Soldier {
    String name;
    Boolean attack_type; //0 - melee; 1 - ranged
    int current_health;
    int max_health;
    int attack_points;
    int defense_melee;
    int defense_ranged;
    Vector<String> tags;
    List<Modifier> modifiers;

    public Soldier(String name, int current_health, int attack_points, int defense_melee, int defense_ranged, Boolean attack_type) {
        this.name = name;
        this.current_health = current_health;
        this.max_health = current_health;
        this.attack_points = attack_points;
        this.defense_melee = defense_melee;
        this.defense_ranged = defense_ranged;
        this.attack_type = attack_type;
    }

    void addModifier(Modifier modifier){
        //TODO after adding Modifier class
    }

    public int getCurrent_health() {
        return current_health;
    }

    public int getMax_health() {
        return max_health;
    }

    public int getAttack_points() {
        return attack_points;
    }

    public int getDefense_melee() {
        return defense_melee;
    }

    public int getDefense_ranged() {
        return defense_ranged;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", attack_type=" + attack_type +
                ", current_health=" + current_health +
                ", max_health=" + max_health +
                ", attack_points=" + attack_points +
                ", defense_melee=" + defense_melee +
                ", defense_ranged=" + defense_ranged +
                ", tags=" + tags +
                ", modifiers=" + modifiers +
                '}';
    }
}

