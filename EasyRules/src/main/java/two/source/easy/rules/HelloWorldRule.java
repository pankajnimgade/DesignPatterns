package two.source.easy.rules;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

/**
 * Created by Pankaj Nimgade on 09-05-2016.
 * <p>
 * This tutorial shows how to use Easy Rules in a very simple application. The goal is to ask the user if he is a friend of duke and says 'Hello duke's friend!' only if he replies 'yes'.
 * <p>
 * Based on this requirement, the rule is pretty straightforward :
 * <p>
 * The condition is that the user input must be equal to 'yes'
 * The action is to say 'Hello duke's friend!' to the user
 * <p>
 * First, let's create a rule class:
 */
@Rule(name = "Hello World rule",
        description = "Say Hello to duke's friends only")
public class HelloWorldRule {

    /**
     * The user input which represents the data
     * that the rule will operate on
     */
    private String input;

    @Condition
    public boolean checkInput() {
//        The rule should applied only if
//        the user's response is yes (duke friend)
        return input.equalsIgnoreCase("yes");
    }

    @Action
    public void sayHelloToDukeFriend() throws Exception {
//        When the rule conditions are satisfied,
//        print hello duke's fiend
        System.out.println("Hello Duke's Friend");
    }

    public void setInput(String input) {
        this.input = input;
    }
}
