# Sample Messaging

## How to setup Firebase Project

1. Open [Firebase Console](https://console.firebase.google.com/)
2. Click on _New Project_
3. In the _Project name_ field, type **SampleMessaging**
4. Click on _Create Project_
5. Click on _Add Firebase to your Android app_ in the next screen
6. In the _Package name_ field, type **com.sample.samplemessaging**
7. Click on _Add App_
8. Save the file being downloaded into the directory _<path-to-project>/app_ as **google-services.json**

##How to build/install:

clone the project
```
$   git clone https://github.com/Avinash-Bhat/SampleMessaging
```

### Build using Android Studio (recommended)
1. open project in Android Studio
2. use _Run_ > _Run 'app'_ or `Shift+F10` (or `⌘R` on Mac)

### Build using Terminal
To install into attached devices
```
➜ Sample Messaging $ ./gradlew installDebug
```
To build
```language=sh
➜ Sample Messaging $ ./gradlew assembleDebug
```
