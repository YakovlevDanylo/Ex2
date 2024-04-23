public class Main {
    public static void main(String[] args) {
        Animals dog1 = new Dog("Бобік");
        Animals dog2 = new Dog("Себастіан");
        Animals dog3 = new Dog("Рекс");
        Animals cat1 = new Cat("Степан");
        Animals cat2 = new Cat("Сажа");

        dog1.run(50);
        dog2.run(501);
        dog1.swim(10);
        dog3.swim(150);

        cat1.run(50);
        cat1.run(210);
        cat1.swim(10);
        System.out.println("\nКількість собак: " + Dog.getDogCount());
        System.out.println("Кількість котів: " + Cat.getCatCount());
        System.out.println("Всього тварин: " + Animals.getTotalAnimalsCount());
    }
}