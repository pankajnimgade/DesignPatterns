package three.source.easy.rule.shop;

import org.easyrules.api.RulesEngine;

import java.util.Scanner;

import static org.easyrules.core.JmxRulesEngineBuilder.aNewJmxRulesEngine;

/**
 * Created by Pankaj Nimgade on 09-05-2016.
 */
public class Launcher {

    public static void main(String[] args) {
        //create a person instance
        Person tom = new Person("Tom", 20);
        System.out.println("Tom: Hi! can I have some Vodka please?");

        //create a Jmx rules engine
        RulesEngine rulesEngine = aNewJmxRulesEngine()
                .named("shop rules engine")
                .build();

        //register rules
        rulesEngine.registerRule(new AgeRule(tom));
        rulesEngine.registerRule(new AlcoholRule(tom));

        //fire rules
        rulesEngine.fireRules();

        // Update adult age via a JMX client.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Change adult age via a JMX client and then press enter");
        scanner.nextLine();

        System.out.println("Re fire rules after updating adult age...");

        rulesEngine.fireRules();
    }
}
