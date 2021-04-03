package day7;

public class ForLoopDemo {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if (i==3){
                System.out.println("value of i is 3");
                break;

            }
            System.out.println("outside for loop");
        }
    }
}
