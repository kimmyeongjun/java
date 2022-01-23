public class Sample {
    public static void main(String[] args) {


        Car car1 = new Car(new UpBehavoir());
        car1.move();

        Car car2 = new Car(new DownBehavior());
        car2.move();


        Car car3 = new Car(new rightBehavior());
        car3.move();

        Car car4 = new Car(new leftBehavior());
        car4.move();

    }


}


