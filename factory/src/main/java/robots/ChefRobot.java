package robots;

import tasks.ChefTask;

public class ChefRobot implements Robot {

    private ChefTask chefTask;

    void setChefTask(ChefTask chefTask) {
        this.chefTask = chefTask;
    }

    @Override
    public void complete() {
        System.out.println(chefTask + " has been cooked");
    }
}
