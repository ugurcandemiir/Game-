# Homework 05 - Due Monday, Oct. 22 at 11:59 PM

This week's homework is intended to give some more experience with extending classes in a slightly less boring context than bank accounts. I am providing a relatively complete "game" which simulates two teams competing with each other over 100 years of early history. Each team consists of a combination of warriors who fight battles, and armorers who create weapons for the warriors. As delivered, all warriors are "knights", and all armorers are "blacksmiths". The blacksmiths make two kinds of weapons... knives when they are young, and swords once they have learned their trade. The top level code is in the "Game" class, which includes a main method that kicks everything off. When you run the main method in the Game class, it runs a simulation of the two teams battling each other over a 100 year history.

Remember, using Eclipse, start with the Git perspective, choose "Clone", enter the URL of your repository, and **remember to update the Local Directory** field to be your project, src sub-directory, and then lab07 subdirectory. Also remember to create new classes in the hw05 package.

Most of the code delivered in this repository can be used as is. However, I would like you to enhance the game. For this homework, you must add at least one new type of Warrior - a new class that extends the Warrior class; and at least one new type of Armorer - a new class that extends the Amorer class. Your new Armorer should build a different kind of weapon than a Knife or a Sword, so you will have to add at least one new class that extends the Weapon class as well.

You will also need to modify the ```Team.age()``` method, which currently only adds blacksmiths to the armorers and knights to the warriors that make up the team. You will need to modify the age method so that your new warriors and armorers become part of the team as the team ages. Note that I will still like to restict the size of the teams to 15 warriors and 15 armorers.

Be creative - choose armorers and warriors that make interesting results.

## Using Eclipse to commit your results

Make sure you stage all your changed files in the Git perspective, and then Commit and Push the results. Then make sure you copy the commit ID, and paste it in the myCourses HW05 submission area.

## Grading Criteria

This homework is worth 10 points. If your code does not compile, you will get an 8 point deduction. If your code gets a compiler warning, you will get a 2 point deduction. The CA's will run your lab07.Games main function. If the game does not demonstrate new warriors and armorers as well as new weapons, you will get up to a 5 point deduction, depending on the severity of the problem.
