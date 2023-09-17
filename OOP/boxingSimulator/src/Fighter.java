public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

    public int hit(Fighter foe){
        System.out.println("------------");
        System.out.println(this.name + "--> " + foe.name + " made " + this.damage + " damage!!");

        if (foe.dodge()) {
            System.out.println(foe.name + " dogded the damage!!");
            return foe.health;
        }

        if (foe.health - this.damage < 0){
            return 0;
        }

        return foe.health - this.damage;
    }
}
