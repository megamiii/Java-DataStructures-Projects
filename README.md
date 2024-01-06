# Java-DataStructures-Projects
This repository showcases a collection of my projects and implementations related to data structures and algorithms in Java.

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
```c
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
```yaml
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
```c
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
```yaml
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
```c
building 10 9 8 7 6 5 4 3 2 1
building 1 2 3 4 5 6 7 8 9 10
building 10 6 5 9 7 8 1 2 3 4
```

*Sample Output:*
```yaml
visible buildings: 10
visible buildings: 1
visible buildings: 4
```

**Restaurant Queue Management:**

*Sample Input:*
```c
restaurant 3 2 1 0 0 0
restaurant 1 2 3 0 0 4 5 6 7 0 0 0 0 0
restaurant 1 2 3 0 4 5 6 0 7 8 9
```

*Sample Output:*
```yaml
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