# Pruebas Automatizadas con Karate

Este repositorio contiene un proyecto de pruebas automatizadas utilizando **Karate**, **Maven** y **Java**. A continuación se describen los pasos para configurar el entorno local y ejecutar las pruebas.

## 1. Prerrequisitos

Antes de comenzar, asegúrate de tener configurado lo siguiente en tu máquina local:

- **Sistema operativo**: Windows 11
- **IDE**: [IntelliJ IDEA](https://www.jetbrains.com/idea/) versión 2024.2.4
- **Karate**: Versión 1.5.0 (Karate está configurado como una dependencia de Maven en el proyecto)
- **JDK**: Versión 17 (asegúrate de tenerlo configurado en la variable de entorno `JAVA_HOME`)
- **Maven**: Versión 3.9.9 (asegúrate de tenerlo en la variable de entorno `MAVEN_HOME`)

### Verificación de versiones instaladas

Para verificar que tienes las versiones correctas de **Java** y **Maven** instaladas, ejecuta los siguientes comandos en tu terminal:

```bash
mvn -version
java -version
```

## 2. Comandos de instalación

Para instalar las dependencias necesarias en tu máquina local, sigue los pasos a continuación:

**2.1 Clonar el repositorio**
```bash
git clone https://github.com/Christian1091/Ejercicio-API-Karate.git
```
- cd Ejercicio-API-Karate

**2.2 Instalar dependencias del proyecto**
```bash
mvn install -DskipTests
```

## 3. Instrucciones para ejecutar los tests

**3.1 Ejecutar Karate modo interactivo**
- Abrir el directorio src/test/java/runners en IntelliJ IDEA.
- Dirigirse a la clase **PetRunner**
- Clic derecho sobre la clase **PetRunner** y seleccionar **Run 'PetRunner'** para ejecutar las pruebas.

**3.2 Ejecutar karate desde línea de comandos**
```bash
mvn clean verify -q
```

## 4. Información adicional

**Reportes:** Se genera reportes en cucumber detallados de las pruebas ejecutadas, que puedes revisar para obtener información sobre el estado de cada prueba, los reportes se encuentran en el directorio **target/karate-reports/cucumber-html-reports/overview-features.html** dentro del proyecto.

**Ejecución de pruebas en CI**

Para que las pruebas se ejecuten automáticamente en GitHub Actions cada vez que se realice un push en la rama master o un pull request hacia la misma, se disparará automáticamente el flujo de trabajo de CI, que ejecutará la prueba en el navegador Firefox y en modo headless.

**Estructura del proyecto**
```markdown
├───.github
│   └───workflows
├───.idea
├───src
│   ├───main
│   │   ├───java
│   │   └───resources
│   └───test
│       ├───java
│       │   └───runners
│       └───resources
│           ├───data
│           └───features
└───target
