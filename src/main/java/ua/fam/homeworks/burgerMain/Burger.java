package ua.fam.homeworks.burgerMain;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String veggies;
    String mayo;

    public Burger(String bun, String meat, String cheese, String veggies, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        displayIngredients();
    }

    public Burger(String bun, String meat, String cheese, String veggies) {
        this(bun, meat, cheese, veggies, "без майонезу");
    }

    public Burger(String bun, String meat, String cheese, String veggies, boolean doubleMeat) {
        this(bun, doubleMeat ? meat + ", подвійне м'ясо" : meat, cheese, veggies);
    }

    private void displayIngredients() {
        System.out.println("Склад бургера:");
        System.out.println("Булочка: " + bun);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + veggies);
        System.out.println("Майонез: " + mayo);
        System.out.println();
    }
}

