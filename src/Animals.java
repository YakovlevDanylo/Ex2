public class Animals {
    private static int totalAnimals = 0;
    private String animalName;

    public Animals(String animalName) {
        this.animalName = animalName;
        totalAnimals++;
    }

    public void run(int barrier) {
        System.out.println(this.animalName + " пробіг " + barrier + " м.");
    }

    public void swim(int barrier) {
        System.out.println(this.animalName + " проблив " + barrier + " м.");
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public static int getTotalAnimalsCount() {
        return totalAnimals;
    }
}
