package Abstraction.TrafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        int n = Integer.parseInt(scan.nextLine());

        Traffic traffic = new Traffic(line.split("\\s+"));

        for(int i = 0 ; i < n ; i++){

            traffic.changeColor();
            System.out.println(traffic.toAWS());

        }

    }
}
