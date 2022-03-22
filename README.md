# Fully Automatic Beverage Vending Machine

#  Application Description

git classroom repo:
metcs/met-cs665-assignment-1-BeiningOuyang

In this application, I implemented a "Fully Automatic Beverage Vending Machine".
The machine makes 4 types of coffees which are Espresso, Americano, Latte Macchiato.
It also makes three teas which are Black Tea, Green Tea, and Yellow Tea.
The machine can also add 0-3 sugar or milk to coffee.


The project starts with a VendMachine class, it can make different types of drinks,
just like in the real world. Then we have a Drink abstract class,
which is the aggregation relationship with VendMachine.
Coffee and Tea are one kind of Drink, therefore, they inherit Drink. 
Furthermore, we have specific coffee or tea, like Latte or black_tea, 
they inherit their parent class "Coffee" or "Tea".


• How flexible is your implementation?
It's flexible if you want to add new beverages in the future,
you can just create a subclass of 'Drink' class
and add new attributes and methods to your new beverage. For example,
You can 'juice' as a new list to 'VendMachine', and then the further implementation of the juice
will be creating a new class of juice and inheriting Drink.


• How is the simplicity and understandability of your implementation?
It's very easy to understand, just like in the real world.
The idea here is that "VendMachine" has one or more "Drink",
so they are aggregation relationships. And then Drink class
is the parent class of all other types of drink.
Coffee and Tea both inherit Drink class because they are a type of drink.
We can add sugar or milk to coffee but not tea, therefore, I only put methods of
adding milk or sugar in the "Coffee" class. So all coffee types of drink can add milk or sugar,
and tea will not able to do that. The number of condiments you can add is limited
by using if/else control. For coffee, I also calculated the price based on each drink and how many
condiments were added in the getFinalPrice method.


For easy to understand, I did print out messages like "making your coffee" to represent
the process of making drinks. I also created a "DrinkControl" to demonstrate
making an Espresso, adding condiments, and calculating the final price. However, it has to be run
in "DrinkControltest" to see the process.

• How do you avoid duplicated code?
I found out that inheritance can help avoid duplicated code.
For example, all the drinks can have names and prices, then we just put the setter and getter
method of drink name and price in Drink class. In this way, all child classes will have setter
and getter methods of drink name and price.







# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




