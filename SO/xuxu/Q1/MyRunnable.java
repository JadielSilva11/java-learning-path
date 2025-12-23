package Q1;
import java.util.Random;

public class MyRunnable implements Runnable {
    int i;
    
    public MyRunnable(int i) {
        this.i = i;
    }
 
    @Override
    public void run() {
        Random ran = new Random();
        int v1[] = new int [1000];
        int j=1;
        for(int i=0;i<1000;i++){
            v1[i] = ran.nextInt(1000);
            if(v1[i] % 7 == 0 && v1[i] % 3 == 0){
                j++;
            }
        }
        int v2[] = new int [j];
        j=0;
        for(int i=0;i<1000;i++){
            if(v1[i] % 7 == 0 && v1[i] % 3 == 0){
                v2[j] = v1[i];
                System.out.println(v2[j]);
                j++;
            
            }
        }

    }
}