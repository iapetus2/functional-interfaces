package robots;

import tasks.CleanerTask;

public class CleanerRobot implements Robot {

    private CleanerTask cleanerTask;

    void setCleanerTask(CleanerTask cleanerTask) {
        this.cleanerTask = cleanerTask;
    }

    @Override
    public void complete() {
        System.out.println(cleanerTask + " has been cleaned");
    }
}
