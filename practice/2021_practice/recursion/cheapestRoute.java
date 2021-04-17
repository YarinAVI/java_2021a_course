package recursion;

public class cheapestRoute {
    public static void main(String[] args) {
        int arr[] = {2,8,3,4,7,1,3,2};
        System.out.println(cheapestRoute(arr));
    }
    public static int cheapestRoute( int []stations) {
        return cheapestRoute(stations,0,0);
    }
    public static int cheapestRoute(int []stations,int i,int currPrice) {
        if(i == stations.length-1) {
            return currPrice+stations[i];
        }
        if(i>=stations.length) {
            return Integer.MAX_VALUE;
        }
        return Math.min(cheapestRoute(stations,i+1,currPrice+stations[i]),cheapestRoute(stations,i+2,currPrice+stations[i]));
    }
}
