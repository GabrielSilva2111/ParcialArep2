# Parcial 2: Arep - Explorador de Algoritmos de Búsqueda

Este proyecto consiste en una solución web que explora dos algoritmos de búsqueda: Búsqueda Lineal y Búsqueda Binaria. La aplicación web desarrollada permite a los usuarios investigar y comprender el funcionamiento de estos algoritmos mediante una interfaz intuitiva y amigable.

## Tecnologías Utilizadas

- **Maven**: Herramienta de gestión de proyectos que facilita la compilación y administración de dependencias.
- **Git y GitHub**: Utilizados para el control de versiones y la colaboración en el desarrollo del proyecto.
- **SparkJava**: Framework ligero de Java para la creación de aplicaciones web.
- **HTML5**: Utilizado para la estructura y el contenido de las páginas web.
- **JavaScript**: Utilizado para la interactividad y la lógica de la aplicación en el lado del cliente.

## Instalación

Para compilar y ejecutar este proyecto, siga los siguientes pasos:

### 1. Configuración de las Instancias de AWS

1. Acceda a la página oficial de Amazon AWS y cree tres instancias EC2.
2. Configure las reglas de seguridad para permitir el tráfico en los puertos necesarios para ejecutar la aplicación.

### 2. Instalación de Herramientas

Instale las siguientes herramientas en cada instancia EC2:

- **Git**: `sudo yum install git -y`
- **Java**: `sudo yum install java-17-amazon-corretto.x86_64`
- **Maven**: `sudo yum install maven -y`

### 3. Compilación del Proyecto

Clone el repositorio del proyecto y compile el código:

- `git clone https://github.com/GabrielSilva2111/ParcialArep2.git`
- `cd ParcialArep2`
- `mvn clean package install`

### 4. Ejecución de la Aplicación

En cada instancia EC2, ejecute los siguientes comandos para iniciar los servicios:

- **ServicioOne y ServicioTwo**:
![imagen.jpg](imagenes/imagen2.jpg)


`java -cp "target/classes:target/dependency/*" edu.escuelaing.arem.ASE.app.MathServices`

- **ProxyServer**:

![imagen1.jpg](imagenes/imagen1.jpg)

  `java -cp "target/classes:target/dependency/*" edu.escuelaing.arem.ASE.app.ServiceProxy http://ec2-174-129-178-111.compute-1.amazonaws.com:4567 http://ec2-54-167-228-120.compute-1.amazonaws.com:4567`
  Reemplace las URL con los DNS de las instancias correspondientes.
  Recordemos que en nuestra estructura tenemos un ServiceProxy, recibe como parámetro
  dos URl Para identificar el servicio

### Pruebas
las siguientes pruebas Son para probar los servicios BinarySearch y LinealSearch
- **Lineal Search**

![imagen4.jpg](imagenes/imagen4.jpg)

![imagen6.jpg](imagenes/imagen6.jpg)
- **Bynary Search**

![imagen7.jpg](imagenes/imagen7.jpg)

![imagen8.jpg](imagenes/imagen8.jpg)

### Arquitectura
este diagrama muestra cómo los clientes interactúan con 
el sistema a través del Service Proxy, que a su vez coordina las 
solicitudes con los MathServices correspondientes. Esto permite una arquitectura escalable y flexible que puede manejar diferentes tipos de solicitudes de búsqueda de manera eficiente.

![imagen5.jpg](imagenes/imagen5.jpg)


### Video Demostración:
[video Parcial](https://www.youtube.com/watch?v=QI8R2rhdQ7o)


  









