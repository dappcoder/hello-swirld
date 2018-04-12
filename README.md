## Hashgraph application template
This is an alternative (arguably friendlier) maven setup for Hashgraph SDK based applications.

It allows you to build and run hashgraph apps using the SDK more like an external resource rather than creating new modules along the demo apps inside the SDK directory structure.

#### Install Hashgraph SDK
Follow the pre-requisites, download and unzip the SDK to preferred location. See https://dev.hashgraph.com/docs/installation/

#### Configure the SDK:
1. change the `config.txt` file found in the SDK as follows:
   * comment the GameDemo.jar line and add a new app line for this application (HelloSwirld.jar)
```
...
# app,        GameDemo.jar
app,        HelloSwirld.jar
...
```
   * Switch off the TLS encryption if you find that the startup is slow. Just uncomment the line:
```
TLS, off
```
#### Configure the pom.xml of this project:
You only need to change the sdk.dir property to refer to the path of your sdk installation (the directory path where you found the config.txt file).
The default is:
```
<sdk.dir>/home/swirlds/sdk</sdk.dir>
```
#### Build it
```
mvn clean install
```
this will package the app jar and copy it to the `apps` dir inside the hashgraph sdk

#### Run from IntelliJ IDEA
1. Run -> Edit Configurations...
2. Add new Application cofiguration
3. Main Class: HelloSwirldMain
4. Working Directory: the sdk path (the same one you configured in the pom.xml)

You should see four console windows and one main browser window.

#### Run from command line
To run it in the usual way, go to hashgraph sdk dir
```
java -jar swirlds.jar
```

NOTE: Every code change needs a `mvn clean install` before you run the app again
