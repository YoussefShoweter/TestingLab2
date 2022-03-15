    import static org.junit.Assert.*;
import org.junit.Test;
public class MaxofthreeTest {
@Test
    public void mytest(){
    int Tests[]={0,200,300,-150,10,40};
    for(int i=0;i<Tests.length;i++){
        for(int j=0;j<Tests.length;j++){
            for(int k=0;k<Tests.length;k++){
                Maxofthree rekt =new Maxofthree();
                int value=Math.max(Tests[i],Math.max(Tests[j],Tests[k]));
//                int max =Math.max(Tests[i],Math.max(Tests[j],Tests[k]));
//                int min =Math.min(Tests[i],Math.min(Tests[j],Tests[k]));
//                if (max>200||min<0)
//                   assertEqual(0,rekt.getmax(Tests[i],Tests[j],Tests[k]));
//                else
//                {
//                    assertEqual(max,rekt.getmax(Tests[i],Tests[j],Tests[k]));
//                }i
                if (rekt.getmax(Tests[i],Tests[j],Tests[k])>200);
                  value=-1;
                    assertEquals(rekt.getmax(Tests[i],Tests[j],Tests[k]),value);
            }
        }
    }
}
}