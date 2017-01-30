
/**
 * Created by paulo on 30/01/17.
 */
public class robot {
    private int initialX;
    private int initialY;
    private int actualX;
    private int actualY;
    private String position;
    private char[] movement;

    public int getInitialX() {
        return initialX;
    }

    public void setInitialX(int initialX) {
        this.initialX = initialX;
    }

    public int getInitialY() {
        return initialY;
    }

    public void setInitialY(int initialY) {
        this.initialY = initialY;
    }

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

    public String toString(){
        return actualX + " " + actualY + " " + position;
    }

    public String toString2(){
        return "Robo: " + "posição x: " + actualX + '\n' +
                        "posição y: " + actualY + '\n' +
                        "posição: " + position + '\n' +
                        "movement: " + movement;
    }

    public void moveRobot(){
        if(position.toUpperCase().equals("N")){
            actualY = actualY + 1;
        }else if(position.toUpperCase().equals("S")){
            actualY = actualY - 1;
        }else if(position.toUpperCase().equals("W")){
            actualX = actualX - 1;
        }else{
            actualX = actualX + 1;
        }
    }

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
