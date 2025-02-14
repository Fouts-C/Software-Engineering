/*
        * UML - Unified Modeling Language *
- A set of graphical notation techniques to create visual models of software system
- Used for specifying, visualizing, constructing, documenting, business modeling, & communications

Types of UML:

- Structural Diagram

- Object Diagram

- Functional Diagram
    - Use Case Diagram: 
    - Actors
        - External Entities
        - Not part of the system
        - Can be primary or secondary
        - Primary initiates (Left) & Secondary Reacts (Right)
    - Use Cases
        - Major system components
        - Nmae indicates purpose
        - Starts with verb
    - Interaction (lines)
        - Indicates which use cases each actors interact with
        - Includes, extends, parent-child relationship
    Ex: 
    Login to App -> Check Balance -> Transfer Funds
    User (Primary Actor) has access to all functions while Bank (Secondary Actor) accesses check balance & transfer funds

- Class Diagram:
    - A class diagram is a type of UML that represents structure of a system by showing its classes, their atributes,
      methods, & the relationship between the classes. It provides a blueprint for creating code or conceptual model for 
      understanding the system.
    
    - Unary Association:
        A -> B : Class A knows everything about class B, but B knows nothing about class A
        Classes are represented with a rectangle
    
    - Type of Association:
        - Aggregation: Association with a whole part relationship <> (Lake <> -> Slide)
                       Independent (Can have slide without lake)
        - Composition: Company <>(Filled diamond) -> Department
                       Dependent  (Can't have department without company)

- Behavioral
    - Sequence Diagram
    - Activity Diagram 
    - State Diagram



        











 */