package Complexity_questions;

public class subStrC {
    public static void main(String[] args) {
        String s = "abcbcabcacabcc";
        //          0123456789
        char c = 'c';
        System.out.println(subStrC(s,c));
    }
    public static int subStrC(String s,char c) {
        int res =0;
        int midC = -1;
        int Count = 0;
        boolean findMidC = false;
        for(int i=0,j=0;i<s.length();i++) {
            if(s.charAt(i) == c) {
                Count =0;
                findMidC = false;
                for(j=i+1;j<s.length();j++) {
                    if(s.charAt(j) == c) {
                        Count++;
                    }
                    if(Count==2) {
                        break;
                    }
                    else if(Count==1 && !findMidC) {
                        midC = j;
                        findMidC = true;
                    }
                }
                if(j==s.length() && Count ==2) {
                    return res+1;
                }
                else if(j==s.length()) {
                    return res;
                }
                else if(Count==2) {
                    res++;
                    i = midC-1;
                }
                else i = midC-1;
            }
        }
        return res;
    }
}
