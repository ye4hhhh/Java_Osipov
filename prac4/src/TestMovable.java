public class TestMovable {
    public static void main(String[] args) {
        Movable shape = new MovableCircle(1, new MovablePoint(47,2,78,25));
        System.out.println(shape);
        shape.moveLeft();
        shape.moveUp();
        System.out.println(shape);
    }
}
