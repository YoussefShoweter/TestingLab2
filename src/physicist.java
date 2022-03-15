import java.util.ArrayList;

public class physicist {
    public physicist() {
    }

    static boolean check(int n , ArrayList<int[]> a){
        if(n<=1 || a.size()<=1){
            return false;
        }
        int x=0,z=0,y=0;
        boolean check=false;
        boolean sizemismatch=true;

        for(int i=0;i<a.size();i++){
            if(a.get(i).length!=3)
                sizemismatch=false;
        }
        if(sizemismatch) {
            if (a.size() == n) {
                for (int i = 0; i < a.size(); i++) {
                    x += a.get(i)[0];
                    y += a.get(i)[1];
                    z += a.get(i)[2];
                }
                if (x == 0 && y == 0 && z == 0) {
                    check = true;
                }
            }
        }
        return check;
        }
    }
