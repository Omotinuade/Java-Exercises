package turtlePackage;


import static turtlePackage.Direction.*;

public class Turtle {
    private Direction direction=EAST;
    private boolean isPenUp= true;
    private Position position= new Position(0,0);

    public Turtle() {
    }


    public boolean penIsUp(){

        return isPenUp;
    }

    public void penDown() {

        isPenUp= false;
    }

    public void penUp() {
        isPenUp=true;
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if(direction== EAST) face(SOUTH);
         else if(direction== SOUTH) face(WEST);
    }

    private void face(Direction direction) {
        this.direction = direction;
    }

    public void turnLeft() {
        if(direction== EAST) face(NORTH);
    }

    public Position getPosition() {
        return position;
    }

    public void moveForward(int i) {
        if(direction==EAST) moveForwardByColumn(i);
    }

    private void moveForwardByColumn(int i) {
        position.setColumn(position.getColumn()+i);
    }
}
