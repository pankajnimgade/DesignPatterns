**Definition:** 
_Defines a set of encapsulated algorithms that can be swapped to carry out a specific behaviour_

_The Strategy pattern provides a way to define a family of algorithms, encapsulate each one as an object, and make them interchangeable._ 

![](img/strategy_pattern.png?raw=true "Title")

In the above diagram Context is composed of a Strategy. 
The context could be anything that would require changing behaviours - a class that provides sorting functionality perhaps. 
The Strategy is simply implemented as an interface, so that we can swap ConcreteStrategys in and out without effecting our Context.


![](img/strategy_seq.png?raw=true "Title")

Use of the Context from the client may vary 
- your client could tell the Context which strategy it would like to use, 
or the Context could decide on behalf of the client.