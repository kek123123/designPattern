package main.ex.ex9.before;

public class Coffee {
    private String type;
    private boolean milk;
    private boolean sugar;
    private boolean chocolate;

    public Coffee(String type) {
        this.type = type;
    }

    public void addMilk() {
        this.milk = true;
    }

    public void addSugar() {
        this.sugar = true;
    }

    public void addChocolate() {
        this.chocolate = true;
    }

    public double getCost() {
        double cost = 0;
        if (type.equals("Espresso")) {
            cost = 1.99;
        } else if (type.equals("Latte")) {
            cost = 2.99;
        } else if (type.equals("Cappuccino")) {
            cost = 3.49;
        }

        if (milk) {
            cost += 0.5;
        }
        if (sugar) {
            cost += 0.2;
        }
        if (chocolate) {
            cost += 0.7;
        }

        return cost;
    }

    public String getDescription() {
        String description = type;
        if (milk) {
            description += " with milk";
        }
        if (sugar) {
            description += " with sugar";
        }
        if (chocolate) {
            description += " with chocolate";
        }
        return description;
    }
}
