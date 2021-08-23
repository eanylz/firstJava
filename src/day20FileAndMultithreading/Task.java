package day20FileAndMultithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss:a");
        for (int i = 0; i <= 5; i++) {
            if (i == 0) {
                System.out.println("Initialization time for "+ taskName+ " is = "+sdf.format(new Date()));
            }else {
                System.out.println("Execution time for "+ taskName+ " is = "+sdf.format(new Date()));

            }

        }
        System.out.println(taskName+" completed");
    }
}
