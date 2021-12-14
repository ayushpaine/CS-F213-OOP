interface Comparable{
    Integer compareTo(RoadLab8 a);
}
public class RoadLab8 implements Comparable{
    public Integer diffLevel[] =new Integer[10] ; 
    public Integer obsPos [] =new Integer[10] ;
    int size; 
    RoadLab8(Integer diffLevel[],Integer obsPos[]){
        this.diffLevel = diffLevel;
        this.obsPos = obsPos;
        this.size = diffLevel.length;
    }
    public Integer getDiffAt(int y, int t){
        Integer ans = diffLevel[y]+ Integer.rotateLeft(obsPos[y], t);
        return ans;
    }
    @Override
    public Integer compareTo(RoadLab8 a){
        Integer sum = Integer.valueOf(0);
        for(int i = 0;i<this.size;i++){
            sum+=this.diffLevel[i]-a.diffLevel[i];
        }
        return sum;
    }
}