# Subsystems example

This repository shows how to get started with [OSGi Subsystems](http://www.osgi.org/Download/Release5). The Subsystems specification facilitates the definition, distribution and deployment of applications consisting of multiple OSGi bundles. Moreover, the specification defines isolations models that prevents implementation details of subsystems to leak outside of the subsystem itself.

## Running the framework

The repository contains a pre-packaged OSGi framework that is able to run Subsystems out of the box. The framework also exposes some commands for the embedded Gogo shell that allows you to interact with the Subsystems implementation. Once you extract the [framework](files/framework.zip), you can run it by moving in the root of the extracted folder and running

```
java -jar bin/felix.jar
```

## Building the examples

Before installing the examples in the running framework, you need to build them. If you already have a working installation of Maven, this is as easy as running the following command from the root of the repository:

```
mvn clean package
```

## Installing a subsystem

Once the examples are built and the framework is running, you can install a subsystem using the Gogo shell. Let's say you want to install the subsystem built by the `application-subsystem` module. To do that, you can simply type the following in your Gogo shell prompt:

```
g! subsystem:install file://.../application-subsystem-1.0.0-SNAPSHOT.esa
```

Of course, you have to provide a valid path pointing to the subsystem archive you want to install.
