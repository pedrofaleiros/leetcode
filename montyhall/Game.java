package montyhall;

import java.util.Random;

public class Game {

    static int goat = 0;
    static int car = 1;

    public int userChoice;
    public boolean change;
    public int open;
    public int[] doors;

    public Game(int choice, boolean change) {
        userChoice = choice - 1;
        this.change = change;

        doors = new int[3];
        for (int i = 0; i < 3; i++) {
            doors[i] = goat;
        }
        var rand = new Random().nextInt(3);
        doors[rand] = car;
    }

    public boolean play() {
        var aux = userChoice + 1;
        // System.out.println("Porta escolhida: " + aux);
        // System.out.println("Trocar? " + change);
        openFirstDoor();
        return result();
    }

    public void openFirstDoor() {
        if (doors[userChoice] == car) {
            open = userChoice >= 1 ? 0 : 1;
        } else {
            if (userChoice == 0) {
                open = doors[1] == goat ? 1 : 2;
            } else if (userChoice == 1) {
                open = doors[0] == goat ? 0 : 2;
            } else {
                open = doors[0] == goat ? 0 : 1;
            }
        }

        var aux = open + 1;
        // System.out.println("Abindo porta: " + aux);
        switch (open) {
            case 0:
                // System.out.println("[-] [] []");
                break;
            case 1:
                // System.out.println("[] [-] []");
                break;
            case 2:
                // System.out.println("[] [] [-]");
                break;
            default:
                break;
        }
    }

    public boolean result() {
        if (change) {
            if (userChoice == 0) {
                userChoice = open == 1 ? 2 : 1;
            } else if (userChoice == 1) {
                userChoice = open == 0 ? 2 : 0;
            } else {
                userChoice = open == 0 ? 1 : 0;
            }
        }

        var aux = userChoice + 1;
        // System.out.println("Porta escolhida: " + aux);

        if (doors[userChoice] == car) {
            // System.out.println("Ganhou!!!");
        } else {
            // System.out.println("Errou");
        }

        var door1 = doors[0] == car ? "[X] " : "[.] ";
        var door2 = doors[1] == car ? "[X] " : "[.] ";
        var door3 = doors[2] == car ? "[X]" : "[.]";
        // System.err.println(door1 + door2 + door3);

        if (doors[userChoice] == car) {
            return true;
        } else {
            return false;
        }
    }
}
