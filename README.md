# E-wok-JAVA -BACKEND
 
E-Wok es una aplicación web que permite a los usuarios consultar un menú de platos, realizar pedidos personalizados y aplicar descuentos según la cantidad de pedidos realizados. La aplicación está en proceso de desarrollo y está diseñada para emular un sistema de pedidos en línea para un restaurante de comida de Wok.
Estructura del Proyecto:
La estructura de un proyecto Spring Boot típico incluye una serie de carpetas y paquetes organizados de la siguiente manera:

bash
Copy code
├── src/
|   ├── main/
|   |   ├── java/
|   |   |   ├── com/
|   |   |   |   ├── ewok/
|   |   |   |   |   ├── controladores/          # Controladores para gestionar las solicitudes HTTP
|   |   |   |   |   |   ├── UsuarioController.java
|   |   |   |   |   |   ├── PlatoController.java
|   |   |   |   |   |   ├── PedidoController.java
|   |   |   |   |   |   ├── DetallePedidoController.java
|   |   |   |   |   ├── modelos/                # Entidades de negocio
|   |   |   |   |   |   ├── Usuario.java
|   |   |   |   |   |   ├── Plato.java
|   |   |   |   |   |   ├── Pedido.java
|   |   |   |   |   |   ├── DetallePedido.java
|   |   |   |   |   ├── servicios/              # Servicios de negocio
|   |   |   |   |   |   ├── UsuarioService.java
|   |   |   |   |   |   ├── PlatoService.java
|   |   |   |   |   |   ├── PedidoService.java
|   |   |   |   |   |   ├── DetallePedidoService.java
|   |   |   |   |   ├── repositorios/            # Repositorios de Spring Data JPA
|   |   |   |   |   |   ├── UsuarioRepository.java
|   |   |   |   |   |   ├── PlatoRepository.java
|   |   |   |   |   |   ├── PedidoRepository.java
|   |   |   |   |   |   ├── DetallePedidoRepository.java
|   |   |   ├── resources/
|   |   |   |   ├── templates/                   # Plantillas Thymeleaf para las vistas
|   |   |   |   |   ├── menu.html
|   |   |   |   |   ├── pedido.html
|   |   |   ├── application.properties            # Configuración de la aplicación
|   ├── test/                                  # Pruebas unitarias y de integración
|   ├── resources/                             # Archivos de recursos (como plantillas Thymeleaf)
|   ├── target/                                # Directorio de salida de compilación
|   ├── pom.xml                                # Archivo de configuración de Maven
