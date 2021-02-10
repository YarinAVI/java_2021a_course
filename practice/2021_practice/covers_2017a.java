public class covers_2017a {
    public static void main(String[] args) {
        int arr[] = {7,2,3};
        int mat[][] = {{1,5,7},
                      {0,0,9},
                      {1,2,3}};
        int test[][] = {{1,0,0,0,5},{1,5,9,0,2},{1,0,0,0,5},{1,0,0,4,5},{1,0,0,4,5},{90,80,7,10,20},{100,100,3,100,100}};
        System.out.println(covers(test,arr,3));
    }
    public static boolean covers(int [][]mat,int []arr,int k) {
        int chooseArr[] = new int[k];
        return covers(mat,arr,0,chooseArr,0,k,0);
    }
    public static boolean covers(int [][]mat,int []arr,int Current_k,int ChosenIndexes[],int i,int Target_k,int row) {
        if(Current_k==Target_k) {
            boolean res = inclusionCheck(mat,arr,ChosenIndexes,0);
            reset(mat,0);
            if(res) {
                for(int x=0;x<ChosenIndexes.length;x++) {
                    System.out.print(ChosenIndexes[x]+"+");
                }
                System.out.println();
            }
            return res;
        }
        if(i==Target_k || row == mat.length) {
            return false;
        }
        ChosenIndexes[i] = row;
        return covers(mat,arr,Current_k+1,ChosenIndexes,i+1,Target_k,row+1) || covers(mat,arr,Current_k,ChosenIndexes,i,Target_k,row+1);
    }
    public static boolean FindNumberInRows(int [][]mat,int number,int ChosenIndexes[],int i) {
        if(i==ChosenIndexes.length) return false;
        return findNum(mat,number,ChosenIndexes[i],0) || FindNumberInRows(mat,number,ChosenIndexes,i+1);
    }
    public static boolean findNum(int [][]mat,int num,int i, int j) {
        if(j==mat[i].length) return false;
        if(mat[i][j]==num) {
            mat[i][j] = -mat[i][j];
            return true;
        }
        return findNum(mat,num,i,j+1);
    }
    public static boolean inclusionCheck(int [][]mat,int []arr,int ChosenIndexes[],int ArrIndex) {
        if(ArrIndex==arr.length) return true;
        return FindNumberInRows(mat,arr[ArrIndex],ChosenIndexes,0) && inclusionCheck(mat,arr,ChosenIndexes,ArrIndex+1);
    }
    public static void reset(int [][]mat,int i) {
        resetRow(mat,i,0);
        if(i<mat.length-1)reset(mat,i+1);
    }
    public static void resetRow(int [][]mat, int i, int j) {
        mat[i][j] = Math.abs(mat[i][j]);
        if(j<mat[i].length-1) resetRow(mat,i,j+1);
    }
}
