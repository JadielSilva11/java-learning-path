package Q2;

public class MyRunnable implements Runnable {
    int i;
    
    public MyRunnable(int i) {
        this.i = i;
    }
 
    @Override
    public void run() {
        int m1[][] = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9},
                      {10, 11, 12}};
        int m2[][] = new int [4][3];
        int l=0;
        for(int i=3;i>=0;i--){
            for(int j=2;j>=0;j--){
                m2[l][j] = m1[i][j];
            }l++;
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(m1[i][j] + " ");
            }System.out.println("");
        }System.out.println("");

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(m2[i][j] + " ");
            }System.out.println("");
        }  
        
    }
}