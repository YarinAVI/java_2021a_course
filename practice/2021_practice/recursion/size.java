package recursion;

public class size {
    public static void main(String[] args) {
        boolean arr[][] = {{false,true,false,false,true},{true,false,false,true,true},{false,false,true,true,false},{true,false,false,false,false},{true,true,true,false,false}};
        System.out.println(size(arr,3,0));
    }
    public static int size(boolean [][]mat,int x,int y) {
     if(x<0 || x >=mat.length || y <0 || y>=mat[0].length || !mat[x][y]) {
         return 0;
     }
     mat[x][y] = false;
     return 1 + size(mat,x+1,y) + size(mat,x-1,y) + size(mat,x,y+1) + size(mat,x,y-1) +
                size(mat,x+1,y+1) + size(mat,x-1,y-1) + size(mat,x-1,y+1) + size(mat,x+1,y-1);
    }

}
