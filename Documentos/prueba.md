Neo Balompié (NBP)

Diagrama de clases

Author: Author

Revision: 0.2

  ---------------------------------------------------------------------------------- ----------------
  No Magic                                                                           
  One Allen Center, 700 Central Expressway South, Suite 110 Allen, Texas 75013 USA   April 19, 2020
  ---------------------------------------------------------------------------------- ----------------

**[Approval]{.smallcaps}**

+----------------------------------------------------------------------+
| The original of this document is approved and signed by:             |
|                                                                      |
| Name:                                                                |
|                                                                      |
| Ruben Bullones, Mari Carmen Lopez, Ruben Gonzalez, Lucia Montiel,    |
| Juan Manuel Pérez, Jesús Vicente y Adrián Cámara.                    |
|                                                                      |
| Title: Diagrama de clases de Neo Balompié (NBP)                      |
|                                                                      |
| Date: 19/04/2020                                                     |
|                                                                      |
| Signature: Introducción de Ingeniería de Software grupo 2ºC          |
+----------------------------------------------------------------------+

**[Revision History]{.smallcaps}**

  -------------- ------------ ----------------- -----------------
  **Revision**   **Date**     **Description**   **Author**
  0.1            \<date 1\>   \<draft\>         \<Author name\>
  0.2            \<date 2\>   \<release\>       \<Author name\>
                                                
  -------------- ------------ ----------------- -----------------

