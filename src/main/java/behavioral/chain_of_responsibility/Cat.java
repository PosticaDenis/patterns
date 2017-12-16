package behavioral.chain_of_responsibility;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class Cat extends AbstractTeam{

    @Override
    protected double getMaxWeight() {
        return weight * 50;
    }

    @Override
    protected void addMember() {
        team.add("Cat");
    }
}

