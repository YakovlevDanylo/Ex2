public class Dog extends Animals{

    private static int dogCount = 0;

    public Dog(String animalName) {
        super(animalName);
        dogCount++;
    }

    @Override
    public void run(int barrier) {
        if (barrier <= 500) {
            super.run(barrier);
        }
        else {
            System.out.println(super.getAnimalName() + " не може подалати таку відстань.");
        }
    }

    @Override
    public void swim(int barrier) {
        if (barrier <= 10) {
            super.swim(barrier);
        }
        else {
            System.out.println(super.getAnimalName() + " не може проблисти таку відстань.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
