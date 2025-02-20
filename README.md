# Fip-Week6
FlexiSaf internship week 5


# Dependency Injection 
This was accomplished by creating a service class to handle the rest endpoint logic which is simplified to return a simple details about me and the Week of the internship 

Then the service class `MyService` was injected into the controller class that handles the rest endpoint and wired through constructors. 

Constructor injection was used because it is not the best practice as highlighted by this article 

https://medium.com/devdomain/spring-boots-autowired-vs-constructor-injection-a-detailed-guide-1b19970d828e

There are two endpoints: 
`/name` and `/week`u
