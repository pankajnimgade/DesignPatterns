package three.source.easy.rule.shop;

import org.easyrules.core.BasicRule;

/**
 * Created by Pankaj Nimgade on 09-05-2016.
 */
public class AlcoholRule extends BasicRule {

    private Person person;

    public AlcoholRule(Person person) {
        super("AlcoholRule",
                "Children are not allowed to buy alcohol",
                2);
        this.person = person;
    }

    /**
     * This method encapsulates the rule's conditions.
     *
     * @return true if the rule should be applied, false else
     */
    @Override
    public boolean evaluate() {
        //The evaluate method encapsulates conditions that must evaluate to TRUE to trigger the rule.
        return person.isAdult();
    }

    @Override
    public void execute() throws Exception {
        super.execute();// does't matter are the supper class is not doing any work in it's execute method
        //The execute method encapsulates actions that should be performed when rule's conditions are satisfied.
        System.out.printf("Shop: Sorry %s, you are not allowed to buy alcohol", person.getName());
    }
}
