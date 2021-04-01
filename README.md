# prescribeit-hello-sdk

This is a sample app that shows how to configure the mvn pom file in order to add the PrescribeIT SDK library as a dependency. The app itself doesn't do much, other than invoking a couple of SDK APIs to prove that the dependency has been configured properly.

To build the app, please run:

```
mvn package
```

at the top of the project. An executable .jar file will be generated in the 'target' directory.

To run the app, please execute:

```
java -jar hello-sdk-1.0-SNAPSHOT-shaded.jar
```

in the target directory.
