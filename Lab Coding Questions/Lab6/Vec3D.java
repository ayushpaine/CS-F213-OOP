public class Vec3D{
    private int[] p1; 
    private int [] p2;
    
    public Vec3D(int[] p1,int[] p2){
        this.p1=p1;
        this.p2=p2;
    }
    @Override
    public String toString(){
        int xx=Math.abs(p2[0]-p1[0]);
        int yy=Math.abs(p2[1]-p1[1]);
        int zz=Math.abs(p2[2]-p1[2]);
        return (xx)+"i+"+(yy)+"j+"+(zz)+"k"+(Math.round(Math.sqrt(xx*xx + yy*yy + zz*zz)));
    }
}