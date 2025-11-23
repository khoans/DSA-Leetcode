# 📘 **Comprehensive Design Pattern Selection Guide with Detailed Questions**

## **1. CREATIONAL PATTERNS**

### **Factory Method Pattern**
**When to use:** Object creation with subclass decision
- ✅ Do you want to defer the instantiation to subclasses?
- ✅ Are you creating objects that belong to families but don't know exact types?
- ✅ Do you want to keep the creation logic in one place?
- ✅ Are you using inheritance to decide which class to instantiate?
- ✅ Do you want to allow subclasses to decide which objects to create?
- ✅ Is the exact type of object determined at runtime by subclasses?
- ✅ Do you want to avoid hardcoding concrete classes in your code?
- ✅ Are you working with frameworks where the base class defines the creation logic?

### **Abstract Factory Pattern**
**When to use:** Creating families of related objects
- ✅ Do you need to create families of related or dependent objects?
- ✅ Do you want to ensure compatibility between objects in a family?
- ✅ Do you want to hide the creation details of objects?
- ✅ Are you working with multiple product families?
- ✅ Do you want to make it easy to switch between product families?
- ✅ Are you creating objects that should work together?
- ✅ Do you want to enforce constraints on which objects can be created together?
- ✅ Are you building platform-independent interfaces?

### **Builder Pattern**
**When to use:** Complex object construction
- ✅ Do you need to construct complex objects step by step?
- ✅ Do you want different representations of an object?
- ✅ Is the construction process independent of the parts?
- ✅ Do you have many constructor parameters?
- ✅ Are you building objects with optional components?
- ✅ Do you need to create immutable objects with many fields?
- ✅ Is the object construction algorithm the same but the parts vary?
- ✅ Do you want to create objects that require multiple steps to build?

### **Prototype Pattern**
**When to use:** Object cloning instead of creation
- ✅ Do you want to avoid subclassing for instantiation?
- ✅ Is object creation expensive compared to cloning?
- ✅ Do you need to create objects at runtime based on existing objects?
- ✅ Are you working with complex object hierarchies?
- ✅ Do you want to avoid the overhead of creating new objects?
- ✅ Are you working with objects that have many configuration options?
- ✅ Do you need to create objects with the same structure but different data?
- ✅ Are you working with object pools or caches?

### **Singleton Pattern**
**When to use:** Exactly one instance needed
- ✅ Do you need exactly one instance of a class?
- ✅ Do you need global access to that instance?
- ✅ Is the instance created only when needed (lazy loading)?
- ✅ Do you need thread-safe access to the instance?
- ✅ Are you managing shared resources (databases, file systems)?
- ✅ Do you need to control access to a shared resource?
- ✅ Are you implementing logging or configuration management?
- ✅ Do you want to ensure only one instance exists across the application?

---

## **2. STRUCTURAL PATTERNS**

### **Adapter Pattern**
**When to use:** Making incompatible interfaces work together
- ✅ Do you need to make incompatible interfaces work together?
- ✅ Do you want to reuse an existing class with a different interface?
- ✅ Are you working with legacy code that can't be modified?
- ✅ Do you need to convert one interface to another?
- ✅ Are you integrating third-party libraries?
- ✅ Do you want to wrap an existing class with a new interface?
- ✅ Are you working with classes that have similar functionality but different interfaces?
- ✅ Do you need to make old code work with new interfaces?

### **Bridge Pattern**
**When to use:** Separating abstraction from implementation
- ✅ Do you want to separate abstraction from implementation?
- ✅ Do you need to extend in two dimensions independently?
- ✅ Are you avoiding permanent binding between abstraction and implementation?
- ✅ Do you want to implement platform independence?
- ✅ Are you working with multiple platforms or rendering systems?
- ✅ Do you want to avoid subclass explosion?
- ✅ Are you designing a system that needs to work with multiple implementations?
- ✅ Do you want to change implementation at runtime?

### **Composite Pattern**
**When to use:** Part-whole hierarchies
- ✅ Do you have part-whole hierarchies?
- ✅ Do you want to treat individual objects and compositions uniformly?
- ✅ Are you building tree-like structures?
- ✅ Do you need recursive operations on the structure?
- ✅ Are you working with file systems or UI components?
- ✅ Do you want to build hierarchical data structures?
- ✅ Do you need to apply operations to both individual and composite objects?
- ✅ Are you working with organizational charts or menu systems?

### **Decorator Pattern**
**When to use:** Adding behavior dynamically
- ✅ Do you want to add responsibilities to objects dynamically?
- ✅ Do you want to avoid subclassing for extensions?
- ✅ Do you need to combine several behaviors flexibly?
- ✅ Are you working with I/O streams or UI components?
- ✅ Do you want to wrap objects with additional functionality?
- ✅ Are you working with formatting or processing pipelines?
- ✅ Do you need to add functionality without affecting other objects?
- ✅ Are you working with security or logging wrappers?

