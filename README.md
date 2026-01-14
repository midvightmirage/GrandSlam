# Features (currently not implemented)
Fully COnfigurable: All variables can be configured.

**Slam Effects**: Crunch sound, screen shake, cracked particles, low-frequency thud (16 block range)

**Shield Bypass**: Splinters inward (attacker view)

**Block Counter**: Sparks upward (target's successful block)



## Enchantments:

**Weighted**: Pulls enemies. Weaker on non-Halbert. Stronger on Halbert/Mace when critting. Config for Knockback compat (default false)

**Overwhelming Force**: Failed look-up counter = 4s shield cooldown. Damage +1 per 4 fallen blocks, cap 20. Configurable increase/cap/disable



## Regular Halbert:

\- Reach: Spear-equivalent

\- Speed: 0.9x sword

\- Block break: 0.5x unless mainhand

\- Shield disable: Recharge doubled, 6% bypass. Protection reduces 2%/level

\- Right-click anim: Half of attack cooldown



## Grand Halbert:

\- Reach: Spear +3.6m

\- Speed: 0.8x sword

\- Block break: 0.8x unless mainhand

\- Shield disable: Recharge doubled, 26% bypass. Protection reduces 2%/level

\- Perfect Block: ≤0.2s timing = 0% bypass

\- Late Block: Normal bypass chance

\- Right-click: Bypasses shield (from above). Counter by looking up during anim

   \- Grace period: 0.1s server-side (latency)
   
   \- Counter success: 100% blocked, no pull, 3x shield durability damage
   
   \- Counter fail: Full Slam + "Staggered" debuff (0.5s, can't raise shield)

\- Right-click attack animation duration: Half of the attack cooldown duration



## Right-click Slam:

\- Cooldown: Spear time (1.2x for Grand)

\- Pull: 2 blocks +3 per Weighted level. Duration: 1s +0.2s per level



## Enchantment Rules:

\- Wind Burst: Throws all other mobs away

\- Sweeping Edge: Left-click only (by default)

\- Protection: Reduces bypass chance

\- Compatible with all sword enchantments



## Durability:

Wood/Gold:128 | Stone:256 | Copper:512 | Iron:1024 | Diamond:2048 | Netherite:3072

\- Right-click: 2 durability cost



## Tooltips: (Slam blockable= new line)

Regular: "Shield Defense: 6% fail (Protection reduces)"

Grand: "Shield Defense: 26% fail (Protection reduces)"

Both: "• Slam blockable by looking up"



# Installation

# Usage

# Contributing

# Credits
