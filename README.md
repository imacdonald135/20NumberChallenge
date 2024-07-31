## IMPORTANT
This project that I developed started from a starting repository with gradle and JDK 17 and used JavaFX and Junit5.
However I heavily changed the functionality of the first app that was built in the lab to this game.

## How the game is played
A RNG will give you a number between 1-999 and you have to selec where out of 20 slots it will goal, with the end goal    
to put 20 random numbers in order without knowing what the next numbers you will get are.


# SENG201 Tut 2 Project Overview
This project is built off the same base project as the starting project for your assignment.

The following README is repeated from the project template project.

Welcome to the template project for SENG201 which you will transform into your own.
This README file includes some useful information to help you get started.
However, we expect that this README becomes your own

## Authors
- SENG201 Teaching team

## Prerequisites
- JDK >= 17 [click here to get the latest stable OpenJDK release (as of writing this README)](https://jdk.java.net/18/)
- gradle [Download](https://gradle.org/releases/) and [Install](https://gradle.org/install/)


## What's Included
This project comes with some basic examples of the following (including dependencies in the build.gradle file):
- JavaFX
- Junit 5

We have also included a basic setup of the Gradle project and Tasks required for the course including:
- Required dependencies for the functionality above
- Test Coverage with JaCoCo
- Build plugins:
    - JavaFX Gradle plugin for working with (and packaging) JavaFX applications easily

You are expected to understand the content provided and build your application on top of it. If there is anything you
would like more information about please reach out to the tutors.

## Importing Project (Using IntelliJ)
IntelliJ has built-in support for Gradle. To import your project:

- Launch IntelliJ and choose `Open` from the start-up window.
- Select the project and click open
- At this point in the bottom right notifications you may be prompted to 'load gradle scripts', If so, click load

**Note:** *If you run into dependency issues when running the app or the Gradle pop up doesn't appear then open the Gradle sidebar and click the Refresh icon.*

## Run Project 
1. Open a command line interface inside the project directory and run `./gradlew run` to run the app.
2. The app should then open a new window, this may not be displayed over IntelliJ but can be easily selected from the taskbar

## Build and Run Jar
1. Open a command line interface inside the project directory and run `./gradlew jar` to create a packaged Jar. The Jar file is located at build/libs/seng201_teamX-1.0-SNAPSHOT.jar
2. Navigate to the build/libs/ directory (you can do this with `cd build/libs`)
3. Run the command `java -jar seng201_tut2-1.0-SNAPSHOT.jar` to open the application.

**Note:** *This Jar is **NOT** cross-platform, so you **must** build the jar you submit on Linux.* 
