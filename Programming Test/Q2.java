public class Bike {
    private int xCenter,yCenter,width,length,speed;
    public Bike(int xCenter,int yCenter,int width,int length, int speed){
        this.xCenter=xCenter;
        this.yCenter=yCenter;
        this.width = width;
        this.length= length;
        this.speed=speed;
    }
    public void changeSpeed(float spd){
        if(speed+spd>=0){
            speed +=spd;
        }else{
            speed=0;
        }
    }
    public void posChangeUnitTime(){
        yCenter = yCenter + speed*1;
    }
    public int getYPosition(){
        return yCenter;
    }
}