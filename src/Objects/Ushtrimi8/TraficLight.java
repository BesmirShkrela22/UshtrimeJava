package Objects.Ushtrimi8;
/*8. Write a Java program to create class called "TrafficLight" with attributes for color and duration,
        and methods to change the color and check for red or green.*/
public class TraficLight {
    private String color;
    private int duration;

    public TraficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equals("red");
    }

    public boolean isGreen() {
        return color.equals("green");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}