`Optional` - A utility class, to make the code use the null properly.

`Optional.of()` - It returns the instance of Optional class to be used as a parameter. It checks passed, not to be 'null'.

`Optional.get()`- It gets the value of the input stored in the Optional class.

Using the Optional class, you can check whether caller method is passing a proper parameter or not.

**Immutable Class: -**

Immutable class is a class which once created, it's contents can not be changed. Immutable objects are the objects whose state can not be changed once constructed.

To create a class immutable, you need to follow following steps:

Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Don’t provide setter methods for variables
Make all mutable fields final so that it’s value can be assigned only once.
Initialize all the fields via a constructor performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
