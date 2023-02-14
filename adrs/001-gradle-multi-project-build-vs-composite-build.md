# Context
We will be using gradle as a build automation tool for a Mono repository with many microservices and shared libraries.
For building multiple artifacts there are two types of gradle build setups.

## Multi-project Build
* all artifacts have the same version
* all artifacts are built together 
* all artifacts have the same release cycle 
* all projects will need to be opened in an IDE
* longer build times 

## Composite Build
* artifacts can have different versions
* artifacts can be built and released independently 
* can open a single application in IDE 
* faster build times by only rebuilding what is needed 

# Decision 
We will use composite builds as we want to be able to have different release cycles for each service.
