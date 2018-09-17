# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

	A list of type Dog (dogs), three Dog objects, a Comparator<Animal> (for which the class is defined immediately after)

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?

	The comparator constructor is called in this line "Collections.sort(dogs, new Comparator<Animal>(){". The class definition for the comparator comes between the immediate {} after new Comparator<Animal>() is created.
