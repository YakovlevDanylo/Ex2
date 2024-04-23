public class Cat extends Animals{

    private static int catCount = 0;

    public Cat(String animalName) {
        super(animalName);
        catCount++;
    }

    @Override
    public void run(int barrier) {
        if (barrier <= 200) {
            super.run(barrier);
        }
        else {
            System.out.println(super.getAnimalName() + " не може подалати таку відстань.");
        }
    }

    @Override
    public void swim(int barrier) {
        System.out.println("Коти не вміють плавати.");
    }

    public static int getCatCount() {
        return catCount;
    }
}
