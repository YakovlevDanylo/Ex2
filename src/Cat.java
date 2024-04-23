public class Cat extends Animals{

    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public void run(int barrier) {
        if (barrier < 200) {
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
}