+----------------------------------------------------------------------+
| \                                                                    |
| \                                                                    |
| \                                                                    |
| \                                                                    |
| Table of Contents                                                    |
+----------------------------------------------------------------------+
| [**Introduction** 1](#introduction)                                  |
|                                                                      |
| [**Purpose** 1](#purpose)                                            |
|                                                                      |
| [**Scope** 1](#scope)                                                |
|                                                                      |
| [**Overview** 1](#overview)                                          |
|                                                                      |
| [**Package Controlador** 2](#package-controlador)                    |
|                                                                      |
| [**Interface Datos equipo** 2](#interface-datos-equipo)              |
|                                                                      |
| [**Attribute Detail** 3](#attribute-detail)                          |
|                                                                      |
| [**Relation Detail** 3](#relation-detail)                            |
|                                                                      |
| [Association 3](#association)                                        |
|                                                                      |
| [**Interface Datos partido** 3](#interface-datos-partido)            |
|                                                                      |
| [**Attribute Detail** 4](#attribute-detail-1)                        |
|                                                                      |
| [**Relation Detail** 4](#relation-detail-1)                          |
|                                                                      |
| [Association 4](#association-1)                                      |
|                                                                      |
| [**Interface Datos pista** 5](#interface-datos-pista)                |
|                                                                      |
| [**Attribute Detail** 5](#attribute-detail-2)                        |
|                                                                      |
| [**Relation Detail** 5](#relation-detail-2)                          |
|                                                                      |
| [Association 5](#association-2)                                      |
|                                                                      |
| [**Interface Datos Usuario** 6](#interface-datos-usuario)            |
|                                                                      |
| [**Attribute Detail** 6](#attribute-detail-3)                        |
|                                                                      |
| [**Relation Detail** 6](#relation-detail-3)                          |
|                                                                      |
| [Association 6](#association-3)                                      |
|                                                                      |
| [**Interface Notificaciones** 6](#interface-notificaciones)          |
|                                                                      |
| [**Attribute Detail** 7](#attribute-detail-4)                        |
|                                                                      |
| [**Relation Detail** 7](#relation-detail-4)                          |
|                                                                      |
| [Association 7](#association-4)                                      |
|                                                                      |
| [**Interface Valoraciones** 7](#interface-valoraciones)              |
|                                                                      |
| [**Attribute Detail** 7](#attribute-detail-5)                        |
|                                                                      |
| [**Relation Detail** 8](#relation-detail-5)                          |
|                                                                      |
| [Association 8](#association-5)                                      |
|                                                                      |
| [**Package Modelo** 8](#package-modelo)                              |
|                                                                      |
| [**Class Administrador** 9](#class-administrador)                    |
|                                                                      |
| [**Attribute Detail** 10](#attribute-detail-6)                       |
|                                                                      |
| [Gestiona 10](#gestiona)                                             |
|                                                                      |
| [**Operation Detail** 10](#operation-detail)                         |
|                                                                      |
| [añadirpista 10](#añadirpista)                                       |
|                                                                      |
| [eliminarpista 10](#eliminarpista)                                   |
|                                                                      |
| [**Relation Detail** 10](#relation-detail-6)                         |
|                                                                      |
| [Association 10](#association-6)                                     |
|                                                                      |
| [Generalization 10](#generalization)                                 |
|                                                                      |
| [**Class Date** 10](#class-date)                                     |
|                                                                      |
| [**Class Equipo** 11](#class-equipo)                                 |
|                                                                      |
| [**Attribute Detail** 11](#attribute-detail-7)                       |
|                                                                      |
| [Compuesto 11](#compuesto)                                           |
|                                                                      |
| [Creador 11](#creador)                                               |
|                                                                      |
| [Juega 11](#juega)                                                   |
|                                                                      |
| [Nombre 12](#nombre)                                                 |
|                                                                      |
| [Tamaño 12](#tamaño)                                                 |
|                                                                      |
| [**Operation Detail** 12](#operation-detail-1)                       |
|                                                                      |
| [getCompuesto 12](#getcompuesto)                                     |
|                                                                      |
| [getCreador 12](#getcreador)                                         |
|                                                                      |
| [getJuega 12](#getjuega)                                             |
|                                                                      |
| [getNombre 12](#getnombre)                                           |
|                                                                      |
| [getTamaño 12](#gettamaño)                                           |
|                                                                      |
| [setCompuesto 12](#setcompuesto)                                     |
|                                                                      |
| [setCreador 12](#setcreador)                                         |
|                                                                      |
| [setJuega 13](#setjuega)                                             |
|                                                                      |
| [setNombre 13](#setnombre)                                           |
|                                                                      |
| [setTamaño 13](#settamaño)                                           |
|                                                                      |
| [unirpartido 13](#unirpartido)                                       |
|                                                                      |
| [**Relation Detail** 13](#relation-detail-7)                         |
|                                                                      |
| [Association 13](#association-7)                                     |
|                                                                      |
| [**Class Jugador** 13](#class-jugador)                               |
|                                                                      |
| [**Attribute Detail** 14](#attribute-detail-8)                       |
|                                                                      |
| [Apellidos 14](#apellidos)                                           |
|                                                                      |
| [Fecha de nacimiento 14](#fecha-de-nacimiento)                       |
|                                                                      |
| [Juega 14](#juega-1)                                                 |
|                                                                      |
| [Nick 15](#nick)                                                     |
|                                                                      |
| [Nombre 15](#nombre-1)                                               |
|                                                                      |
| [Pertenece 15](#pertenece)                                           |
|                                                                      |
| [Posición fav. 15](#posición-fav.)                                   |
|                                                                      |
| [Recibe 15](#recibe)                                                 |
|                                                                      |
| [Tiene 15](#tiene)                                                   |
|                                                                      |
| [Valorar 15](#valorar)                                               |
|                                                                      |
| [**Operation Detail** 15](#operation-detail-2)                       |
|                                                                      |
| [aceptarjugador 15](#aceptarjugador)                                 |
|                                                                      |
| [crearpartido 15](#crearpartido)                                     |
|                                                                      |
| [eliminarequipo 16](#eliminarequipo)                                 |
|                                                                      |
| [getApellidos 16](#getapellidos)                                     |
|                                                                      |
| [getFecha de nacimiento 16](#getfecha-de-nacimiento)                 |
|                                                                      |
| [getJuega 16](#getjuega-1)                                           |
|                                                                      |
| [getNick 16](#getnick)                                               |
|                                                                      |
| [getNombre 16](#getnombre-1)                                         |
|                                                                      |
| [getPertenece 16](#getpertenece)                                     |
|                                                                      |
| [getPosición fav. 16](#getposición-fav.)                             |
|                                                                      |
| [getRecibe 16](#getrecibe)                                           |
|                                                                      |
| [getTiene 17](#gettiene)                                             |
|                                                                      |
| [getValorar 17](#getvalorar)                                         |
|                                                                      |
| [salirsedeunpartido 17](#salirsedeunpartido)                         |
|                                                                      |
| [setApellidos 17](#setapellidos)                                     |
|                                                                      |
| [setFecha de nacimiento 17](#setfecha-de-nacimiento)                 |
|                                                                      |
| [setJuega 17](#setjuega-1)                                           |
|                                                                      |
| [setNick 17](#setnick)                                               |
|                                                                      |
| [setNombre 17](#setnombre-1)                                         |
|                                                                      |
| [setPertenece 17](#setpertenece)                                     |
|                                                                      |
| [setPosición fav. 18](#setposición-fav.)                             |
|                                                                      |
| [setRecibe 18](#setrecibe)                                           |
|                                                                      |
| [setTiene 18](#settiene)                                             |
|                                                                      |
| [setValorar 18](#setvalorar)                                         |
|                                                                      |
| [uniranoregistrado 18](#uniranoregistrado)                           |
|                                                                      |
| [unirpartido 18](#unirpartido-1)                                     |
|                                                                      |
| [valorarjugador 18](#valorarjugador)                                 |
|                                                                      |
| [valorarpista 18](#valorarpista)                                     |
|                                                                      |
| [**Relation Detail** 18](#relation-detail-8)                         |
|                                                                      |
| [Association 18](#association-8)                                     |
|                                                                      |
| [Generalization 19](#generalization-1)                               |
|                                                                      |
| [**Class Notificacion** 19](#class-notificacion)                     |
|                                                                      |
| [**Attribute Detail** 19](#attribute-detail-9)                       |
|                                                                      |
| [Enviada a 19](#enviada-a)                                           |
|                                                                      |
| [Mensaje 19](#mensaje)                                               |
|                                                                      |
| [**Operation Detail** 19](#operation-detail-3)                       |
|                                                                      |
| [getEnviada a 20](#getenviada-a)                                     |
|                                                                      |
| [getMensaje 20](#getmensaje)                                         |
|                                                                      |
| [setEnviada a 20](#setenviada-a)                                     |
|                                                                      |
| [setMensaje 20](#setmensaje)                                         |
|                                                                      |
| [**Relation Detail** 20](#relation-detail-9)                         |
|                                                                      |
| [Association 20](#association-9)                                     |
|                                                                      |
| [**Class Partido** 20](#class-partido)                               |
|                                                                      |
| [**Attribute Detail** 21](#attribute-detail-10)                      |
|                                                                      |
| [Equipo 21](#equipo)                                                 |
|                                                                      |
| [Fecha 21](#fecha)                                                   |
|                                                                      |
| [Hora 21](#hora)                                                     |
|                                                                      |
| [Jugador 21](#jugador)                                               |
|                                                                      |
| [**Operation Detail** 21](#operation-detail-4)                       |
|                                                                      |
| [get 21](#get)                                                       |
|                                                                      |
| [getEquipo 21](#getequipo)                                           |
|                                                                      |
| [getFecha 21](#getfecha)                                             |
|                                                                      |
| [getHora 21](#gethora)                                               |
|                                                                      |
| [getJugador 22](#getjugador)                                         |
|                                                                      |
| [set 22](#set)                                                       |
|                                                                      |
| [setEquipo 22](#setequipo)                                           |
|                                                                      |
| [setFecha 22](#setfecha)                                             |
|                                                                      |
| [setHora 22](#sethora)                                               |
|                                                                      |
| [setJugador 22](#setjugador)                                         |
|                                                                      |
| [**Relation Detail** 22](#relation-detail-10)                        |
|                                                                      |
| [Association 22](#association-10)                                    |
|                                                                      |
| [**Class Pista** 23](#class-pista)                                   |
|                                                                      |
| [**Attribute Detail** 23](#attribute-detail-11)                      |
|                                                                      |
| [Es gestionada 23](#es-gestionada)                                   |
|                                                                      |
| [Hora fin 23](#hora-fin)                                             |
|                                                                      |
| [Hora inicio 23](#hora-inicio)                                       |
|                                                                      |
| [Nombre 24](#nombre-2)                                               |
|                                                                      |
| [Tiene 24](#tiene-1)                                                 |
|                                                                      |
| [Ubicación 24](#ubicación)                                           |
|                                                                      |
| [**Operation Detail** 24](#operation-detail-5)                       |
|                                                                      |
| [get 24](#get-1)                                                     |
|                                                                      |
| [getEs gestionada 24](#getes-gestionada)                             |
|                                                                      |
| [getHora fin 24](#gethora-fin)                                       |
|                                                                      |
| [getHora inicio 24](#gethora-inicio)                                 |
|                                                                      |
| [getNombre 24](#getnombre-2)                                         |
|                                                                      |
| [getTiene 24](#gettiene-1)                                           |
|                                                                      |
| [getUbicación 25](#getubicación)                                     |
|                                                                      |
| [set 25](#set-1)                                                     |
|                                                                      |
| [setEs gestionada 25](#setes-gestionada)                             |
|                                                                      |
| [setHora fin 25](#sethora-fin)                                       |
|                                                                      |
| [setHora inicio 25](#sethora-inicio)                                 |
|                                                                      |
| [setNombre 25](#setnombre-2)                                         |
|                                                                      |
| [setTiene 25](#settiene-1)                                           |
|                                                                      |
| [setUbicación 25](#setubicación)                                     |
|                                                                      |
| [**Relation Detail** 25](#relation-detail-11)                        |
|                                                                      |
| [Association 25](#association-11)                                    |
|                                                                      |
| [**Class Usuario** 26](#class-usuario)                               |
|                                                                      |
| [**Attribute Detail** 26](#attribute-detail-12)                      |
|                                                                      |
| [Contraseña 26](#contraseña)                                         |
|                                                                      |
| [Correo electrónico 26](#correo-electrónico)                         |
|                                                                      |
| [**Operation Detail** 26](#operation-detail-6)                       |
|                                                                      |
| [getContraseña 26](#getcontraseña)                                   |
|                                                                      |
| [getCorreo electrónico 26](#getcorreo-electrónico)                   |
|                                                                      |
| [setContraseña 27](#setcontraseña)                                   |
|                                                                      |
| [setCorreo electrónico 27](#setcorreo-electrónico)                   |
|                                                                      |
| [**Relation Detail** 27](#relation-detail-12)                        |
|                                                                      |
| [Generalization 27](#generalization-2)                               |
|                                                                      |
| [**Class Valoración** 27](#class-valoración)                         |
|                                                                      |
| [**Attribute Detail** 27](#attribute-detail-13)                      |
|                                                                      |
| [Valoracion 27](#valoracion)                                         |
|                                                                      |
| [Valorada por 28](#valorada-por)                                     |
|                                                                      |
| [**Operation Detail** 28](#operation-detail-7)                       |
|                                                                      |
| [getValoracion 28](#getvaloracion)                                   |
|                                                                      |
| [getValorada por 28](#getvalorada-por)                               |
|                                                                      |
| [setValoracion 28](#setvaloracion)                                   |
|                                                                      |
| [setValorada por 28](#setvalorada-por)                               |
|                                                                      |
| [**Relation Detail** 28](#relation-detail-13)                        |
|                                                                      |
| [Association 28](#association-12)                                    |
|                                                                      |
| [Generalization 28](#generalization-3)                               |
|                                                                      |
| [**Class Valoración Jugador** 28](#class-valoración-jugador)         |
|                                                                      |
| [**Attribute Detail** 29](#attribute-detail-14)                      |
|                                                                      |
| [Asociada 29](#asociada)                                             |
|                                                                      |
| [**Relation Detail** 29](#relation-detail-14)                        |
|                                                                      |
| [Association 29](#association-13)                                    |
|                                                                      |
| [Generalization 29](#generalization-4)                               |
|                                                                      |
| [**Class Valoración Pista** 29](#class-valoración-pista)             |
|                                                                      |
| [**Attribute Detail** 29](#attribute-detail-15)                      |
|                                                                      |
| [Asociada 29](#asociada-1)                                           |
|                                                                      |
| [**Relation Detail** 29](#relation-detail-15)                        |
|                                                                      |
| [Association 30](#association-14)                                    |
|                                                                      |
| [Generalization 30](#generalization-5)                               |
|                                                                      |
| [**Interface Equipo** 30](#interface-equipo)                         |
|                                                                      |
| [**Attribute Detail** 30](#attribute-detail-16)                      |
|                                                                      |
| [**Relation Detail** 30](#relation-detail-16)                        |
|                                                                      |
| [Association 30](#association-15)                                    |
|                                                                      |
| [**Interface Notificación** 30](#interface-notificación)             |
|                                                                      |
| [**Attribute Detail** 30](#attribute-detail-17)                      |
|                                                                      |
| [**Relation Detail** 31](#relation-detail-17)                        |
|                                                                      |
| [Association 31](#association-16)                                    |
|                                                                      |
| [**Interface Partido** 31](#interface-partido)                       |
|                                                                      |
| [**Attribute Detail** 31](#attribute-detail-18)                      |
|                                                                      |
| [**Relation Detail** 31](#relation-detail-18)                        |
|                                                                      |
| [Association 31](#association-17)                                    |
|                                                                      |
| [**Interface Pista** 31](#interface-pista)                           |
|                                                                      |
| [**Attribute Detail** 31](#attribute-detail-19)                      |
|                                                                      |
| [**Relation Detail** 32](#relation-detail-19)                        |
|                                                                      |
| [Association 32](#association-18)                                    |
|                                                                      |
| [**Interface Usuario** 32](#interface-usuario)                       |
|                                                                      |
| [**Attribute Detail** 32](#attribute-detail-20)                      |
|                                                                      |
| [**Relation Detail** 32](#relation-detail-20)                        |
|                                                                      |
| [Association 32](#association-19)                                    |
|                                                                      |
| [**Interface Valoraciones** 32](#interface-valoraciones-1)           |
|                                                                      |
| [**Attribute Detail** 33](#attribute-detail-21)                      |
|                                                                      |
| [**Relation Detail** 33](#relation-detail-21)                        |
|                                                                      |
| [Association 33](#association-20)                                    |
|                                                                      |
| [**Package Vista** 33](#package-vista)                               |
|                                                                      |
| [**Interface Añadir Pista** 34](#interface-añadir-pista)             |
|                                                                      |
| [**Attribute Detail** 35](#attribute-detail-22)                      |
|                                                                      |
| [**Relation Detail** 35](#relation-detail-22)                        |
|                                                                      |
| [Association 35](#association-21)                                    |
|                                                                      |
| [**Interface Crear Equipo** 35](#interface-crear-equipo)             |
|                                                                      |
| [**Attribute Detail** 35](#attribute-detail-23)                      |
|                                                                      |
| [**Relation Detail** 35](#relation-detail-23)                        |
|                                                                      |
| [Association 35](#association-22)                                    |
|                                                                      |
| [**Interface Crear Partido** 35](#interface-crear-partido)           |
|                                                                      |
| [**Attribute Detail** 36](#attribute-detail-24)                      |
|                                                                      |
| [**Relation Detail** 36](#relation-detail-24)                        |
|                                                                      |
| [Association 36](#association-23)                                    |
|                                                                      |
| [**Interface Eliminar Equipo** 36](#interface-eliminar-equipo)       |
|                                                                      |
| [**Attribute Detail** 36](#attribute-detail-25)                      |
|                                                                      |
| [**Relation Detail** 36](#relation-detail-25)                        |
|                                                                      |
| [Association 36](#association-24)                                    |
|                                                                      |
| [**Interface Eliminar Partido** 36](#interface-eliminar-partido)     |
|                                                                      |
| [**Attribute Detail** 37](#attribute-detail-26)                      |
|                                                                      |
| [**Relation Detail** 37](#relation-detail-26)                        |
|                                                                      |
| [Association 37](#association-25)                                    |
|                                                                      |
| [**Interface Eliminar Pista** 37](#interface-eliminar-pista)         |
|                                                                      |
| [**Attribute Detail** 37](#attribute-detail-27)                      |
|                                                                      |
| [**Relation Detail** 37](#relation-detail-27)                        |
|                                                                      |
| [Association 37](#association-26)                                    |
|                                                                      |
| [**Interface Iniciar Sesion** 37](#interface-iniciar-sesion)         |
|                                                                      |
| [**Attribute Detail** 38](#attribute-detail-28)                      |
|                                                                      |
| [**Relation Detail** 38](#relation-detail-28)                        |
|                                                                      |
| [Association 38](#association-27)                                    |
|                                                                      |
| [**Interface Mandar Notificaciones**                                 |
| 38](#interface-mandar-notificaciones)                                |
|                                                                      |
| [**Attribute Detail** 38](#attribute-detail-29)                      |
|                                                                      |
| [**Relation Detail** 38](#relation-detail-29)                        |
|                                                                      |
| [Association 38](#association-28)                                    |
|                                                                      |
| [**Interface Modificar Equipo** 38](#interface-modificar-equipo)     |
|                                                                      |
| [**Attribute Detail** 39](#attribute-detail-30)                      |
|                                                                      |
| [**Relation Detail** 39](#relation-detail-30)                        |
|                                                                      |
| [Association 39](#association-29)                                    |
|                                                                      |
| [**Interface Registrarse** 39](#interface-registrarse)               |
|                                                                      |
| [**Attribute Detail** 39](#attribute-detail-31)                      |
|                                                                      |
| [**Relation Detail** 39](#relation-detail-31)                        |
|                                                                      |
| [Association 39](#association-30)                                    |
|                                                                      |
| [**Interface Salirse de Partido** 39](#interface-salirse-de-partido) |
|                                                                      |
| [**Attribute Detail** 40](#attribute-detail-32)                      |
|                                                                      |
| [**Relation Detail** 40](#relation-detail-32)                        |
|                                                                      |
| [Association 40](#association-31)                                    |
|                                                                      |
| [**Interface Unir a un no Registrado**                               |
| 40](#interface-unir-a-un-no-registrado)                              |
|                                                                      |
| [**Attribute Detail** 40](#attribute-detail-33)                      |
|                                                                      |
| [**Relation Detail** 40](#relation-detail-33)                        |
|                                                                      |
| [Association 40](#association-32)                                    |
|                                                                      |
| [**Interface Unirse a Partido** 40](#interface-unirse-a-partido)     |
|                                                                      |
| [**Attribute Detail** 41](#attribute-detail-34)                      |
|                                                                      |
| [**Relation Detail** 41](#relation-detail-34)                        |
|                                                                      |
| [Association 41](#association-33)                                    |
|                                                                      |
| [**Interface Unirse con Equipo** 41](#interface-unirse-con-equipo)   |
|                                                                      |
| [**Attribute Detail** 41](#attribute-detail-35)                      |
|                                                                      |
| [**Relation Detail** 41](#relation-detail-35)                        |
|                                                                      |
| [Association 41](#association-34)                                    |
|                                                                      |
| [**Interface Valorar Pistas** 41](#interface-valorar-pistas)         |
|                                                                      |
| [**Attribute Detail** 42](#attribute-detail-36)                      |
|                                                                      |
| [**Relation Detail** 42](#relation-detail-36)                        |
|                                                                      |
| [Association 42](#association-35)                                    |
|                                                                      |
| [**Interface Valorar Usuario** 42](#interface-valorar-usuario)       |
|                                                                      |
| [**Attribute Detail** 42](#attribute-detail-37)                      |
|                                                                      |
| [**Relation Detail** 42](#relation-detail-37)                        |
|                                                                      |
| [Association 42](#association-36)                                    |
|                                                                      |
| [**Appendix A: Diagram** 43](#appendix-a-diagram)                    |
|                                                                      |
| [**Model** 43](#model)                                               |
|                                                                      |
| [**Model** 43](#model-1)                                             |
+----------------------------------------------------------------------+

+--------------------------------------------------------+
| \                                                      |
| \                                                      |
| \                                                      |
| Table of Figures                                       |
+--------------------------------------------------------+
| [Figure 1. Controlador 2](#_Toc38225809)               |
|                                                        |
| [Figure 2. Datos equipo 3](#_Toc38225810)              |
|                                                        |
| [Figure 3. Datos partido 4](#_Toc38225811)             |
|                                                        |
| [Figure 4. Datos pista 5](#_Toc38225812)               |
|                                                        |
| [Figure 5. Datos Usuario 6](#_Toc38225813)             |
|                                                        |
| [Figure 6. Notificaciones 7](#_Toc38225814)            |
|                                                        |
| [Figure 7. Valoraciones 7](#_Toc38225815)              |
|                                                        |
| [Figure 8. Modelo 9](#_Toc38225816)                    |
|                                                        |
| [Figure 9. Administrador 10](#_Toc38225817)            |
|                                                        |
| [Figure 10. Equipo 11](#_Toc38225818)                  |
|                                                        |
| [Figure 11. Jugador 14](#_Toc38225819)                 |
|                                                        |
| [Figure 12. Notificacion 19](#_Toc38225820)            |
|                                                        |
| [Figure 13. Partido 20](#_Toc38225821)                 |
|                                                        |
| [Figure 14. Pista 23](#_Toc38225822)                   |
|                                                        |
| [Figure 15. Usuario 26](#_Toc38225823)                 |
|                                                        |
| [Figure 16. Valoración 27](#_Toc38225824)              |
|                                                        |
| [Figure 17. Valoración Jugador 28](#_Toc38225825)      |
|                                                        |
| [Figure 18. Valoración Pista 29](#_Toc38225826)        |
|                                                        |
| [Figure 19. Equipo 30](#_Toc38225827)                  |
|                                                        |
| [Figure 20. Notificación 30](#_Toc38225828)            |
|                                                        |
| [Figure 21. Partido 31](#_Toc38225829)                 |
|                                                        |
| [Figure 22. Pista 31](#_Toc38225830)                   |
|                                                        |
| [Figure 23. Usuario 32](#_Toc38225831)                 |
|                                                        |
| [Figure 24. Valoraciones 32](#_Toc38225832)            |
|                                                        |
| [Figure 25. Vista 34](#_Toc38225833)                   |
|                                                        |
| [Figure 26. Añadir Pista 35](#_Toc38225834)            |
|                                                        |
| [Figure 27. Crear Equipo 35](#_Toc38225835)            |
|                                                        |
| [Figure 28. Crear Partido 36](#_Toc38225836)           |
|                                                        |
| [Figure 29. Eliminar Equipo 36](#_Toc38225837)         |
|                                                        |
| [Figure 30. Eliminar Partido 37](#_Toc38225838)        |
|                                                        |
| [Figure 31. Eliminar Pista 37](#_Toc38225839)          |
|                                                        |
| [Figure 32. Iniciar Sesion 38](#_Toc38225840)          |
|                                                        |
| [Figure 33. Modificar Equipo 38](#_Toc38225841)        |
|                                                        |
| [Figure 34. Registrarse 39](#_Toc38225842)             |
|                                                        |
| [Figure 35. Salirse de Partido 39](#_Toc38225843)      |
|                                                        |
| [Figure 36. Unir a un no Registrado 40](#_Toc38225844) |
|                                                        |
| [Figure 37. Unirse a Partido 40](#_Toc38225845)        |
|                                                        |
| [Figure 38. Unirse con Equipo 41](#_Toc38225846)       |
|                                                        |
| [Figure 39. Valorar Pistas 41](#_Toc38225847)          |
|                                                        |
| [Figure 40. Valorar Usuario 42](#_Toc38225848)         |
|                                                        |
| [Figure 41. Model 43](#_Toc194895637)                  |
|                                                        |
| [Figure 42. Model 44](#_Toc38225850)                   |
+--------------------------------------------------------+

**Introduction**
================

**Purpose**
-----------

This document provides class, interface, and enumeration specification.
The specification provides the details of the types being modeled within
the system

**Scope**
---------

This document is intended to define class specification for the {System
Name}.

**Overview**
------------

This document provides a list of all packages with a summary for each.
Each package has a section that contains a list of its classes,
interfaces and enumeration type, with a summary for each. Class and
Interface contains description, summary tables, detailed member
descriptions, and relation table.

**Package Controlador**
=======================

> ![-1822857152.jpg](media/image1.jpg){width="3.1354166666666665in"
> height="7.364583333333333in"}

1.  []{#_Toc38225809 .anchor}Controlador

  -------------------- -------------
  **Name**             Controlador
  **Qualified Name**   Controlador
  -------------------- -------------

**Interface** **Datos equipo**
------------------------------

> ![923127396.jpg](media/image2.jpg){width="1.6979166666666667in"
> height="0.6770833333333334in"}

2.  []{#_Toc38225810 .anchor}Datos equipo

  --------------------- ---------------------------
  **Name**              Datos equipo
  **Qualified Name**    Controlador::Datos equipo
  **Visibility**        public
  **Base Classifier**   
  --------------------- ---------------------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Crear Equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

  ------------------- -----------------
  **Type**            Eliminar Equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -----------------

  ------------------- ------------------
  **Type**            Modificar Equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ------------------

  ------------------- --------
  **Type**            Equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------

### **Relation Detail**

#### Association

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Crear Equipo |
+---------------------+------------------+

+---------------------+----------------------+
| **Name**            |                      |
+---------------------+----------------------+
| **Related Element** | -   Modificar Equipo |
+---------------------+----------------------+

+---------------------+------------+
| **Name**            |            |
+---------------------+------------+
| **Related Element** | -   Equipo |
+---------------------+------------+

+---------------------+---------------------+
| **Name**            |                     |
+---------------------+---------------------+
| **Related Element** | -   Eliminar Equipo |
+---------------------+---------------------+

**Interface** **Datos partido**
-------------------------------

> ![1235818509.jpg](media/image3.jpg){width="1.6979166666666667in"
> height="0.5625in"}

3.  []{#_Toc38225811 .anchor}Datos partido

  --------------------- ----------------------------
  **Name**              Datos partido
  **Qualified Name**    Controlador::Datos partido
  **Visibility**        public
  **Base Classifier**   
  --------------------- ----------------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Crear Partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

  ------------------- ------------------
  **Type**            Unirse a Partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ------------------

  ------------------- -------------------------
  **Type**            Unir a un no Registrado
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -------------------------

  ------------------- -------------------
  **Type**            Unirse con Equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -------------------

  ------------------- --------------------
  **Type**            Salirse de Partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------------

  ------------------- ------------------
  **Type**            Eliminar Partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ------------------

  ------------------- ---------
  **Type**            Partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------

### **Relation Detail**

#### Association

+---------------------+-----------------------------+
| **Name**            |                             |
+---------------------+-----------------------------+
| **Related Element** | -   Unir a un no Registrado |
+---------------------+-----------------------------+

+---------------------+------------------------+
| **Name**            |                        |
+---------------------+------------------------+
| **Related Element** | -   Salirse de Partido |
+---------------------+------------------------+

+---------------------+----------------------+
| **Name**            |                      |
+---------------------+----------------------+
| **Related Element** | -   Eliminar Partido |
+---------------------+----------------------+

+---------------------+-----------------------+
| **Name**            |                       |
+---------------------+-----------------------+
| **Related Element** | -   Unirse con Equipo |
+---------------------+-----------------------+

+---------------------+----------------------+
| **Name**            |                      |
+---------------------+----------------------+
| **Related Element** | -   Unirse a Partido |
+---------------------+----------------------+

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Crear Partido |
+---------------------+-------------------+

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Partido |
+---------------------+-------------+

**Interface** **Datos pista**
-----------------------------

> ![177221073.jpg](media/image4.jpg){width="1.6979166666666667in"
> height="0.5625in"}

4.  []{#_Toc38225812 .anchor}Datos pista

  --------------------- --------------------------
  **Name**              Datos pista
  **Qualified Name**    Controlador::Datos pista
  **Visibility**        public
  **Base Classifier**   
  --------------------- --------------------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Añadir Pista
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

  ------------------- ----------------
  **Type**            Eliminar Pista
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ----------------

  ------------------- --------
  **Type**            Pista
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------

### **Relation Detail**

#### Association

+---------------------+-----------+
| **Name**            |           |
+---------------------+-----------+
| **Related Element** | -   Pista |
+---------------------+-----------+

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Añadir Pista |
+---------------------+------------------+

+---------------------+--------------------+
| **Name**            |                    |
+---------------------+--------------------+
| **Related Element** | -   Eliminar Pista |
+---------------------+--------------------+

**Interface** **Datos Usuario**
-------------------------------

> ![1610807369.jpg](media/image5.jpg){width="1.6979166666666667in"
> height="0.6770833333333334in"}

5.  []{#_Toc38225813 .anchor}Datos Usuario

  --------------------- ----------------------------
  **Name**              Datos Usuario
  **Qualified Name**    Controlador::Datos Usuario
  **Visibility**        public
  **Base Classifier**   
  --------------------- ----------------------------

### **Attribute Detail**

  ------------------- -------------
  **Type**            Registrarse
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -------------

  ------------------- ----------------
  **Type**            Iniciar Sesion
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ----------------

  ------------------- ---------
  **Type**            Usuario
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------

### **Relation Detail**

#### Association

+---------------------+--------------------+
| **Name**            |                    |
+---------------------+--------------------+
| **Related Element** | -   Iniciar Sesion |
+---------------------+--------------------+

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Usuario |
+---------------------+-------------+

+---------------------+-----------------+
| **Name**            |                 |
+---------------------+-----------------+
| **Related Element** | -   Registrarse |
+---------------------+-----------------+

**Interface** **Notificaciones**
--------------------------------

> ![-69774903.jpg](media/image6.jpg){width="1.6979166666666667in"
> height="0.5625in"}

6.  []{#_Toc38225814 .anchor}Notificaciones

  --------------------- -----------------------------
  **Name**              Notificaciones
  **Qualified Name**    Controlador::Notificaciones
  **Visibility**        public
  **Base Classifier**   
  --------------------- -----------------------------

### **Attribute Detail**

  ------------------- -----------------------
  **Type**            Mandar Notificaciones
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -----------------------

  ------------------- --------------
  **Type**            Notificación
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+---------------------------+
| **Name**            |                           |
+---------------------+---------------------------+
| **Related Element** | -   Mandar Notificaciones |
+---------------------+---------------------------+

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Notificación |
+---------------------+------------------+

**Interface** **Valoraciones**
------------------------------

> ![624528820.jpg](media/image7.jpg){width="1.6979166666666667in"
> height="0.8229166666666666in"}

7.  []{#_Toc38225815 .anchor}Valoraciones

  --------------------- ---------------------------
  **Name**              Valoraciones
  **Qualified Name**    Controlador::Valoraciones
  **Visibility**        public
  **Base Classifier**   
  --------------------- ---------------------------

### **Attribute Detail**

  ------------------- -----------------
  **Type**            Valorar Usuario
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -----------------

  ------------------- ----------------
  **Type**            Valorar Pistas
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ----------------

  ------------------- --------------
  **Type**            Valoraciones
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+---------------------+
| **Name**            |                     |
+---------------------+---------------------+
| **Related Element** | -   Valorar Usuario |
+---------------------+---------------------+

+---------------------+--------------------+
| **Name**            |                    |
+---------------------+--------------------+
| **Related Element** | -   Valorar Pistas |
+---------------------+--------------------+

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Valoraciones |
+---------------------+------------------+

**Package Modelo**
==================

> ![2124737456.jpg](media/image8.jpg){width="3.0729166666666665in"
> height="7.375in"}

8.  []{#_Toc38225816 .anchor}Modelo

  -------------------- --------
  **Name**             Modelo
  **Qualified Name**   Modelo
  -------------------- --------

**Class** **Administrador**
---------------------------

> ![-2079653680.jpg](media/image9.jpg){width="1.6041666666666667in"
> height="0.9479166666666666in"}

9.  []{#_Toc38225817 .anchor}Administrador

+------------------------+-------------------------------+
| **Name**               | Administrador                 |
+------------------------+-------------------------------+
| **Qualified Name**     | Modelo::Administrador         |
+------------------------+-------------------------------+
| **Visibility**         | public                        |
+------------------------+-------------------------------+
| **Abstract**           | false                         |
+------------------------+-------------------------------+
| **Base Classifier**    | -   [Usuario](#class-usuario) |
+------------------------+-------------------------------+
| **Realized Interface** |                               |
+------------------------+-------------------------------+

### **Attribute Detail**

#### Gestiona

  ------------------- ---------
  **Type**            Pista
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    \*
  ------------------- ---------

### **Operation Detail**

#### añadirpista

  ----------------- --------
  **Type**          
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### eliminarpista

+-----------------+------------------+
| **Type**        |                  |
+-----------------+------------------+
| **Visibility**  | public           |
+-----------------+------------------+
| **Is Abstract** | false            |
+-----------------+------------------+
| **Parameter**   | -   in p : Pista |
+-----------------+------------------+

### **Relation Detail**

#### Association

+---------------------+-----------+
| **Name**            | Gestiona  |
+---------------------+-----------+
| **Related Element** | -   Pista |
+---------------------+-----------+

#### Generalization

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Usuario |
+---------------------+-------------+

**Class** **Date**
------------------

  ------------------------ --------------
  **Name**                 Date
  **Qualified Name**       Modelo::Date
  **Visibility**           public
  **Abstract**             false
  **Base Classifier**      
  **Realized Interface**   
  ------------------------ --------------

**Class** **Equipo**
--------------------

> ![-1793478456.jpg](media/image10.jpg){width="2.7083333333333335in"
> height="2.6458333333333335in"}

10. []{#_Toc38225818 .anchor}Equipo

  ------------------------ ----------------
  **Name**                 Equipo
  **Qualified Name**       Modelo::Equipo
  **Visibility**           public
  **Abstract**             false
  **Base Classifier**      
  **Realized Interface**   
  ------------------------ ----------------

### **Attribute Detail**

#### Compuesto

  ------------------- ---------
  **Type**            Jugador
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1..10
  ------------------- ---------

#### Creador

  ------------------- ---------
  **Type**            Jugador
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Juega

  ------------------- ---------
  **Type**            Partido
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1..\*
  ------------------- ---------

#### Nombre

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Tamaño

  ------------------- ---------
  **Type**            int
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

### **Operation Detail**

#### getCompuesto

  ----------------- ---------
  **Type**          Jugador
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------

#### getCreador

  ----------------- ---------
  **Type**          Jugador
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------

#### getJuega

  ----------------- ---------
  **Type**          Partido
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------

#### getNombre

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getTamaño

  ----------------- --------
  **Type**          int
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### setCompuesto

+-----------------+--------------------------------------+
| **Type**        |                                      |
+-----------------+--------------------------------------+
| **Visibility**  | public                               |
+-----------------+--------------------------------------+
| **Is Abstract** | false                                |
+-----------------+--------------------------------------+
| **Parameter**   | -   in compuesto : Jugador \[1..10\] |
+-----------------+--------------------------------------+

#### setCreador

+-----------------+--------------------------+
| **Type**        |                          |
+-----------------+--------------------------+
| **Visibility**  | public                   |
+-----------------+--------------------------+
| **Is Abstract** | false                    |
+-----------------+--------------------------+
| **Parameter**   | -   in creador : Jugador |
+-----------------+--------------------------+

#### setJuega

+-----------------+----------------------------------+
| **Type**        |                                  |
+-----------------+----------------------------------+
| **Visibility**  | public                           |
+-----------------+----------------------------------+
| **Is Abstract** | false                            |
+-----------------+----------------------------------+
| **Parameter**   | -   in juega : Partido \[1..\*\] |
+-----------------+----------------------------------+

#### setNombre

+-----------------+------------------------+
| **Type**        |                        |
+-----------------+------------------------+
| **Visibility**  | public                 |
+-----------------+------------------------+
| **Is Abstract** | false                  |
+-----------------+------------------------+
| **Parameter**   | -   in nombre : String |
+-----------------+------------------------+

#### setTamaño

+-----------------+---------------------+
| **Type**        |                     |
+-----------------+---------------------+
| **Visibility**  | public              |
+-----------------+---------------------+
| **Is Abstract** | false               |
+-----------------+---------------------+
| **Parameter**   | -   in tamaño : int |
+-----------------+---------------------+

#### unirpartido

+-----------------+--------------------------+
| **Type**        |                          |
+-----------------+--------------------------+
| **Visibility**  | public                   |
+-----------------+--------------------------+
| **Is Abstract** | false                    |
+-----------------+--------------------------+
| **Parameter**   | -   in Partido : Partido |
+-----------------+--------------------------+

### **Relation Detail**

#### Association

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Jugador |
+---------------------+-------------+

+---------------------+-------------+
| **Name**            | Partido     |
+---------------------+-------------+
| **Related Element** | -   Partido |
+---------------------+-------------+

**Class** **Jugador**
---------------------

> ![-1386113636.jpg](media/image11.jpg){width="3.1145833333333335in"
> height="5.020833333333333in"}

11. []{#_Toc38225819 .anchor}Jugador

+------------------------+-------------------------------+
| **Name**               | Jugador                       |
+------------------------+-------------------------------+
| **Qualified Name**     | Modelo::Jugador               |
+------------------------+-------------------------------+
| **Visibility**         | public                        |
+------------------------+-------------------------------+
| **Abstract**           | false                         |
+------------------------+-------------------------------+
| **Base Classifier**    | -   [Usuario](#class-usuario) |
+------------------------+-------------------------------+
| **Realized Interface** |                               |
+------------------------+-------------------------------+

### **Attribute Detail**

#### Apellidos

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Fecha de nacimiento

  ------------------- ---------
  **Type**            Date
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Juega

  ------------------- ---------
  **Type**            Partido
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1..\*
  ------------------- ---------

#### Nick

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Nombre

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Pertenece

  ------------------- ---------
  **Type**            Equipo
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1
  ------------------- ---------

#### Posición fav.

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Recibe

  ------------------- --------------
  **Type**            Notificacion
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1
  ------------------- --------------

#### Tiene

  ------------------- --------------------
  **Type**            Valoración Jugador
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    \*
  ------------------- --------------------

#### Valorar

  ------------------- ------------
  **Type**            Valoración
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    \*
  ------------------- ------------

### **Operation Detail**

#### aceptarjugador

+-----------------+--------------------+
| **Type**        |                    |
+-----------------+--------------------+
| **Visibility**  | public             |
+-----------------+--------------------+
| **Is Abstract** | false              |
+-----------------+--------------------+
| **Parameter**   | -   in p : Partido |
+-----------------+--------------------+

#### crearpartido

  ----------------- --------
  **Type**          
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### eliminarequipo

+-----------------+-------------------+
| **Type**        |                   |
+-----------------+-------------------+
| **Visibility**  | public            |
+-----------------+-------------------+
| **Is Abstract** | false             |
+-----------------+-------------------+
| **Parameter**   | -   in e : Equipo |
+-----------------+-------------------+

#### getApellidos

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getFecha de nacimiento

  ----------------- --------
  **Type**          Date
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getJuega

  ----------------- ---------
  **Type**          Partido
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------

#### getNick

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getNombre

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getPertenece

  ----------------- --------
  **Type**          Equipo
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getPosición fav.

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getRecibe

  ----------------- --------------
  **Type**          Notificacion
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------------

#### getTiene

  ----------------- --------------------
  **Type**          Valoración Jugador
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------------------

#### getValorar

  ----------------- ------------
  **Type**          Valoración
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ------------

#### salirsedeunpartido

+-----------------+--------------------+
| **Type**        |                    |
+-----------------+--------------------+
| **Visibility**  | public             |
+-----------------+--------------------+
| **Is Abstract** | false              |
+-----------------+--------------------+
| **Parameter**   | -   in p : Partido |
+-----------------+--------------------+

#### setApellidos

+-----------------+---------------------------+
| **Type**        |                           |
+-----------------+---------------------------+
| **Visibility**  | public                    |
+-----------------+---------------------------+
| **Is Abstract** | false                     |
+-----------------+---------------------------+
| **Parameter**   | -   in apellidos : String |
+-----------------+---------------------------+

#### setFecha de nacimiento

+-----------------+-----------------------------------+
| **Type**        |                                   |
+-----------------+-----------------------------------+
| **Visibility**  | public                            |
+-----------------+-----------------------------------+
| **Is Abstract** | false                             |
+-----------------+-----------------------------------+
| **Parameter**   | -   in fecha de nacimiento : Date |
+-----------------+-----------------------------------+

#### setJuega

+-----------------+----------------------------------+
| **Type**        |                                  |
+-----------------+----------------------------------+
| **Visibility**  | public                           |
+-----------------+----------------------------------+
| **Is Abstract** | false                            |
+-----------------+----------------------------------+
| **Parameter**   | -   in juega : Partido \[1..\*\] |
+-----------------+----------------------------------+

#### setNick

+-----------------+----------------------+
| **Type**        |                      |
+-----------------+----------------------+
| **Visibility**  | public               |
+-----------------+----------------------+
| **Is Abstract** | false                |
+-----------------+----------------------+
| **Parameter**   | -   in nick : String |
+-----------------+----------------------+

#### setNombre

+-----------------+------------------------+
| **Type**        |                        |
+-----------------+------------------------+
| **Visibility**  | public                 |
+-----------------+------------------------+
| **Is Abstract** | false                  |
+-----------------+------------------------+
| **Parameter**   | -   in nombre : String |
+-----------------+------------------------+

#### setPertenece

+-----------------+---------------------------------+
| **Type**        |                                 |
+-----------------+---------------------------------+
| **Visibility**  | public                          |
+-----------------+---------------------------------+
| **Is Abstract** | false                           |
+-----------------+---------------------------------+
| **Parameter**   | -   in pertenece : Equipo \[1\] |
+-----------------+---------------------------------+

#### setPosición fav.

+-----------------+-------------------------------+
| **Type**        |                               |
+-----------------+-------------------------------+
| **Visibility**  | public                        |
+-----------------+-------------------------------+
| **Is Abstract** | false                         |
+-----------------+-------------------------------+
| **Parameter**   | -   in posición fav. : String |
+-----------------+-------------------------------+

#### setRecibe

+-----------------+------------------------------------+
| **Type**        |                                    |
+-----------------+------------------------------------+
| **Visibility**  | public                             |
+-----------------+------------------------------------+
| **Is Abstract** | false                              |
+-----------------+------------------------------------+
| **Parameter**   | -   in recibe : Notificacion \[1\] |
+-----------------+------------------------------------+

#### setTiene

+-----------------+------------------------------------------+
| **Type**        |                                          |
+-----------------+------------------------------------------+
| **Visibility**  | public                                   |
+-----------------+------------------------------------------+
| **Is Abstract** | false                                    |
+-----------------+------------------------------------------+
| **Parameter**   | -   in tiene : Valoración Jugador \[\*\] |
+-----------------+------------------------------------------+

#### setValorar

+-----------------+------------------------------------+
| **Type**        |                                    |
+-----------------+------------------------------------+
| **Visibility**  | public                             |
+-----------------+------------------------------------+
| **Is Abstract** | false                              |
+-----------------+------------------------------------+
| **Parameter**   | -   in valorar : Valoración \[\*\] |
+-----------------+------------------------------------+

#### uniranoregistrado

+-----------------+--------------------+
| **Type**        |                    |
+-----------------+--------------------+
| **Visibility**  | public             |
+-----------------+--------------------+
| **Is Abstract** | false              |
+-----------------+--------------------+
| **Parameter**   | -   in p : Partido |
+-----------------+--------------------+

#### unirpartido

+-----------------+--------------------+
| **Type**        |                    |
+-----------------+--------------------+
| **Visibility**  | public             |
+-----------------+--------------------+
| **Is Abstract** | false              |
+-----------------+--------------------+
| **Parameter**   | -   in p : Partido |
+-----------------+--------------------+

#### valorarjugador

+-----------------+--------------------+
| **Type**        |                    |
+-----------------+--------------------+
| **Visibility**  | public             |
+-----------------+--------------------+
| **Is Abstract** | false              |
+-----------------+--------------------+
| **Parameter**   | -   in j : Jugador |
+-----------------+--------------------+

#### valorarpista

+-----------------+------------------+
| **Type**        |                  |
+-----------------+------------------+
| **Visibility**  | public           |
+-----------------+------------------+
| **Is Abstract** | false            |
+-----------------+------------------+
| **Parameter**   | -   in p : Pista |
+-----------------+------------------+

### **Relation Detail**

#### Association

+---------------------+------------------------+
| **Name**            |                        |
+---------------------+------------------------+
| **Related Element** | -   Valoración Jugador |
+---------------------+------------------------+

+---------------------+----------------+
| **Name**            |                |
+---------------------+----------------+
| **Related Element** | -   Valoración |
+---------------------+----------------+

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Notificacion |
+---------------------+------------------+

+---------------------+------------+
| **Name**            |            |
+---------------------+------------+
| **Related Element** | -   Equipo |
+---------------------+------------+

+---------------------+-------------+
| **Name**            | Partido1    |
+---------------------+-------------+
| **Related Element** | -   Partido |
+---------------------+-------------+

#### Generalization

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Usuario |
+---------------------+-------------+

**Class** **Notificacion**
--------------------------

> ![12228571.jpg](media/image12.jpg){width="2.3645833333333335in"
> height="1.5208333333333333in"}

12. []{#_Toc38225820 .anchor}Notificacion

  ------------------------ ----------------------
  **Name**                 Notificacion
  **Qualified Name**       Modelo::Notificacion
  **Visibility**           public
  **Abstract**             false
  **Base Classifier**      
  **Realized Interface**   
  ------------------------ ----------------------

### **Attribute Detail**

#### Enviada a

  ------------------- ---------
  **Type**            Jugador
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    \*
  ------------------- ---------

#### Mensaje

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

### **Operation Detail**

#### getEnviada a

  ----------------- ---------
  **Type**          Jugador
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------

#### getMensaje

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### setEnviada a

+-----------------+-----------------------------------+
| **Type**        |                                   |
+-----------------+-----------------------------------+
| **Visibility**  | public                            |
+-----------------+-----------------------------------+
| **Is Abstract** | false                             |
+-----------------+-----------------------------------+
| **Parameter**   | -   in enviada a : Jugador \[\*\] |
+-----------------+-----------------------------------+

#### setMensaje

+-----------------+-------------------------+
| **Type**        |                         |
+-----------------+-------------------------+
| **Visibility**  | public                  |
+-----------------+-------------------------+
| **Is Abstract** | false                   |
+-----------------+-------------------------+
| **Parameter**   | -   in mensaje : String |
+-----------------+-------------------------+

### **Relation Detail**

#### Association

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Jugador |
+---------------------+-------------+

**Class** **Partido**
---------------------

> ![-1216158273.jpg](media/image13.jpg){width="2.375in"
> height="2.3958333333333335in"}

13. []{#_Toc38225821 .anchor}Partido

  ------------------------ -----------------
  **Name**                 Partido
  **Qualified Name**       Modelo::Partido
  **Visibility**           public
  **Abstract**             false
  **Base Classifier**      
  **Realized Interface**   
  ------------------------ -----------------

### **Attribute Detail**

  ------------------- ---------
  **Type**            Pista
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1
  ------------------- ---------

#### Equipo

  ------------------- ---------
  **Type**            Equipo
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1..\*
  ------------------- ---------

#### Fecha

  ------------------- ---------
  **Type**            Date
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Hora

  ------------------- ---------
  **Type**            Date
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Jugador

  ------------------- ---------
  **Type**            Jugador
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1..10
  ------------------- ---------

### **Operation Detail**

#### get

  ----------------- --------
  **Type**          Pista
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getEquipo

  ----------------- --------
  **Type**          Equipo
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getFecha

  ----------------- --------
  **Type**          Date
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getHora

  ----------------- --------
  **Type**          Date
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getJugador

  ----------------- ---------
  **Type**          Jugador
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------

#### set

+-----------------+----------------------+
| **Type**        |                      |
+-----------------+----------------------+
| **Visibility**  | public               |
+-----------------+----------------------+
| **Is Abstract** | false                |
+-----------------+----------------------+
| **Parameter**   | -   in : Pista \[1\] |
+-----------------+----------------------+

#### setEquipo

+-----------------+----------------------------------+
| **Type**        |                                  |
+-----------------+----------------------------------+
| **Visibility**  | public                           |
+-----------------+----------------------------------+
| **Is Abstract** | false                            |
+-----------------+----------------------------------+
| **Parameter**   | -   in equipo : Equipo \[1..\*\] |
+-----------------+----------------------------------+

#### setFecha

+-----------------+---------------------+
| **Type**        |                     |
+-----------------+---------------------+
| **Visibility**  | public              |
+-----------------+---------------------+
| **Is Abstract** | false               |
+-----------------+---------------------+
| **Parameter**   | -   in fecha : Date |
+-----------------+---------------------+

#### setHora

+-----------------+--------------------+
| **Type**        |                    |
+-----------------+--------------------+
| **Visibility**  | public             |
+-----------------+--------------------+
| **Is Abstract** | false              |
+-----------------+--------------------+
| **Parameter**   | -   in hora : Date |
+-----------------+--------------------+

#### setJugador

+-----------------+------------------------------------+
| **Type**        |                                    |
+-----------------+------------------------------------+
| **Visibility**  | public                             |
+-----------------+------------------------------------+
| **Is Abstract** | false                              |
+-----------------+------------------------------------+
| **Parameter**   | -   in jugador : Jugador \[1..10\] |
+-----------------+------------------------------------+

### **Relation Detail**

#### Association

+---------------------+-----------+
| **Name**            |           |
+---------------------+-----------+
| **Related Element** | -   Pista |
+---------------------+-----------+

+---------------------+------------+
| **Name**            | Partido    |
+---------------------+------------+
| **Related Element** | -   Equipo |
+---------------------+------------+

+---------------------+-------------+
| **Name**            | Partido1    |
+---------------------+-------------+
| **Related Element** | -   Jugador |
+---------------------+-------------+

**Class** **Pista**
-------------------

> ![-1411450079.jpg](media/image14.jpg){width="3.21875in"
> height="3.1458333333333335in"}

14. []{#_Toc38225822 .anchor}Pista

  ------------------------ ---------------
  **Name**                 Pista
  **Qualified Name**       Modelo::Pista
  **Visibility**           public
  **Abstract**             false
  **Base Classifier**      
  **Realized Interface**   
  ------------------------ ---------------

### **Attribute Detail**

  ------------------- ---------
  **Type**            Partido
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    \*
  ------------------- ---------

#### Es gestionada

  ------------------- ---------------
  **Type**            Administrador
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1..\*
  ------------------- ---------------

#### Hora fin

  ------------------- ---------
  **Type**            Date
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Hora inicio

  ------------------- ---------
  **Type**            Date
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Nombre

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Tiene

  ------------------- ------------------
  **Type**            Valoración Pista
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    \*
  ------------------- ------------------

#### Ubicación

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

### **Operation Detail**

#### get

  ----------------- ---------
  **Type**          Partido
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------

#### getEs gestionada

  ----------------- ---------------
  **Type**          Administrador
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------------

#### getHora fin

  ----------------- --------
  **Type**          Date
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getHora inicio

  ----------------- --------
  **Type**          Date
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getNombre

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getTiene

  ----------------- ------------------
  **Type**          Valoración Pista
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ------------------

#### getUbicación

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### set

+-----------------+-------------------------+
| **Type**        |                         |
+-----------------+-------------------------+
| **Visibility**  | public                  |
+-----------------+-------------------------+
| **Is Abstract** | false                   |
+-----------------+-------------------------+
| **Parameter**   | -   in : Partido \[\*\] |
+-----------------+-------------------------+

#### setEs gestionada

+-----------------+------------------------------------------------+
| **Type**        |                                                |
+-----------------+------------------------------------------------+
| **Visibility**  | public                                         |
+-----------------+------------------------------------------------+
| **Is Abstract** | false                                          |
+-----------------+------------------------------------------------+
| **Parameter**   | -   in es gestionada : Administrador \[1..\*\] |
+-----------------+------------------------------------------------+

#### setHora fin

+-----------------+------------------------+
| **Type**        |                        |
+-----------------+------------------------+
| **Visibility**  | public                 |
+-----------------+------------------------+
| **Is Abstract** | false                  |
+-----------------+------------------------+
| **Parameter**   | -   in hora fin : Date |
+-----------------+------------------------+

#### setHora inicio

+-----------------+---------------------------+
| **Type**        |                           |
+-----------------+---------------------------+
| **Visibility**  | public                    |
+-----------------+---------------------------+
| **Is Abstract** | false                     |
+-----------------+---------------------------+
| **Parameter**   | -   in hora inicio : Date |
+-----------------+---------------------------+

#### setNombre

+-----------------+------------------------+
| **Type**        |                        |
+-----------------+------------------------+
| **Visibility**  | public                 |
+-----------------+------------------------+
| **Is Abstract** | false                  |
+-----------------+------------------------+
| **Parameter**   | -   in nombre : String |
+-----------------+------------------------+

#### setTiene

+-----------------+----------------------------------------+
| **Type**        |                                        |
+-----------------+----------------------------------------+
| **Visibility**  | public                                 |
+-----------------+----------------------------------------+
| **Is Abstract** | false                                  |
+-----------------+----------------------------------------+
| **Parameter**   | -   in tiene : Valoración Pista \[\*\] |
+-----------------+----------------------------------------+

#### setUbicación

+-----------------+---------------------------+
| **Type**        |                           |
+-----------------+---------------------------+
| **Visibility**  | public                    |
+-----------------+---------------------------+
| **Is Abstract** | false                     |
+-----------------+---------------------------+
| **Parameter**   | -   in ubicación : String |
+-----------------+---------------------------+

### **Relation Detail**

#### Association

+---------------------+----------------------+
| **Name**            |                      |
+---------------------+----------------------+
| **Related Element** | -   Valoración Pista |
+---------------------+----------------------+

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Partido |
+---------------------+-------------+

+---------------------+-------------------+
| **Name**            | Gestiona          |
+---------------------+-------------------+
| **Related Element** | -   Administrador |
+---------------------+-------------------+

**Class** **Usuario**
---------------------

> ![-1185212635.jpg](media/image15.jpg){width="2.9791666666666665in"
> height="1.6458333333333333in"}

15. []{#_Toc38225823 .anchor}Usuario

  ------------------------ -----------------
  **Name**                 Usuario
  **Qualified Name**       Modelo::Usuario
  **Visibility**           public
  **Abstract**             false
  **Base Classifier**      
  **Realized Interface**   
  ------------------------ -----------------

### **Attribute Detail**

#### Contraseña

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Correo electrónico

  ------------------- ---------
  **Type**            String
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

### **Operation Detail**

#### getContraseña

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getCorreo electrónico

  ----------------- --------
  **Type**          String
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### setContraseña

+-----------------+----------------------------+
| **Type**        |                            |
+-----------------+----------------------------+
| **Visibility**  | public                     |
+-----------------+----------------------------+
| **Is Abstract** | false                      |
+-----------------+----------------------------+
| **Parameter**   | -   in contraseña : String |
+-----------------+----------------------------+

#### setCorreo electrónico

+-----------------+------------------------------------+
| **Type**        |                                    |
+-----------------+------------------------------------+
| **Visibility**  | public                             |
+-----------------+------------------------------------+
| **Is Abstract** | false                              |
+-----------------+------------------------------------+
| **Parameter**   | -   in correo electrónico : String |
+-----------------+------------------------------------+

### **Relation Detail**

#### Generalization

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Jugador |
+---------------------+-------------+

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Administrador |
+---------------------+-------------------+

**Class** **Valoración**
------------------------

> ![-793689325.jpg](media/image16.jpg){width="2.6979166666666665in"
> height="1.5208333333333333in"}

16. []{#_Toc38225824 .anchor}Valoración

  ------------------------ --------------------
  **Name**                 Valoración
  **Qualified Name**       Modelo::Valoración
  **Visibility**           public
  **Abstract**             false
  **Base Classifier**      
  **Realized Interface**   
  ------------------------ --------------------

### **Attribute Detail**

#### Valoracion

  ------------------- ---------
  **Type**            int
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    
  ------------------- ---------

#### Valorada por

  ------------------- ---------
  **Type**            Jugador
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1
  ------------------- ---------

### **Operation Detail**

#### getValoracion

  ----------------- --------
  **Type**          int
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- --------

#### getValorada por

  ----------------- ---------
  **Type**          Jugador
  **Visibility**    public
  **Is Abstract**   false
  **Parameter**     
  ----------------- ---------

#### setValoracion

+-----------------+-------------------------+
| **Type**        |                         |
+-----------------+-------------------------+
| **Visibility**  | public                  |
+-----------------+-------------------------+
| **Is Abstract** | false                   |
+-----------------+-------------------------+
| **Parameter**   | -   in valoracion : int |
+-----------------+-------------------------+

#### setValorada por

+-----------------+-------------------------------------+
| **Type**        |                                     |
+-----------------+-------------------------------------+
| **Visibility**  | public                              |
+-----------------+-------------------------------------+
| **Is Abstract** | false                               |
+-----------------+-------------------------------------+
| **Parameter**   | -   in valorada por : Jugador \[1\] |
+-----------------+-------------------------------------+

### **Relation Detail**

#### Association

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Jugador |
+---------------------+-------------+

#### Generalization

+---------------------+----------------------+
| **Name**            |                      |
+---------------------+----------------------+
| **Related Element** | -   Valoración Pista |
+---------------------+----------------------+

+---------------------+------------------------+
| **Name**            |                        |
+---------------------+------------------------+
| **Related Element** | -   Valoración Jugador |
+---------------------+------------------------+

**Class** **Valoración Jugador**
--------------------------------

> ![-2050261044.jpg](media/image17.jpg){width="1.4895833333333333in"
> height="0.5625in"}

17. []{#_Toc38225825 .anchor}Valoración Jugador

+------------------------+-------------------------------------+
| **Name**               | Valoración Jugador                  |
+------------------------+-------------------------------------+
| **Qualified Name**     | Modelo::Valoración Jugador          |
+------------------------+-------------------------------------+
| **Visibility**         | public                              |
+------------------------+-------------------------------------+
| **Abstract**           | false                               |
+------------------------+-------------------------------------+
| **Base Classifier**    | -   [Valoración](#class-valoración) |
+------------------------+-------------------------------------+
| **Realized Interface** |                                     |
+------------------------+-------------------------------------+

### **Attribute Detail**

#### Asociada

  ------------------- ---------
  **Type**            Jugador
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1
  ------------------- ---------

### **Relation Detail**

#### Association

+---------------------+-------------+
| **Name**            |             |
+---------------------+-------------+
| **Related Element** | -   Jugador |
+---------------------+-------------+

#### Generalization

+---------------------+----------------+
| **Name**            |                |
+---------------------+----------------+
| **Related Element** | -   Valoración |
+---------------------+----------------+

**Class** **Valoración Pista**
------------------------------

> ![659964937.jpg](media/image18.jpg){width="1.3020833333333333in"
> height="0.5625in"}

18. []{#_Toc38225826 .anchor}Valoración Pista

+------------------------+-------------------------------------+
| **Name**               | Valoración Pista                    |
+------------------------+-------------------------------------+
| **Qualified Name**     | Modelo::Valoración Pista            |
+------------------------+-------------------------------------+
| **Visibility**         | public                              |
+------------------------+-------------------------------------+
| **Abstract**           | false                               |
+------------------------+-------------------------------------+
| **Base Classifier**    | -   [Valoración](#class-valoración) |
+------------------------+-------------------------------------+
| **Realized Interface** |                                     |
+------------------------+-------------------------------------+

### **Attribute Detail**

#### Asociada

  ------------------- ---------
  **Type**            Pista
  **Default Value**   
  **Visibility**      private
  **Multiplicity**    1
  ------------------- ---------

### **Relation Detail**

#### Association

+---------------------+-----------+
| **Name**            |           |
+---------------------+-----------+
| **Related Element** | -   Pista |
+---------------------+-----------+

#### Generalization

+---------------------+----------------+
| **Name**            |                |
+---------------------+----------------+
| **Related Element** | -   Valoración |
+---------------------+----------------+

**Interface** **Equipo**
------------------------

> ![2103253351.jpg](media/image19.jpg){width="1.1458333333333333in"
> height="0.5625in"}

19. []{#_Toc38225827 .anchor}Equipo

  --------------------- ----------------
  **Name**              Equipo
  **Qualified Name**    Modelo::Equipo
  **Visibility**        public
  **Base Classifier**   
  --------------------- ----------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Datos equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Datos equipo |
+---------------------+------------------+

**Interface** **Notificación**
------------------------------

> ![-322622476.jpg](media/image20.jpg){width="1.1979166666666667in"
> height="0.5625in"}

20. []{#_Toc38225828 .anchor}Notificación

  --------------------- ----------------------
  **Name**              Notificación
  **Qualified Name**    Modelo::Notificación
  **Visibility**        public
  **Base Classifier**   
  --------------------- ----------------------

### **Attribute Detail**

  ------------------- ----------------
  **Type**            Notificaciones
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ----------------

### **Relation Detail**

#### Association

+---------------------+--------------------+
| **Name**            |                    |
+---------------------+--------------------+
| **Related Element** | -   Notificaciones |
+---------------------+--------------------+

**Interface** **Partido**
-------------------------

> ![-877734611.jpg](media/image21.jpg){width="1.1458333333333333in"
> height="0.5625in"}

21. []{#_Toc38225829 .anchor}Partido

  --------------------- -----------------
  **Name**              Partido
  **Qualified Name**    Modelo::Partido
  **Visibility**        public
  **Base Classifier**   
  --------------------- -----------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos partido |
+---------------------+-------------------+

**Interface** **Pista**
-----------------------

> ![1380281545.jpg](media/image22.jpg){width="1.1458333333333333in"
> height="0.5625in"}

22. []{#_Toc38225830 .anchor}Pista

  --------------------- ---------------
  **Name**              Pista
  **Qualified Name**    Modelo::Pista
  **Visibility**        public
  **Base Classifier**   
  --------------------- ---------------

### **Attribute Detail**

  ------------------- -------------
  **Type**            Datos pista
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -------------

### **Relation Detail**

#### Association

+---------------------+-----------------+
| **Name**            |                 |
+---------------------+-----------------+
| **Related Element** | -   Datos pista |
+---------------------+-----------------+

**Interface** **Usuario**
-------------------------

> ![-1987266729.jpg](media/image23.jpg){width="1.1458333333333333in"
> height="0.5625in"}

23. []{#_Toc38225831 .anchor}Usuario

  --------------------- -----------------
  **Name**              Usuario
  **Qualified Name**    Modelo::Usuario
  **Visibility**        public
  **Base Classifier**   
  --------------------- -----------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos Usuario
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos Usuario |
+---------------------+-------------------+

**Interface** **Valoraciones**
------------------------------

> ![-1481351569.jpg](media/image24.jpg){width="1.2916666666666667in"
> height="0.5625in"}

24. []{#_Toc38225832 .anchor}Valoraciones

  --------------------- ----------------------
  **Name**              Valoraciones
  **Qualified Name**    Modelo::Valoraciones
  **Visibility**        public
  **Base Classifier**   
  --------------------- ----------------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Valoraciones
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Valoraciones |
+---------------------+------------------+

**Package Vista**
=================

> ![438568411.jpg](media/image25.jpg){width="3.3333333333333335in"
> height="7.447916666666667in"}

25. []{#_Toc38225833 .anchor}Vista

  -------------------- -------
  **Name**             Vista
  **Qualified Name**   Vista
  -------------------- -------

**Interface** **Añadir Pista**
------------------------------

> ![-1067780203.jpg](media/image26.jpg){width="1.2291666666666667in"
> height="0.5625in"}

26. []{#_Toc38225834 .anchor}Añadir Pista

  --------------------- ---------------------
  **Name**              Añadir Pista
  **Qualified Name**    Vista::Añadir Pista
  **Visibility**        public
  **Base Classifier**   
  --------------------- ---------------------

### **Attribute Detail**

  ------------------- -------------
  **Type**            Datos pista
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -------------

### **Relation Detail**

#### Association

+---------------------+-----------------+
| **Name**            |                 |
+---------------------+-----------------+
| **Related Element** | -   Datos pista |
+---------------------+-----------------+

**Interface** **Crear Equipo**
------------------------------

> ![-1122057698.jpg](media/image27.jpg){width="1.28125in"
> height="0.5625in"}

27. []{#_Toc38225835 .anchor}Crear Equipo

  --------------------- ---------------------
  **Name**              Crear Equipo
  **Qualified Name**    Vista::Crear Equipo
  **Visibility**        public
  **Base Classifier**   
  --------------------- ---------------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Datos equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Datos equipo |
+---------------------+------------------+

**Interface** **Crear Partido**
-------------------------------

> ![-629730672.jpg](media/image28.jpg){width="1.3020833333333333in"
> height="0.5625in"}

28. []{#_Toc38225836 .anchor}Crear Partido

  --------------------- ----------------------
  **Name**              Crear Partido
  **Qualified Name**    Vista::Crear Partido
  **Visibility**        public
  **Base Classifier**   
  --------------------- ----------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos partido |
+---------------------+-------------------+

**Interface** **Eliminar Equipo**
---------------------------------

> ![952412162.jpg](media/image29.jpg){width="1.4166666666666667in"
> height="0.5625in"}

29. []{#_Toc38225837 .anchor}Eliminar Equipo

  --------------------- ------------------------
  **Name**              Eliminar Equipo
  **Qualified Name**    Vista::Eliminar Equipo
  **Visibility**        public
  **Base Classifier**   
  --------------------- ------------------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Datos equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Datos equipo |
+---------------------+------------------+

**Interface** **Eliminar Partido**
----------------------------------

> ![1323263239.jpg](media/image30.jpg){width="1.5520833333333333in"
> height="0.5625in"}

30. []{#_Toc38225838 .anchor}Eliminar Partido

  --------------------- -------------------------
  **Name**              Eliminar Partido
  **Qualified Name**    Vista::Eliminar Partido
  **Visibility**        public
  **Base Classifier**   
  --------------------- -------------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos partido |
+---------------------+-------------------+

**Interface** **Eliminar Pista**
--------------------------------

> ![331817926.jpg](media/image31.jpg){width="1.3125in"
> height="0.5625in"}

31. []{#_Toc38225839 .anchor}Eliminar Pista

  --------------------- -----------------------
  **Name**              Eliminar Pista
  **Qualified Name**    Vista::Eliminar Pista
  **Visibility**        public
  **Base Classifier**   
  --------------------- -----------------------

### **Attribute Detail**

  ------------------- -------------
  **Type**            Datos pista
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- -------------

### **Relation Detail**

#### Association

+---------------------+-----------------+
| **Name**            |                 |
+---------------------+-----------------+
| **Related Element** | -   Datos pista |
+---------------------+-----------------+

**Interface** **Iniciar Sesion**
--------------------------------

> ![-1551127276.jpg](media/image32.jpg){width="1.3125in"
> height="0.5625in"}

32. []{#_Toc38225840 .anchor}Iniciar Sesion

  --------------------- -----------------------
  **Name**              Iniciar Sesion
  **Qualified Name**    Vista::Iniciar Sesion
  **Visibility**        public
  **Base Classifier**   
  --------------------- -----------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos Usuario
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos Usuario |
+---------------------+-------------------+

**Interface** **Mandar Notificaciones**
---------------------------------------

  --------------------- ------------------------------
  **Name**              Mandar Notificaciones
  **Qualified Name**    Vista::Mandar Notificaciones
  **Visibility**        public
  **Base Classifier**   
  --------------------- ------------------------------

### **Attribute Detail**

  ------------------- ----------------
  **Type**            Notificaciones
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ----------------

### **Relation Detail**

#### Association

+---------------------+--------------------+
| **Name**            |                    |
+---------------------+--------------------+
| **Related Element** | -   Notificaciones |
+---------------------+--------------------+

**Interface** **Modificar Equipo**
----------------------------------

> ![1373566052.jpg](media/image33.jpg){width="1.4895833333333333in"
> height="0.5625in"}

33. []{#_Toc38225841 .anchor}Modificar Equipo

  --------------------- -------------------------
  **Name**              Modificar Equipo
  **Qualified Name**    Vista::Modificar Equipo
  **Visibility**        public
  **Base Classifier**   
  --------------------- -------------------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Datos equipo
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Datos equipo |
+---------------------+------------------+

**Interface** **Registrarse**
-----------------------------

> ![-1438177862.jpg](media/image34.jpg){width="1.21875in"
> height="0.5625in"}

34. []{#_Toc38225842 .anchor}Registrarse

  --------------------- --------------------
  **Name**              Registrarse
  **Qualified Name**    Vista::Registrarse
  **Visibility**        public
  **Base Classifier**   
  --------------------- --------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos Usuario
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos Usuario |
+---------------------+-------------------+

**Interface** **Salirse de Partido**
------------------------------------

> ![2083933971.jpg](media/image35.jpg){width="1.5520833333333333in"
> height="0.5625in"}

35. []{#_Toc38225843 .anchor}Salirse de Partido

  --------------------- ---------------------------
  **Name**              Salirse de Partido
  **Qualified Name**    Vista::Salirse de Partido
  **Visibility**        public
  **Base Classifier**   
  --------------------- ---------------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos partido |
+---------------------+-------------------+

**Interface** **Unir a un no Registrado**
-----------------------------------------

> ![-1953297277.jpg](media/image36.jpg){width="1.875in"
> height="0.5625in"}

36. []{#_Toc38225844 .anchor}Unir a un no Registrado

  --------------------- --------------------------------
  **Name**              Unir a un no Registrado
  **Qualified Name**    Vista::Unir a un no Registrado
  **Visibility**        public
  **Base Classifier**   
  --------------------- --------------------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos partido |
+---------------------+-------------------+

**Interface** **Unirse a Partido**
----------------------------------

> ![-1004366707.jpg](media/image37.jpg){width="1.4479166666666667in"
> height="0.5625in"}

37. []{#_Toc38225845 .anchor}Unirse a Partido

  --------------------- -------------------------
  **Name**              Unirse a Partido
  **Qualified Name**    Vista::Unirse a Partido
  **Visibility**        public
  **Base Classifier**   
  --------------------- -------------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos partido |
+---------------------+-------------------+

**Interface** **Unirse con Equipo**
-----------------------------------

> ![1189435873.jpg](media/image38.jpg){width="1.5729166666666667in"
> height="0.5625in"}

38. []{#_Toc38225846 .anchor}Unirse con Equipo

  --------------------- --------------------------
  **Name**              Unirse con Equipo
  **Qualified Name**    Vista::Unirse con Equipo
  **Visibility**        public
  **Base Classifier**   
  --------------------- --------------------------

### **Attribute Detail**

  ------------------- ---------------
  **Type**            Datos partido
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- ---------------

### **Relation Detail**

#### Association

+---------------------+-------------------+
| **Name**            |                   |
+---------------------+-------------------+
| **Related Element** | -   Datos partido |
+---------------------+-------------------+

**Interface** **Valorar Pistas**
--------------------------------

> ![1243520658.jpg](media/image39.jpg){width="1.34375in"
> height="0.5625in"}

39. []{#_Toc38225847 .anchor}Valorar Pistas

  --------------------- -----------------------
  **Name**              Valorar Pistas
  **Qualified Name**    Vista::Valorar Pistas
  **Visibility**        public
  **Base Classifier**   
  --------------------- -----------------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Valoraciones
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Valoraciones |
+---------------------+------------------+

**Interface** **Valorar Usuario**
---------------------------------

> ![-786674423.jpg](media/image40.jpg){width="1.4270833333333333in"
> height="0.5625in"}

40. []{#_Toc38225848 .anchor}Valorar Usuario

  --------------------- ------------------------
  **Name**              Valorar Usuario
  **Qualified Name**    Vista::Valorar Usuario
  **Visibility**        public
  **Base Classifier**   
  --------------------- ------------------------

### **Attribute Detail**

  ------------------- --------------
  **Type**            Valoraciones
  **Default Value**   
  **Visibility**      public
  **Multiplicity**    
  ------------------- --------------

### **Relation Detail**

#### Association

+---------------------+------------------+
| **Name**            |                  |
+---------------------+------------------+
| **Related Element** | -   Valoraciones |
+---------------------+------------------+

**Appendix A: Diagram**
=======================

**Model**
---------

> ![-658586304.jpg](media/image41.jpg){width="6.6777766841644794in"
> height="4.632707786526685in"}

41. []{#_Toc194895637 .anchor}Model

**Model**
---------

> ![-1583398394.jpg](media/image42.jpg){width="6.6777766841644794in"
> height="4.632707786526685in"}

42. []{#_Toc38225850 .anchor}Model

**Clase Usuario**

La clase Usuario contiene información sobre un determinado usuario: su
nick, su correo electrónico y su contraseña.

**Clase Jugador**

La clase Jugador hereda de la clase Usuario, por lo que contiene
información sobre un determinado usuario, además de su nombre, apellidos
y fecha de nacimiento. También posee información sobre su posición
favorita.

Este jugador puede tanto crear partidos y modificarlos como unirse a
aquellos que ya estén creados. Además, podrá crear equipos con los
cuales podrá unirse a un partido. Otra opción será la de unirse al
partido con gente que no esté registrada.

Asimismo tendrá la opción de salirse del partido o eliminarlo (si es
anfitrión) y de modificar y eliminar sus equipos. Este anfitrión podrá
aceptar o rechazar a todo aquel que quiera unirse al partido.

Otra opción será la de valorar pistas y jugadores con los que ya haya
jugado.

 

**Clase Equipo**

La clase Equipo contiene información de un determinado equipo como el
tamaño del equipo, el nombre del mismo y el nombre del capitán de
equipo(creador). 

El equipo se podrá unir a un partido con alguno o todos sus miembros.

 

**Clase Partido**

La clase partido proporciona la fecha y hora en la que se realizará un
partido en específico, se puede jugar un partido con equipo, solo o con
jugadores no registrados, partido está relacionado con pista ya que
estará asignado a una.

 

**Clase Administrador**

La clase Administrador hereda de la clase Usuario, por lo que contiene
información sobre un determinado usuario, el administrador es el que
gestiona las pistas.

**Clase Pista**

La clase Pista contiene información sobre una determinada pista, tal
como su nombre, su ubicación y la hora de inicio y fin en la que se
pueden realizar los partidos. Las pistas son modificadas por el
administrador ya sea para eliminarlas, añadirlas o cambiar su
información, también cuenta con valoraciones dadas por los usuarios.

**Clase Valoración**

Esta clase engloba todas las valoraciones, ya sean de usuario o de
pista.

Como atributos tiene un entero Valoración que es la calificación entre 1
y 5 de una pista o usuario.

Relacionada con las clases Pista y Jugador.

**Clase Valoración Usuario**

Esta clase hereda de Valoración y contiene todas las valoraciones que
los jugadores hacen de otros usuarios, también jugadores.

No contiene atributos propios, solo los que hereda de su superclase.

**Clase Valoración Pista**

Hereda de Valoración y contiene todas las calificaciones que los
usuarios realizan a las pistas en las que han jugado algún partido.

No contiene atributos propios, solo Valoración, heredada de su
superclase.

**Clase Notificación**

Esta clase representa las notificaciones que recibe el usuario por parte
del sistema.

Tiene como atributos Mensaje, un String, que sería el cuerpo de la
notificación.

Está relacionada con Jugador. 
