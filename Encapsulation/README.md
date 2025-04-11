# Inventory Management System

## Description
The Inventory Management System is a Java-based application that allows users to manage an inventory of items. The system supports adding, displaying, and categorizing items such as fruits and weapons. It demonstrates the use of object-oriented programming principles like inheritance, encapsulation, and polymorphism.

## Features
- Add items to the inventory.
- Support for different item types (e.g., `Fruit`, `Weapon`).
- Display detailed information about all items in the inventory.
- Filter and display items by type.

## Project Structure
The project is organized into the following files:
- `src/Inventory.java`: Manages the list of items and provides methods to add and display items.
- `src/Fruit.java`: Represents a specific type of item (fruit) with additional attributes.
- `src/Weapon.java`: Represents a specific type of item (weapon) with additional attributes.
- `src/Item.java`: Abstract base class for all items.
- `src/ItemStuff.java`: Interface defining common methods for items.
- `src/Main.java`: Entry point of the application.

## How to Run
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Compile and run the `Main` class located in `src/Main.java`.

## Example Usage
```plaintext
Item: Apples, Quantity: 2
Fruit: Apples, Quantity: 20, Type: Fuji
Weapon: Sword, Quantity: 2, Type: Melee, Damage: 75