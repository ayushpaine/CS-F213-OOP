public class Bike {
    
    public int xCenter, yCenter, width, length, speed;

    public Bike(int xCenter, int yCenter, int width, int length, int speed) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.width = width;
        this.length = length;
        this.speed = speed;
    }
    //method to change speed
    public void changeSpeed(float spd) {
        speed += spd;
    }
    // posChangeUnitTime to be called after unit time changes y-position = old pos + speed*1
    public void posChangeUnitTime() {
        yCenter += speed * 1;
    }
    // method to get y position 
    public int getYPosition() {
        return yCenter;
    }
}