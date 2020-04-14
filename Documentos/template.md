# Especificación de requisitos 
## Del proyecto NBP

Versión 0.1  
Generada por NBP  
13/04/2020  

Índice
=================
* [Versiones](#versiones)
* 1 [Introducción](#1-introducción)
  * 1.1 [Objetivo del documento](#11-objetivo-del-documento)
  * 1.2 [Ámbito del proyecto](#12-ámbito-del-proyecto)
  * 1.3 [Definiciones, acrónimos y abreviaturas](#13-definiciones-acrónimos-y-abreviaturas)
  * 1.4 [Referencias](#14-referencias)
  * 1.5 [Resumen del documento](#15-resumen-del-documento)
* 2 [Vista general del producto](#2-vista-general-del-producto)
  * 2.1 [Perspectiva del producto](#21-perspectiva-del-producto)
  * 2.2 [Funciones del producto](#22-funciones-del-producto)
  * 2.3 [Restricciones del producto](#23-restricciones-del-producto)
  * 2.4 [Perfiles de usuario](#24-perfiles-de-usuario)
  * 2.5 [Suposiciones y dependencias](#25-suposiciones-y-dependencias)
* 3 [Interfaces externas](#3-interfaces-externas)
    * 3.1 [Interfaces con el Usuario](#31-interfaces-con-el-usuario)
    * 3.2 [Interfaces con el Hardware](#32-interfaces-con-el-hardware)
    * 3.3 [Interfaces con el Software](#33-interfaces-con-el-software)
* 4 [Requisitos](#4-requisitos)
  * 4.1 [Precedencia y prioridad](#41-precedencia-y-prioridad) 
  * 4.2 [Funcionales](#42-funcionales)
  * 4.3 [Calidad de Servicio](#43-calidad-de-servicio)
    * 4.3.1 [Rendimiento](#431-rendimiento)
    * 4.3.2 [Seguridad](#432-seguridad)
    * 4.3.3 [Fiabilidad](#433-fiabilidad)
    * 4.3.4 [Disponibilidad](#434-disponibilidad)
  * 4.5 [Diseño e implementación](#45-diseño-e-implementación)
    * 4.5.1 [Instalación](#451-instalación)
    * 4.5.2 [Mantenimiento](#452-mantenimiento)
    * 4.5.3 [Coste](#453-coste)
    * 4.5.4 [Fecha de Entrega](#454-fecha-de-entrega)
* 5 [Verificación](#5-verificación)
  
## Versiones
| Name |    Date    | Reason For Changes  | Versión   |
|------|------------|---------------------|-----------|
| NBP  | 13/04/2020 | Primera versión     | 0.1       |


## 1. Introducción

### 1.1 Objetivo del documento

El objetivo de este documento es describir nuestro proyecto, aportando los requisitos que pensamos que debería tener. Nuestro público objetivo sería principalmente gente joven aficionada al fútbol y que le guste practicarlo, aunque también está enfocada para gente de mayor edad con estos gustos.

### 1.2 Ámbito del proyecto

Este documento describe nuestro proyecto en su totalidad, que consiste en la creación de una aplicación de escritorio, donde el enfoque principal es la gestión de partidos de fútbol, los cuales podrán acercar a personas que no tengan un círculo social cercano con sus mismos intereses. Nuestro claro objetivo con esta aplicación es proporcionar una base de jugadores al usuario con los que poder practicar fútbol. En el caso de que tengas un equipo con el que jugar, podrás estar al tanto de la disponibilidad de las pistas de tu ciudad. 
El objetivo comercial de esta app sería proporcionar a los distintos ayuntamientos y/o polideportivos este tipo de servicios.


### 1.3 Definiciones, acrónimos y abreviaturas

NBP: Es la abreviatura del nombre completo de nuestra aplicación, la cual es Neo Balompié.
Software: Programa que ofrece una funcionalidad.
Hardware: Componentes físicos de un sistema.
MADEJA: Marco de Desarrollo de la Junta de Andalucía.
Requisitos Funcionales: Describen una característica o funcionalidad del sistema
Requisitos no Funcionales: Describen una restricción sobre una característica o funcionalidad del sistema.
-Un usuario será definido como anfitrión al crear un partido, dándole la posibilidad de eliminar el partido y aceptar o no a los jugadores que quieran unirse.
-Definimos como administrador a aquellas cuentas con un permiso dado por el sistema que les permiten gestionar las pistas.


### 1.4 Referencias

Política de Seguridad de la Información del Ayuntamiento de Málaga, Mayo 2019: https://www.malaga.eu/visorcontenido/NRMDocumentDisplayer/665/DocumentoNormativa665<br>
Normalización de Interfaces de MADEJA, versión 1.5.0 : http://www.juntadeandalucia.es/servicios/madeja/contenido/subsistemas/interfazusuario/normalizacion-interfaces


### 1.5 Resumen del documento

Empezamos exponiendo brevemente el producto y nuestra motivación para desarrollarlo. A continuación, hablaremos sobre las funcionalidades que aportará nuestra aplicación a los usuarios. Después veremos cómo el usuario interactúa con la interfaz del sistema; proseguiremos con los requisitos del sistema, con su explicación y cómo serán verificados.

## 2. Vista general del producto


### 2.1 Perspectiva del producto

Nuestro producto surge de la necesidad de organizar partidos en las pistas municipales, debido al desconocimiento de la disponibilidad de estas, ya que esto dificulta el uso y disfrute de las instalaciones.
Se trata de una aplicación nueva que resuelve el problema mencionado anteriormente, ofreciendo al usuario una herramienta, útil y fácil de utilizar, en la que los usuarios pueden reservar, conocer la disponibilidad de las pistas y encontrar gente con quien jugar.


### 2.2 Funciones del producto

En primer lugar, el usuario deberá registrarse en la plataforma para poder acceder a las funcionalidades de la aplicación. Una vez iniciada sesión, podrá crear y unirse a partidos atendiendo a la disponibilidad de las pistas.
Además, tendrá la opción de crear equipos, compartir partidos por redes sociales y valorar tanto pistas como jugadores con los que haya jugado.
La aplicación ofrecerá un usuario con privilegios, el administrador, que contará con las mismas funcionalidades que un usuario normal y además podrá gestionar la disponibilidad de las pistas.



### 2.3 Perfiles de usuario

Esta aplicación está enfocada principalmente a todos aquellos amantes del fútbol, ya sean jóvenes o adultos. El usuario no necesitará tener ningún tipo de conocimiento o experiencia para hacer uso del producto. 
Por otro lado, en cuanto al ámbito laboral, referenciamos a los funcionarios del ayuntamiento destinados a administrar las pistas que estarán disponibles en la aplicación.


### 2.4 Suposiciones y dependencias

 * Almacenaje del que disponga la base de datos del ayuntamiento.
 * Deberá tener acceso a Internet.
 * Un dispositivo desde el que pueda acceder.


### 3 Interfaces externas


#### 3.1 Interfaces con el usuario 

Puesto que el objetivo es que los ayuntamientos de la provincia de Málaga gestionen las pistas públicas con nuestra aplicación, nuestra intención es que la interfaz esté normalizada según el Marco de Desarrollo de la Junta de Andalucía (MADEJA), por lo que las ventanas, botones, mensajes de error, iconos y ventanas de ayuda, y tipos de datos seguirán el marco descrito anteriormente. 

#### 3.2 Interfaces con el Hardware

Describa las características de cada interfaz entre el producto de software y los componentes de hardware del sistema. Esto puede incluir los tipos de dispositivos que deben ser compatibles, la naturaleza de los datos y las interacciones de control entre el software y el hardware, y los protocolos de comunicación que se utilizarán.

Protocolos:

 * MySQL protocol, en un futuro.

Arquitectura:

 * x86_64.


#### 3.3 Interfaces con el Software

Nuestro producto está direccionado a ser multiplataforma, aunque por ahora la primera versión será una aplicación de escritorio. Todos los equipos donde vaya a ser ejecutada nuestra aplicación necesitarán tener preinstalados el JVM, ya que de por sí ninguna aplicación Java es ejecutada de forma nativa por ningún sistema operativo.
Actualmente vamos a trabajar de forma local en la primera versión, con una BDD de Oracle. Sin embargo, en un futuro tenemos pensado crear una BDD MySQL que podrá utilizarse a través de la contratación hosting de un servidor donde estará localizada.
Utilizaremos una API de Java que nos será de gran utilidad a la hora de realizar las conexiones con la BDD ya que añade una biblioteca java.sql que contiene clases de gran utilidad, la API se conoce como Java Database Connectivity o bien JDBC.


## 4. Requisitos


### 4.1 Precedencia y prioridad

| ID  | NOMBRE                                                        | DESCRIPCIÓN                                                                                                                                                                                  | PRIORIDAD   | PRECEDENCIA | TIPO               |
|-----|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|-------------|--------------------|
| R1  | Registrar<br>  usuario                                        | Un usuario podrá<br>  registrarse facilitando un correo, un nombre de usuario, su nombre y<br>  apellidos reales, su fecha de nacimiento, demarcación favorita y una<br>  contraseña válida. | Fundamental |             | Funcional          |
| R2  | Registro único<br>  de correo electrónico                     | No se podrán<br>  registrar varios usuarios con el mismo correo.                                                                                                                             | Fundamental | R1          | No Funcional       |
| R3  | Contraseña<br>  válida                                        | Una contraseña<br>  será válida cuando esté formada por una cadena alfanumérica con una longitud<br>  de entre 6 y 20 caracteres.                                                            | Deseable    | R1          | No funcional       |
| R4  | Iniciar sesión                                                | El usuario<br>  tendrá que introducir su correo y su contraseña para poder acceder al sistema<br>  y todas sus funcionalidades.                                                              | Fundamental | R1          | Funcional          |
| R5  | Cerrar sesión                                                 | El usuario podrá<br>  salir de su cuenta. Esto lo llevará a la pantalla inicial de<br>  registrarse/iniciar sesión.                                                                          | Fundamental | R4          | Funcional          |
| R6  | Crear pista                                                   | El administrador<br>  podrá añadir nuevas pistas al sistema, introduciendo su nombre, ubicación y<br>  horario.                                                                              | Fundamental |             | Funcional          |
| R7  | Modificar pista                                               | El administrador<br>  tendrá la posibilidad de modificar una pista del sistema.                                                                                                              | Deseable    | R6          | Funcional          |
| R8  | Eliminar pista                                                | El administrador<br>  tendrá la posibilidad de eliminar una pista del sistema.                                                                                                               | Fundamental | R6          | Funcional          |
| R9  | Crear partido                                                 | El usuario<br>  contará con la posibilidad de crear un partido eligiendo una pista, un dia y<br>  una hora disponibles.                                                                      | Fundamental |             | Funcional          |
| R11 | Capacidad de<br>  partido                                     | Un partido<br>  tendrá una capacidad máxima de 10 jugadores.                                                                                                                                 | Fundamental | R9          | No funcional       |
| R12 | Limitación de<br>  creación de partido                        | El usuario no<br>  podrá crear más de un partido al día.                                                                                                                                     | Deseable    | R9          | Funcional          |
| R13 | Eliminar partido                                              | El sistema<br>  cancelará el partido por petición del creador.                                                                                                                               | Fundamental | R9          | Funcional          |
| R14 | Eliminar partido<br>  por falta de integrantes                | El partido se<br>  eliminará del sistema si a falta de 4 horas del partido todavía no hay<br>  jugadores suficientes para disputarlo.                                                        | Deseable    | R9          | No funcional       |
| R15 | Eliminar partido<br>  finalizado                              | El sistema<br>  eliminará el partido tras pasar 24 horas de la realización del mismo                                                                                                         | Deseable    | R9          | No funcional       |
| R16 | Crear equipo                                                  | El usuario<br>  añadirá al equipo jugadores por el nombre de usuario.                                                                                                                        | Opcional    |             | Funcional          |
| R17 | Modificar equipo                                              | El usuario podrá<br>  modificar los equipos que estén en su lista de equipos.                                                                                                                | Opcional    | R16         | Funcional          |
| R18 | Eliminar equipo                                               | El creador del<br>  equipo podrá eliminar el equipo de su lista de equipos.                                                                                                                  | Opcional    | R16         | Funcional          |
| R19 | Tamaño nombre de<br>  equipo                                  | El nombre de los<br>  equipos deberá tener menos de 10 caracteres y solo podrán ser letras                                                                                                   | Opcional    | R16         | No funcional       |
| R20 | Máximo de<br>  miembros de un equipo                          | Un equipo<br>  permitirá inscribir hasta 10 jugadores.                                                                                                                                       | Opcional    | R16         | No funcional       |
| R21 | Unirse a un<br>  partido                                      | El usuario<br>  tendrá la opción de unirse a un partido solo.                                                                                                                                | Fundamental | R9          | Funcional          |
| R22 | Añadir jugadores no registrados a un partido                  | El usuario podrá<br>  añadir al partido jugadores no registrados en el sistema, determinando su<br>  edad y nombre.                                                                          | Deseable    | R21         | Funcional          |            
| R23 | Añadir miembros<br>  de tu equipo a un partido                | El usuario podrá<br>  añadir al partido usuarios que estén en su equipo.                                                                                                                     | Deseable    | R21         | Funcional          |
| R24 | Aceptar/<br>  Rechazar Jugador                                | El anfitrión del<br>  partido será el responsable de aceptar o no las peticiones de usuarios para<br>  poder disputar dicho partido.                                                         | Fundamental | R21         | Funcional          |
| R25 | Limitación de<br>  envío de solicitud de unión                | Si el jugador se<br>  ha unido a un partido y el creador de este lo rechaza, este usuario no podrá<br>  mandar otra solicitud para unirse al mismo partido.                                  | Opcional    | R24         | No funcional       |
| R26 | Salir de un<br>  partido                                      | Un jugador podrá<br>  salirse de un partido y dejar su plaza libre.                                                                                                                          | Fundamental | R24         | Funcional          |
| R27 | Cambio de<br>  anfitrión                                      | Si el anfitrión<br>  sale del partido, pasará a ser el primer jugador que se unió.                                                                                                           | Deseable    | R26         | No funcional       |
| R28 | Valorar a un<br>  jugador                                     | El usuario tras<br>  haber realizado un partido tendrá la oportunidad de valorar entre 1 y 5 a los<br>  demás integrantes del partido.                                                       | Opcional    | R21         | Funcional          |
| R29 | Valorar a una<br>  pista                                      | El usuario podrá<br>  valorar las pistas donde ya haya disputado un partido entre 1 y 5.                                                                                                     | Opcional    | R21         | Funcional          |
| R30 | Limitación de<br>  valoraciones                               | Un jugador solo<br>  podrá valorar una vez a cada jugador del partido y a la pista por cada<br>  partido disputado.                                                                          | Opcional    | R21         | No funcional       |
| R31 | Compartir<br>  partido                                        | El sistema<br>  generará un enlace para que el usuario pueda compartir un partido por redes<br>  sociales.                                                                                   | Opcional    | R9          | Funcional          |
| R32 | Notificación de<br>  eliminación de partido                   | El sistema<br>  mandará una notificación a los usuarios inscritos en el partido para avisar<br>  de que este ha sido eliminado.                                                              | Opcional    | R13         | Funcional          |
| R33 | Notificación de<br>  eliminación de pista                     | El sistema<br>  mandará una notificación a todos los usuarios registrados en el sistema, con<br>  la información de qué pista ha sido eliminada.                                             | Opcional    | R14         | Funcional          |
| R34 | Notificación al<br>  aceptar una solicitud de unión a partido | El sistema<br>  mandará un correo al usuario cuando el anfitrión lo acepte o rechace en el<br>  partido.                                                                                     | Opcional    | R8          | Funcional          |
| R35 | Notificación de<br>  partido lleno                            | El sistema<br>  mandará una notificación a los usuarios inscritos en el partido para avisar<br>  que está completo.                                                                          | Opcional    | R21         | Funcional          |
| R36 | Idioma                                                        | La aplicación<br>  estará en español e inglés.                                                                                                                                               | Opcional    | R24         | No funcional       |
| R37 | Conexión a<br>  internet                                      | El sistema<br>  contará con una conexión de aproximadamente 1Mbps para acceder a la base de<br>  datos, gestionar partidos y ver el horario disponible.                                      | Deseable    |             | No funcional       |
| R38 | Manejabilidad                                                 | El usuario será<br>  capaz de manejarse sin ningún tipo de ayuda por el sistema tras 15 minutos de<br>  uso.                                                                                 | Deseable    |             | No funcional       |
| R39 | Seguridad                                                     | No se<br>  proporcionará información personal de los clientes salvo nombre de usuario,<br>  edad y demarcación favorita.                                                                     | Deseable    |             | No funcional       |
| R40 | Tiempo de<br>  respuesta                                      | Al abrir la<br>  aplicación, esta debe ser capaz de responder al usuario en menos de 5<br>  segundos.                                                                                        | Deseable    |             | No funcional       |
| R41 | Ubicación BDD                                                 | La Base de Datos<br>  estará físicamente ubicada en Málaga.                                                                                                                                  | Fundamental |             | No funcional       |
| R42 | Almacenamiento<br>  BDD                                       | La base de datos<br>  almacenará los datos de los usuarios registrados, de las pistas y de los<br>  partidos no finalizados.                                                                 | Opcional    |             | No funcional<br>   |	
| R43 | Fiabilidad 						      | El programa solo podrá fallar una vez cada 1000 horas de uso.																     | Opcional    |		 | No funcional       |
| R44 | Disponibilidad 						      | El programa podrá usarse con un ordenador de prestaciones bajas.															     | Opcional    |		 | No funcional       |


### 4.2 Funcionales

https://github.com/Jesusve99/IngSof2020/blob/master/Documentos/Casos%20de%20Uso.bak


### 4.3 Calidad de Servicio
 
#### 4.3.1 Rendimiento

Las notificaciones que envía el sistema tienen que ser enviadas en un plazo de 5 minutos.
El sistema tiene que ser estable y fallar como máximo 1 vez cada 24 horas de uso.
El resto del sistema no necesita una respuesta rápida puesto que la aplicación no está orientada a tiempo real.


#### 4.3.2 Seguridad

El sistema podrá almacenar una serie de datos personales como email, contraseña y las preferencias de cada jugador, por lo que en versiones futuras se tendrá en cuenta que se encripte con un algoritmo que garantice su seguridad.

#### 4.3.3 Fiabilidad
Puesto que el riesgo de que nuestro producto no funcione es prácticamente nulo, se pretende que el programa solo falle una cada 1000 horas de uso.

#### 4.3.4 Disponibilidad
Su primera versión solo estará disponibles en ordenadores, las características iguales o superiores que necesitan para el correcto funcionamiento del programa son al menos 1GB de RAM y un Intel Celeron G4930 3.2Ghz. 


### 4.5 Diseño e implementación

#### 4.5.1 Instalación

El programa funcionará en una arquitectura de x64 con Java. El sistema donde se ejecute el programa no necesita ningún requerimiento más en concreto.

#### 4.5.2 Mantenimiento

Puesto que el programa usará un modelo de vista-controlador el mantenimiento de este estará separado en la distintas capas, aislando los problemas y haciendo más sencilla una modificación en alguna de estas.

#### 4.5.3 Coste

Los recursos que vamos a utilizar nos los proporciona la Universidad de Málaga.
Además, el coste en personal será de 1297’53€.


#### 4.5.4 Fecha de entrega

La entrega de este proyecto se realizará el 5 de junio de 2020.

## 5. Verificación

 * Registro de usuario: Se comprobará que el usuario ha rellenado los datos necesarios. Se comprobará que el correo a utilizar por el usuario no está asociado a otra cuenta. Se comprobará si el usuario ha sido registrado correctamente.
 * Registro único de correo: El sistema comprobará que no existen dos usuarios con el mismo correo en la base de datos. 
 * Contraseña válida: Se intentará registrarse con una contraseña de menos de 6 caracteres o más de 20.
 * Inicio de sesión de usuario: Se iniciará sesión en el sistema con usuarios que estén registrados en el sistema y se comprobará si se inicia sesión con usuarios no registrados.
 * Cierre de sesión de usuario: Se comprueba que se ha vuelto a la pantalla de registro/inicio de sesión.
 * Añadir pista: Se comprobará si han sido rellenados todos los datos necesarios sobre la pista y si esta pista no existe ya. Se comprobará si la pista se ha almacenado correctamente.
 * Modificar pista: Se comprobará que se han rellenado todos los datos necesarios. Se comprobará que la pista ha sido modificada correctamente .
 * Eliminar pista: Se comprobará que la pista existe. Se comprobará que la pista ha sido eliminada correctamente.
 * Crear partido: se comprobará si la pista y el horario que ha seleccionado el usuario deja de estar disponible.
 * Capacidad Partido: se intentará introducir más jugadores de lo posible en un partido.
 * Limitación de crear partidos: Se comprobará que el usuario no haya creado un partido anteriormente durante ese día.
 * Eliminar partido: Se comprobará que el partido existe. Para eliminarlo se pueden dar tres casos: Se comprobará que el anfitrión del partido haya decidido eliminarlo. Se comprobará que el partido ha sido eliminado correctamente de la base de datos.
 * Eliminar partido por falta de integrantes: Se comprobará que el partido existe. Se comprobará que el partido está incompleto de jugadores 4 horas antes de su inicio.
 * Eliminar partido al finalizar: Se comprobará que el partido ya ha sido disputado hace 24h
 * Crear Equipo: Se comprobará que los datos necesarios han sido rellenados y que el nombre del equipo no haya sido utilizado en otro caso. Se comprobará que el equipo ha sido creado correctamente.
 * Modificar equipo:Se comprobará en el sistema la existencia de dicho equipo si ha habido alguna modificación con alguna versión antigua. 
 * Eliminar equipo: Si se ha eliminado el equipo se verificará que ya no está en el sistema ni en la lista de equipos de los usuarios.
 * Tamaño nombre equipo: Se intentará crear equipos sin esas características.
 * Máximo de jugadores por equipo: Se intentará añadir más jugadores al equipo validando que el equipo no acepte ningún jugador más.
* Unirse a un partido: se comprueba que el usuario está introducido en ese partido.
* Introducir jugadores de un equipo en un partido: se comprobará el número de integrantes del partido tras la unión del usuario con miembros de un equipo.
 * Introducir jugadores de un equipo en un partido: se comprobará el número de integrantes del partido tras la unión del usuario con miembros de un equipo.
 * Aceptar/Rechazar Jugador: El usuario aceptado tiene que haber recibido un correo de aceptación, estará en la lista de jugadores del partido y si ha sido rechazado no tendría que estar en la lista ni en la lista de jugadores en lista de espera.
* Limitación de envío de solicitud: Se comprobará que habiendo enviado una solicitud no se pueden enviar más.  
 * Salirse de un partido: El sistema comprobará que en la lista de jugadores del partido ya no exista el usuario y que en la lista de partidos del usuario ya no forme parte el partido.
 * Cambio de anfitrión: Se comprobará que saliéndose el antiguo anfitrión, el nuevo anfitrión es el que más tiempo 
 * Valorar jugador: se hace una entrada de valoración de un usuario sobre otro usuario del 1-5, y entonces se hace una búsqueda en la base de datos mirando que al usuario valorado se ha añadido una valoración más al contador de las valoraciones y que esta ha sido actualizada satisfactoriamente.
 * Valorar Pista: Se comprobará si se ha recibido una nueva valoración de la pista
 * Limitación de valoraciones: Se intentará valorar más de una vez a un usuario con el que ya se haya disputado un partido.
 * Compartir Partido: crea un partido o te unes a un partido y le das a la opción de compartir partido este genera una dirección que se copia automáticamente al portapapeles y al pegarlo comprobamos que es la dirección correcta. Y por otro lado, al clickar te enlaza a la aplicación y te envía al partido deseado.
 * Notificación eliminación de partido: Se eliminará un partido que todavía no se haya   disputado y se comprobará que se ha recibido un correo de eliminación a todos los usuarios que estaban en la lista del partido.
 * Notificación de Eliminación de Pista: Se comprobará el correo de los usuarios registrados en el sistema para ver si ha llegado o no la notificación.
 * Notificación de aceptación de partido: Se comprobará el correo de los usuarios que quieran unirse al partido y consultando su llegada.
 * Notificación de partido lleno: Se comprobará el correo de los usuarios registrados en el partido para verificar si ha llegado la notificación.
 * Idioma: Se verificará que todas las partes funcionales del sistema estarán traducidas al español o inglés dependiendo del idioma elegido por el usuario.
 * Conexión a internet: Se intentará navegar por el sistema con una conexión inferior a la dicha.
 * Manejabilidad: Se hará un estudio de 20 personas para ver si se cumplen los parámetros acordados.
 * Seguridad: Se intentará descubrir los datos de los usuarios comprobando la seguridad de la base de datos.
 * Tiempo de respuesta: Se harán testeos del sistema para ver cuánto tiempo máximo ha tardado el sistema en responder.
 * Ubicación BDD: Se comprobará que la ubicación física de nuestra BDD está en Málaga.
 * Almacenamiento base de datos: Se comprobará si todas esas especificaciones están en la base de datos del sistema.
