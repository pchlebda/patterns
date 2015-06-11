/**
 * Created by Piotr on 2015-06-11.
 */
public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso = torso;
    }

    @Override
    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }

    @Override
    public String getRobotHead() {
        return robotHead;
    }

    @Override
    public String getRobotTorso() {
        return robotTorso;
    }

    @Override
    public String getRobotArms() {
        return robotArms;
    }

    @Override
    public String getRobotLegs() {
        return robotLegs;
    }
}
