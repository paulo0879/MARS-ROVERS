public class robot {
    private int actualX;
    private int actualY;
    private String position;
    private char[] movement;

    //Getters and Setters from the variables of the class robot.
    public int getActualX() {
        return actualX;
    }

    public void setActualX(int actualX) {
        this.actualX = actualX;
    }

    public int getActualY() {
        return actualY;
    }

    public void setActualY(int actualY) {
        this.actualY = actualY;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public char[] getMovement() {
        return movement;
    }

    public void setMovement(char[] movement) {
        this.movement = movement;
    }

    //Method that will return the values actualX, actualY and the position in a String.
    public String toString(){
        return actualX + " " + actualY + " " + position;
    }

    //Method that will move the robot in the direction of his position.
    public void moveRobot(int plateauX, int plateauY){
        if(position.toUpperCase().equals("N")){
            if(plateauY > actualY)
                actualY = actualY + 1;
        }else if(position.toUpperCase().equals("S")){
            if(actualY >= 1)
                actualY = actualY - 1;
        }else if(position.toUpperCase().equals("W")){
            if(actualX >= 1)
                actualX = actualX - 1;
        }else{
            if(plateauX - actualX >= 1)
                actualX = actualX + 1;
        }
    }

    //Method that will change the positon of the robot 90 degrees to the left.
    public void changePositionL(){
        switch(position){
            case "N": position = "W";
                break;
            case "W": position = "S";
                break;
            case "S": position = "E";
                break;
            case "E": position = "N";
                break;
        }
    }

    //Method that will change the positon of the robot 90 degrees to the right.
    public void changePositionR(){
        switch(position){
            case "N": position = "E";
                break;
            case "E": position = "S";
                break;
            case "S": position = "W";
                break;
            case "W": position = "N";
                break;
        }
    }


}
