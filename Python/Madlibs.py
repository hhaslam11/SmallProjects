"""
Madlibs.py
Kaleb Haslam
https://www.codecademy.com
"""

print("Mad Libs  ||  Kaleb Haslam")

print("Enter a name: ")
name      = raw_input()

adj_1     = raw_input("Enter an adjective: ")
adj_2     = raw_input("Enter another adjective: ")
adj_3     = raw_input("Enter a final adjective: ")

verb_1    = raw_input("Enter a verb: ")
verb_2    = raw_input("Enter another verb: ")
verb_3    = raw_input("Enter a final verb: ")

noun_1    = raw_input("Enter a noun: ")
noun_2    = raw_input("Enter another noun: ")
noun_3    = raw_input("Enter a third noun: ")
noun_4    = raw_input("Enter a final noun: ")

animal    = raw_input("Enter an animal: ")
food      = raw_input("Enter a food: ")
fruit     = raw_input("Enter a fruit: ")
number    = raw_input("Enter a number: ")
superhero = raw_input("Enter a name of a superhero: ")
country   = raw_input("Enter a country: ")
dessert   = raw_input("Enter a type of dessert: ")
year      = raw_input("Enter a year:")

#The template for the story
STORY = "This morning I woke up and felt %s because %s was going to finally %s over the big %s %s. On the other side of the %s were many %ss protesting to keep %s in stores. The crowd began to %s to the rythym of the %s, which made all of the %ss very %s. %s tried to %s into the sewers and found %s rats. Needing help, %s quickly called %s. %s appeared and saved %s by flying to %s and dropping %s into a puddle of %s. %s then fell asleep and woke up in the year %s, in a world where %ss ruled the world."

print(STORY % (adj_1, name, verb_1, adj_2, noun_1, noun_2, animal, food, verb_2, noun_3, fruit, adj_3, name, verb_3, number, name, superhero, superhero, name, country, name, dessert, name, year, noun_4))

