# Hashgraph Application Template
This is an alternative (arguably friendlier) maven setup for Hashgraph SDK based applications.

It allows you to build and run Hashgraph apps using the SDK more like an external resource rather than creating new modules along the demo apps inside the SDK directory structure.

Clone this repo to whatever location (independent from the Hashgraph sdk).
## Install Hashgraph SDK
Follow the pre-requisites, download and unzip the SDK to preferred location. See https://dev.hashgraph.com/docs/installation/

### Configure the SDK:
1. change the `config.txt` file found in the SDK as follows:
   * comment the GameDemo.jar line and add a new app line for this application (HelloSwirld.jar)
```
...
# app,        GameDemo.jar
app,          HelloSwirld.jar
...
```
   * Switch off the TLS encryption if you find that the startup is slow. Just uncomment the line:
```
TLS, off
```

## Configure this Project
You only need to change the swirlds.sdk property to refer to the path of your SDK installation (the directory path where you found the config.txt file).
The default is:
```
<swirlds.sdk>/home/swirlds/sdk</swirlds.sdk>
```

### Building
```
mvn clean install
```
this will package the app jar and copy it to the `apps` dir inside the Hashgraph SDK

### Run from IntelliJ IDEA
1. Run -> Edit Configurations...
2. Add new Application configuration
3. Main Class: Main
4. Working Directory: the SDK path (the same one you configured in the pom.xml)

You should see four console windows and one main browser window.

### Run from command line
To run it in the usual way, go to Hashgraph SDK dir
```
java -jar swirlds.jar
```

NOTE: Every code change needs a `mvn clean install` before you run the app again
