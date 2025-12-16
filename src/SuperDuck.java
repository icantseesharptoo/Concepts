public class SuperDuck extends AbstractDuck {
    private double speed;
    private double position = 0;

    public SuperDuck() {
        this.speed = (Math.random()*10)  ;
    }

    public SuperDuck(int speed) {
        this.speed = speed;
    }

    public void move() {
        this.position += speed;
    }

    public double getPosition() {
        return position;
    }

    public double getSpeed() {
        return speed;
    }

    public void run() {

    }

    public void swim() {

    }
}
