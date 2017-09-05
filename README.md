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
