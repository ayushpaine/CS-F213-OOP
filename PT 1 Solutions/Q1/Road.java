public class Road {

    public Integer[] diffLevel;
    public Integer[] obsPos;

    public Road(Integer[] diffLevel, Integer[] obsPos) {
        this.diffLevel = diffLevel;
        this.obsPos = obsPos;
    }

    public Integer getDiffAt(int y, int t) {
        int obs = (int) obsPos[y];
        int diffLev = (int) diffLevel[y];
        int ans = (int) Integer.rotateLeft(obs, t);
        return ans + diffLev;
    }

}