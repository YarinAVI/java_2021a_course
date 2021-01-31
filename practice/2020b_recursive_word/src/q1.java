// written by yarin avisidris
public class q1 {
    public static void main(String[] args) {
        char m[][] = {{'s','h','a','l','o'},
                      {'s','h','a','z','m'},
                      {'h','w','l','o','m'},
                      {'a','r','n','t','n'},
                      {'l','o','m','i','n'},};
        findWord(m,"shalom");
    }
    public static void findWord(char [][] arr,String word) {
        int pathArr[][] = new int[arr.length][arr[0].length];
        if(iterateRow(arr,word,0,pathArr)) {
            printArr(pathArr);
        }
        else {
            System.out.println("No Such Word");
        }
    }
    public static boolean iterateRow(char [][]arr,String word, int i,int [][] pathArr) {
        boolean res = false;
        res = iterateColumn(arr,word,i,0,pathArr);
        if(i<arr.length-1) {
            return res |iterateRow(arr,word,i+1,pathArr);
        }
        return res;
    }
    public static boolean iterateColumn(char [][] arr,String word,int i,int j,int [][] pathArr) {
        boolean res = false;
        if(word.charAt(0)== arr[i][j]) {
            res = dfs(arr,word,i,j,0,pathArr);
        }
        if(res) {
            return true;
        }
        if(j<arr[i].length-1) {
            res |= iterateColumn(arr,word,i,j+1,pathArr);
        }
        return res;
    }
    public static boolean dfs(char [][]arr,String word,int i,int j,int wordIndex,int pathArr[][]) {
        if(word.length()==1 && arr[i][j] == word.charAt(0)) {
            pathArr[i][j] = wordIndex+1;
            return true;
        }
        char temp = arr[i][j];
        arr[i][j] = 'X';
        pathArr[i][j] = wordIndex+1;
        boolean res = false;
        if(i< arr.length-1 && word.length()>=2 && arr[i+1][j] == word.charAt(1)) {
            res |= dfs(arr,word.substring(1),i+1,j,wordIndex+1,pathArr);
        }
        if((i-1)>=0 && word.length()>=2 && arr[i-1][j] == word.charAt(1) ) {
            res |=dfs(arr,word.substring(1),i-1,j,wordIndex+1,pathArr);
        }
        if(j<arr[i].length-1 && word.length()>=2 && arr[i][j+1] == word.charAt(1)) {
            res |= dfs(arr,word.substring(1),i,j+1,wordIndex+1,pathArr);
        }
        if((j-1)>=0 && word.length()>=2 && arr[i][j-1] == word.charAt(1) ) {
            res |= dfs(arr,word.substring(1),i,j-1,wordIndex+1,pathArr);
        }
        if(!res) {
            pathArr[i][j] = 0;
        }
        arr[i][j] = temp;
        return res;
    }

    // we dont need to write this function so i wrote it so we can test the code
    public static void printArr(int arr[][]) {
        for(int i=0;i<arr.length;i++) {
            for(int j =0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
    }
}
