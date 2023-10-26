# Leaf-Sheep-Sea-Slug
Team 2 project 1 for AOOP. 
The University of Texas at El Paso
Department of Computer Science
CS 3331 – Advanced Object-Oriented Programming
Instructor: Dr. Bhanukiran Gurijala
Fall 2023
Project Part 1
Academic Integrity Statement:
This work is to be done as a team. It is not permitted to share, reproduce, or alter
any part of this assignment for any purpose. Students are not permitted to share
code, upload this assignment online in any form, or view/receive/modify code
written from anyone else. This assignment is part of an academic course at The
University of Texas at El Paso and a grade will be assigned for the work produced
individually by the student.
Instructions:
Your code must be written in Java. In the comment heading of your source code,
you should write your name(s), date, course, instructor, programming assignment
1, lab description, and honesty statement. The honesty statement must state that
you completed this work entirely on your own without any outside sources
including peers, experts, online sources, or the like. Only assistance from the
instructor, TA, or IA will be permitted. Generate Javadoc for your complete code.
Scenario:
You will be part of the creation of a brand-new Dungeon Crawler game. Your
game will have a basic dungeon traversing system and a turn-based battle system.
With the addition of gathering items and interacting with non-playable characters.
Additionally, your game will be deployed on a launcher where players sign in with
their credentials to gather their saved data.
Part A:
Read the requirements described in Part B to complete Part A. Part A must be
completed before implementing the requirements in Part B
1. Write a UML Use Case Diagram (Level I) for your system. With at least the
following:
a. 2 actors
b. 3 Use Cases
2. Write a UML Class Diagram to structure your code using the classes,
requirements, and concepts described in Part B
Part B
1. Create the following classes (Note: some may be abstract)
a. User
b. Person
c. Player
d. Dungeon
e. Utility (Meant to be used for Create, Read, Update, Delete (CRUD)
purposes)
f. Log
g. RunGame (Where you have your Main Method)
h. Any other additional Classes that you believe will be beneficial to
help with successfully implementing this program.
i. All Classes should have appropriate methods.
ii. All Classes should have appropriate fields.
2. Read files with information and store the information appropriately.
a. Pick a data structure that is appropriate.
i. Consider the time complexity.
ii. Consider space complexity.
b. Consider the use of objects and how your objects will interact with
each other.
3. Your system should be menu-driven with the following options:
a. Register
b. Login
c. New Game
d. Exit
4. Your system should be able to handle the following:
a. Read a User file to verify players that “own” the game and are
permitted to launch/play the game.
b. New users will be added to the Users file with the appropriate
initialized data.
c. Logged-in users should be able to start the new game, in this case
reading the Dungeon and displaying it. (In the case below, 0 means
empty room, e is the entrance and $ is the player)
d. Players will be able to traverse the dungeon by using basic inputs.
e. Log all activity being done on the game.
i. User Movements
ii. User log in time and date
iii. User playtime
iv. Examples of log messages.
1. “10:00:10 10/10/23 - User X player moved to (2,3) in the
dungeon”
2. “10:00:10 10/10/23 - User A logged into the game”
3. “09:13:10 10/11/23 - User X player created a new game”
4. “23:01:17 10/12/23 - User Y player moved to (1,7) in the
dungeon”
5. “11:57:10 10/13/23 - User B logged out, user was logged in for X
time”
5. The user can exit the program by writing “EXIT” or creating an Exit value
while in the main menu only. When the user exits the program
a. Write a new updated Users sheet (similar to the original input, except
with the new values such as updated playtime, last login)
6. Handle all exceptions appropriately. (Your system should not crash)
7. Write Javadoc for your system.
8. Write a lab report describing your work (template provided)
a. Any assumptions made should be precisely mentioned in the source
code and described in the lab report.
b. The lab report should contain sample screenshots of the program
being run in different circumstances, including successful and failing
changes.
9. Schedule a demo with TA/IA
10.**If submission is past the deadline** Your report must have an additional
section entitled “Why I submitted late”. In that section, explain the reason 
why your submission was late. (Note: you will still be penalized the typical
late penalty)
Deadlines:
10/20/23, by 11:59 pm:
1. UML Class Diagram Progress (.pdf)
2. UML Use Case Diagram Progress (.pdf)
3. Current Progress Source Code and files (.java/.txt/.csv) – Commit current
progress up to this point.
For each item (1-3)
a. Does not have to be complete. Ensure there are no compilation errors.
b. There should be a significant amount of work done (as determined by the
instructional team).
c. TA/IA will review for progress only.
10/27/2023, by 11:59 pm:
1. UML Class Diagram (.pdf)
2. UML Use Case Diagram (.pdf)
3. Source code (.java files)
4. Lab report (.pdf file)
5. Javadoc (entire doc folder)
6. Updated Users Sheet (.csv)
7. Log (.txt)
