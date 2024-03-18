package ua.fam.homeworks.burgerMain;

public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("Створюємо бургери:");
        System.out.println("===================");

        Burger regularBurger = new Burger("Картопляна", "Яловичина", "Чеддер", "Помідор", true);
        Burger dietBurger = new Burger("Пшенична", "Курка", "Бринза", "Огірок", false);
        Burger doubleMeatBurger = new Burger("Ржана", "Свинина", "Моцарелла", "Цибуля", true);
    }
}

