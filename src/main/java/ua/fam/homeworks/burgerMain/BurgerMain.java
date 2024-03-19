package ua.fam.homeworks.burgerMain;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("Булка з насінням", "Рибне філе", "Сир Чеддер", "Помідор", "Майонез");
        Burger dietBurger = new Burger("Булка без глютену", "Куряче філе", "Сир моцарелла", "Листя салату");
        Burger doubleMeatBurger = new Burger("Біг Мак", "Яловичина", "Сир Чеддер", "Цибуля", false);
    }
}


