public class findWord {
    public static void main(String[] args) {
        char m[][]  = {{'t','z','x','c','d'},
                        {'s','h','a','z','x'},
                        {'s','w','l','o','m'},
                        {'h','r','m','l','a'},
                        {'a','l','o','s','h'}};

        findWord(m,"shalom");
    }
    public static void findWord(char mat[][],String word) {
        int resMat[][] = new int[mat.length][mat[0].length];
        if(iterateRows(mat,word,0,resMat)) {
            printArr(resMat);
        }else {
            System.out.println("Not found");
        }
    }
    public static boolean iterateRows(char m[][],String word,int i,int resMat[][]) {
        boolean res = iterateColumns(m,word,i,0,resMat);
        if((i+1)<m.length) return  res | iterateRows(m,word,i+1,resMat);
        return res;
    }
    public static boolean iterateColumns(char m[][], String word,int i, int j,int resMat[][]){
        boolean res = false;
        if(m[i][j] == word.charAt(0)) {
            res = scan(m,word,i,j,resMat,0);
        }
        if((j+1)<m[0].length) return res | iterateColumns(m,word,i,j+1,resMat);
        return res;
    }
    // 012345
    //"Shalom"
    public static boolean scan(char m[][],String word,int i,int j,int resMat[][],int counter) {
        if(counter+1 == word.length()) {
            resMat[i][j] = counter+1;
            return true;
        }
        resMat[i][j] = counter+1;
        char temp = m[i][j];
        m[i][j] = 'X';
        boolean op1= false, op2= false,op3 =false,op4= false;
        if((i+1)<m.length && m[i+1][j] == word.charAt(counter+1) ) {
            op1 = scan(m,word,i+1,j,resMat,counter+1);
        }
        if((i-1)>=0 && m[i-1][j] == word.charAt(counter+1) ) {
            op2 = scan(m,word,i-1,j,resMat,counter+1);
        }
        if((j+1)<m[0].length && m[i][j+1] == word.charAt(counter+1)) {
            op3 = scan(m,word,i,j+1,resMat,counter+1);
        }
        if((j-1)>=0 && m[i][j-1] == word.charAt(counter+1)) {
            op4 = scan(m,word,i,j-1,resMat,counter+1);
        }
        m[i][j] = temp;
        if(!op1 && !op2 && !op3 && !op4) {
            resMat[i][j] = 0;
        }
        return op1 || op2 || op3 || op4;
    }
    public static void printArr(int m[][]) {
        for(int i=0;i<m.length;i++) {
            for(int j=0;j<m.length;j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
