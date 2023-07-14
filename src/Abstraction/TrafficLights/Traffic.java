package Abstraction.TrafficLights;

public class Traffic {

    private String[] traffic;

    public Traffic(String[] traffic) {
        this.traffic = traffic;
    }

    public void changeColor() {


        for (int i = 0; i < traffic.length; i++) {
            if (traffic[i].equals("RED")) {
                traffic[i] = "GREEN";
            } else if (traffic[i].equals("GREEN")) {
                traffic[i] = "YELLOW";
            } else if (traffic[i].equals("YELLOW")) {
                traffic[i] = "RED";
            }
        }


    }

    public String toAWS() {
        String line = "";
       for(String s : traffic){
           line = line + s + " ";
       }
       return line;
    }
}
