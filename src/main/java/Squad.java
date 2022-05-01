import java.util.ArrayList;
import java.util.List;

public class Squad {
    private int squadSize;
    private  String squadName;
    private String squadCause;
    private int squadId;
    private static ArrayList<Squad> instances = new ArrayList<Squad>();

    public Squad(int squadSize, String squadName, String squadCause) {
        this.squadSize = squadSize;
        this.squadName = squadName;
        this.squadCause = squadCause;
        this.squadId = squadId;
        this.instances.add(this);
    }

    public int getSquadSize() {
        return squadSize;
    }

    public void setSquadSize(int squadSize) {
        this.squadSize = squadSize;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public String getSquadCause() {
        return squadCause;
    }

    public void setSquadCause(String squadCause) {
        this.squadCause = squadCause;
    }

    public int getSquadId() {
        return squadId;
    }

    public void setSquadId(int squadId) {
        this.squadId = squadId;
    }
    public static ArrayList<Squad> getAll() {
        return instances;
    }

//    public static List<Squad> getInstances() {
//        return instances;
//    }

//    public static void setInstances(List<Squad> instances) {
//        Squad.instances = instances;
//    }
}
