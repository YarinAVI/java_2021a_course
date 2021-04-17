public class Road1_Road2 {
    public static void main(String args[]) {
        int x[] = {1,1,1,2,1,1,1,1};
        int y[] = {5, 4, 5, 8, 120, 90, 90, 30};
        System.out.println(shortestRoad(y,x));
    }
    public static int shortestRoad(int road1[], int road2[]) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
        for (i = 0; i < road1.length; i++) {
            r1 += road1[i];
            r2 += road2[i];
        }
        i--;
        for (int j = road2.length - 1; j >= 0; j--) {
            min = Math.min(r3+r1,min);
            min = Math.min(r2+r4,min);
            r3 += road2[j];
            r1 -= road1[i];
            r4 += road1[j];
            r2 -= road2[i];
            i--;
        }
        return min;
    }
}
