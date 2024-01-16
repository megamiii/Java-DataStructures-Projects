# Java-DataStructures-Projects
This repository showcases a collection of my projects and implementations related to data structures and algorithms in Java.

- [Java-DataStructures-Projects](#java-datastructures-projects)
  - [1. JavaStackQueue](#1-javastackqueue)
    - [Project Description](#project-description)
    - [Repository Structure Overview](#repository-structure-overview)
    - [Data Structures](#data-structures)
    - [Problem Solvers](#problem-solvers)
    - [Main Execution (`Main.java`)](#main-execution-mainjava)
    - [I/O Examples](#io-examples)
    - [Compilation and Execution](#compilation-and-execution)
    - [Notes](#notes)
  - [2. BSTBookFinder](#2-bstbookfinder)
    - [Project Description](#project-description-1)
    - [Features](#features)
    - [Repository Structure Overview](#repository-structure-overview-1)
    - [How to Use](#how-to-use)
    - [Implementation Details](#implementation-details)
    - [Compilation and Execution](#compilation-and-execution-1)
    - [Sample Input and Output](#sample-input-and-output)
  - [3. HybridSort](#3-hybridsort)
    - [Project Description](#project-description-2)
    - [Features](#features-1)
    - [Repository Structure Overview](#repository-structure-overview-2)
    - [How to Use](#how-to-use-1)
    - [Compilation and Execution](#compilation-and-execution-2)
    - [Sample Input and Output](#sample-input-and-output-1)
    - [Additional Notes](#additional-notes)
  - [HashTable](#hashtable)
    - [Description](#description)
    - [Repository Structure Overview](#repository-structure-overview-3)
    - [How to Use](#how-to-use-2)
    - [Compilation and Execution](#compilation-and-execution-3)
    - [Sample Input and Output](#sample-input-and-output-2)

## 1. JavaStackQueue
### Project Description
JavaStackQueue is a Java-based implementation project aimed at demonstrating the practical applications of two fundamental data structures: Stack and Queue. Through this project, we showcase their uses in solving real-world problems such as determining visible buildings in a skyline (BuildingSeer) and managing the queue in a restaurant (Restaurant).

### Repository Structure Overview
The JavaStackQueue project repository is structured to facilitate the development, testing, and deployment of the Java-based stack and queue data structures, along with their applications in solving typical computational problems. Below is the hierarchy and description of the contents:

```bash
JavaStackQueue/
│
├── skeleton/
│   ├── outputIO/          # Directory for storing outputs from execution
│   ├── sampleIO/          # Sample inputs and expected outputs for testing
│   └── src/               # Source code for the data structures and problem solvers
│       ├── Solver/        # Problem-solving classes using data structures
│       │   ├── BuildingSeer.java
│       │   └── Restaurant.java
│       └── Structures/    # Core data structure implementations
│           ├── Queue.java
│           ├── Stack.java
│           └── Main.java  # Main class for execution and handling I/O
```

### Data Structures
The project introduces two classes, Stack and Queue, each providing a set of operations essential for their respective data structure:

- `Stack`: A Last-In-First-Out (LIFO) data structure with `push`, `pop`, `clear`, `isempty`, and `length` methods.
- `Queue`: A First-In-First-Out (FIFO) data structure with `push`, `pop`, `clear`, `isempty`, and `length` methods.

### Problem Solvers
We have two problem-solving classes that utilize the implemented data structures to provide solutions to specific scenarios:

- `BuildingSeer`: Determines how many buildings from a sequence are visible when taller buildings can block the view of shorter ones.
- `Restaurant`: Manages a queue of customers in a restaurant, reporting the last customer served and the maximum length of the queue during service.

### Main Execution (`Main.java`)
The `Main` class is responsible for interfacing with the user, handling file I/O for inputs and outputs, and invoking the appropriate data structure methods based on the commands read from the input files.

### I/O Examples
The project uses text files for input and output to demonstrate the Stack and Queue operations. Below are sample inputs and their corresponding outputs, showcasing how the Main.java program processes commands and returns results.

**Stack Operations:**

*Sample Input:*
```
stack push 10
stack push 20
stack push 30
stack pop
stack isempty
stack push 40
stack length
stack pop
stack pop
stack pop
stack isempty
stack push 50
stack clear
stack isempty
stack length
```

*Sample Output:*
```
stack pushed: 10
stack pushed: 20
stack pushed: 30
stack pop: 30
stack is not empty
stack pushed: 40
stack length: 3
stack pop: 40
stack pop: 20
stack pop: 10
stack is empty
stack pushed: 50
stack cleared
stack is empty
stack length: 0
```

**Queue Operations:**

*Sample Input:*
```
queue push 20
queue push 30
queue pop
queue isempty
queue push 40
queue length
queue pop
queue pop
queue isempty
queue length
queue push 50
queue clear
queue isempty
queue length
```

*Sample Output:*
```
queue pushed: 20
queue pushed: 30
queue pop: 20
queue is not empty
queue pushed: 40
queue length: 2
queue pop: 30
queue pop: 40
queue is empty
queue length: 0
queue pushed: 50
queue cleared
queue is empty
queue length: 0
```

**Building Visibility:**

*Sample Input:*
```
building 10 9 8 7 6 5 4 3 2 1
building 1 2 3 4 5 6 7 8 9 10
building 10 6 5 9 7 8 1 2 3 4
```

*Sample Output:*
```
visible buildings: 10
visible buildings: 1
visible buildings: 4
```

**Restaurant Queue Management:**

*Sample Input:*
```
restaurant 3 2 1 0 0 0
restaurant 1 2 3 0 0 4 5 6 7 0 0 0 0 0
restaurant 1 2 3 0 4 5 6 0 7 8 9
```

*Sample Output:*
```
length, stu_id: 1 3
length, stu_id: 7 5
length, stu_id: 2 7
```

### Compilation and Execution
To compile and execute the JavaStackQueue project, use the following commands in a Linux environment:

```bash
javac $(find ./skeleton/src -name "*.java")
java -cp ./skeleton/src Main <input_filepath> <output_filepath>
```

Replace `<input_filepath>` and `<output_filepath>` with the paths to your input and output files, respectively.

For example:

```bash
java -cp ./skeleton/src Main ./skeleton/sampleIO/input.txt ./skeleton/outputIO/output.txt
```

These commands will compile all Java files within the `src` directory and run the `Main` class with the specified input and output file paths.

### Notes
- Ensure that all Java files are present within the `src` directory and are correctly referenced in the `package` declarations.
- Ensure that your Java environment path is correctly set up for the javac and java commands to work.
- The sample input and output files provided in the sampleIO directory are for demonstration purposes. Feel free to add more comprehensive tests to thoroughly check your implementations.
- Adjust file paths according to your specific environment setup.

## 2. BSTBookFinder
### Project Description
BSTBookFinder is a Java-based system designed to assist librarians in managing the catalog of books in a library. Utilizing a Binary Search Tree (BST), it allows for efficient adding, removing, and searching of books by title. The system is tailored to handle a large volume of books and supports various operations to streamline library management tasks.

### Features
- **Book Management:** Add or delete book records efficiently.
- **Search:** Find the location of a book using its title.
Lexicographical Order Operations: Retrieve the first or last book in lexicographical order.
- **Size Management:** Each tree node tracks the size of its subtree for balanced operations.
- **Print Book List:** Output all book titles in lexicographical order.
- **Order Search:** Locate a book by its lexicographical position or find a book's position by its title.

### Repository Structure Overview
```bash
BSTBookFinder/
│
├── bin/                           # Compiled .class files
│
├── src/
│   ├── bst/
│   │   ├── BinaryNode.java        # Node structure for BST
│   │   ├── BinarySearchTree.java  # Core BST implementation for book records
│   │   ├── BookSearch.java        # Interface for book management operations
│   │   └── TreePrinter.java       # Utility to visualize the BST (for debugging)
│   └── Main.java                  # Main I/O handling
│
├── sample_input.txt               # Sample input file for the program
└── sample_output.txt              # Expected output for the sample input
```

### How to Use
- **Add a Book:** Use `add(String name, String position)` to add a new book to the system. The `name` is the title of the book, and `position` is its location in the library.
- **Remove a Book:** Use `remove(String name)` to remove a book from the system. Provide the `name` of the book you want to remove.
- **Find a Book's Location:** Use `get(String name)` to find a book's location. Input the `name` of the book.
- **Retrieve Books by Order:** Use `orderSearch(int order)` to find the book at a specific lexicographical position, or `orderSearch(String name)` to find the position of a book.

### Implementation Details
- The system is case-sensitive and expects book titles in lowercase without spaces.
- BST is chosen for its efficient search, insert, and delete operations, which are critical for managing a large number of books.
- Method overloading is used for the order search functionality.
- The `size` variable in `BinaryNode` is crucial for maintaining the balance of the BST and must be managed with each insertion or deletion.

### Compilation and Execution
Compile and run the program using the provided `Main.java` which handles input and output automatically. Ensure to compile all `.java` files in the `src` and run the `Main` class from the correct location.


For example:

```bash
# Compile the Java files, placing class files in the bin directory
javac -d bin src/*.java src/bst/*.java

# Run the Main class, using bin as the classpath
java -cp bin Main
```

### Sample Input and Output
The `BSTBookFinder` system accepts a series of commands to perform operations on the book database. Below are examples of commands you might input into the system, along with the expected output for each.

*Sample Input:*

The input commands to `BSTBookFinder` are given in a text file, such as `sample_input.txt`, and might look like the following:

```
print_all
get basic_of_love
add history A4-123
add true_romance B5-331
add purity_of_dancer C2-112
add cats_on_catnip B3-319
add deep_learning D2-554
add data_structure D7-301
remove history
size
print_all
add friends Z1-342
order_search data_structure
order_search 2
order_search the_dungeon_and_dragon
remove how_to_make_a_girl_friend
print_tree
get_min
get_max
```

*Sample Output:*

The system's output will be printed to the standard output (stdout) and might look like the following, which corresponds to the sample input provided above:


```
BookSearch does not have any book
BookSearch cannot find the book
ADD: history A4-123
ADD: true_romance B5-331
ADD: purity_of_dancer C2-112
ADD: cats_on_catnip B3-319
ADD: deep_learning D2-554
ADD: data_structure D7-301
REMOVE: history A4-123
SIZE: 5
BOOK: cats_on_catnip
BOOK: data_structure
BOOK: deep_learning
BOOK: purity_of_dancer
BOOK: true_romance
ADD: friends Z1-342
ORDER: data_structure
ORDER: cats_on_catnip
BookSearch cannot find the book
BookSearch cannot find the book
PRINT_TREE:
       pod6               
      /    \       
     /      \      
    /        \     
   /          \    
   coc4       tr1       
    \           
     \          
     dl3           
    /   \         
   ds1   f1
GET MIN: cats_on_catnip
GET MAX: true_romance
```

## 3. HybridSort
### Project Description
The `HybridSort` introduces a sorting solution that merges the quicksort and insertion sort algorithms to optimize performance. The hybrid sorting algorithm starts with quicksort and switches to insertion sort when subarrays reach a size threshold. This approach leverages the efficiency of quicksort for large datasets and the effectiveness of insertion sort for small partitions.

### Features
- **Hybrid Sorting Algorithm:** Combines quicksort and insertion sort for improved sorting performance.
- **Subarray Threshold:** Switches from quicksort to insertion sort when subarrays reach a size of 32.
- **Performance Optimized:** Tailored to offer better average-case performance on typical datasets.
- **Problem Solving:** Applies the hybrid sorting algorithm to solve a variety of problems, including finding k-th smallest elements and merging two unsorted arrays.

### Repository Structure Overview
```bash
HybridSort/
│
├── src/
│   ├── sort/
│   │   ├── HybridSorter.java    # Implements the hybrid sorting algorithm
│   │   ├── QuickSorter.java     # Implements the quicksort portion
│   │   ├── InsertionSorter.java # Implements the insertion sort portion
│   │   └── Pair.java            # Data structure for key-value pairs
│   └── Main.java                # Main program entry point
│
└── testcase/
    ├── input.txt                # Sample input file for the program
    └── output.txt               # Output file for sample input
```

### How to Use
- **Sorting:** To sort an array of key-value pairs, create an instance of `HybridSorter` and call the `sort` method.
- **K-th Smallest Element:** Use the `search` method of `HybridSorter` to find the k-th smallest element based on key comparison.
- **Find Element by Key:** `searchKey` returns the position of an element by its key in a sorted array.
- **Find First, Median, and Last Elements:** Use the `first`, `median`, and `last` methods to find respective elements after merging two unsorted arrays.

### Compilation and Execution
Compile and run the program using the provided `Main.java`, which handles input and output automatically. Ensure to compile all `.java` files in the src/sort directory and run the `Main` class without modifying it.

For example:
```bash
# Navigate to the project root directory
cd HybridSort

# Compile the Java files and output the class files to the default directory
javac src/sort/*.java src/Main.java

# Run the Main class with the provided input.txt file
java -cp src Main < testcase/input.txt > testcase/output.txt
```

### Sample Input and Output
The `HybridSort` accepts a series of commands to perform operations on the array of pairs. Below are examples of commands you might input into the system, along with the expected output for each.

*Sample Input:*
```
n 6
append apple 3
append coconut 5
append strawberry 1
append durian 2
append banana 4
append watermelon 6
print 0
print 1
print 2
search 1
searchKey apple
search 2
searchKey durian
sort
print 0
print 1
print 2
searchKey coconut
n 3 3
append apple 1
append coconut 2
append strawberry 3
append durian 4
append banana 5
append watermelon 6
median
first
n 2 3
append apple 1
append coconut 2
append strawberry 3
append durian 4
append banana 5
first
median
last
```

*Sample Output:*
```
apple
coconut
strawberry
durian
banana
watermelon
Print: 0 apple 3
Print: 1 coconut 5
Print: 2 strawberry 1
Search: 1 apple 3
searchKey: 1 apple
Search: 2 banana 4
searchKey: 4 durian
Sorted
Print: 0 apple 3
Print: 1 banana 4
Print: 2 coconut 5
searchKey: 3 coconut
n1: 3 n2: 3
apple
coconut
strawberry
durian
banana
watermelon
Median: coconut-durian 2-4
First: apple 1
n1: 2 n2: 3
apple
coconut
strawberry
durian
banana
First: apple 1
Median: coconut 2
Last: strawberry 3
```

The sample output will correspond to the operations performed by the hybrid sorting algorithm, as demonstrated in the given input file.

### Additional Notes
- The program is designed to handle up to 1,000,000 key-value pairs.
- All keys are unique and should be provided in lowercase without spaces.
- This implementation is optimized for large datasets, ensuring time complexity is maintained in the worst case, with better performance in the best case.

## HashTable

### Description
The HashTable project implements a hash table using quadratic probing for collision resolution. It includes the following operations: create, insert, delete, search, and maxProbe. The hash table is designed to handle a large number of entries with efficient collision handling.

### Repository Structure Overview

```bash
HashTableProject/
│
├── src/                  # Source files for the HashTable implementation
│   ├── HashTable.java    # The HashTable class with quadratic probing
│   └── Main.java         # Main class for demonstrating HashTable usage
│
├── bin/                  # Compiled bytecode files (not tracked by Git)
│
├── .gitignore            # Specifies intentionally untracked files to ignore
│
├── sample_input.txt      # Sample input for testing the HashTable program
├── sample_output.txt     # Sample output for validating the program's functionality
│
└── README.md             # Documentation and overview of the project
```

### How to Use
- **Create**: Initialize the hash table with given constants for the quadratic probing collision resolution policy.
- **Insert**: Add a key to the hash table.
- **Delete**: Remove a key from the hash table, using -1 as a tombstone.
- **Search**: Find the index of a key in the hash table.
- **MaxProbe**: Determine the maximum number of probes that have occurred during an insertion.

### Compilation and Execution
To compile and run the HashTable project, navigate to the project directory and use the following commands:

```bash
javac src/HashTable.java src/Main.java
java -cp src Main
```

### Sample Input and Output
*Sample Input:*
```
create 1 1 1
insert 100
insert 200
insert 1000
insert 2000
search 100
search 200
search 1000
search 2000
delete 100
search 100
search 200
maxProbe
```

*Sample Output:*
```
INSERT: 100, INDEX: 101
INSERT: 200, INDEX: 201
INSERT: 1000, INDEX: 478
INSERT: 2000, INDEX: 432
SEARCH: 100, INDEX: 101
SEARCH: 200, INDEX: 201
SEARCH: 1000, INDEX: 478
SEARCH: 2000, INDEX: 432
DELETE: 100, INDEX: 101
Failed to find 100
SEARCH: 200, INDEX: 201
Maximum number of probes: 2
```