
class UpBehavoir implements CarMoveBehavior{


    @Override
    public void move() {
        System.out.println("up");
    }
}

class DownBehavior implements CarMoveBehavior {

    @Override
    public void move() {
        System.out.println("down");
    }
}

class leftBehavior implements CarMoveBehavior{

    @Override
    public void move() {
        System.out.println("left");
    }
}

class rightBehavior implements CarMoveBehavior{

    @Override
    public void move() {


        System.out.println("right");
    }
}