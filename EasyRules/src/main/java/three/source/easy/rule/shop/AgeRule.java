package three.source.easy.rule.shop;

import org.easyrules.core.BasicRule;

/**
 * Created by Pankaj Nimgade on 09-05-2016.
 */
public class AgeRule extends BasicRule {

    private static final int ADULT_AGE = 18;

    private Person person;

    public AgeRule(Person person) {
        super("Age Rule", "Check if the person's age is > 18 and mark the person isAdult or not", 1);
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
        return person.getAge() > ADULT_AGE;
    }

    /**
     * This method encapsulates the rule's actions.
     *
     * @throws Exception if an error occurs
     *                   during actions performing
     */
    @Override
    public void execute() throws Exception {
        super.execute(); // does't matter are the supper class is not doing any work in it's execute method
        person.setAdult(true);
        System.out.printf("Person %s has been marked as adult", person.getName());
        //The execute method encapsulates actions that should be performed when rule's conditions are satisfied.
    }
}
