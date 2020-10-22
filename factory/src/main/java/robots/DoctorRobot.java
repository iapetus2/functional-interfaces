package robots;

import tasks.DoctorTask;

public class DoctorRobot implements Robot {

    private DoctorTask doctorTask;

    public void setDoctorTask(DoctorTask doctorTask) {
        this.doctorTask = doctorTask;
    }

    @Override
    public void complete() {
        System.out.println(doctorTask + " has been treated");
    }
}
