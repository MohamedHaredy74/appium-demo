# Appium Demo

A Java-based mobile UI automation project using [Appium](https://appium.io/) and TestNG to drive tests against an Android application.

## Overview

This project demonstrates how to set up and run automated tests for an Android app (`ApiDemos-debug.apk`) using Appium's `UiAutomator2` driver. It starts a local Appium server programmatically, launches the app on an Android device/emulator, and runs test scenarios with TestNG.

## Tech Stack

- **Java 24**
- **Maven** for build and dependency management
- **Appium Java Client** (`io.appium:java-client`) for driving the Android app
- **TestNG** as the test framework

## Project Structure

```
src/test/java/tests/DemoTest.java   # Test class: starts Appium service, launches the app, runs tests
src/test/resources/ApiDemos-debug.apk  # Sample Android app under test
pom.xml                              # Maven project configuration
```

## Prerequisites

- Java 24 and Maven installed
- Appium server dependencies (Node.js, Appium, UiAutomator2 driver)
- Android SDK with an emulator or connected device configured

## Running the Tests

```bash
mvn test
```

This will start a local Appium service, install and launch the sample APK on the configured device, and execute the test suite.
