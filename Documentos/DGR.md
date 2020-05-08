# Especificación de requisitos 
## Del proyecto NBP

Versión 0.2  
Generada por NBP  
02/05/2020  

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
  * 4.2 [Calidad de Servicio](#42-calidad-de-servicio)
    * 4.2.1 [Rendimiento](#421-rendimiento)
    * 4.2.2 [Seguridad](#422-seguridad)
    * 4.2.3 [Fiabilidad](#423-fiabilidad)
    * 4.2.4 [Disponibilidad](#424-disponibilidad)
  * 4.3 [Normativas aplicables](#43-normativas-aplicables)
  * 4.4 [Diseño e implementación](#44-diseño-e-implementación)
    * 4.4.1 [Instalación](#441-instalación)
    * 4.4.2 [Mantenimiento](#442-mantenimiento)
    * 4.4.3 [Coste](#443-coste)
    * 4.4.4 [Fecha de Entrega](#444-fecha-de-entrega)
* 5 [Verificación](#5-verificación)
  
## Versiones
| Name |    Date    | Reason For Changes  | Versión   |
|------|------------|---------------------|-----------|
| NBP  | 13/04/2020 | Primera versión     | 0.1       |
| NBP  | 02/05/2020 | Segunda versión     | 0.2       |


## 1. Introducción

### 1.1 Objetivo del documento
El objetivo de este documento es describir nuestro proyecto, aportando los requisitos que pensamos que debería tener. Nuestro público objetivo sería principalmente gente joven aficionada al fútbol y que le guste practicarlo, aunque también está enfocada para gente de mayor edad con estos gustos.

### 1.2 Ámbito del proyecto
Este documento describe nuestro proyecto en su totalidad consiste en la creación de una aplicación de escritorio, donde el enfoque principal es la gestión de partidos de fútbol, los cuales podrán acercar a personas que no tengan un círculo social cercano con sus mismos intereses. Nuestro claro objetivo con esta aplicación es proporcionar una base de jugadores al usuario con los que poder practicar fútbol. En el caso de que tengas un equipo con el que jugar, podrás estar al tanto de la disponibilidad de las pistas de tu ciudad. 
El objetivo comercial de esta app sería proporcionar a los distintos ayuntamientos y/o polideportivos este tipo de servicios.

### 1.3 Definiciones, acrónimos y abreviaturas
 * NBP:  Nombre completo de nuestra aplicación, la cual es Neo Balompié.
 * MADEJA: Marco de Desarrollo de la Junta de Andalucía. 
 * Software: Programa que ofrece una funcionalidad.
 * Hardware: Componentes físicos de un sistema.
 * Requisitos Funcionales: Describen una característica o funcionalidad del sistema.
 * Requisitos no Funcionales: Describen una restricción sobre una característica o funcionalidad del sistema.
 * Usuario: Será definido como anfitrión al crear un partido, dándole la posibilidad de eliminar el partido y aceptar o no a los jugadores que quieran unirse.
 * Administrador: Aquellas cuentas con un permiso dado por el sistema que les permiten gestionar las pistas.

### 1.4 Referencias
 * Política de Seguridad de la Información del Ayuntamiento de Málaga, Mayo 2019 (https://www.malaga.eu/visorcontenido/NRMDocumentDisplayer/665/DocumentoNormativa665).
 * Normalización de Interfaces de MADEJA, versión 1.5.0 (http://www.juntadeandalucia.es/servicios/madeja/contenido/subsistemas/interfazusuario/normalizacion-interfaces).
 * Manual de Calidad del Ayuntamiento de Málaga, Edición 3, 15/11/2004 (https://calidad.malaga.eu/portal/menu/seccion_0003/documentos/Manual_Calidad_mlgmc.pdf).
 * Ejemplo de Interfaz MADEJA (http://www.juntadeandalucia.es/servicios/madeja/contenido/libro-pautas/142).

### 1.5 Resumen del documento
Empezamos exponiendo brevemente el producto y nuestra motivación para desarrollarlo. A continuación, hablaremos sobre las funcionalidades que aportará nuestra aplicación a los usuarios. Después veremos cómo el usuario interactúa con la interfaz del sistema; proseguiremos con los requisitos del sistema, con su explicación y cómo serán verificados.

## 2. Vista general del producto

### 2.1 Perspectiva del producto
Nuestro producto surge de la necesidad de organizar partidos en las pistas municipales, debido al desconocimiento de la disponibilidad de estas, ya que esto dificulta el uso y disfrute de las instalaciones.
Se trata de una aplicación nueva que resuelve el problema mencionado anteriormente, ofreciendo al usuario una herramienta, útil y fácil de utilizar, en la que los usuarios pueden reservar, conocer la disponibilidad de las pistas y encontrar gente con quien jugar.

### 2.2 Funciones del producto
En primer lugar, el usuario deberá registrarse en la plataforma para poder acceder a las funcionalidades de la aplicación. Una vez iniciada sesión, podrá crear y unirse a partidos atendiendo a la disponibilidad de las pistas.
Además, tendrá la opción de crear equipos, compartir partidos por redes sociales y valorar tanto pistas como jugadores con los que haya jugado.
La aplicación ofrecerá un tipo de usuario con privilegios, el administrador, que contará con las mismas funcionalidades que un usuario normal y además podrá gestionar la disponibilidad de las pistas.

<img src="https://github.com/Jesusve99/IngSof2020/blob/master/Documentos/CasosDeUso.jpeg" alt="Diagrama Casos de Uso" style="vertical-align:middle">

### 2.3 Restricciones del producto
Puesto que el objetivo final del desarrollo de este producto es la aplicación del mismo por el Ayuntamiento de Málaga, el desarrollo se tendrá que acoger a un estándar de interfaz, a las normativas de la gestión de datos y seguridad, y de calidad de producto, los cuales se describirán en los puntos 3.1, 4.3.2 y 4.4 respectivamente. 

### 2.4 Perfiles de usuario
Esta aplicación está enfocada principalmente a todos aquellos amantes del fútbol, ya sean jóvenes o adultos. El usuario no necesitará tener ningún tipo de conocimiento o experiencia para hacer uso del producto. 
Por otro lado, en cuanto al ámbito laboral, referenciamos a los funcionarios del ayuntamiento destinados a administrar las pistas que estarán disponibles en la aplicación.

### 2.5 Suposiciones y dependencias
 * Almacenaje del que disponga la base de datos del ayuntamiento.
 * Deberá tener acceso a Internet.
 * Un dispositivo desde el que pueda acceder (tener JVM instalado para poder ejecutar la aplicación ya que está desarrollada en java).

### 3 Interfaces externas

#### 3.1 Interfaces con el usuario 
Nuestra intención es que la interfaz esté normalizada según el MADEJA, por lo que las ventanas, botones, mensajes de error, iconos y ventanas de ayuda, y tipos de datos seguirán el marco descrito anteriormente. Un ejemplo de la interfaz es el referenciado en el punto 1.4 como “Ejemplo de Interfaz MADEJA”.

#### 3.2 Interfaces con el Hardware
Nuestro Software será desarrollado para arquitecturas x86_64.

#### 3.3 Interfaces con el Software
Nuestro producto está direccionado a ser multiplataforma, aunque por ahora la primera versión será una aplicación de escritorio.
Vamos a crear una BDD MySQL remota.
Utilizaremos una API de Java para realizar las conexiones con la BDD: Java Database Connectivity (JDBC).
La BDD será desarrollada en MySQL y por lo tanto necesitaremos hacer uso del protocolo propio del SGBDD Mysql Protocol.

## 4. Requisitos

### 4.1 Precedencia y prioridad


|    ID | NOMBRE                                                     | DESCRIPCIÓN                                                                                                                                                                                                       | PRIORIDAD   | PRECEDENCIA | TIPO            |
|-------|------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|-------------|-----------------|
| R1    | Registrar   usuario                                        | Un usuario podrá   registrarse facilitando un correo, un nombre de usuario, su nombre y   apellidos reales, su fecha de nacimiento, demarcación favorita y una   contraseña válida.                               | Fundamental |             | Funcional       |
| R2    | Registro único   de correo electrónico                     | No se podrán registrar varios usuarios con el   mismo correo.                                                                                                                                                     | Fundamental |        | No Funcional    |
| R3    | Contraseña   válida                                        | Una contraseña   será válida cuando esté formada por una cadena alfanumérica con una longitud   de entre 6 y 20 caracteres.                                                                                       | Deseable    |          | No funcional    |
| R4    | Iniciar sesión                                             | El usuario   tendrá que introducir su correo y su contraseña para poder acceder al sistema   y todas sus funcionalidades.                                                                                         | Fundamental | R1          | Funcional       |
| R5    | Cerrar sesión                                              | El usuario podrá   salir de su cuenta. Esto lo llevará a la pantalla inicial de   registrarse/iniciar sesión.                                                                                                     | Fundamental | R4          | Funcional       |
| R6    | Crear pista                                                | El administrador   podrá añadir nuevas pistas al sistema, introduciendo su nombre, ubicación y   horario.                                                                                                         | Fundamental |             | Funcional       |
| R7    | Modificar pista                                            | El administrador   tendrá la posibilidad de modificar los datos una pista del sistema.                                                                                                                            | Deseable    | R6          | Funcional       |
| R8    | Eliminar pista                                             | El administrador   tendrá la posibilidad de eliminar una pista del sistema.                                                                                                                                       | Fundamental | R6          | Funcional       |
| R9    | Crear partido                                              | El usuario   contará con la posibilidad de crear un partido eligiendo una pista, un dia y   una hora ya no reservada en la pista.                                                                                 | Fundamental |             | Funcional       |
| R11   | Capacidad de   partido                                     | Un partido   tendrá una capacidad máxima de 10 jugadores.                                                                                                                                                         | Fundamental |           | No funcional    |
| R12   | Limitación de   creación de partido                        | El usuario no   podrá crear más de un partido al día.                                                                                                                                                             | Deseable    | R9          | Funcional       |
| R13   | Eliminar partido                                           | El sistema   cancelará el partido por petición del creador.                                                                                                                                                       | Fundamental | R9          | Funcional       |
| R14   | Eliminar partido   por falta de integrantes                | El partido se   eliminará del sistema si a falta de 4 horas del partido todavía no hay   jugadores suficientes para disputarlo.                                                                                   | Deseable    | R9          | No funcional    |
| R15   | Eliminar partido   finalizado                              | El sistema   eliminará el partido tras pasar 24 horas de la realización del mismo                                                                                                                                 | Deseable    | R9          | No funcional    |
| R16   | Crear equipo                                               | El usuario   añadirá al equipo jugadores por el nombre de usuario.                                                                                                                                                | Opcional    |             | Funcional       |
| R17   | Modificar equipo                                           | El usuario podrá   modificar los datos los equipos que estén en su lista de equipos.                                                                                                                              | Opcional    | R16         | Funcional       |
| R18   | Eliminar equipo                                            | El creador del   equipo podrá eliminar el equipo de su lista de equipos.                                                                                                                                          | Opcional    | R16         | Funcional       |
| R19   | Tamaño nombre de   equipo                                  | El nombre de los   equipos deberá tener menos de 10 caracteres y solo podrán ser letras                                                                                                                           | Opcional    |          | No funcional    |
| R20   | Máximo de   miembros de un equipo                          | Un equipo   permitirá inscribir hasta 10 jugadores.                                                                                                                                                               | Opcional    |          | No funcional    |
| R21   | Unirse a un   partido                                      | El usuario   tendrá la opción de unirse a un partido solo.                                                                                                                                                        | Fundamental | R9          | Funcional       |
| R22   | Añadir jugadores no registrados a un partido               | El usuario podrá añadir al partido jugadores no registrados en el sistema, determinando su edad y nombre.                                                                                                         | Deseable    | R21         | Funcional       |
| R23   | Añadir miembros   de tu equipo a un partido                | El usuario podrá   añadir al partido usuarios que estén en su equipo.                                                                                                                                             | Deseable    | R21         | Funcional       |
| R24   | Aceptar/   Rechazar Jugador                                | El anfitrión del   partido será el responsable de aceptar o no las peticiones de usuarios para   poder disputar dicho partido.                                                                                    | Fundamental | R21         | Funcional       |
| R25   | Limitación de   envío de solicitud de unión                | Si el jugador se   ha unido a un partido y el creador de este lo rechaza, este usuario no podrá   mandar otra solicitud para unirse al mismo partido.                                                             | Opcional    | R24         | No funcional    |
| R26   | Salir de un   partido                                      | Un jugador podrá   salirse de un partido y dejar su plaza libre.                                                                                                                                                  | Fundamental | R24         | Funcional       |
| R27   | Cambio de   anfitrión                                      | Si el anfitrión   sale del partido, pasará a ser el siguiente jugador que se unió.                                                                                                                                | Deseable    | R26         | No funcional    |
| R28   | Valorar a un   jugador                                     | El usuario podrá   valorar a otro usuario con el que haya jugado.                                                                                                                                                 | Opcional    | R21         | Funcional       |
| R29   | Valorar a una   pista                                      | El usuario podrá   valorar las pistas donde ya haya disputado un partido.                                                                                                                                         | Opcional    | R21         | Funcional       |
| R30   | Limitación de   valoraciones                               | Un jugador solo   podrá valorar una vez a cada jugador del partido y a la pista por cada   partido disputado.                                                                                                     | Opcional    | R21         | No funcional    |
| R31   | Compartir   partido                                        | El sistema   generará un enlace para que el usuario pueda compartir un partido por redes   sociales.                                                                                                              | Opcional    | R9          | Funcional       |
| R32   | Notificación de   eliminación de partido                   | El sistema   mandará una notificación a los usuarios inscritos en el partido para avisar   de que este ha sido eliminado.                                                                                         | Opcional    | R13         | Funcional       |
| R33   | Notificación de   eliminación de pista                     | El sistema   mandará una notificación a todos los usuarios registrados en el sistema, con   la información de qué pista ha sido eliminada.                                                                        | Opcional    | R8          | Funcional       |
| R34   | Notificación al   aceptar una solicitud de unión a partido | El sistema   mandará un correo al usuario cuando el anfitrión lo acepte o rechace en el   partido.                                                                                                                | Opcional    | R21         | Funcional       |
| R35   | Notificación de   partido lleno                            | El sistema   mandará una notificación a los usuarios inscritos en el partido para avisar   que está completo.                                                                                                     | Opcional    | R24         | Funcional       |
| R36   | Idioma                                                     | La aplicación   estará en español e inglés.                                                                                                                                                                       | Opcional    |             | No funcional    |
| R37   | Conexión a   internet                                      | El sistema   contará con una conexión mínima de 1Mbps para acceder a la base de   datos, gestionar partidos y ver el horario disponible.                                                                 | Deseable    |             | No funcional    |
| R38   | Manejabilidad                                              | El usuario será   capaz de manejarse sin ningún tipo de ayuda por el sistema tras 15 minutos de   uso.                                                                                                            | Deseable    |             | No funcional    |
| R39   | Seguridad                                                  | El sistema   estará sujeto a la legislación sobre seguridad del ayuntamiento de   Málaga                                                                                                                          | Opcional    |             | No funcional    |
| R40   | Tiempo de   respuesta                                      | Al abrir la   aplicación, esta debe ser capaz de responder al usuario en menos de 5   segundos.                                                                                                                   | Deseable    |             | No funcional    |
| R41   | Ubicación BDD                                              | La Base de Datos   estará físicamente ubicada en Málaga.                                                                                                                                                          | Fundamental |             | No funcional    |
| R42   | Almacenamiento   BDD                                       | La base de datos   almacenará los datos de los usuarios registrados, de las pistas y de los   partidos no finalizados.                                                                                            | Opcional    |             | No funcional    |
| R43   | Disponibilidad                                             | El programa   podrá usarse en ordenadores con bajas prestaciones y será consistente a   fallos                                                                                                                    | Opcional    |             | No funcional    |
| R44   | Rendimiento                                                | Las distintas   vistas del programa se mostrarán al usuario en menos de 1 segundos.                                                                                                                               | Deseable    |             | No funcional    |
| R45   | Fiabilidad                                                 | El programa sólo   podrá fallar una cada 100 horas de uso.                                                                                                                                                        | Opcional    |             | No funcional    |
| R46   | Rango de   valoración                                      | Las valoraciones   podrán ser del 1 al 5, siendo 1 la peor y 5 la mejor.                                                                                                                                          | Opcional    | R28 / R29   | No funcional    |
| R47   | JVM                                                        | Todos los   equipos donde vaya a ser ejecutada nuestra aplicación necesitarán tener   preinstalados el JVM, ya que de por sí ninguna aplicación Java es ejecutada   de forma nativa por ningún sistema operativo. | Fundamental |             | No funcional    |

### 4.2 Funcionales
#### R1 - Registrar   usuario
Un usuario podrá registrarse facilitando un correo, un nombre de usuario, su nombre y   apellidos reales, su fecha de nacimiento, demarcación favorita y una contraseña válida. Aquí podéis extender y comentar como se registran los administradores
.
##### Dependencias 
##### Prioridad
Fundamental
##### Justificación
El registro de usuario es necesario en la aplicación para identificar a los usuarios y facilitar la creación de equipos.

### 4.3 Calidad de Servicio
 
#### 4.3.1 Rendimiento
Puesto que nuestro producto es de carácter recreativo, no necesita una respuesta especialmente rápida. Aun así, garantizamos que las notificaciones se realicen en un intervalo de 5 minutos desde que se cumpla la condición para su emisión y que las nuevas ventanas carguen en menos de 1 segundo, para obtener una respuesta fluida entre el programa y los usuarios.

#### 4.3.2 Seguridad
Nuestro objetivo es que el programa cumpla con la “Política de Seguridad de la Información” del ayuntamiento de Málaga (https://www.malaga.eu/visorcontenido/NRMDocumentDisplayer/665/DocumentoNormativa665), la cual establece un marco de gestión de la seguridad de la información según el Real Decreto 3/2010, por el que se regula el Esquema Nacional de Seguridad. 

#### 4.3.3 Fiabilidad
Puesto que el riesgo de que nuestro producto no funcione es prácticamente nulo, se pretende que el programa solo falle una cada 100 horas de uso.

#### 4.3.4 Disponibilidad
 * Su primera versión solo estará disponibles en ordenadores, las características iguales o superiores que necesitan para el correcto funcionamiento del programa son al menos 1GB de RAM y un Intel Celeron G4930 3.2Ghz. 
 * El sistema deberá de ser consistente y resistente a fallos, pudiendo alcanzar como máximo 2 fallos/dia.

### 4.4 Normativas aplicables
Nuestra aplicación no tratará actualmente la normativa aplicables en sus primeras versiones. Pero, en las futuras versiones finales se regirá por "Política de Seguridad de la Información" (https://www.malaga.eu/visorcontenido/NRMDocumentDisplayer/665/DocumentoNormativa665).

### 4.5 Diseño e implementación

#### 4.5.1 Instalación
El programa funcionará en una arquitectura tanto x32 como x64 con Java. El sistema donde se ejecute el programa no necesita ningún requerimiento más en concreto.

#### 4.5.2 Mantenimiento
Puesto que el programa usará un modelo-vista-controlador el mantenimiento de este estará separado en los distintos módulos, aislando los problemas y haciendo más sencilla una modificación en alguna de estas.

#### 4.5.3 Coste
Los recursos que vamos a utilizar nos los proporciona la Universidad de Málaga.
Además, el coste en personal será de 1,861.01 € (https://www.sinnaps.com/cloud/project/index?project=93634).

#### 4.5.4 Fecha de entrega
La entrega de este proyecto se realizará el 5 de junio de 2020.

## 5. Verificación
 * Registro de usuario: Se comprobará que el usuario ha rellenado los datos necesarios. Se comprobará que el correo a utilizar por el usuario no está asociado a otra cuenta. Se comprobará si el usuario ha sido registrado correctamente. Se probará con datos erróneos para ver que se comporta de manera satisfactoria.
 * Registro único de correo: El sistema comprobará que no existen dos usuarios con el mismo correo en la base de datos. 
 * Contraseña válida: Se intentará registrarse con una contraseña de menos de 6 caracteres o más de 20.
 * Inicio de sesión de usuario: Se iniciará sesión en el sistema con usuarios que estén registrados en este y se comprobará si se inicia sesión con usuarios no registrados.
 * Cierre de sesión de usuario: Se comprueba que se ha vuelto a la pantalla de registro/inicio de sesión.
 * Añadir pista: Se comprobará si han sido rellenados todos los datos necesarios sobre la pista y si esta pista no existe ya. Se comprobará si la pista se ha almacenado correctamente.
 * Modificar pista: Se comprobará que se han rellenado todos los datos necesarios. Se comprobará que la pista ha sido modificada correctamente .
 * Eliminar pista: Se comprobará que la pista existe. Se comprobará que la pista ha sido eliminada correctamente.
 * Crear partido: Se comprobará si la pista y el horario que ha seleccionado el usuario deja de estar disponible, intentando seleccionar la misma a la vez, procurando evitar las llamadas paralelas.
 * Capacidad Partido: Se intentará introducir más jugadores de lo posible en un partido.
 * Limitación de crear partidos: Se comprobará que el usuario no haya creado un partido anteriormente durante ese día.
 * Eliminar partido: Se comprobará que el partido existe. Para eliminarlo se pueden dar tres casos: Se comprobará que el anfitrión del partido haya decidido eliminarlo. Se comprobará que el partido ha sido eliminado correctamente de la base de datos.
 * Eliminar partido por falta de integrantes: Se comprobará que el partido existe. Se comprobará que el partido está incompleto de jugadores 4 horas antes de su inicio.
 * Eliminar partido al finalizar: Se comprobará que el partido ya ha sido disputado hace 24h
 * Crear Equipo: Se comprobará que los datos necesarios han sido rellenados y que el nombre del equipo no haya sido utilizado en otro caso. Se comprobará que el equipo ha sido creado correctamente.
 * Modificar equipo: Se comprobará en el sistema la existencia de dicho equipo si ha habido alguna modificación con alguna versión antigua. 
 * Eliminar equipo: Si se ha eliminado el equipo se verificará que ya no está en el sistema ni en la lista de equipos de los usuarios. Se probará a borrarlo por el creador y por otro que no sea el que lo ha probado.
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
 * Seguridad: Un equipo externo comprobará que el software cumple con la legislación mencionada anteriormente.
 * Tiempo de respuesta: Se harán testeos del sistema para ver cuánto tiempo máximo ha tardado el sistema en responder.
 * Ubicación BDD: Se comprobará que la ubicación física de nuestra BDD está en Málaga.
 * Almacenamiento base de datos: Se comprobará si todas esas especificaciones están en la base de datos del sistema.
* Fiabilidad: Se comprobará manteniendo el programa ejecutando funcionalidades durante 100 horas.
* Disponibilidad: Se comprobará ejecutando el programa en un ordenador de esas características.
* Rendimiento: Se comprobará el tiempo de carga entre vistas.
