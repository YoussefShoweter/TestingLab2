import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class PhysicistTest {
    @Test
    public void test(){
        int[]Nums={4,2,3,3,-1};
        int[]t11={4,5,1};int[]t12={5,2,7};int[]t13={-10,-9,2};int[] t14={1,2,-10};
        int[]t21={4,2,6};int[]t22={-4,-2,-6};
        int[]t31={2,6,-4};int[]t32={4,-5,7};int[]t33={-10,2,2};
        int[]t41={1,2,-10};
        int[]t51={41,0,6};int[]t52={-4,-4,-57};

        ArrayList<int[]> a1=new ArrayList<>();
        a1.add(t11);a1.add(t12);a1.add(t13);a1.add(t14);
        ArrayList<int[]> a2=new ArrayList<>();
        a2.add(t21);a2.add(t22);
        ArrayList<int[]> a3=new ArrayList<>();
        a3.add(t31);a3.add(t32);a3.add(t33);
        ArrayList<int[]> a4=new ArrayList<>();
        a4.add(t41);
        ArrayList<int[]> a5=new ArrayList<>();
        a5.add(t51);a5.add(t52);
        ArrayList<int[]>[] rekt=new ArrayList[5];
        rekt[0]=a1;rekt[1]=a2;rekt[2]=a3;rekt[3]=a4;rekt[4]=a5;

        int total=0;

        for(int i=0;i<Nums.length;i++){
            boolean testcheck=false;
            for(int j=0;j<rekt[i].size();j++){
            total=total+rekt[i].get(j)[0]+rekt[i].get(j)[1]+rekt[i].get(j)[2];
            }

            if( total==0  &&Nums[i]>1 && rekt[i].size()==Nums[i]){
                testcheck=true;

            }
            assertEquals(testcheck,physicist.check(Nums[i],rekt[i]));

        }




    }
}
