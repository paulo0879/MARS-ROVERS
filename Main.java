import java.awt.*;
import java.util.Scanner;

public class Main {
    private static int plateauX;
    private static int plateauY;
    private static String[] directions = {"N", "S", "E", "W"};


    public static void teste(robot robot1, robot robot2){
        char[] robot1move = robot1.getMovement();
        for(int i = 0; i < robot1move.length; i++){
            switch (robot1move[i]){
                case 'M': robot1.moveRobot();
                    break;
                case 'L': robot1.changePositionL();
                    break;
                case 'R': robot1.changePositionR();
                    break;
            }
        }
        System.out.println(robot1.toString());

        char[] robot2move = robot2.getMovement();
        for(int i = 0; i < robot2move.length; i++){
            switch (robot2move[i]){
                case 'M': robot2.moveRobot();
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
        //CRIAR CONDIÇÕES
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plateau size: ");
        String plateauSize = keyboard.nextLine();
        String[] plateauS = plateauSize.split("\\s+");
        plateauX = Integer.parseInt(plateauS[0]);
        plateauY = Integer.parseInt(plateauS[1]) + 1;

        System.out.println("Robot 1 data: ");
        String robot1data = keyboard.nextLine();
        String[] robot1D = robot1data.split("\\s+");
        robot robot1 = new robot();
        robot1.setInitialX(Integer.parseInt(robot1D[0]));
        robot1.setInitialY(Integer.parseInt(robot1D[1]));
        robot1.setActualX(Integer.parseInt(robot1D[0]));
        robot1.setActualY(Integer.parseInt(robot1D[1]));
        robot1.setPosition(robot1D[2]);

        System.out.println("Robot 1 movement: ");
        String robot1move = keyboard.nextLine();
        robot1.setMovement(robot1move.toCharArray());

        System.out.println("Robot 2 data: ");
        String robot2data = keyboard.nextLine();
        String[] robot2D = robot2data.split("\\s+");
        robot robot2 = new robot();
        robot2.setInitialX(Integer.parseInt(robot2D[0]));
        robot2.setInitialY(Integer.parseInt(robot2D[1]));
        robot2.setActualX(Integer.parseInt(robot2D[0]));
        robot2.setActualY(Integer.parseInt(robot2D[1]));
        robot2.setPosition(robot2D[2]);

        System.out.println("Robot 2 movement: ");
        String robot2move = keyboard.nextLine();
        robot2.setMovement(robot2move.toCharArray());

        teste(robot1, robot2);
    }
}
