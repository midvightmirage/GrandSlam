# Features (currently not implemented)
Regular Carishan: 6% shield bypass chance, spear-reach, 0.9x attack speed, right-click slam attack
Grand Carishan: 26% shield bypass chance, +3.6m reach on top of spear-reach, 0.8x attack speed, right-click slam attack

Slam Attack: Right-click to slam, 2 durability cost, can be countered by looking up
Counter Success: Target takes 3x shield durability damage, no damage to attacker, 1.5x on regular Carishan
Counter Fail: Target takes slam damage + Staggered effect (can't block for 0.5s)

**Enchantments**
Weighted: Pulls enemies over 1s + 0.2s per level
Overwhelming Force: 4s shield cooldown on blocked hits, +1 damage per 4 fall blocks
Wind Thrust: Pushes nearby mobs away in 4 block radius











Fully Configurable: All variables can be configured.

**Slam Effects**: Crunch sound, screen shake, cracked particles, low-frequency thud (16 block range)

**Shield Bypass**: Splinters inward (attacker view)

**Block Counter**: Sparks upward (target's successful block)



## Enchantments:

**Weighted**: Pulls enemies. Weaker on non-Halbert. Stronger on Halbert/Mace/Spear when critting. Config for Knockback compat (default false) (2 max levels) [disables knockback]

**Overwhelming Force**: Failed look-up counter = 4s shield cooldown. Damage +1 per 4 fallen blocks, cap 20. Configurable increase/cap/disable (only 1 level) [disables knockback, exclusive to item]

**Wind Thrust**: Throws all mobs other than attacker and target away (spear compatible) [disables knockback]

## Regular Halberd:

\- **Reach**: Spear-equivalent

\- **Speed**: 0.9x sword

\- **Block break**: 0.5x unless mainhand

\- **Shield disable**: Recharges attack coldoown twice as fast for the attacker. 6% chance of shield being bypassed. Protection reduces odds of shield being disabled by 2% per level.

\- **Right-click animation**: Half of attack cooldown



## Grand Halberd:

\- **Reach**: Spear +3.6m

\- **Speed**: 0.8x sword

\- **Block break**: 0.8x unless mainhand

\- **Shield disable**: Recharges attack coldoown twice as fast for the attacker. 26% chance of shield being bypassed. Protection reduces odds of shield being disabled by 2% per level.

\- **Right-click**: Bypasses shield (from above). Counter by looking up during attack animation. (Bypasses shield delay by default)

   \- **Grace period**: 0.1s server-side (latency)
   
   \- **Counter success**: 100% blocked, no pull, 3x shield durability damage
   
   \- **Counter fail**: Full Slam + "Staggered" debuff (0.5s, can't raise shield)

\- **Right-click attack animation duration**: Half of the attack cooldown duration



## Right-click Slam:

\- **Cooldown**: Spear time (1.2x for Grand)

\- **Pull**: +3.3 per Weighted level. Duration: 1s +0.2s per level (Only with Weighted) [1.5 per Weighted level on non Grand size Halberd]



## Enchantment Rules:

\- **Sweeping Edge**: Left-click only (by default)

\- **Protection**: Reduces bypass chance (on target's shield)

\- Compatible with all sword enchantments



## Durability:

**Wood/Gold**:128 | **Stone**:256 | **Copper**:512 | **Iron**:1024 | **Diamond**:2048 | **Netherite**:3072

\- Right-click: 2 durability cost



## Tooltips: (Slam blockable= new line)

**Regular**: "Shield Defense: fals 6% of the time (Protection reduces)"

**Grand**: "Shield Defense: fails 26% of the time (Protection reduces)"

**Both**: "• Slam blockable by looking up"



# Installation

# Usage

# Contributing

# Credits

# Random Thoughts
A mod that adds frostbrite (because thought about something relating to shield and fire aspect, specifically fire aspect making shields burn)
