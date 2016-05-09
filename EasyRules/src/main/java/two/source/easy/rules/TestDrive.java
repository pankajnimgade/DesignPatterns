package two.source.easy.rules;

import org.easyrules.api.RulesEngine;

import java.util.Scanner;

import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;

/**
 * Created by Pankaj Nimgade on 09-05-2016.
 */
public class TestDrive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you a friend of duke?[yes/no]:");
        String input = scanner.nextLine();

        /**
         * Declare the rule
         */
        HelloWorldRule helloWorldRule = new HelloWorldRule();

        /**
         * Set business data to operate on
         */
        helloWorldRule.setInput(input.trim());

        /**
         * Create a rules engine and register the business rule
         */
        RulesEngine rulesEngine = aNewRulesEngine().withSilentMode(false).build();

        rulesEngine.registerRule(helloWorldRule);

        /**
         * Fire rules
         */
        rulesEngine.fireRules();

    }
}
