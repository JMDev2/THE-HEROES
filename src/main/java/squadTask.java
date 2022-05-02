import java.util.ArrayList;
import java.util.List;

public class squadTask {
    private List<Squad> instance = new ArrayList<>();

    public void createSquad(List<Squad> mySquadList, Squad mySquad){
        if(mySquadList != null){
            instance = mySquadList;
        }else {
            instance = new ArrayList<>();
        }
        mySquad.setSquadId(instance.size()+1);
        instance.add(mySquad);
    }

}


