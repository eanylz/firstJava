package day12array;

public class ForEach2 {
    public static void main(String[] args) {
        int [][] arr = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int [] cc:arr){
            for(int a: cc){
                System.out.print(a+ " ");
            }
            System.out.println();

        }

    }
}
