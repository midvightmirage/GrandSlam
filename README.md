# 1. Enderite Resource

## **1 Corrupted Remnants**
**Generation**:
- **Location**: The End dimension, Y=8-24 (central island only)
- **Spawn Rate**: 1.2 blocks per chunk (rare, veins of 1-2)

**Block Properties**:
- **Block Name**: Corrupted Remnant (loose block, like Ancient Debris)
- **Texture**: Black-purple crystalline material
- **Light**: Emits light level 3 + purple particles; intensifies to level 12 if it is inside an explosion radius, intensifies to 15 if its an explosion that destroys it
- **Mining**: Requires diamond+ pickaxe; blast-resistant (1200)
- **Processing**: Blast furnace only, 20 seconds (2x fuel) → Enderite Ingot
- **On Mine**: Purple flash block lighting (subtle), screen (subtle, especially when not looking at) and particle effect (more intense if destroyed by explosion    )

## 2. Tools
```
Sword   | 4063 Durability |  9.0 Base Damage | - 2.4 Attack Speed | Something special that isnt overkill
Axe     | 4063 Durability | 10.0 Base Damage | +10.0 Mining Speed | Something special that isnt overkill
Pickaxe | 4063 Durability |  6.0 Base Damage | +12.0 Mining Speed | 2x portal scraping; Silk Touch drops reinforced deepslate
Shovel  | 4063 Durability |  6.5 Base Damage | +14.0 Mining Speed | Something special that isnt overkill
Hoe     | 4063 Durability |  4.0 Base Damage
```

## 3. Armor
```
Helmet     | 815 Durability |  4 Protection | 4 Toughness  | Something special that isnt overkill
Chestplate | 1185           |  9 Protection | 4 Toughness  | Something special that isnt overkill
Leggings   | 1113           |  7 Protection | 4 Toughness  | Something special that isnt overkill
Boots      | 963            |  4 Protection | 4 Toughness  | Something special that isnt overkill

Full Set   | .............. | 24 Protection | 16 Toughness | Bonus is below
Bonus: Feather Falling IV innate, stacks with Feather Falling, so level 4 becomes level 8 functionally (the only default bonus)
```

### What is Core Infusion
Use the core of a powerful entity like a Revenant (Place the core in an enchanting table and that gives those enchantments, infusing the core, and then put it with the item you enchant in an anvil)
Using infusion enchantments with regular enchantments deals deals 20 hearts of damage. Totems of undying do work and also so does resistance. The damage it deals is based on an equal chance of either dealing no damage at all, fire aspecting, frostbiting or withering you when it happens.

# 2. Sculk Mechanics & Dimension

## **1. Portal Extraction Mechanics**

### **a. Scraping End Portal Frame**
- **Tool**: Netherite or Enderite pickaxe only
- **Action**: Hold right-click on frame's bottom surface
- **Progress**: 
  - Netherite: 160 ticks (8 seconds)
  - Enderite: 80 ticks (4 seconds)
- **Result**: Frame becomes **Exposed End Frame** (underside exposed)
- **Reversibility**: Apply Eye of Ender to restore original frame

### **b. Essence Extraction**
- **Item**: Water Bottle (normal water glass bottle, empty bottle cannot extract)
- **Action**: Right-click Exposed End Frame
- **Danger**: If original portal is still active, starts hidden 12-second explosion countdown
- **Output**: Bottle of Nullspace Essence (purple swirling liquid, stackable to 16)
- **Failure**: Right click with empty hand deals 2 hearts of wither 2 damage + 5 sec Nausea
- **Particles**: Purple drip particles during extraction

## **2. Frame Crafting & Assembly**

### **a. Nullstone Frame Recipe**
```
|                |                   |                |
| -------------- | ----------------- | -------------- |
| Air            | Enderite Ingot    | Air            |
| Enderite Ingot | Bottle of Essence | Enderite Ingot |
| Air            | Enderite Ingot    | Air            |
```

- **Yield**: 1 Nullstone Frame block
- **Properties**:
  - Hardness: 50 (diamond+ pick to mine)
  - Blast Resistance: 1200
  - Texture: Reinforced deepslate with animated purple veins
  - Light: Emits level 5 when placed

### **b. Portal Construction**
- **Placement**: On **upper side** (top face) of Reinforced Deepslate blocks
- **Shape**: Any rectangular hollow (min 2x3, max 10x10 interior)
- **Assembly**: Insert Tethered Eyes into frames to activate

## **3. Eye Upgrading & Portal States**

### **a Tethered Eye Recipe**
- **Smithing Table**: Eye of Ender + Enderite Ingot + Tethering Template
- **Output**: Tethered Eye (stackable to 16)
- **Placement**: Right click on frames, is there to filter the essence to be traversable and to even open the portal in the first place

### **b Portal State Machine**
- **INACTIVE**: Built, dark purple fluid, no function
- **ACTIVE**: Warden <50% HP gets near portal → bright vortex, **reusable entry** (multiple uses)
- **DEPLETED**: After **first hallway traversal**, fluid turns black, blocks entry until reactivated
- **Reactivation**: Lure another <50% HP warden → returns to ACTIVE (loop)
- **CORRUPTED**: Warden ≥50% HP gets near portal → black fluid, unpassable until Revenant death
- **Post-Revenant**: Returns to INACTIVE

## **4. Warden Boss: Revenant**

### **a Luring Mechanics**
**Echo Resonator:**
- **Crafting**: Echo Shard + Enderite Ingot + Amethyst Shard
- **Usage**: Throw within 8 blocks of warden → pathfinds to portal (128-block targetting range, 64-block range for movement, stops after 64 blocks)
- **Duration**: 30 seconds, 3 uses

### **b. Tansformation**
- **Trigger**: Kill vanilla warden that corrupted portal (within 32 blocks of central area, otherwise if outside ancient city portal inactive and a dispersal animation and if within ancient city but not within 32 blocks stays active and spawns Revenant upon player entering 32 blocks range)
- **Sequence**: 5-second death animation → grows 1.5x → explodes with a purple flash of light → Revenant spawns
- **Health**: 750 HP (full health on spawn)
- **Arena**: Portal location (no special arena)

### **c. Revenant Boss Fight**
**Status**: Core mechanics drafted, specifics undecided
- **Abilities**: Summons, [TBD]
- **Summons**: [TBD]
- **Phases**: 100-50%, 50-25%, 25-0% health thresholds (timing/values TBD)
- **Drops**: Revenant Core (100%), 2-4 Enderite Ingots, 5-8 Echo Shards

### **d. Portal Restoration**
- **Revenant Core**: 100% drop, used for Grand Carishan
- **Post-Death**: Portal instantly unlocks → returns to INACTIVE
- **Permanent Mark**: Portal now only activates with <50% HP wardens

## **5. Inbetween Dimension & Hallway**

### **a. Subspace Mechanics**
- **Dimension ID**: `grandslam:inbetween_<parent_dimension>` (pre-registered)
- **Activation**: When Nullstone frames have been placed and activated
- **Copy Mechanism**:
  - **Terrain**: Mirror parent dimension's chunk generator at full scale
  - **Biomes**: Mirror parent's biome at origin
  - **Structures**: Visual ghosts only (non-interactable, no loot for clones)

### **b. Hallway Generation**
- **Location**: Origin where portal is located in parent dimension flipped and mirrored in inbetween dimension
- **Structure**: 3x3x50 block corridor (stone brick, deepslate, purple lanterns)
- **Orientation**: Rotated 180° relative to parent portal
- **Gravity**: **Normal** (deferred to future design)
- **Exit**: Gateway at end of portal.
- **Entrance**: Non-euclidean, blurs and swirls at the edges with a bright glow in the middle of the transition-

### **c. Traversal Consequence**
**First Entry (ACTIVE → DEPLETED):**
- Player enters ACTIVE portal → teleport to hallway entrance
- Portal becomes **DEPLETED** (black fluid)
- Gateway is **one-way** (once you pass through the inbetween hallway it deactivates)

**Reactivation Cycle:**
- Lure new <50% HP warden → returns to ACTIVE
- Denizens **respawn** at same positions
- Hallway is **reusable** (same structure, new spawns)

## **6. Carishan Weapon System**

### **a. Mechanics**
**Regular Carishan:**
- Reach: spear reach
- Slam: Right-click, spear attack cooldown, counterable, bypasses if not countered

**Grand Carishan:**
- **Reach**: +3.6 blocks
- **Enhanced Slam**: 1.2x spear attack cooldown, breaks shield if blocked, otherwise bypasses

**Durability**: Wood & Gold (128), Stone(256), Copper(512), Iron(1024), Diamond(2048), Netherite(3072)
- **Attack Speed**: Lower tier = faster, Gold is faster than Wood.

**Slam Cost**: 2 durability per use

**Slam Counter**: Look upward (< -60°) during wind-up, ping dependant lag-compensation grace period, maximum of .1s by default
- **Success**: 100% block, 3x shield damage, axe disable if grand Carishan, else attcker gets staggered, no pull
- **Failure**: Full damage

**Enchantment Rules**
- **Sweeping Edge**: Incompatible with Carishan. Other Sword Enchantments work.
- **Protection**: Add to shield. Adds 2% chance for grand carishan to fail breaking per level, max level 4 (8% at max level)
- **Thorns**: Add to shield.

### **b. Enchantments**
#### 1. Regular Enchantments
- **Weighted (II)**: Pulls enemies, disables knockback, stronger on crits
- **Overwhelming Force (I)**: Failed block = 4s additional shield cooldown time, height-based damage bonus (+1 per 4 blocks, cap 20 Hearts/40 HP or 50% of max HP, whichever is lower, every 100 blocks the first caps get increased by 20 and the second gets 5% of HP added, hard cap is 80% of max HP)
- **Wind Thrust (I)**: AOE knockback, incompatible with knockback and overwhelming force
- **Inverse Force (I)**: Bow/Crossbow only, pulls target 1.5 blocks, **cannot combine with Punch**
- **Frostbite** (mutually exclusive) [level 1= slowness 2 and freze damage level 2= slowness 3 and more freeze damage, turns to ice on death, level 3 turns to ice (90% damage absorbtion while in ice and break ice faster if attacked or movement attempt by target, almost instantly ice melts when mob is hot type and deals fast freeze unfreeze damage, and depending on biome temperataure melts ice)]
- **Knockback Resisance** (1 per level, 2 max levels)
- **Increase Attack Speed** (10 levels, +0.2 per level)
- **Increase Mining Speed** (10 levels, +0.2 per level)

#### 2. Core Infusions
- **Sculk sensors detect at 50% range** (4 levels, 25% decrease per level, 100 -> 75% -> 50% -> 25% -> 0%)
- **idk**: Endermen looking at eyes no mad (4 levels, instant -> 2s -> 4s -> 8s -> 16s)
- **Veil**: Hides nameplate behind blocks and when crouched (Always hides nameplate behind block, on 1 level only on crouch and on 2 levels always (toggleable with bind), on 3 levels crouch and swap hands to go into Astral Plane, level 3 cannot be manually created, has to be found in the inbetween, yea the inbetween not the other side)
- **Void Resistance**: +50% resistance to void damage per level (at 2 levels you stop taking damange, at level 3 armor stops taking damage over time in the void and at level 4 it repairs in the void)
- **Void Anchor**: Can use the void to teleport to other places after falling for 2 minutes, level 2 makes it 1 minute, level 3 makes it 30s, level 4 makes it 15s, level 5 makes it 7.5s, level 6 makes it 3.25s    Stacks with other effects (e.g., Netherite's innate 1.0 KB resist is not removed; all armor follows same system)


### **c. Weapon Crafting**
- **Long Stick Grip**: Component item (material, recipe, stats TBD) [two types: regular and grand]
- **Weapon Blade**: Component item (material, recipe, stats TBD) [two types: regular and grand]
- **Assembly**: Grip + Edge → Carishan (crafting method, material costs TBD)
- **Material Progression**: Wood→Gold→Stone→Copper→Iron→Diamond→Netherite (resource costs TBD)

Lower tier material faster attack speed .1s or something


## **7. Systems To Be Designed**

### **a. Revenant Boss Fight**
- [ ] Specific ability damage values and cooldowns
- [ ] Dormant Warden summon mechanics (HP, duration, AI)
- [ ] Phase transition triggers and effects
- [ ] Arena interaction (frame damage, environmental hazards)
- [ ] Final loot table (quantities, rare drops)

### **b. Denizen Faction**
- [ ] Entity count (fixed or scaling?)
- [ ] Humanoid vs. non-humanoid ratio
- [ ] Spawn positions (entrance/midpoint/exit)
- [ ] Gear tier distribution probabilities
- [ ] AI patrol paths and aggression range
- [ ] Loot: Nullspace Shard guaranteed? Additional drops?

### **c. Carishan Crafting**
- [ ] Long Stick Grip: Material source and recipe
- [ ] Weapon Edge: Material source and recipe
- [ ] Assembly method (crafting table vs. smithing)
- [ ] Material tier resource costs (wood→netherite)

