import java.util.Optional;

public class maxEqualChar {
    public static void main(String[] args) {
        String test = "xxxyyyyy";
        String a = "xyz";
        String b = "FCFFFFFFLOLALOLALLLLXB";
        System.out.println(maxEqualChar(b));
    }
    public static int maxEqualChar(String s) {
        if(s.length()==0) {
            return 0;
        }
        else if(s.length() == 1) {
            return 1;
        }
        return maxEqualChar(s,0,1,0);
    }
    public static int maxEqualChar(String s,int index,int max,int Counter) {
        if(index==s.length()-1) {
            if(s.charAt(index-1)==s.charAt(index)) {
                return Math.max(max,Counter+1);
            }
            return max;
        }
        if(s.charAt(index)==s.charAt(index+1)) {
            return maxEqualChar(s,index+1,max,Counter+1);
        }
        max = Math.max(max,Counter+1);
        return maxEqualChar(s,index+1,max,0);
    }
}
