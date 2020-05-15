# playing-with-angular-part2-backend

This is the backend for the playing-with-angular-part2.

How to execute this project:
- Install Docker in you machine.
- Import as a Maven project in Intellij.
- Build a new jar file (mvn install -DskipTests).
- Enable Swarm in Docker and run:
    - docker stack deploy docker stack deploy --compose-file=docker-compose.yml backend-db.