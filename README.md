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

### Production Buildings
| Building         | Function                        |
|-----------------|--------------------------------|
| **Farm**        | Produces food for units        |
| **Lumber Mill** | Produces wood for buildings   |
| **Quarry**      | Produces stone for defenses   |
| **Iron Mine**   | Produces iron for weapons     |

### Military Buildings
| Building          | Unlocks Unit Training      |
|------------------|-------------------------|
| **Barracks**     | Swordsmen, Spearmen      |
| **Archery Range** | Archers, Crossbowmen    |
| **Stable**       | Cavalry Units           |
| **Cannon Foundry** | Light & Heavy Cannons  |

### Trade & Research Buildings
| Building        | Function                                       |
|---------------|----------------------------------------------|
| **Marketplace** | Enables trade and merchant management     |
| **University** | Unlocks research for advanced technologies |

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

