package WhatIveLearned;

public class notes {

    public static void main(String[] args) {
        // you can test things here if you want
    }
}
/*
// -------------------------
// ✳️ VARIABLES
// -------------------------
int number = 5;
String name = "Alice";
boolean isAlive = true;

// -------------------------
// 🔁 IF / ELSE
// -------------------------
if (number > 10) {
        System.out.println("Big number");
} else if (number > 5) {
        System.out.println("Medium number");
} else {
        System.out.println("Small number");
}

// -------------------------
// 🔁 LOOPS
// -------------------------
        for (int i = 0; i < 5; i++) {
        System.out.println("For loop count: " + i);
}

int j = 0;
while (j < 5) {
        System.out.println("While loop count: " + j);
j++;
        }

// -------------------------
// 📦 ARRAYS
// -------------------------
int[] numbers = {1, 2, 3, 4};
System.out.println(numbers[0]); // prints 1

String[] fruits = new String[3];
fruits[0] = "Apple";
fruits[1] = "Banana";
fruits[2] = "Orange";

// Loop through array
        for (String fruit : fruits) {
        System.out.println(fruit);
}

// -------------------------
// 🧰 METHODS
// -------------------------
public int add(int a, int b) {
    return a + b;
}

// -------------------------
// 🧱 CLASSES & OBJECTS
// -------------------------
public class Player {
    String name;
    int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void takeDamage(int dmg) {
        hp -= dmg;
        System.out.println(name + " took " + dmg + " damage! HP: " + hp);
    }
}

Player p = new Player("Hero", 100);
p.takeDamage(20);

// -------------------------
// 🔀 SWITCH STATEMENT
// -------------------------

/*Keyword	Purpose
case	checks for specific values
break	stops the switch from continuing
default	runs when no cases match (like else)
String action = "attack";*/
/*
switch (action) {
        case "attack":
        System.out.println("You swing your sword!");
        break;
                case "heal":
                System.out.println("You heal yourself!");
        break;
default:
        System.out.println("Nothing happens.");
        break;
                }
