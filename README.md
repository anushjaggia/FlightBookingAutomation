Flight Booking Automation
This repository contains a Java-based Selenium script for automating the flight booking process on a sample travel website. The script interacts with the website's user interface to perform the following key actions:

Dynamic Dropdown Selection: The script navigates through dynamic dropdowns to select the departure and destination airports. It waits for a brief period to ensure proper interaction.

Calendar Date Picker: It selects a specific date on the calendar for booking a flight. Additionally, the script verifies the disabled state of the return trip calendar.

Checkboxes Handling: The script interacts with checkboxes, selecting the "Student Discount" checkbox, ensuring it is selected, and counting the total number of checkboxes on the page. It also adjusts the number of adults using increment and decrement buttons and verifies the changes.

Currency Selection: The script interacts with a static dropdown menu to select a specific currency for the booking.

Flight Search Submission: It initiates the flight search by clicking the "Find Flights" button.

Getting Started
To run this script locally, ensure you have the following prerequisites:

Java Development Kit-17
Selenium WebDriver
Chrome WebDriver
TestNG (for assertions)
Usage
Clone this repository to your local machine.

Set up your development environment with the necessary dependencies.

Update the Chrome WebDriver path in the script if required.

Run the script to automate the flight booking process on the provided website.

Observe the script's interactions and verifications in the console output.

Author
Anush Jaggia
