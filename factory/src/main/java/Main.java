import robots.Robot;
import robots.RobotFactory;
import tasks.ChefTask;
import tasks.CleanerTask;
import tasks.DoctorTask;
import tasks.Task;

public class Main {
    public static void main(String[] args) {

        Task chefTask = new ChefTask();
        Task cleanerTask = new CleanerTask();
        Task doctorTask = new DoctorTask();

        Robot chef = RobotFactory.createRobot(chefTask);
        Robot cleaner = RobotFactory.createRobot(cleanerTask);
        Robot doctor = RobotFactory.createRobot(doctorTask);

        chef.complete();
        cleaner.complete();
        doctor.complete();
    }
}
