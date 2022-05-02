import java.util.ArrayList;
import java.util.List;

public class HeroTask {
    private List<Hero> instance = new ArrayList<>();

    public void creatHero(List<Hero> myList, Hero myHero){
        if(myList != null){
            instance = myList;
        }else {
            instance = new ArrayList<>();
        }
        myHero.setHeroId(instance.size()+1);
        instance.add(myHero);
    }
    public List<Hero> getList(){
        return instance;
    }
}



