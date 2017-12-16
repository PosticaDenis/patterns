package behavioral.chain_of_responsibility;

/**
 * Created by Dennis on 15-Dec-17.
 **/
public class Grandpa extends AbstractTeam{

    @Override
    protected double getMaxWeight() {
        return weight * 10;
    }

    @Override
    protected void addMember() {
        team.add("Grandpa");
    }
}
