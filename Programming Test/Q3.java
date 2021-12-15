public class Controller {
    public static boolean crashCheck(int [] b1, int [] b2){
        if(Math.abs(b1[0]-b2[0]) <= (double)b1[2]/2+(double)b2[2]/2 || Math.abs(b1[1]-b2[1])<=(double)b1[3]/2+(double)b2[3]/2 ){
            return true;
        }
        return false;
    }
    public static int winner(int [] b1, int [] b2){
        if((double)b1[1]+(double)b1[3]/2>(double)b2[1]+(double)b2[3]/2){
            return 1;
        }
        else if((double)b1[1]+(double)b1[3]/2<(double)b2[1]+(double)b2[3]/2){
            return 2;
        }
        else{
            return 3;
        }
    }

}