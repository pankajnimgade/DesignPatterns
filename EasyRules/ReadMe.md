Most business rules can be represented by the following definition:

    Name:        a unique rule name within a rules namespace
    Description: a brief description of the rule
    Priority:    rule priority regarding to other rules
    Conditions:  set of conditions that should be satisfied to apply the rule
    Actions:     set of actions to perform when conditions are satisfied

Easy Rules provides an abstraction for each of these key points to define business rules.

Next section will show you how to define a rule either by extending a base class provided by Easy Rules or by annotating your own domain class.