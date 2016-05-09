In this tutorial, we have a shop application and we would like to implement the following requirement: deny children from buying alcohol. The minimal legal age to be considered as adult is 18. This tutorial is split in two parts:

    Part 1: Implement the business rule of denying children from buying alcohol
    Part 2: Make the legal age configurable via JMX so we can change it at runtime


We will define the following rules:

    Rule 1: should operate an a Person instance, check that the person age is greater than 18 and set the adult flag.
    Rule 2: should operate an a Person instance, check that the person is adult and deny children (ie, non adult) from buying alcohol.

Rule 1 should be fired before rule 2. We will set rule 1 priority to 1 and rule 2 priority to 2 so that Easy Rules engine fire them in this order.