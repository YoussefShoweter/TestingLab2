import static org.junit.Assert.*;
import org.junit.Test;

public class WaterTest {
    @Test
    public void mytest(){
        int randoms[]={5,6,4,8,7,4,3,98,75,480,-5,-51,2};
        for(int i=0;i<randoms.length;i++){
            boolean see=false;
            if(randoms[i]%2==0 && randoms[i]<100 && randoms[i]>0)
                see=true;
             if (randoms[i]==2)
                see=false;
            assertEquals(see,watermelons.check(randoms[i]));
        }

    }
}
