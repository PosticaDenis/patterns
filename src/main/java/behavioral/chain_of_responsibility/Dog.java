package behavioral.chain_of_responsibility;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class Dog extends AbstractTeam{

    @Override
    protected double getMaxWeight() {
        return weight * 40;
    }

    @Override
    protected void addMember() {
        team.add("Dog");
    }
}
