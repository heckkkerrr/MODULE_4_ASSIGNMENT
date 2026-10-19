# Module 4 - Assignment Answers

Name: Siddharth Jaspal
Degree: Bachelor of Technology in Artificial Intelligence
Enrollment Number: A0231109824068
University: Amity University
GitHub Username: heckkkerrr

These answers follow the supplied assignment document. Each numbered item is mapped to a source file or explanation below.

## Generics

### 2. What is the purpose of generics in Java, and how do they improve type safety and code reusability?

src/GenericsExamples.java

### 3. Explain the syntax for creating a user-defined generic class in Java. Provide an example.

See the related explanation and example in the repository.

### 4. How do bounded type parameters work in generics? Write a generic class that accepts only subclasses of Number.

src/GenericsExamples.java

### 5. What is the difference between ? extends T and ? super T in generics? Provide an example of when to use each.

src/GenericsExamples.java

### 6. How do raw types differ from parameterized types in generics, and why should raw types be avoided?

src/GenericsExamples.java

### 7. Write a generic class Pair<K, V> that holds two values of any types, K and V. Include methods to get and set the values.

See the related explanation and example in the repository.

### 8. Create a user-defined generic class Box<T> with methods addItem(T item) and getItem(). Demonstrate its usage with String and Integer types.

See the related explanation and example in the repository.

### 9. Write a generic method swapElements that swaps two elements in an array. Demonstrate its usage with different data types.

See the related explanation and example in the repository.

### 10. Develop a user-defined generic class Stack<T> that provides standard stack operations like push(T item), pop(), and peek(). Demonstrate with integers and strings.

See the related explanation and example in the repository.

### 11. Implement a generic class MinMaxFinder<T extends Comparable<T>> that provides methods findMin() and findMax() to find the minimum and maximum elements in a list. Demonstrate it with a list of integers and strings.

See the related explanation and example in the repository.

## Java.util package and collection framework

### 13. What is the java.util package, and why is it essential in Java programming?

See the related explanation and example in the repository.

### 14. What are the key features of the Collection Framework in java.util?

src/CollectionExamples.java

### 15. Explain the differences between Collection and Collections in java.util.

See the related explanation and example in the repository.

### 16. What is the role of the Iterator interface in the java.util package?

See the related explanation and example in the repository.

### 17. What is the purpose of the Comparator and Comparable interfaces in the java.util package?

See the related explanation and example in the repository.

### 18. What are the key interfaces in the Java Collection Framework, and how are they related?

src/CollectionExamples.java

### 19. What is the difference between Collection and Map interfaces in Java?

src/CollectionExamples.java

### 20. Explain the differences between Set, List, and Queue in the Collection Framework.

src/CollectionExamples.java

### 21. What is the significance of the Iterable interface, and how is it used in the Collection Framework?

src/CollectionExamples.java

### 22. What are the benefits of using the Collection Framework over arrays?

src/CollectionExamples.java

### 23. Write a program to iterate over a List of integers using:

See the related explanation and example in the repository.

### 24. A simple for loop

See the related explanation and example in the repository.

### 25. An enhanced for loop

See the related explanation and example in the repository.

### 26. A while loop with an Iterator

See the related explanation and example in the repository.

### 27. Write a generic method to print all elements of any Collection (e.g., List, Set, Queue).

See the related explanation and example in the repository.

## List Interface

### 29. What is the List interface, and how does it differ from the Set interface?

src/CollectionExamples.java

### 30. What is the difference between ArrayList and LinkedList in terms of performance and usage?

See the related explanation and example in the repository.

### 31. Write a program to demonstrate the use of ArrayList for storing and iterating over elements.

See the related explanation and example in the repository.

### 32. What is the role of the Vector class, and how does it differ from ArrayList?

See the related explanation and example in the repository.

### 33. How is the Stack class implemented, and how does it relate to the List interface?

src/CollectionExamples.java

