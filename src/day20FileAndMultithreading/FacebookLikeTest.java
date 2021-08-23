package day20FileAndMultithreading;

public class FacebookLikeTest {
    public static void main(String[] args) {
        FacebookLike fb = new FacebookLike(500);
        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.incrementLikes();
            }
        });
        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.incrementLikes();
            }
        });
        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.incrementLikes();
            }
        });

        Thread user4 = new Thread(new Runnable() {
            @Override
            public void run() {
                fb.incrementLikes();
            }
        });
        user1.start();
        user2.start();
        user3.start();
        user4.start();

    }
}
