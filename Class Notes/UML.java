/*
        * UML - Unified Modeling Language *
- A set of graphical notation techniques to create visual models of software system
- Used for specifying, visualizing, constructing, documenting, business modeling, & communications

Types of UML:

- Structural Diagram:

    - Object Diagram:
        - a snapshot of the objects in a system at a specific moment in time. It shows how instances (objects) 
        of classes relate to each other at a particular point.

    - Functional Diagram
        - Use Case Diagram: 
        - Actors
            - External Entities
            - Not part of the system
            - Can be primary or secondary
            - Primary initiates (Left) & Secondary Reacts (Right)
        - Use Cases
            - Major system components
            - Name indicates purpose
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

    - Sequence Diagram:
       - A Sequence Diagram shows the flow of interactions between entities (actors, systems, or objects) over time.
       - It is a step-by-step depiction of how messages are passed between components, showing the order of actions.
       - It includes lifelines, messages, conditions, and alternatives, helping visualize the logic behind system interactions. 
    
    - Activity Diagram: 
       - Similar to a flow chart
       - Start node (colored circle)
       - Activities (rounded rectangles)
       - Control Flow (arrows)
       - Conditions (diamonds)
       - Forks (bar with one input and multiple outputs)
       - Joins (bar with one output and multiple inputs)
       - End node (circle with smaller colored circle inside)

        USE CASES:
        Process Modeling: To show the flow of tasks within a business or technical process.
            Example: Modeling a customer purchasing process, from browsing to payment.
        System Workflow: To visualize how a system responds to various inputs.
            Example: Showing how a system handles user login, from entering credentials to providing access or showing an error.
        Parallel Processing: To demonstrate how tasks can run concurrently and then be synchronized.
            Example: In a hospital system, parallel processes might involve updating patient records and notifying doctors simultaneously.
    
     - State Diagram:
        - Behavior of a single object
        - Models one part of the system
        - Start (solid circle) required
        - End (circle with solid circle inside it) optional
        - States - Rounded Rectangles
        - Transitions - Arrows between states


Boundary Objects (Interface Layer):
    - Boundary objects represent the interaction between the system and the outside world (e.g., users, external systems).
     They define input and output for the system.
    - They handle the communication between the user and the system. They can represent screens, forms, or APIs.
    
    Example:
        A Login Form where users input their username and password is a 
        boundary object.
        It interacts with the user and collects information to send to the 
        system.
        ATM Screen: When you use an ATM, the screen showing buttons 
        to withdraw money is a boundary object.

Entity Objects (Data Layer):
    - Entity objects represent the data and business logic of the system. They are typically connected to the system's underlying database.
      They store and manage the data of the system. This could be customer information, product lists, or bank account details.
    
    Example:
        A Customer object that holds information like name, address, and customer 
        ID is an entity object.
        In a banking system, an Account object that stores the account balance 
        and transaction history is an entity object.

Control Objects (Logic Layer):
    - Control objects manage the flow of the application and the interactions between boundary and entity objects. 
      They implement business logic.They coordinate the overall workflow and make decisions about how the system should behave 
     based on user input and system data.
    
    Example:
        A LoginController that takes the data from the login form (boundary object),
        checks the user's credentials by interacting with the database (entity object), 
        and decides whether to grant or deny access.
        In an online shopping system, a ShoppingCartController would manage the
        process of adding items to a cart and checking out.

 */