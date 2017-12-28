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

## [Proxy](https://www.javacodegeeks.com/2015/09/proxy-design-pattern.html)
- The client does not know about the proxy, the proxy acts as an original object for the client.
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/Proxyclass_diagram_11.jpg" alt="Proxy 1">

1. Proxy:
- 1a. Maintains a reference that lets the proxy access the real subject. Proxy may refer to a Subject if the RealSubject and Subject interfaces are the same.
- 1b. Provides an interface identical to Subject’s so that a proxy can be substituted for the real subject.
- 1c. Controls access to the real subject and may be responsible for creating and deleting it.
2. Subject:
- 2a. Defines the common interface for RealSubject and Proxy so that a Proxy can be used anywhere a RealSubject is expected.
3. RealSubject:
- 3a. Defines the real object that the proxy represents.

There are three main variations to the Proxy Pattern:
1. A remote proxy provides a local representative for an object in a different address space.
2. A virtual proxy creates expensive objects on demand.
3. A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.

## [Chain of responsibility](https://www.javacodegeeks.com/2015/09/chain-of-responsibility-design-pattern-2.html)
<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/chain_of_responsibility_class_diagram.jpg" alt="Chain of responsibility 1">

Handler
1. Defines an interface for handling requests.
2. (Optionally) Implements the successor link.

ConcreteHandler
1. Handles requests it is responsible for.
2. Can access its successor.
3. If the ConcreteHandler can handle the request, it does so; otherwise it forwards the request to its successor.

Client
1. Initiates the request to a ConcreteHandler object on the chain.

## [Builder](https://www.javacodegeeks.com/2015/09/builder-design-pattern.html)
The intent of the Builder Pattern is to separate the construction of a complex object from its representation, so that the same construction process can create different representations.

<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/builder_class_diagram.jpg" alt="Builder 1">

Builder
- Specifies an abstract interface for creating parts of a Product object.

ConcreteBuilder
- Constructs and assembles parts of the product by implementing the Builder interface.
- Defines and keeps track of the representation it creates.
- Provides an interface for retrieving the product.

Director
- Constructs an object using the Builder interface.

Product
- Represents the complex object under construction. ConcreteBuilder builds the product’s internal representation and defines the process by which it’s assembled.
- Includes classes that define the constituent parts, including interfaces for assembling the parts into the final result.

## [Flyweight](https://www.javacodegeeks.com/2015/09/flyweight-design-pattern.html)
The intent of the Flyweight Pattern is to use shared objects to support large numbers of fine-grained objects efficiently.

<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/flyweight_class_diagram.jpg" alt="Flyweight 1">

Flyweight
- Declares an interface through which flyweights can receive and act on extrinsic state.

ConcreteFlyweight
- Implements the Flyweight interface and adds storage for intrinsic state, if any. A ConcreteFlyweight object must be sharable. Any state it stores must be intrinsic; that is, it must be independent of the ConcreteFlyweight object’s context.

FlyweightFactory
- Creates and manages flyweight objects.
- Ensures that flyweights are shared properly. When a client requests a flyweight, the FlyweightFactory object supplies an existing instance or creates one, if none exists.

Client
- Maintains a reference to flyweight(s).
- Computes or stores the extrinsic state of flyweight(s).

## [Factory Method](https://www.javacodegeeks.com/2015/09/factory-method-design-pattern.html)
The Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types.

<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/Factoryclass_diagram_1.jpg" alt="Factory Method 1">

Product
- Defines the interface of objects the factory method creates.

ConcreteProduct
- Implements the Product interface.

Creator
- Declares the factory method, which returns an object of type Product. Creator may also define a default implementation of the factory method that returns a default ConcreteProduct object.
- May call the factory method to create a Product object.

ConcreteCreator
- Overrides the factory method to return an instance of a ConcreteProduct.

## [Abstract Factory](https://www.javacodegeeks.com/2015/09/abstract-factory-design-pattern.html)
The Abstract Factory provides an interface for creating families of related or dependent objects without specifying their concrete classes.

<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/Abstractclass_diagram_1.jpg" alt="Abstract Factory 1">

AbstractFactory
- Declares an interface for operations that create abstract product objects.

ConcreteFactory
- Implements the operations to create concrete product objects.

AbstractProduct
- Declares an interface for a type of product object.

ConcreteProduct
- Defines a product object to be created by the corresponding concrete factory.
- Implements the AbstractProduct interface.

Client
- Uses only interfaces declared by AbstractFactory and AbstractProduct classes.

## [Prototype](https://www.javacodegeeks.com/2015/09/prototype-design-pattern.html)
The Prototype design pattern is used to specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/PrototypePatternclass_diagram_11.jpg" alt="Prototype 1">

Prototype
- Declares an interface for cloning itself.

ConcretePrototype
- Implements an operation for cloning itself.

Client
- Creates a new object by asking a prototype to clone itself.

## [Memento](https://www.javacodegeeks.com/2015/09/memento-design-pattern.html)
The Memento Pattern’s intent is, without violating encapsulation, to capture and externalize an object’s internal state so that the object can be restored to this state later.

<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/Mementoclass_diagram_12.jpg" alt="Memento 1">

Memento
- Stores internal state of the Originator object. The memento may store as much or as little of the originator’s internal state as necessary at its originator’s discretion.
- Protects against access by objects other than the originator. Mementos have effectively two interfaces. Caretaker sees a narrow interface to the Memento—it can only pass the memento to other objects. Originator, in contrast, sees a wide interface, one that lets it access all the data necessary to restore itself to its previous state. Ideally, only the originator that produced the memento would be permitted to access the memento’s internal state.

Originator
- Creates a memento containing a snapshot of its current internal state.
- Uses the memento to restore its internal state.

Caretaker
- Is responsible for the memento’s safekeeping.
- Never operates on or examines the contents of a memento.

## [Template](https://www.javacodegeeks.com/2015/09/template-design-pattern.html)
The Template Pattern defines the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses to redefine certain steps of an algorithm without changing the algorithm’s structure.

<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/TemplatePatternclass_diagram_13.jpg" alt="Template 1">

AbstractClass
- Defines abstract primitive operations that concrete subclasses define to implement steps of an algorithm.
- Implements a template method defining the skeleton of an algorithm. The template method calls primitive operations as well as operations defined in AbstractClass or those of other objects.

ConcreteClass
- Implements the primitive operations to carry.

## [State](https://www.javacodegeeks.com/2015/09/state-design-pattern.html)
The State Design Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

<img src="https://www.javacodegeeks.com/wp-content/uploads/2015/09/sta_design_pattern_class_diagram.jpg" alt="State 1">

Context
- Defines the interface of interest to clients.
- Maintains an instance of a ConcreteState subclass that defines the current state.

State
- Defines an interface for encapsulating the behavior associated with a particular state of the Context.

ConcreteState subclasses
- Each subclass implements a behavior associated with a state of the Context.
