public class Animals {

    private String animalName;

    public Animals(String animalName) {
        this.animalName = animalName;
    }

    public void run(int barrier) {
        System.out.println(this.animalName + " пробіг " + barrier + " м.");
    }

    public void swim(int barrier) {
        System.out.println(this.animalName + " проблив " + barrier + " м.");
    }
}