### 34. Create a List of strings and perform the following operations:

See the related explanation and example in the repository.

### 35. Add elements to the list.

See the related explanation and example in the repository.

### 36. Remove an element by value and index.

See the related explanation and example in the repository.

### 37. Replace an element at a specific index.

See the related explanation and example in the repository.

### 38. Print the list after each operation.

See the related explanation and example in the repository.

### 39. Write a program to compare the performance of ArrayList and LinkedList for:

See the related explanation and example in the repository.

### 40. Adding elements at the beginning.

See the related explanation and example in the repository.

### 41. Removing elements from the middle.

See the related explanation and example in the repository.

### 42. Iterating through the list.

See the related explanation and example in the repository.

### 43. Write a program to sort an ArrayList of strings alphabetically and reverse alphabetically.

See the related explanation and example in the repository.

## Set Interface

### 45. What is the Set interface, and how is it different from List?

src/CollectionExamples.java

### 46. What is the difference between HashSet, LinkedHashSet, and TreeSet in Java?

See the related explanation and example in the repository.

### 47. Write a program to demonstrate the use of TreeSet for storing sorted elements.

See the related explanation and example in the repository.

### 48. How does HashSet handle duplicate elements? Explain with an example.

See the related explanation and example in the repository.

### 49. What is the significance of equals() and hashCode() methods in HashSet?

See the related explanation and example in the repository.

### 50. Write a program to demonstrate the uniqueness property of HashSet by attempting to add duplicate elements.

See the related explanation and example in the repository.

### 51. Create a TreeSet of integers and perform the following operations:

See the related explanation and example in the repository.

### 52. Add elements to the set.

See the related explanation and example in the repository.

### 53. Find the smallest and largest elements.

See the related explanation and example in the repository.

### 54. Remove a specific element.

See the related explanation and example in the repository.

### 55. Write a program to iterate over a LinkedHashSet and explain its order-preserving property.

See the related explanation and example in the repository.

## Map Interface

### 57. What is the Map interface in Java, and how is it different from Collection?

src/CollectionExamples.java

### 58. What is the difference between HashMap, LinkedHashMap, and TreeMap?

See the related explanation and example in the repository.

### 59. How does HashMap handle collisions?

See the related explanation and example in the repository.

### 60. Write a program to demonstrate the use of TreeMap for sorting keys.

See the related explanation and example in the repository.

### 61. What is the difference between Hashtable and HashMap? Why is Hashtable considered legacy?

See the related explanation and example in the repository.

### 62. Write a program to create a HashMap of employee IDs and names. Perform the following operations:

See the related explanation and example in the repository.

### 63. Add new key-value pairs.

See the related explanation and example in the repository.

### 64. Check if a key exists.

See the related explanation and example in the repository.

### 65. Iterate through the map using:

See the related explanation and example in the repository.

### 66. KeySet

See the related explanation and example in the repository.

### 67. EntrySet

See the related explanation and example in the repository.

### 68. Write a program to demonstrate the sorted order of keys in TreeMap by adding unsorted key-value pairs.

See the related explanation and example in the repository.

### 69. Write a program to show the difference between HashMap and LinkedHashMap in terms of iteration order.

See the related explanation and example in the repository.

## Queue and stack

### 71. Implement a simple program using Queue (with LinkedList) to simulate a ticket booking system.

See the related explanation and example in the repository.

### 72. Use a PriorityQueue to store a list of tasks with priorities. Add tasks, remove the highest-priority task, and print the queue.

See the related explanation and example in the repository.

### 73. Write a program to implement a Stack using the Stack class. Perform operations like push, pop, peek, and check if it is empty.

See the related explanation and example in the repository.

### 74. Implement a deque using the ArrayDeque class. Perform operations like:

See the related explanation and example in the repository.

### 75. Add elements at both ends.

See the related explanation and example in the repository.

### 76. Remove elements from both ends.

See the related explanation and example in the repository.

### 77. Peek at both ends.

