public class Controller {

    public Controller() {
    }
    // check crash through xCenter, yCenter, width, length

    public static boolean crashCheck(int[] b1, int[] b2) {
        if (b1[0] + b1[2] / 2 >= b2[0] && b1[0] - b1[2] / 2 <= b2[0] && b1[1] - b1[3] / 2 <= b2[1] && b1[1] + b1[3] / 2 >= b2[1]) {
            return true;
        } else {
            return false;
        }
    }

    public static int winner(int[] b1, int[] b2) {
        //compare winner 
        if (b1[1]+ b1[3]/2 > b2[1] + b2[3] / 2) {
            return 1;
        }
        else if (b1[1]+ b1[3] / 2 < b2[1]+ b2[3] / 2) {
            return 2;
        }
        else {
            return 3;
        }
        
    }
}
