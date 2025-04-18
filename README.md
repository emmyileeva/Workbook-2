# Workbook 2 – Java Practice Projects

This folder contains my Java exercises from Workbook 2.  

---

## 📘 Exercises Included

### ✅ FullNameGenerator
- Prompts the user to enter their first name, optional middle name, last name, and optional suffix
- Trims extra spaces from each input
- Builds a full name string depending on which parts were provided
- Adds a comma before the suffix when present
- Console-based interaction using `Scanner`

### ✅ FullNameParser
- Prompts the user to enter their name in either `first last` or `first middle last` format
- Trims extra spaces from the input
- Parses the name into first, middle, and last parts
- Displays "(none)" for middle name if it was not provided
- Uses `split()`, conditionals, and arrays to handle flexible input

### ✅ FinancialClientApp
- Console-based app to register and manage business clients
- Collects first name, last name, business name, email address, and phone number
- Displays client info with formatted names like `Last, First I.`
- Allows users to display all business names or email addresses from a predefined list
- Demonstrates usage of classes, arrays, methods, and object data formatting

### ✅ HighScoreWins
- Prompts the user to enter a game result in the format `TeamA:TeamB|ScoreA:ScoreB`
- Splits the input to extract both team names and their scores
- Compares the scores and prints the winning team
- Displays "It's a tie!" if both scores are equal
- Great for practicing string splitting, parsing, and conditionals

### ✅ TheaterReservations
- Prompts the user for their full name, show date (in `MM/dd/yyyy` format), and number of tickets
- Automatically reformats the date to `yyyy-MM-dd` for clarity
- Displays a confirmation message showing the number of tickets, formatted date, and the name as `LastName, FirstName`
- Handles plural and singular ticket wording (e.g., “1 ticket” vs. “3 tickets”)
- Great practice for string manipulation and Java date formatting using `LocalDate` and `DateTimeFormatter`

### ✅ AddressBuilder
- Prompts the user to enter their full name, billing address, and shipping address
- Uses `StringBuilder` and the `append()` method to dynamically build a formatted address block
- Displays the customer’s full name followed by billing and shipping addresses
- Adds blank lines between sections for clear formatting
- Great practice for working with `StringBuilder`, user input, and string formatting

### ✅ CellPhoneService
- Builds a `CellPhone` class with fields like:
  - `serialNumber`
  - `model`
  - `carrier`
  - `phoneNumber`
  - `owner`
- Implements:
  - A parameterless constructor with default values.
  - An overloaded constructor to initialize all fields at once.
- Provides getter and setter methods for each field.
- Includes a `dial` method:
  - Allows dialing a phone number.
  - Overloaded to simulate one `CellPhone` object dialing another.
- In the main application:
  - Prompts the user to enter details for two cell phones.
  - Sets the details using setters and retrieves them using getters.
  - Displays the phone's properties in a formatted output.
  - Adds a separator line between the details of each phone for better readability.
  - Simulates dialing between the two phones using the `dial` method.
  - Creates a third `CellPhone` object using the overloaded constructor.
  - Initializes the third phone's fields using setters and displays its details.
  - Simulates dialing from the third phone to the first phone.
- Great practice for:
  - Working with classes, constructors, setters, and getters.
  - Handling user input with `Scanner`.
  - Formatting console output for clarity.
  - Overloading methods for enhanced functionality.

### ✅ LoopingExercises
- A set of small apps demonstrating each loop type in Java:
  - **WhileLoop**: prints “I love Java” five times using a `while` loop  
  - **DoWhileLoop**: prints “I love Java” five times using a `do…while` loop  
  - **ForLoop**: counts down from 10 to 1 with a `for` loop, pauses 1 second between numbers with `Thread.sleep(1000)`, and ends with “Launch!”  
- Great practice for:
  - Understanding loop syntax and flow control  
  - Managing loop conditions and loop bodies  
  - Introducing delays in console apps with exception handling  

---

## ✨ What I Learned
- How to use `Scanner` to collect user input from the console
- How to handle optional inputs and conditionally add parts to a string
- How to use `String.trim()` and `String.isEmpty()` to clean up and validate text
- How to use `if`, `else if`, and `else` to build different outcomes based on input
- How to keep console output clean and readable
- How to use `String.split()` and arrays to parse flexible user input
- How to use for, while, and do-while loops effectively
- How to use Thread.sleep() to add delays in loop execution



