# State Pattern
* Allows an object to change its behaviour when its internal state changes
* State of the object is encapsulated in different state objects
## State Machine: Terminology
A State is a description of the status of a system that is waiting to execute a transition.
A transition is a set of actions to be executed when **a condition is fulfilled or when an event is received**

## Implementation
1. Define a State interface that contains a method for every action in the system.
```java
public interface ViewingState {
    public abstract void onLock();
    public abstract void onPlay();
    public abstract void onNext();
}
```
2. Implement a State class for every state of the system. these classes will be responsible for the behavior of the machine when it is in the corresponding state.
3. Delegate the State class to do the work.

The structure is very similar to Strategy Pattern, the only difference is that the for Strategy, context/client changes the behaviour via different strategies.

For state, the client's behaviour is depended on its internal state.