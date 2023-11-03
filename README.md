# Mustang Shelby - Composable Animated Card for Jetpack Compose

Welcome to the repository of `Mustang Shelby`, a lightweight and easy-to-use library for Android developers using Kotlin and Jetpack Compose to add animated sliding cards to their UI. Effortlessly integrate animated visibility with customizable text content, color schemes, and display times.

## Version
[![](https://jitpack.io/v/gilsonjuniorpro/Jarvis.svg)](https://jitpack.io/#gilsonjuniorpro/mustang)

## Features

- **Animated Visibility**: Utilize smooth sliding animations for your card's visibility.
- **Customizable Appearance**: Change the background color, text color, and font size to match your app's theme.
- **Adjustable Timing**: Control the display duration of your sliding card with predefined settings.
- **Easy Integration**: Quickly add `Mustang Shelby` to your project with a few lines of code.

## Getting Started

To add `Mustang Shelby` to your Compose project, follow these simple steps:

### Step 1: Add JitPack to Your Build

Ensure you have the Maven Central and JitPack repositories added to your project-level `build.gradle` file:

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2: Add the Dependency
Add the following line to your module-level build.gradle file: 

```
dependencies {
    implementation 'com.github.gilsonjuniorpro:jarvis.ca:version_here'
}
```

### Usage
Here's a simple example of how to use Mustang Shelby in your project:

```
@Composable
fun YourComposableScreen() {
    var isVisible by remember { mutableStateOf(true) }
    SlidingCardExample(
        isVisible = isVisible,
        toggleVisibility = { isVisible = !isVisible },
        displayTime = DisplayTime.Medium,
        backgroundColor = Color.White,
        textColor = Color.Black,
        fontSize = 15,
        content = "Hello, I'm a Jarvis CA card!"
    )
}
```

The SlidingCardExample composable function provides a card that slides in and out of view with customizable text content.

### Customization
Customize the SlidingCardExample with these parameters:

isVisible: Boolean that controls the visibility of the card.
toggleVisibility: Lambda function that is called to toggle the visibility.
displayTime: An enum (Short, Medium, Long) that controls how long the card is visible.
backgroundColor: The color of the card's background.
textColor: The color of the text.
fontSize: The size of the text.
content: The text content displayed on the card.
Contribution
Contributions are always welcome! Feel free to fork this repository and submit a pull request.

### License
Distributed under the MIT License. See LICENSE for more information.

### Contact
If you have any questions or suggestions, feel free to reach out.
