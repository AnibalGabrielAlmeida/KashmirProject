# Gestor de Reservas para Sala de Ensayo

## Descripción

Este proyecto tiene como objetivo facilitar la organización de reservas de horarios disponibles para una sala de ensayo. Los clientes pueden reservar un horario después de realizar un pago a través de una billetera virtual. La interfaz sencilla muestra los horarios disponibles y el precio de la reserva según la cantidad de horas seleccionadas.

### Características Principales

- Reserva de horarios con pago a través de billetera virtual.
- Interfaz sencilla para la selección de horarios y cálculo de precios.
- Datos obligatorios para la primera reserva: nombre de banda, número de contacto, y nombre de la persona encargada.
- Opción de crear una cuenta para evitar la recarga de datos en futuras reservas.

## Tecnologías Utilizadas

- **Backend:** Java, Spring Boot
- **Base de Datos:** MariaDB
- **Frontend:** HTML, CSS (JavaScript, React o Vue.js en desarrollo futuro)

## Instalación

No aplicable por el momento, en su estadios tempranos.

## Uso

La aplicación de Gestor de Reservas para Sala de Ensayo está diseñada para brindar a las bandas y artistas una manera sencilla y eficiente de reservar horarios de ensayo en tu sala. A continuación, se detalla cómo utilizar la aplicación desde la perspectiva del usuario:

### 1. Reserva de Horarios

1.1 **Seleccionar Horario:**
   - Explora la interfaz para visualizar los horarios disponibles.
   - Selecciona el horario deseado y la duración de la reserva.

1.2 **Proporcionar Datos y Realizar Pago:**
   - Proporciona los siguientes datos obligatorios:
      - Nombre de la banda.
      - Número de contacto.
      - Nombre de la persona encargada de la reserva.
   - Procede al proceso de pago a través de la billetera virtual integrada (usando una API de pasarela de pago como Mercado Pago u otra similar).

### 2. Registro de Banda (Primera Reserva)

2.1 **Opción de Crear Cuenta:**
   - Para facilitar futuras reservas, considera crear una cuenta para evitar la recarga de datos en cada reserva.

### 3. Administración de Reservas

3.1 **Visualizar Historial:**
   - Accede a tu historial de reservas para obtener un registro detallado de todas las sesiones de ensayo.

3.2 **Realizar Cambios:**
   - Modifica o cancela reservas según sea necesario.

### 4. Administrador (Acceso Restringido)

4.1 **Gestión de Caja:**
   - Registra ingresos y egresos automáticamente con cada reserva y pago.
   - Lleva un conteo de gastos como luz, internet y posibles arreglos.

4.2 **CRUD de Reservas y Clientes:**
   - Añade, actualiza o elimina reservas y clientes según sea necesario.
   - Útil para situaciones en las que la banda prefiere registrar información presencialmente o realiza reservas por otros medios.

### 5. Notificaciones por WhatsApp

5.1 **Configuración de Notificaciones:**
   - Configura la opción para recibir notificaciones por WhatsApp.
   - Recibe recordatorios de reserva y actualizaciones directamente en tu dispositivo móvil.

## Estado del Proyecto

En la fase inicial del desarrollo, este proyecto está en sus primeros pasos.

## Autor

El proyecto es de autoria propia

## Licencia

Este proyecto es de autoría propia, por el momento, no está bajo ninguna licencia específica.