### **Facade Pattern**
**When to use:** Simplifying complex subsystems
- ✅ Do you want to simplify a complex subsystem?
- ✅ Do you need a unified interface to a set of interfaces?
- ✅ Are you working with complex libraries or APIs?
- ✅ Do you want to decouple client from subsystem dependencies?
- ✅ Are you building application frameworks?
- ✅ Do you want to provide a simple interface to complex systems?
- ✅ Are you working with multiple subsystems that need coordination?
- ✅ Do you want to hide the complexity of subsystems?

### **Flyweight Pattern**
**When to use:** Memory optimization
- ✅ Do you have many similar objects consuming excessive memory?
- ✅ Do objects have redundant data that can be shared?
- ✅ Are you working with text processing or graphics?
- ✅ Do you need to optimize performance by reducing object creation?
- ✅ Are you working with large datasets with common properties?
- ✅ Do you have objects with intrinsic (shared) and extrinsic (unique) state?
- ✅ Are you working with games or GUI systems with many similar objects?
- ✅ Do you want to reduce memory footprint of similar objects?

### **Proxy Pattern**
**When to use:** Controlling access to objects
- ✅ Do you want to control access to an object?
- ✅ Do you need lazy initialization of expensive objects?
- ✅ Are you working with remote objects or security checks?
- ✅ Do you want to add behavior without changing the object?
- ✅ Are you implementing virtual proxies for expensive resources?
- ✅ Do you need protection proxies for security?
- ✅ Are you working with remote proxies for distributed systems?
- ✅ Do you want to implement smart references with additional functionality?

---

## **3. BEHAVIORAL PATTERNS**

### **Chain of Responsibility Pattern**
**When to use:** Multiple handlers for requests
- ✅ Do you have multiple objects that can handle a request?
- ✅ Do you want to avoid hardcoding the receiver?
- ✅ Do you want to give more than one object a chance to handle the request?
- ✅ Are you implementing event handling or exception handling?
- ✅ Do you want to decouple senders and receivers?
- ✅ Are you building approval systems or request processing?
- ✅ Do you need to pass requests through a chain of handlers?
- ✅ Are you implementing filters or middleware?

### **Command Pattern**
**When to use:** Parameterizing objects with requests
- ✅ Do you want to parameterize objects with different requests?
- ✅ Do you need to queue or log operations?
- ✅ Do you want to support undo/redo functionality?
- ✅ Are you building GUI applications or macro systems?
- ✅ Do you want to support transactional behavior?
- ✅ Are you implementing batch processing or macro commands?
- ✅ Do you need to store operations for later execution?
- ✅ Are you building action-based systems?

### **Interpreter Pattern**
**When to use:** Implementing simple languages
- ✅ Do you have a simple language to implement?
- ✅ Is the grammar small and simple?
- ✅ Do you need to evaluate expressions frequently?
- ✅ Are you building rule engines or parsers?
- ✅ Do you want to represent grammar as objects?
- ✅ Are you working with mathematical expressions or queries?
- ✅ Do you need to evaluate sentences in a language?
- ✅ Are you building domain-specific languages (DSLs)?

### **Iterator Pattern**
**When to use:** Sequential access to collections
- ✅ Do you want to access elements of an aggregate object sequentially?
- ✅ Do you want to provide a uniform interface for traversal?
- ✅ Do you want to support multiple traversals simultaneously?
- ✅ Are you working with collections or data structures?
- ✅ Do you want to hide the internal structure of collections?
- ✅ Do you need to traverse different types of collections uniformly?
- ✅ Are you working with tree or graph traversal?
- ✅ Do you want to support different traversal strategies?

### **Mediator Pattern**
**When to use:** Controlling complex interactions
- ✅ Do you have tight coupling between multiple objects?
- ✅ Do objects communicate in complex ways?
- ✅ Do you want to reuse objects in different contexts?
- ✅ Are you building GUI systems or chat systems?
- ✅ Do you want to centralize communication logic?
- ✅ Are you working with multiple interacting components?
- ✅ Do you want to reduce dependencies between objects?
- ✅ Are you building event-driven systems?

### **Memento Pattern**
**When to use:** Capturing and restoring state
- ✅ Do you need to capture and restore object state?
- ✅ Do you want to implement undo/redo functionality?
- ✅ Do you want to maintain history of object states?
- ✅ Do you need transaction rollback capabilities?
- ✅ Do you want to preserve encapsulation while saving state?
- ✅ Are you building text editors or drawing applications?
- ✅ Do you need to save and restore game states?
- ✅ Are you implementing checkpointing functionality?

