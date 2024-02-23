package ua.fam.homeworks;

public class homework5 {

    public static void main(String[] args) {

        int warriorsLi = 13;
        int archersLi = 24;
        int horsemenLi = 46;

        int warriorsMin = 9;
        int archersMin = 35;
        int horsemenMin = 12;

        int armyLi = 860;
        int armyMin = (int) (1.5 * 860);

        int totalAttackLi = armyLi * (warriorsLi + archersLi + horsemenLi);
        int totalAttackMin = armyMin * (warriorsMin + archersMin + horsemenMin);

        System.out.println("Total Attack of Dynasty Li - " + totalAttackLi);
        System.out.println("Total Attack of Dynasty Min - " + totalAttackMin);
    }
}