See the related explanation and example in the repository.

### 78. Write a program to check if a string is a palindrome using a Deque.

See the related explanation and example in the repository.

## Specialized Classes

### 80. What is the purpose of the PriorityQueue class in Java?

See the related explanation and example in the repository.

### 81. How is the Deque interface different from the Queue interface?

See the related explanation and example in the repository.

### 82. What is the difference between BlockingQueue and PriorityQueue?

See the related explanation and example in the repository.

### 83. Write a program to implement a simple Queue using the LinkedList class.

See the related explanation and example in the repository.

### 84. What is the role of WeakHashMap in Java, and how is it different from HashMap?

See the related explanation and example in the repository.

## Concurrency and Thread-Safety

### 86. How is Vector different from ArrayList in terms of thread safety?

See the related explanation and example in the repository.

### 87. Write a program to demonstrate the thread-safe nature of Vector by adding elements to it from multiple threads.

See the related explanation and example in the repository.

### 88. What is the role of ConcurrentHashMap in Java, and how does it achieve thread safety?

See the related explanation and example in the repository.

### 89. Create a ConcurrentHashMap and demonstrate how it handles concurrent modifications.

See the related explanation and example in the repository.

### 90. What are the differences between CopyOnWriteArrayList and ArrayList?

See the related explanation and example in the repository.

### 91. Write a program using CopyOnWriteArrayList to iterate and modify a list safely in a multithreaded environment.

See the related explanation and example in the repository.

### 92. What is the difference between synchronizedCollection and ConcurrentHashMap?

See the related explanation and example in the repository.

## Utility Methods in Collections Class

### 94. What are some commonly used methods in the Collections utility class?

See the related explanation and example in the repository.

### 95. Write a program to shuffle and sort an ArrayList using methods from the Collections class.

See the related explanation and example in the repository.

### 96. How can you make a collection thread-safe using the Collections class?

See the related explanation and example in the repository.

### 97. Create an unmodifiable List using Collections.unmodifiableList() and show what happens when you try to modify it.

See the related explanation and example in the repository.

### 98. Write a program to perform a binary search on a List using the Collections.binarySearch() method.

See the related explanation and example in the repository.

### 99. Write a program to find the frequency of elements in a list using Collections.frequency().

See the related explanation and example in the repository.

## Custom Comparator

### 101. Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.

See the related explanation and example in the repository.

### 102. Write a program to sort a Map by its values using a custom Comparator.

src/ComparatorExamples.java

## Practical Use Cases

### 104. Create a class LruCache<K, V> using LinkedHashMap to implement an LRU (Least Recently Used) cache.

See the related explanation and example in the repository.

### 105. Implement a basic to-do list application using ArrayList to store tasks. Add functionality to add, remove, and display tasks.

See the related explanation and example in the repository.

### 106. Write a program to count the frequency of characters in a string using a HashMap.

See the related explanation and example in the repository.

### 107. Create a program to store students’ grades in a TreeMap, with student names as keys and grades as values. Allow adding, removing, and querying grades.

See the related explanation and example in the repository.

### 108. Write a program to merge two PriorityQueue objects and sort the resulting queue.

See the related explanation and example in the repository.

## Advanced Questions

### 110. Create a generic MultiMap<K, V> class that stores multiple values for a single key using a HashMap<K, List<V>>.

See the related explanation and example in the repository.

### 111. Write a program to implement a simple banking system using Map to store customer IDs and their account balances.

See the related explanation and example in the repository.

### 112. Use a WeakHashMap to demonstrate how entries are garbage-collected when keys are no longer strongly referenced.

See the related explanation and example in the repository.

### 113. Create a program to implement a book catalog system using HashMap, where book titles are the keys and author names are the values. Allow searching by title.

See the related explanation and example in the repository.

### 114. Write a program to store a list of products and their prices in a TreeMap and display the products in sorted order by name.

See the related explanation and example in the repository.
