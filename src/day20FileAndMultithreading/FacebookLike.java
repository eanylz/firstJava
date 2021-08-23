package day20FileAndMultithreading;

public class FacebookLike {

    private int likes;
    public FacebookLike(int likes){
        this.likes= likes;
    }
    public synchronized void incrementLikes(){
        likes++;
        try{
            Thread.sleep(1500);
            System.out.println(likes);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