### **Observer Pattern**
**When to use:** One-to-many dependencies
- ✅ Do you have one-to-many dependency between objects?
- ✅ Do you want loose coupling between subjects and observers?
- ✅ Do you need broadcast communication?
- ✅ Are you building event-driven systems or GUI applications?
- ✅ Do you want to support multiple views of the same data?
- ✅ Are you working with real-time data updates?
- ✅ Do you need automatic notification of state changes?
- ✅ Are you implementing MVC architecture?

### **State Pattern**
**When to use:** Changing behavior based on state
- ✅ Does your object have multiple states with different behaviors?
- ✅ Do you have large conditional statements based on object state?
- ✅ Do you need to change behavior based on internal state?
- ✅ Are you implementing workflow systems or finite state machines?
- ✅ Do you want to eliminate conditional statements?
- ✅ Are you working with order processing or document management?
- ✅ Do you need to manage complex state transitions?
- ✅ Are you building game character states or media players?

### **Strategy Pattern**
**When to use:** Multiple algorithms
- ✅ Do you have multiple algorithms for the same operation?
- ✅ Do you want to switch algorithms at runtime?
- ✅ Do you have conditional logic that selects different algorithms?
- ✅ Do you want to decouple algorithm implementation from client code?
- ✅ Do you want to test different algorithms easily?
- ✅ Are you implementing different sorting or compression algorithms?
- ✅ Do you need to swap algorithms without changing client code?
- ✅ Are you building payment or authentication systems?

### **Template Method Pattern**
**When to use:** Fixed algorithm structure
- ✅ Do you have an algorithm with a fixed structure but variable steps?
- ✅ Do you want to avoid code duplication across similar algorithms?
- ✅ Do you have multiple classes following the same algorithm pattern?
- ✅ Do you want to control where subclasses can extend the algorithm?
- ✅ Are you building frameworks or base classes?
- ✅ Do you want to define a skeleton with customizable steps?
- ✅ Are you implementing game loops or processing pipelines?
- ✅ Do you want to enforce execution order of operations?

### **Visitor Pattern**
**When to use:** Separating algorithms from structures
- ✅ Do you have object structures that rarely change?
- ✅ Do you need to perform many different operations on these objects?
- ✅ Do you want to avoid adding operations to element classes?
- ✅ Do you need double dispatch functionality?
- ✅ Are you building compilers or interpreters?
- ✅ Do you want to add operations without modifying existing classes?
- ✅ Are you working with complex object hierarchies?
- ✅ Do you need type-specific processing without instanceof checks?

---

## **Decision Flowchart with Detailed Questions**

```
1. Are you creating objects?
   ├── Need subclass to decide creation? → Factory Method
   ├── Need families of related objects? → Abstract Factory
   ├── Complex step-by-step construction? → Builder
   ├── Clone instead of create? → Prototype
   └── Exactly one instance needed? → Singleton

2. Are you organizing structure?
   ├── Incompatible interfaces? → Adapter
   ├── Separate abstraction from impl? → Bridge
   ├── Part-whole hierarchies? → Composite
   ├── Add behavior dynamically? → Decorator
   ├── Simplify complex subsystem? → Facade
   ├── Memory optimization needed? → Flyweight
   └── Control access to object? → Proxy

3. Are you handling object interaction?
   ├── Multiple handlers for request? → Chain of Responsibility
   ├── Parameterize with requests? → Command
   ├── Implement simple language? → Interpreter
   ├── Sequential access needed? → Iterator
   ├── Complex interactions? → Mediator
   ├── Capture/restore state? → Memento
   ├── One-to-many dependency? → Observer
   ├── Change behavior by state? → State
   ├── Multiple algorithms? → Strategy
   ├── Fixed algorithm structure? → Template Method
   └── Separate algorithm from structure? → Visitor

4. Are you building frameworks/libraries?
   ├── Need flexible object creation? → Factory/Abstract Factory
   ├── Need to extend functionality? → Strategy/Command
   ├── Need to manage state? → State/Memento
   └── Need to separate concerns? → Visitor/Mediator

5. Are you optimizing performance?
   ├── Memory issues? → Flyweight
   ├── Need caching? → Prototype/Singleton
   └── Need lazy loading? → Proxy/Factory

6. Are you working with GUI/Event-driven systems?
   ├── Need to handle events? → Observer/Command
   ├── Need to manage components? → Composite/Mediator
   └── Need to handle user actions? → Command/Strategy

7. Are you building enterprise applications?
   ├── Need to manage resources? → Singleton/Factory
   ├── Need to handle business logic? → Strategy/State
   └── Need to manage transactions? → Command/Memento
```

This comprehensive guide provides detailed questions for each design pattern, helping you make informed decisions about which pattern best fits your specific requirements and constraints.
