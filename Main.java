import java.util.Scanner;

public class Main {
    private static int plateauX;
    private static int plateauY;

    //Method that will start the robots
    public static void start(robot robot1, robot robot2){
        //Make the movements of the robot1
        char[] robot1move = robot1.getMovement();
        for(int i = 0; i < robot1move.length; i++){
            switch (robot1move[i]){
                case 'M': robot1.moveRobot(plateauX, plateauY);
                    break;
                case 'L': robot1.changePositionL();
                    break;
                case 'R': robot1.changePositionR();
                    break;
            }
        }
        System.out.println(robot1.toString());

        //Make the movements of the robot2
        char[] robot2move = robot2.getMovement();
        for(int i = 0; i < robot2move.length; i++){
            switch (Character.toUpperCase(robot2move[i])){
                case 'M': robot2.moveRobot(plateauX, plateauY);
                    break;
                case 'L': robot2.changePositionL();
                    break;
                case 'R': robot2.changePositionR();
                    break;
            }
        }
        System.out.println(robot2.toString());
    }

    public static void main(String[] args) {
        //Read from the keyboard the Plateau size and it will put the value on the variables plateauX and plateauY
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plateau size: ");
        String plateauSize = keyboard.nextLine();
        String[] plateauS = plateauSize.split("\\s+");
        plateauX = Integer.parseInt(plateauS[0]);
        plateauY = Integer.parseInt(plateauS[1]) + 1;

        /*Read from the keyboard the value X, Y and position of the robot 1. If the value of X is bigger than plateauX or
          the value of Y is bigger than plateauY it will stay in a loop until the values are valid.*/
        robot robot1 = new robot();
        int aux1 = 0;
        while(aux1 == 0) {
            System.out.println("Robot 1 data: ");
            String robot1data = keyboard.nextLine();
            String[] robot1D = robot1data.split("\\s+");
            if (Integer.parseInt(robot1D[0]) <= plateauX && Integer.parseInt(robot1D[1]) <= plateauY) {
                robot1.setActualX(Integer.parseInt(robot1D[0]));
                robot1.setActualY(Integer.parseInt(robot1D[1]));
                robot1.setPosition(robot1D[2]);
                aux1++;
            }else{
                System.out.println("Robot 1 data cannot be accepted. Try again.");
            }
        }

        //Read from the keyboard the movement of the robot 1.
        System.out.println("Robot 1 movement: ");
        String robot1move = keyboard.nextLine();
        robot1.setMovement(robot1move.toCharArray());

        /*Read from the keyboard the value X, Y and position of the robot 2. If the value of X is bigger than plateauX or
          the value of Y is bigger than plateauY it will stay in a loop until the values are valid.*/
        robot robot2 = new robot();
        int aux2 = 0;
        while(aux2 == 0) {
            System.out.println("Robot 2 data: ");
            String robot2data = keyboard.nextLine();
            String[] robot2D = robot2data.split("\\s+");
            if (Integer.parseInt(robot2D[0]) <= plateauX && Integer.parseInt(robot2D[1]) <= plateauY) {
                robot2.setActualX(Integer.parseInt(robot2D[0]));
                robot2.setActualY(Integer.parseInt(robot2D[1]));
                robot2.setPosition(robot2D[2]);
                aux2++;
            }else{
                System.out.println("Robot 2 data cannot be accepted. Try again.");
            }
        }

        //Read from the keyboard the movement of the robot 2.
        System.out.println("Robot 2 movement: ");
        String robot2move = keyboard.nextLine();
        robot2.setMovement(robot2move.toCharArray());

        start(robot1, robot2);
    }
}
