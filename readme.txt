Instrucciones paso a paso de ejecución

Tecnologías usadas 

- Sistema operativo: Windows 11
- IDE: IntelliJ IDEA versión 2024.2.4
- Karate: Versión 1.5.0
- JDK: Versión 17
- Maven: Versión 3.9.9

Verificar las versiones instaladas ejecutando estos comandos:
- Maven: mvn -version
- Java: java -version

Instrucciones para ejecutar los test

Para ejecutar las pruebas automatizadas, seguir los pasos a continuación:

Ejecutar KarateDSL modo interactivo
- Ingresar al directorio directorio /src/test/java/runners y luego a la clase **PetRunner** dar clic derecho sobre la clase. 
- Seleccionar Run 'PetRunner' para ejecutar el proyecto
- El proyecto se ejecutara	

Ejecutar KarateDSL mediante línea de comandos
- mvn clean verify -q

Ejecutar CI
Cualquier push a la rama master o pull request hacia la misma disparará automáticamente el flujo de trabajo.