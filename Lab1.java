public class Lab1 {
    public static void main(String[] args) {
        int[] a = new int[11];
	int n = 24;
	for (int i = 0; i < 11; i++) {
		a[i] = n;
		n = n - 2;
                System.out.println(a[i]);
	}
        double[] x = new double[15];
        for(int i = 0; i < x.length; i++) {
            x[i] = Math.random()*16 - 5;
            System.out.println(x[i]);
        }
        double[][] s = new double[11][15];
        for(int i = 0; i < 11; i++){
            for(int j= 0; j < 15; j++) {
                if(a[i] == 4) {
                    s[i][j] = Math.atan(Math.pow(Math.E, Math.cbrt(-(Math.pow(Math.sin(x[j]), 2)))));   
                } else if(a[i] == 12 || a[i] == 14 || a[i] == 18 || a[i] == 22 || a[i] == 24) {
                    double m = (x[j] + 3)/16;
                    s[i][j] = Math.atan(Math.pow(m, 4));    
                } else {
                    s[i][j] = Math.pow(((Math.cos(x[j])-1)/Math.log(Math.abs(x[j]))), 3);
                }
            }
        }      
        for(int i = 0; i < 11; i++) {
            for(int j = 0; j < 15; j++) {
                System.out.printf("%8.2f", s[i][j]);
            }
        } 
    } 
}


