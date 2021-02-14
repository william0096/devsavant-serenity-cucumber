# Automation - Devsavant "Avianca"

Este es un repositorio de Automatización que usa serenity-bdd-screenplay & cucumber

## Screenplay implementation

Estos test usan tasks, actions, abilities, questions and page elements definidos en src/main/java/screenplay.

La estructura del paquete screenplay se define de esta forma

````
+ model
    Domain model classes
+ abilities
    Actor/User can do abilities
+ tasks
    Business-level tasks
+ actions
    UI interactions
+ user_interfaces
    Page Objects and Page Elements
+ questions
    Objects used to query the application
````
La estructura del paquete mencionado, es una idea y/o aproximación de como la automatización de pruebas puede
ser escrita implementando el patron de diseño screenplay y los principios SOLID (Single Responsibility , Open/Closed, 
Liskov Substitution, Interface Segregation, Depedency Injection) en el mismo framework.


## Get the code

Git:

    git clone https://github.com/william0096/devsavant-serenity-cucumber
    cd devsavant-serenity-cucumber
    

## Running the Project

En una ventana de terminal ejecute:

    ./gradle.bat clean test aggregate (For Windows Machines)
    ./gradlew clean test aggregate  (For Linux based and Mac)
    
nota: tenga en cuenta que el respositorio por defecto se ejecutta con Chrome, es importante que se asegure de tener instalado la versión del navegador 88.0, o en su defecto reemplace el archivo chromedriver localizado en src/test/resources/drivers con la versión de chromedriver que se ajuste a su versión actual

## Verificar el reporte de pruebas

Una vez ejecutadas las pruebas, puede localizar el reporte en target/site/serenity/index.html

Refernecia: https://www.youtube.com/watch?v=VueLCYV2UYs&feature=youtu.be 
