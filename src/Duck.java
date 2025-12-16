public class Duck extends AbstractDuck implements IbehaveLikeDragon, IbehaveLikeHuman {
    private int age;

    public Duck()
    {
    }

    public Duck(int age) {
        this.age = age;
    }

    private void addOneMoreYear() {
        this.age++;
    }

    public void quack() {
        System.out.println("Quack");
        int r = (int)(Math.random()*10);
        if (r < 5) {
            hatch();
        }
    }

    private void hatch() {
        System.out.println("Hatch");
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void fireBreath() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void speak() {

    }

    @Override
    public void fight() {

    }
}
