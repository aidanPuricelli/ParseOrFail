# Parser Project
### Group Name: 
    Parse or Fail
### Language: 
    Java
### Group Members:
    Aidan Puricelli
    Clay Billadeau
    Ethan Mick
    Shakthivel Gnanasekaran
### The Parser:
    ParseOrFail's Python parser is a Java project that uses ANTLR to parse Python
    scripts. It's built with Maven and includes a `Main` class that outputs a
    parse tree to  a file.
### Getting Started
    These instructions will get you a copy of the project up and running on your 
    local machine for development and testing purposes.
### Prerequisites
    You need to have the following installed on your machine:
    * Git
    * Java Development Kit (JDK)
    * Maven
### Cloning the Repository
    To clone down the repo, open a terminal and run the following:
    ```bash
    git clone https://github.com//parseorfail.git
    ```
### Building the Project
    Navigate to the project directory and run the following command to build the project:
    `mvn clean install`
    This will compile the project and run any tests. If the build is successful, you should see a `BUILD SUCCESS`
    status message.
### Running Main.java
    To run `Main.java`, use the following command:
    `mvn exec:java -Dexec.mainClass="parseorfail.Main"`
    This will run `Main` and output the parse tree to the "parsetree.txt" file.
### Demo Video:
    Our group has also created a Demo video to illustrate the process and the Parser in action.
    It can be found at the following link:
