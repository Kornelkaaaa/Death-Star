# Death-Star

This project simulates the functionality of the Death Star, a fictional superweapon from the Star Wars universe. The Death Star has two main attributes: defensive capability and offensive power. It can defend against attacks and fire its primary weapon to destroy planets.

Classes
#DeathStar
The DeathStar class represents an instance of the Death Star. It has the following attributes and methods:

- initialDefensiveCapability: Represents the initial defensive capability of the Death Star.
- offensivePower: Represents the offensive power of the Death Star.
- DeathStar(int initialDefensiveCapability, int offensivePower): Constructor method to initialize a Death Star object with given defensive capability and offensive power.
- getDefensiveStrength(): Returns the current defensive strength of the Death Star.
- getFirePower(): Returns the current offensive power of the Death Star.
- defendAgainst(int strengthOfAttack): Method to defend the Death Star against an attack by reducing its defensive capability.
- firePrimaryWeapon(int energyNeededForFiringDeathStar): Method to fire the Death Star's primary weapon by consuming energy from its offensive power.
- toString(): Overrides the toString() method to provide a string representation of the Death Star object.

# DeathStarDriver
The DeathStarDriver class contains the main method to test the functionality of the DeathStar class. It demonstrates various scenarios such as initializing Death Star objects, checking defensive capability and offensive power, attacking and defending, and printing the status of Death Stars.

# Usage
#To use this project:

1. Compile both DeathStar.java and DeathStarDriver.java files.
2. Run the DeathStarDriver class.
3. Observe the output to see the simulation results of the Death Star's actions.
