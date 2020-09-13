package upr4_5;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1,int x2,int y1,int y2,int xSpeed,int ySpeed) {
        this.bottomRight = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.topLeft = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft= " + topLeft +
                ", bottomRight= " + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        this.bottomRight.moveUp();
        this.topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        this.bottomRight.moveDown();
        this.topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        this.bottomRight.moveLeft();
        this.topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        this.bottomRight.moveRight();
        this.topLeft.moveRight();
    }
}
