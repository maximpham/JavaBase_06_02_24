package ua.fam.homeworks;
class Burger {
    String bun;
    String meat;
    String cheese;
    String veggies;
    boolean mayo;

    public Burger(String bun, String meat, String cheese, String veggies, boolean mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;

        System.out.println("Бургер складається з:");
        System.out.println("Булочка: " + this.bun);
        System.out.println("М'ясо: " + this.meat);
        System.out.println("Сир: " + this.cheese);
        System.out.println("Зелень: " + this.veggies);
        if (this.mayo) {
            System.out.println("Майонез: Є");
        } else {
            System.out.println("Майонез: Немає");
        }
        System.out.println();
    }
}

public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("Створюємо бургери:");
        System.out.println("===================");

        Burger regularBurger = new Burger("Картопляна", "Яловичина", "Чеддер", "Помідор", true);
        Burger dietBurger = new Burger("Пшенична", "Курка", "Бринза", "Огірок", false);
        Burger doubleMeatBurger = new Burger("Ржана", "Свинина", "Моцарелла", "Цибуля", true);
    }
}

