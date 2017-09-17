# design-patterns-tutorial
Samples of most popular design patterns for java

[Java Design Patterns Tutorial](https://www.javacodegeeks.com/2015/09/java-design-patterns.html) from javacodegeeks

## [Adapter](https://www.javacodegeeks.com/2015/09/adapter-design-pattern.html)
- Current Code with the old vendors's API (XPay in the example)
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/adapter_pattern_1.jpg" alt="Adapter 1">

- Now, the current code interface is not compatible with the new vendor’s API. (PayD in the example)
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/adapter_pattern_2.jpg" alt="Adapter 2">

- Adapter solution
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/adapter_pattern_3.jpg" alt="Adapter 3">

## [Facade](https://www.javacodegeeks.com/2015/09/facade-design-pattern.html)
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/facade_pattern.jpg" alt="Facade 1">

## [Composite](https://www.javacodegeeks.com/2015/09/composite-design-pattern.html)
- Typical Composite object structure.
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/composite_pattern.jpg" alt="Composite 1">

- The Component defines an interface or abstract class for all objects in the composition both the composite and the leaf nodes. The Component may implement a default behavior for generic methods.

- The Composite’s role is to define the behavior of the components having children and to store child components. The Composite also implements the Leaf related operations.
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/composite_pattern_class_diagram.jpg" alt="Composite 2">

## [Bridge](https://www.javacodegeeks.com/2015/09/bridge-design-pattern.html)
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/class_diagram_2.jpg" alt="Bridge 1">

- The components of the Bridge Pattern comprise of an abstraction, refined abstraction, an implementer, and concrete implementer.
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/class_diagram_3.jpg" alt="Bridge 2">

## [Singleton](https://www.javacodegeeks.com/2015/09/singleton-design-pattern.html)
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/singleton_class_diagram.jpg" alt="Singleton 1">

## [Observer](https://www.javacodegeeks.com/2015/09/observer-design-pattern.html)
- The key objects in this pattern are subject and observer.
- A subject may have any number of dependent observers.
- All observers are notified whenever the subject undergoes a change in its state. In response, each observer will query the subject to synchronize its state with the subject state.
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/class_diagram_11.jpg" alt="Observer 1">

## [Mediator](https://www.javacodegeeks.com/2015/09/mediator-design-pattern.html)
- Before Mediator the interaction between the classes might look like this, containing references of each other.
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/Mediatorclass_diagram_1.jpg" alt="Mediator 1">

- After implementing a Mediator the interaction between the classes looks like this, only containing a reference to the mediator.
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/Mediatorclass_diagram_2.jpg" alt="Mediator 2">

- Using a Mediator means the interaction code has to reside in only one place, and that makes it easier to maintain.
- More formal structure of the Mediator Pattern.
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/Mediatorclass_diagram_3.jpg" alt="Mediator 3">

The major participants of the Mediator Pattern are:
1. Mediator: Defines an interface for communicating with Colleague objects.
2. ConcreteMediator: Implements cooperative behavior by coordinating Colleague objects. It also knows and maintains its colleagues.
3. Colleague Classes: Each Colleague class knows its Mediator object. Each colleague communicates with its mediator whenever it would have otherwise communicated with another colleague.
