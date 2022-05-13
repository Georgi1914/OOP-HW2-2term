package Soldier;

import Modifiers.IModifier;

import java.util.List;
import java.util.Vector;

public class Soldier {
    String name;
    String attack_type; //0 - melee; 1 - ranged
    int CurrHp;
    int MaxHP;
    int Attack;
    int MeleeDefense;
    int RangeDefence;
    Vector<String> tags;
    List<IModifier> modifiers;

    public Soldier(String name, int CurrHp, int Attack, int MeleeDefense, int RangeDefence, String attack_type) {
        this.name = name;
        this.CurrHp = CurrHp;
        this.MaxHP = CurrHp;
        this.Attack = Attack;
        this.MeleeDefense = MeleeDefense;
        this.RangeDefence = RangeDefence;
        this.attack_type = attack_type;
    }

    public void addModifier(IModifier modifier){
        //TODO after adding Modifier class
    }

    Soldier chooseTarget(List<Soldier> enemies){
        return null; //TODO
    }

    int getDamageAgainst(Soldier enemy){
        return 0; //TODO
    }

    int getDamageFrom(Soldier enemy, int value, Boolean type){
        return 0; //TODO
    }

    void receiveAttack(Soldier enemy, int value, Boolean type){
        //TODO
    }

    //TODO after adding Modifier fix getters
    public int getCurrHp() {
        return CurrHp;
    }

    public int getMaxHP() {
        return MaxHP;
    }

    public int getAttack() {
        return Attack;
    }

    public int getMeleeDefense() {
        return MeleeDefense;
    }

    public int getRangeDefence() {
        return RangeDefence;
    }


    @Override
    public String toString() {
        return name +
                "   HP:" + CurrHp + "/" + MaxHP +
                "   ATK:" + Attack + //TODO add modifier attack
                "   DEF:" + MeleeDefense + "/" + RangeDefence + //TODO add modifier defenses
                "Modifiers:"; // TODO add modifier stats
    }
}

