

public class Maxofthree {
    public Maxofthree() {
    }
    public int getmax(int a,int b,int c){
        if (a>b) {
            if (a > c)
                return a;
            else
                return c;
        } else {
            if(b>c)
                return b;
            else
                return c;
        }

    }
}
