public class Car {

    public CarMoveBehavior carmoveinterface;

    Car(CarMoveBehavior carmoveinterface) {
        this.carmoveinterface = carmoveinterface;
    }

    public void move() {
        this.carmoveinterface.move();
    }

    public void setmove(CarMoveBehavior carmoveinterface) {
        this.carmoveinterface = carmoveinterface;
    }

}
