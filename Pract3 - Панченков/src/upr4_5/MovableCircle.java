package upr4_5;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        this.center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return " MovableCircle {"+
                "radius=" + radius +
                ", center: " + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
        System.out.println("up");
    }

    @Override
    public void moveDown() {
        center.moveDown();
        System.out.println("down");
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
        System.out.println("left");
    }

    @Override
    public void moveRight() {
        center.moveRight();
        System.out.println("right");
    }
}
