# Eldoria Game System

## Description
Eldoria is a fantasy realm under threat from the Shadowlord. Heroes across the realm join forces to complete quests, gain powers, and save the land. This project is part of the game development team, and it aims to manage characters, quests, and battles in the game.

## Project Structure
This project follows an object-oriented approach, and all necessary classes and interfaces are implemented to create a functioning system. Below is a summary of the main classes and interfaces

### Classes
- Character (Abstract Class) Represents any game character. It has a name and level and requires a method `speak()`.
- Hero (Class) Inherits from `Character`. Represents playable characters in the game.
- Enemy (Class) Inherits from `Character`. Represents game enemies.
- QuestBoard (Class) Manages quests and assigns them to characters that implement the `Questable` interface.
- BattleManager (Class) Simulates a battle between a Hero and an Enemy.

### Interface
- Questable (Interface) Characters that can accept quests must implement this interface. It includes the method `acceptQuest(String questName)`.

## Features
- Character Creation Create heroes and enemies.
- Quest Management Assign quests to characters using the Quest Board.
- Battle Simulation Simulate battles between Heroes and Enemies.
- Git Workflow GitFlow-based project structure, with branches for weekly development tasks.

## Setup
1. Clone this repository to your local machine.
2. Open the `eldoria-game` folder in your IDE (e.g., IntelliJ IDEA).
3. Build the project using Maven.

## Branches
- Week-5 Initial setup and structure of the game system.
- Week-6 Updates and additional features, including the introduction of Hero and Enemy classes.

## Git Workflow
1. Create a new branch for each week's development.
2. Make sure to commit frequently with descriptive commit messages.
3. Push changes to the remote repository regularly.

## Example Output
