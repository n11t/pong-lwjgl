# Einrichtung

## Voraussetzungen

* [Maven](http://maven.apache.org/) muss installiert sein

## Installation

    git clone https://github.com/n11t/pong-lwjgl.git
    cd pong
    mvn clean install

* Das Projekt in Eclipse als `Existing Maven Projekt` einbinden
* Das Projekt als Java-Applikation ausfuehren
* Unter `Run > Run Configurations` die VM-Arguments unter `Arguments` um `-Djava.library.path="./target/natives/"` erweitern.

# Singleplayer

    WASD

    mvn clean install
    java -Djava.library.path="./target/natives/" -jar ./target/pong-0.0.1-SNAPSHOT-jar-with-dependencies.jar

# Multiplayer

    WASD und Pfeiltasten

    mvn clean install
    java -Djava.library.path="./target/natives/" -jar ./target/pong-0.0.1-SNAPSHOT-jar-with-dependencies.jar versus
