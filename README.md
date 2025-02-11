# Rise of Settlements

## Overview
Rise of Settlements is a **2D city-building strategy game**, developed in **Java** with **LibGDX**. The game allows players to build and manage villages, train units, trade resources, research technologies, and expand their settlements.

## Features
- **Village Management**: Manage multiple villages with different buildings and upgrade paths.
- **Resource Production**: Gather and manage essential resources.
- **Building System**: Construct various buildings that unlock production, research, and training capabilities.
- **Unit Training**: Recruit and manage different types of military units.
- **Trade Routes**: Establish and optimize trade routes between villages.
- **Research System**: Unlock new technologies through village universities.
- **Multiple Windows UI**: Support for detachable UI elements using LibGDX.
- **Game Save System**: Save and load game progress using JSON.

---

## Buildings
Buildings are essential for resource production, unit training, and research. Each building can be upgraded to increase efficiency.

### Starting Buildings
Each player starts with a village that contains the following buildings:
- **Town Hall**
- **Storage**
- **Farm**
- **Clay Pit**
- **Lumberjack**
- **Quarry**

### Constructible Buildings
Players can construct additional buildings to expand their village:
- **Wall**
- **Hideout**
- **Sawmill**
- **Brickmaker**
- **Stonecutter**
- **Smithy**
- **University**
- **Barracks**
- **Archery Range**
- **Stable**
- **Cannon Foundry**

### Building Progression
- Each building starts at **level 1** and can be upgraded up to **level 50**.
- Upgrading buildings costs **resources** but provides **benefits** such as increased production efficiency or stronger defenses.
- **Resource buildings** generate more resources as their level increases.
- **Unit buildings** allow the creation of military units after being added to the **construction queue**.
- All buildings function **only within their respective village**. Resources and units are **not globally shared**.

---

## World Map & Expansion
- The village exists on a **map** with multiple villages that can be **attacked and conquered**.
- Players can switch between owned villages and upgrade their buildings separately.
- This allows players to expand their **kingdom** and control multiple settlements.
- Trade routes can be established between villages to **automatically send resources**.

### Walls & Defense
- Players can construct and upgrade **walls** on the map to defend villages.
- Each **wall belongs to a village** and is built using that village’s resources.
- Walls provide increasing defense against enemy attacks as they are upgraded.

### Map Structure
The world map is based on a **coordinate system**, where each tile can be:
- A **village**
- A **wall**
- A **grassland**
- A **forest**

Villages are distributed across the coordinate system and function **independently**.

### Barbarian Villages
- Over time, **stronger barbarian villages** will appear on the map.
- These villages belong to an **AI-controlled kingdom** and become progressively more difficult to defeat.

---

## Units
Units are trained in military buildings and can be used for defense or expansion.

### Infantry
| Unit         | Trained in   | Strength   |
|-------------|-------------|-----------|
| **Swordsman** | Barracks   | Medium    |
| **Spearman**  | Barracks   | High vs Cavalry |

### Ranged
| Unit         | Trained in       | Strength   |
|-------------|----------------|-----------|
| **Archer**   | Archery Range  | Long-range attack |
| **Crossbowman** | Archery Range  | Strong armor penetration |

### Cavalry
| Unit          | Trained in  | Strength |
|--------------|------------|----------|
| **Sword Rider** | Stable  | Fast, melee |
| **Bow Rider**  | Stable  | Fast, ranged |

### Siege Units
| Unit           | Trained in       | Strength |
|--------------|-----------------|----------|
| **Light Cannon** | Cannon Foundry | High siege damage |
| **Heavy Cannon** | Cannon Foundry | Very high siege damage |

---

## Research System
Research is done at the University and provides bonuses such as:
- Faster unit training
- More efficient resource production
- Stronger units
- Increased trade capacity

---

## Trade System
- Each village has a **Marketplace** with a limited number of merchants.
- Merchants transport resources between villages based on available **trade route settings**.
- Trade can be **manually managed** or set to **automated intervals**.

### Trade Upgrades
| Research Level | Carrying Capacity |
|--------------|----------------|
| **Level 0**  | 100 Units |
| **Level 1**  | 500 Units |
| **Level 2**  | 1500 Units |
| **Level 3**  | 5000 Units |

---

## Future Plans
- **Multiplayer Support**: Web-based online gameplay.
- **Advanced AI**: NPC villages that interact dynamically with the player.
- **Expanded Economy**: More trading options and dynamic market prices.

### How to Play
1. **Build a Village**: Construct essential buildings.
2. **Train Units**: Unlock and train military forces.
3. **Expand**: Manage resources, establish trade routes, and upgrade technology.
4. **Dominate**: Use your army and economy to expand your influence.

**Enjoy building your kingdom in Rise of Settlements!**

