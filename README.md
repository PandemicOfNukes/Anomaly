# Anomaly
A Rogue Like - Text Adventure Game In Java Inspired In Games From The 80s-90s

This game was used has the final project of my course in "Management and Programming of Information Systems".

Anomaly is heavily inspired in several other Rogue Like  Games form the 80s and the 90s (For example Rogue and NetHack).

Anomaly also contains a website that I made (now defunct, but you can still find the website source code in this repository) that expands on the lore of the game and the outside events that explain somethings, although do to time constraints I didn't do as much as I would liked to do.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
What Is a RogueLike?

Well following this Wikipedia Article (https://en.wikipedia.org/wiki/Roguelike):

A Roguelike (or rogue-like) is a subgenre of role-playing computer games traditionally characterized by a dungeon crawl through procedural generated levels, turn-based gameplay, grid-based movement, and permanent death of the player character. Most roguelikes are based on a high fantasy narrative, reflecting their influence from tabletop role playing games such as Dungeons & Dragons. 

So Basically a RogueLike is a game that involves:

- Exploration
- Generated Levels
- Turn Based Gameplay 
- Grid based movement
-Permanent Death 

Of course, not all the Roguelikes follow this rules. But this the basic underlines in a Roguelike.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
The Story:

Oppenheimer is a lab rat for the company Dreams. Previously a death row prisoner he was "saved" by Dreams Company to "work" for them.

He wakes up still in a Dreamy-Reality state of mind and doesn't know what happened to him... He notices that is Jail door is open and the laboratory is empty.

He doesn't know that happened was the worst disaster in human history.

Cold and Alone Oppenheimer needs to escape the lab that maintained him for so long... And find the truth of what happened.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Dependencies:

Before you start Playing you need some Dependencies.

Because this game is made in Java you need:

- Java Development Kit 15 or newer (You can download the latest Java Development Kit here: https://www.oracle.com/java/technologies/downloads/)
- Java Runtime Environment 8 or newer (You can download the latest Java Runtime Environment here: https://www.java.com/en/download/)

After installing these dependencies the game should work.

The game was tested in a Computer with these Specifications:

OS: Windows 7 64-bits
RAM: 3 GB
CPU: Intel Core Centrino DUO @1.80 GHZ
GPU: Intel GMA 945

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Gameplay Elements:

The general gameplay idea of Anomaly is that the RogueLike represents a Dream that the main character is having. And the text adventure part of the game is the real world and Oppenheimer is looping between reality and the dream.

Roguelike Layout:

![Anexo 1](https://user-images.githubusercontent.com/59929476/176985972-1fd8e6df-ef84-46a9-9ef6-ebaeeed72c45.png)

Text Adventure Layout:

![Anexo 2](https://user-images.githubusercontent.com/59929476/176985978-1c071b59-fe30-4a32-8e20-f9c005420046.png)

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
How to Play:

CONTROLS:

Left Arrow or H Key: Move Left

Right Arrow or L Key: Move Right

Up Arrow or K Key: Move Up

Down Arrow or J Key: Move Down

Y key: Move diagonally Up-Left

U key: Move to the Up-Right diagonal

B key: Move to the Down-Left diagonal

N key: Move to the Lower-Right diagonal

G key or , key: Pick up items

D key: Drop items

E key: To eat

W key: Equip a weapon or armor

X key: Examine an item

T key: Throw an item, stone or potion at an enemy

F key: If the player has the BOW item equipped, aim and shoot an arrow at the enemy

Q key: Drink a potion

SHIFT + Key >: If the player is on top of a sign > goes down one floor

< key: If the player is on top of a sign < goes up one floor

SHIFT key + ? key: Opens the in-game quick help menu

ESC key: Exits any menu.



EXPLORATION, EQUIPMENT, ENERGY, LEVELS :

Start of the game:

The map is randomly generated and enemies and items are all randomly placed on the map. So it's not worth trying to memorize the map.

Movement:

Simply press the key that corresponds to where you want to move.
As you move around, you discover more of the map.
Remember that you can still excavate the walls. But remember that excavating walls takes a lot of energy, so be careful.

Grab Items:

To pick up an item you have to move the character over the item (%, , , (, [,!) and press the G key or , .

Equip Items:

To equip an item, press the W key and a menu with possible options will appear.
Weapons are illustrated with this symbol” (“armors with this “[“.
After the menu appears, simply press the Key that corresponds to the item you want to equip.
Remember that we can equip a weapon at the same time an armor is equipped and vice versa.

Hunger And Eating:

Remember to pick up food and eat it.
Food is represented by %.
Also remember that walking, digging walls, fighting enemies, etc. Consumes energy.
You can see how close it is to dying by the food messages that appear in the Lower Right of the screen.

Hunger States:

“Stuffed” – This is the best possible state of energy. That is, even if you eat more it does not add any energy.

“Full” – State saying it is close to Stuffed.

“Hungry” – State saying that you are running out of energy quickly.

“Starving” – State saying that you are about to starve to death.

Remember that you can eat enemy bodies.

Drop Equipment:

If you have equipment that is useless. The player can drop the equipment by pressing the D Key.
A menu will appear that will have all your equipment and simply press the key corresponding to the equipment you want to drop.

Pass Levels (or Floors):

To pass the level (or floors), go to one of these Signs >, < and press the key corresponding to the Sign.
Remember that > to go down one floor and < to go up one floor.

Examine an Item:

To examine an item press the X key and a menu will appear with all your equipment.
Simply press the Key that corresponds to the item to examine it.


COMBAT, POTIONS, HEALTH POINTS,EXPERIENCE POINTS:

Entering in combat mode:

To enter combat mode simply move the character to the position of the enemy you want to attack.
The character will automatically attack the enemy.

How to win a combat:

Combat is won by whoever kills the enemy first.
For example, the player wins the combat if he manages to kill the enemy before the enemy kills the player.
The damage is randomized to both the player and the enemy (of course randomization has a limit number). This number can be upgraded with weapons or attack level increase.
Enemies can attack each other, for example a Bat can attack a Goblin.

Potions:

Potions can greatly help the player in combat.
Potions can be tossed or drunk.
Remember, potions are represented by “!”.
The potions are random, so the colors of the potions may be different from what they are and sometimes the potion may not work when being drunk or thrown.
For example, a green potion might not mean it's a poison.
So be careful and think carefully before shooting or drinking a potion, as the good effects of the potion (eg increased damage) can affect enemies as well and the bad effects of the potion (eg poison) can affect the player.
To drink a potion press the Q key and a menu will appear, simply press the key that corresponds to the potion you want to drink.
To shoot a potion press the T key and a menu will appear, simply press the key that corresponds to the potion you want to shoot. Aim and shoot at the enemy.

Throwing Rocks Or Equipment:

Throwing rocks (remember, rocks are represented by “,”) or equipment is a good way to avoid direct confrontations with enemies.
To throw a stone or equipment, press the T key and a menu will appear, simply press the key that corresponds to the stone or equipment you want to throw. Aim and shoot at the enemy.
Remember, that each piece of equipment has its shooting damage, so some equipment is not worth throwing.

Shooting a Bow Arrow: 

To fire a bow arrow, first pick one up.
Second, equip it.
Third, press the F key and aim and shoot at the enemy.
Remember, the F key is only available when the Bow-Arrow is equipped.

Recovering Life:

Health recovers slowly in time. 
It is possible to recover Health faster if you upgrade the level of recovery.

XP And Levels:

The player can earn XP by killing enemies. Stronger enemies give more XP.
If the player has enough XP to level up, a menu will appear with several options to upgrade your character. Simply press the key that corresponds to what you want to update.

Upgrades Available:

"Increased hit points" – Increases the character's HP.
"Increased attack value" – Increases the character's base attack.
"Increased defense value" – Increases the character's base defense.
"Increased vision" – Increases the character's field of vision.
"Increased hp regeneration" – Increases the character's HP regeneration.

TEXT ADVENTURE:

The text adventure is very simple to understand, you just have to press the key that corresponds to the option you want to use.

GAME MODES AND GAME DIFFICULTIES:

Normal:

The normal game mode has Roguelike and Text Adventure.
To win the Roguelike you must find the item “Teddy Bear” (represented by *) and leave the basement alive.
Recommended for new players.

Survival:

Survival game mode only has Roguelike.
How long can you survive?
Recommended for experienced players.

DIFFICULTIES IN SURVIVAL MODE

Normal Mode: How Survival Mode should be played
God Mode: If life was a problem, now it's not... (gives player 10,000 health)

ENEMIES, ITEMS, POTIONS TABLES:

TYPES IN INTELLIGENCE OF ENEMIES:

WANDERERS

Wanderers are enemies that choose a random direction to go.
These enemies are:
-Bat
-Spider

HUNTERS

Hunters are enemies that pursue the player.
These enemies are:
-Zombie
-Vampire
-Anomaly

INTELLIGENT

Intelligent are the smartest enemies in the game. They can use armor and items.
These enemies are:
-Goblin
-SkinCrawler

TABLE OF ENEMIES:

Fungus(f):

HP: 10

Max Attack: 0

Max XP: 10

Type Of Intelligence: No Intelligence (They Replicate In The Map)

Can Drop Items?: Yes- His Body

Bat(b):

HP: 15

Max Attack: 1

Max XP: 17

Type Of Intelligence: Wanderer

Can Drop Items?: Yes- His Body

Spider(x):

HP: 10

Max Attack: 2

Max XP: 17

Type Of Intelligence: Wanderer

Can Drop Items?: Yes- His Body

Zombie(z):

HP:50

Max Attack: 10

Max XP: 70

Type Of Intelligence: Hunter

Can Drop Items?: Yes- His Body

Vampire(v):

HP:60

Max Attack: 20

Max XP: 90

Type Of Intelligence: Hunter

Can Drop Items?: Yes- His Body

Anomaly(@):

HP: 50

Max Attack: 50

Max XP: 90

Type Of Intelligence: Hunter

Can Drop Items?: Yes- His Body

Goblin(g):

HP: 66

Max Attack: Depends on what equipment the Goblin has

Max XP: 90

Type Of Intelligence: Intelligent

Can Drop Items?: Yes- His Body and the items that the enemy had

SkinCrawler(S):

HP: 75

Max Attack: Depends on what equipment the SkinCrawler has

Max XP: 120

Type Of Intelligence: Intelligent

Can Drop Items?: Yes- His Body and the items that the enemy had

TABLE OF WEAPONS:

Dagger:

Damage: 5

Damage When Throwing: 5

Sword:

Damage: 10

Damage When Throwing: 3

Staff:

Attack: 5

Attack When Throwing: 3

Bow:

Damage: 1

Damage When Throwing: 0

Damage When Firing: 5

Baguette:

Damage: 3

Damage When Throwing: 0

Note: This is also a food item. Restores 100 energy.

FOOD TABLE:


Apple:

Energy: 100

Baguette:

Energy: 100

Bread:

Energy: 400

Bat Corpse:

Energy: 75

Spider Corpse:

Energy: 50

Fungus Corpse:

Energy: 50

Zombie Corpse:

Energy: 250

Vampire Corpse:

Energy: 300

Goblin Corpse:

Energy: 330

SkinCrawler Corpse:

Energy: 375


POSSIBLE POTION COLORS:

-Red

-Yellow

-Green

-Cyan

-Blue

-Magenta

-Black

-Gray

-White


POTION EFFECTS TABLE:

Potion Of Health:

Heal 15 HP

Potion Of Slow Health:

Slow HP Cure

Potion Of Poison:

Slowly removes HP points from the player or the enemy

Potion Of Warrior:

Turns the one who takes it stronger

Potion Of Archer:

Increases the player's field of vision for a limited time

Potion Of Experience:

Gives the player some XP

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TIPS AND TRICKS:

1. To avoid direct confrontation with enemies use potions and stones
2. Always update your equipment
3. Use digging the smart way (to escape enemies and such)
4. Don't focus too much on combat 
5. Pay attention to food
6. Survive…

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TROUBLESHOOTING:

WHEN I TRY TO START THE GAME A WINDOW APPEARS SAYING: “ERROR: A JNI ERROR HAS OCCURRED, PLEASE CHECK YOUR INSTALLATION AND TRY AGAIN”

CAUSES

Dependencies are not installed or are poorly installed.

IF YOU DON'T HAVE DEPENDENCIES INSTALLED

Install Dependencies.

IF YOU HAVE DEPENDENCIES INSTALLED AND YOU CONTINUE TO HAVE THIS ERROR

Uninstall and try to reinstall Dependencies again.

If the issue continues, it could be a problem with the installers. Download new ones.

If the problem continues, make sure your computer is compatible.

THE GAME LOCKS/CRASHES WHILE IT IS RUNNING

CAUSES

There are various causes, lack of RAM, something happened in the game process, etc.
The most common cause is the lack of RAM in the Virtual Computer that Java creates.

HOW TO SOLVE

As long as the cause cannot be debugged, the user can try to resolve it.
This is a list of what the user can do:

-Restart the game

-Close all Java processes on your computer

-Close programs that may be consuming RAM

-Restart the computer

-Reinstall Dependencies

-Update Dependencies

-Make sure your computer meets the Minimum Requirements

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
THE WEBSITE:

The Website is now defunct but you can still see the Source Code in the repository.

The Website serves to expand the lore of the game. The Website is protected by a simple password login system made in PHP.

The Website uses HTML, CSS and PHP.

The Username is: carter

And the Password is: pumpkin

 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
WHAT LIBRARIES AND ALGORITHMS ANOMALY USES:

LIBRARIES:

Anomaly uses Java, Java Swing and ASCIIPanel.

AsciiPanel simulates a code page 437 ASCII terminal display. It supports all 256 characters of codepage 437, arbitrary foreground colors, arbitrary background colors, and arbitrary terminal sizes. 
It was made by Tristan check him out (https://github.com/trystan/AsciiPanel)

ALGORITHMS:

Anomaly uses mainly three algorithms:

- Cellular Automata

- A* (A-Star)

- Bresehans Line

Cellular Automata:

Cellular Automata is a discrete model of computation studied in automata theory. The Cellular Automata algorithm is also called cellular spaces, mosaic automata, homogeneous structures, cellular structures, mosaic structures and iterative matrices.

How Cellular Automata works to create a map is, the algorithm first creates a map and then creates new maps using a 4-5 rule: a tile becomes a wall if in the previous map it was a wall and 4 or more of its neighbors were a wall or if not a wall 5 or more of your neighbors were a wall. That is, a tile is a wall if the 3 by 3 region contains at least 5 walls. Each iteration makes each block more like its neighbors, and the amount of overall “noise” is gradually reduced.

The advantages of this algorithm are:
-Maps will never look the same as other generated maps
-A more or less “simple” implementation
-Maps have a natural basement look

But despite the advantages there is a big disadvantage in the maps, there is only 45% that the map will be completely open (that is, the entire map is accessible to the player) to solve this problem, I added a system where it allows the player to excavate walls.

![Anexo 3](https://user-images.githubusercontent.com/59929476/176985990-f829d79a-ec50-4502-9a5b-7efd9892a8c7.PNG)

An Example Of a Possible Map:

![Anexo 4](https://user-images.githubusercontent.com/59929476/176985993-4a0eccb0-095a-40c5-85d2-a4b95e0df328.PNG)

A* (A-STAR):

A* is a search algorithm, it looks for an object (or “node”) in a specific graph. The algorithm makes a decision tree of all possible paths to the object, and chooses which path is the shortest.

An Example Of a A* Graph

![Anexo 6](https://user-images.githubusercontent.com/59929476/176986115-09e8c8ad-0b90-4bf6-afcb-d3954782189a.png)

BRESEHANS LINE:

Bresenhams line is a line drawing algorithm that determines which points in an N-Dimensional image should be selected to form an approximation of a straight line between two points.

Bresenhams line has a great advantage of being able to peek through small “cracks” in the map, so this algorithm increases the reality of the game and helps the player to make decisions.

An Example Of A Bresehans Line Graph

![Anexo 5](https://user-images.githubusercontent.com/59929476/176986016-5c724c57-9640-4bd6-8808-7ee9e09b6d89.PNG)

 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
PROBLEMS AND BAD ORGANIZATION:

If you took a look at the code you might be wondering why I have so many screens.

Well this was actually a bad idea when I look at it now. The original intent was (ironically enough) that the code would be easier to read. I thought that if I put everything in modules I could make the code easier to understand. Well, in the end it was a mess and because this was my final project I didn't have the time to fix it up before. The same thing applies to the website. Some people say its messy, other people say its not messy, but in my opinion its very messy. Lessons were learned and I continue to learn.

Interesting thing about my project, some of the sounds were made by using a Walkman.

 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
SPECIAL THANKS:

I wanna thank my family and friends who supported me during this endeavor.

A special thanks to Trystan for making ASCIIPanel, again check him out (https://github.com/trystan)

And I thank you for just being here.
