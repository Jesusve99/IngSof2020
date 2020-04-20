# Neo Balompié (NBP)

Diagrama de clases

Author: Author

Revision: 0.2

| No Magic |
 |
| --- | --- |
| One Allen Center, 700 Central Expressway South, Suite 110 Allen, Texas 75013 USA | April 19, 2020 |

**Approval**

| The original of this document is approved and signed by:Name: Ruben Bullones, Mari Carmen Lopez, Ruben Gonzalez, Lucia Montiel, Juan Manuel Pérez, Jesús Vicente y Adrián Cámara.
Title: Diagrama de clases de Neo Balompié (NBP) Date: 19/04/2020
Signature: Introducción de Ingeniería de Software grupo 2ºC |
| --- |

**Revision History**

| **Revision** | **Date** | **Description** | **Author** |
| --- | --- | --- | --- |
| 0.1 | \&lt;date 1\&gt; | \&lt;draft\&gt; | \&lt;Author name\&gt; |
| 0.2 | \&lt;date 2\&gt; | \&lt;release\&gt; | \&lt;Author name\&gt; |
|
 |
 |
 |
 |

| **Table of Contents** |
| --- |
|
**[Introduction 1](#_Toc38225522)**[**Purpose** 1](#_Toc38225523)[**Scope** 1](#_Toc38225524)[**Overview** 1](#_Toc38225525)**[Package Controlador 2](#_Toc38225526)**[**Interface Datos equipo** 2](#_Toc38225527)[**Attribute Detail** 3](#_Toc38225528)[**Relation Detail** 3](#_Toc38225529)[Association 3](#_Toc38225530)[**Interface Datos partido** 3](#_Toc38225531)[**Attribute Detail** 4](#_Toc38225532)[**Relation Detail** 4](#_Toc38225533)[Association 4](#_Toc38225534)[**Interface Datos pista** 5](#_Toc38225535)[**Attribute Detail** 5](#_Toc38225536)[**Relation Detail** 5](#_Toc38225537)[Association 5](#_Toc38225538)[**Interface Datos Usuario** 6](#_Toc38225539)[**Attribute Detail** 6](#_Toc38225540)[**Relation Detail** 6](#_Toc38225541)[Association 6](#_Toc38225542)[**Interface Notificaciones** 6](#_Toc38225543)[**Attribute Detail** 7](#_Toc38225544)[**Relation Detail** 7](#_Toc38225545)[Association 7](#_Toc38225546)[**Interface Valoraciones** 7](#_Toc38225547)[**Attribute Detail** 7](#_Toc38225548)[**Relation Detail** 8](#_Toc38225549)[Association 8](#_Toc38225550)**[Package Modelo 8](#_Toc38225551)**[**Class Administrador** 9](#_Toc38225552)[**Attribute Detail** 10](#_Toc38225553)[Gestiona 10](#_Toc38225554)[**Operation Detail** 10](#_Toc38225555)[añadirpista 10](#_Toc38225556)[eliminarpista 10](#_Toc38225557)[**Relation Detail** 10](#_Toc38225558)[Association 10](#_Toc38225559)[Generalization 10](#_Toc38225560)[**Class Date** 10](#_Toc38225561)[**Class Equipo** 11](#_Toc38225562)[**Attribute Detail** 11](#_Toc38225563)[Compuesto 11](#_Toc38225564)[Creador 11](#_Toc38225565)[Juega 11](#_Toc38225566)[Nombre 12](#_Toc38225567)[Tamaño 12](#_Toc38225568)[**Operation Detail** 12](#_Toc38225569)[getCompuesto 12](#_Toc38225570)[getCreador 12](#_Toc38225571)[getJuega 12](#_Toc38225572)[getNombre 12](#_Toc38225573)[getTamaño 12](#_Toc38225574)[setCompuesto 12](#_Toc38225575)[setCreador 12](#_Toc38225576)[setJuega 13](#_Toc38225577)[setNombre 13](#_Toc38225578)[setTamaño 13](#_Toc38225579)[unirpartido 13](#_Toc38225580)[**Relation Detail** 13](#_Toc38225581)[Association 13](#_Toc38225582)[**Class Jugador** 13](#_Toc38225583)[**Attribute Detail** 14](#_Toc38225584)[Apellidos 14](#_Toc38225585)[Fecha de nacimiento 14](#_Toc38225586)[Juega 14](#_Toc38225587)[Nick 15](#_Toc38225588)[Nombre 15](#_Toc38225589)[Pertenece 15](#_Toc38225590)[Posición fav. 15](#_Toc38225591)[Recibe 15](#_Toc38225592)[Tiene 15](#_Toc38225593)[Valorar 15](#_Toc38225594)[**Operation Detail** 15](#_Toc38225595)[aceptarjugador 15](#_Toc38225596)[crearpartido 15](#_Toc38225597)[eliminarequipo 16](#_Toc38225598)[getApellidos 16](#_Toc38225599)[getFecha de nacimiento 16](#_Toc38225600)[getJuega 16](#_Toc38225601)[getNick 16](#_Toc38225602)[getNombre 16](#_Toc38225603)[getPertenece 16](#_Toc38225604)[getPosición fav. 16](#_Toc38225605)[getRecibe 16](#_Toc38225606)[getTiene 17](#_Toc38225607)[getValorar 17](#_Toc38225608)[salirsedeunpartido 17](#_Toc38225609)[setApellidos 17](#_Toc38225610)[setFecha de nacimiento 17](#_Toc38225611)[setJuega 17](#_Toc38225612)[setNick 17](#_Toc38225613)[setNombre 17](#_Toc38225614)[setPertenece 17](#_Toc38225615)[setPosición fav. 18](#_Toc38225616)[setRecibe 18](#_Toc38225617)[setTiene 18](#_Toc38225618)[setValorar 18](#_Toc38225619)[uniranoregistrado 18](#_Toc38225620)[unirpartido 18](#_Toc38225621)[valorarjugador 18](#_Toc38225622)[valorarpista 18](#_Toc38225623)[**Relation Detail** 18](#_Toc38225624)[Association 18](#_Toc38225625)[Generalization 19](#_Toc38225626)[**Class Notificacion** 19](#_Toc38225627)[**Attribute Detail** 19](#_Toc38225628)[Enviada a 19](#_Toc38225629)[Mensaje 19](#_Toc38225630)[**Operation Detail** 19](#_Toc38225631)[getEnviada a 20](#_Toc38225632)[getMensaje 20](#_Toc38225633)[setEnviada a 20](#_Toc38225634)[setMensaje 20](#_Toc38225635)[**Relation Detail** 20](#_Toc38225636)[Association 20](#_Toc38225637)[**Class Partido** 20](#_Toc38225638)[**Attribute Detail** 21](#_Toc38225639)[Equipo 21](#_Toc38225640)[Fecha 21](#_Toc38225641)[Hora 21](#_Toc38225642)[Jugador 21](#_Toc38225643)[**Operation Detail** 21](#_Toc38225644)[get 21](#_Toc38225645)[getEquipo 21](#_Toc38225646)[getFecha 21](#_Toc38225647)[getHora 21](#_Toc38225648)[getJugador 22](#_Toc38225649)[set 22](#_Toc38225650)[setEquipo 22](#_Toc38225651)[setFecha 22](#_Toc38225652)[setHora 22](#_Toc38225653)[setJugador 22](#_Toc38225654)[**Relation Detail** 22](#_Toc38225655)[Association 22](#_Toc38225656)[**Class Pista** 23](#_Toc38225657)[**Attribute Detail** 23](#_Toc38225658)[Es gestionada 23](#_Toc38225659)[Hora fin 23](#_Toc38225660)[Hora inicio 23](#_Toc38225661)[Nombre 24](#_Toc38225662)[Tiene 24](#_Toc38225663)[Ubicación 24](#_Toc38225664)[**Operation Detail** 24](#_Toc38225665)[get 24](#_Toc38225666)[getEs gestionada 24](#_Toc38225667)[getHora fin 24](#_Toc38225668)[getHora inicio 24](#_Toc38225669)[getNombre 24](#_Toc38225670)[getTiene 24](#_Toc38225671)[getUbicación 25](#_Toc38225672)[set 25](#_Toc38225673)[setEs gestionada 25](#_Toc38225674)[setHora fin 25](#_Toc38225675)[setHora inicio 25](#_Toc38225676)[setNombre 25](#_Toc38225677)[setTiene 25](#_Toc38225678)[setUbicación 25](#_Toc38225679)[**Relation Detail** 25](#_Toc38225680)[Association 25](#_Toc38225681)[**Class Usuario** 26](#_Toc38225682)[**Attribute Detail** 26](#_Toc38225683)[Contraseña 26](#_Toc38225684)[Correo electrónico 26](#_Toc38225685)[**Operation Detail** 26](#_Toc38225686)[getContraseña 26](#_Toc38225687)[getCorreo electrónico 26](#_Toc38225688)[setContraseña 27](#_Toc38225689)[setCorreo electrónico 27](#_Toc38225690)[**Relation Detail** 27](#_Toc38225691)[Generalization 27](#_Toc38225692)[**Class Valoración** 27](#_Toc38225693)[**Attribute Detail** 27](#_Toc38225694)[Valoracion 27](#_Toc38225695)[Valorada por 28](#_Toc38225696)[**Operation Detail** 28](#_Toc38225697)[getValoracion 28](#_Toc38225698)[getValorada por 28](#_Toc38225699)[setValoracion 28](#_Toc38225700)[setValorada por 28](#_Toc38225701)[**Relation Detail** 28](#_Toc38225702)[Association 28](#_Toc38225703)[Generalization 28](#_Toc38225704)[**Class Valoración Jugador** 28](#_Toc38225705)[**Attribute Detail** 29](#_Toc38225706)[Asociada 29](#_Toc38225707)[**Relation Detail** 29](#_Toc38225708)[Association 29](#_Toc38225709)[Generalization 29](#_Toc38225710)[**Class Valoración Pista** 29](#_Toc38225711)[**Attribute Detail** 29](#_Toc38225712)[Asociada 29](#_Toc38225713)[**Relation Detail** 29](#_Toc38225714)[Association 30](#_Toc38225715)[Generalization 30](#_Toc38225716)[**Interface Equipo** 30](#_Toc38225717)[**Attribute Detail** 30](#_Toc38225718)[**Relation Detail** 30](#_Toc38225719)[Association 30](#_Toc38225720)[**Interface Notificación** 30](#_Toc38225721)[**Attribute Detail** 30](#_Toc38225722)[**Relation Detail** 31](#_Toc38225723)[Association 31](#_Toc38225724)[**Interface Partido** 31](#_Toc38225725)[**Attribute Detail** 31](#_Toc38225726)[**Relation Detail** 31](#_Toc38225727)[Association 31](#_Toc38225728)[**Interface Pista** 31](#_Toc38225729)[**Attribute Detail** 31](#_Toc38225730)[**Relation Detail** 32](#_Toc38225731)[Association 32](#_Toc38225732)[**Interface Usuario** 32](#_Toc38225733)[**Attribute Detail** 32](#_Toc38225734)[**Relation Detail** 32](#_Toc38225735)[Association 32](#_Toc38225736)[**Interface Valoraciones** 32](#_Toc38225737)[**Attribute Detail** 33](#_Toc38225738)[**Relation Detail** 33](#_Toc38225739)[Association 33](#_Toc38225740)**[Package Vista 33](#_Toc38225741)**[**Interface Añadir Pista** 34](#_Toc38225742)[**Attribute Detail** 35](#_Toc38225743)[**Relation Detail** 35](#_Toc38225744)[Association 35](#_Toc38225745)[**Interface Crear Equipo** 35](#_Toc38225746)[**Attribute Detail** 35](#_Toc38225747)[**Relation Detail** 35](#_Toc38225748)[Association 35](#_Toc38225749)[**Interface Crear Partido** 35](#_Toc38225750)[**Attribute Detail** 36](#_Toc38225751)[**Relation Detail** 36](#_Toc38225752)[Association 36](#_Toc38225753)[**Interface Eliminar Equipo** 36](#_Toc38225754)[**Attribute Detail** 36](#_Toc38225755)[**Relation Detail** 36](#_Toc38225756)[Association 36](#_Toc38225757)[**Interface Eliminar Partido** 36](#_Toc38225758)[**Attribute Detail** 37](#_Toc38225759)[**Relation Detail** 37](#_Toc38225760)[Association 37](#_Toc38225761)[**Interface Eliminar Pista** 37](#_Toc38225762)[**Attribute Detail** 37](#_Toc38225763)[**Relation Detail** 37](#_Toc38225764)[Association 37](#_Toc38225765)[**Interface Iniciar Sesion** 37](#_Toc38225766)[**Attribute Detail** 38](#_Toc38225767)[**Relation Detail** 38](#_Toc38225768)[Association 38](#_Toc38225769)[**Interface Mandar Notificaciones** 38](#_Toc38225770)[**Attribute Detail** 38](#_Toc38225771)[**Relation Detail** 38](#_Toc38225772)[Association 38](#_Toc38225773)[**Interface Modificar Equipo** 38](#_Toc38225774)[**Attribute Detail** 39](#_Toc38225775)[**Relation Detail** 39](#_Toc38225776)[Association 39](#_Toc38225777)[**Interface Registrarse** 39](#_Toc38225778)[**Attribute Detail** 39](#_Toc38225779)[**Relation Detail** 39](#_Toc38225780)[Association 39](#_Toc38225781)[**Interface Salirse de Partido** 39](#_Toc38225782)[**Attribute Detail** 40](#_Toc38225783)[**Relation Detail** 40](#_Toc38225784)[Association 40](#_Toc38225785)[**Interface Unir a un no Registrado** 40](#_Toc38225786)[**Attribute Detail** 40](#_Toc38225787)[**Relation Detail** 40](#_Toc38225788)[Association 40](#_Toc38225789)[**Interface Unirse a Partido** 40](#_Toc38225790)[**Attribute Detail** 41](#_Toc38225791)[**Relation Detail** 41](#_Toc38225792)[Association 41](#_Toc38225793)[**Interface Unirse con Equipo** 41](#_Toc38225794)[**Attribute Detail** 41](#_Toc38225795)[**Relation Detail** 41](#_Toc38225796)[Association 41](#_Toc38225797)[**Interface Valorar Pistas** 41](#_Toc38225798)[**Attribute Detail** 42](#_Toc38225799)[**Relation Detail** 42](#_Toc38225800)[Association 42](#_Toc38225801)[**Interface Valorar Usuario** 42](#_Toc38225802)[**Attribute Detail** 42](#_Toc38225803)[**Relation Detail** 42](#_Toc38225804)[Association 42](#_Toc38225805)**[Appendix A: Diagram 43](#_Toc38225806)**[**Model** 43](#_Toc38225807)[**Model** 43](#_Toc38225808)


 |
| --- |

**Table of Figures**

[Figure 1.Controlador 2](#_Toc38225809)

[Figure 2.Datos equipo 3](#_Toc38225810)

[Figure 3.Datos partido 4](#_Toc38225811)

[Figure 4.Datos pista 5](#_Toc38225812)

[Figure 5.Datos Usuario 6](#_Toc38225813)

[Figure 6.Notificaciones 7](#_Toc38225814)

[Figure 7.Valoraciones 7](#_Toc38225815)

[Figure 8.Modelo 9](#_Toc38225816)

[Figure 9.Administrador 10](#_Toc38225817)

[Figure 10.Equipo 11](#_Toc38225818)

[Figure 11.Jugador 14](#_Toc38225819)

[Figure 12.Notificacion 19](#_Toc38225820)

[Figure 13.Partido 20](#_Toc38225821)

[Figure 14.Pista 23](#_Toc38225822)

[Figure 15.Usuario 26](#_Toc38225823)

[Figure 16.Valoración 27](#_Toc38225824)

[Figure 17.Valoración Jugador 28](#_Toc38225825)

[Figure 18.Valoración Pista 29](#_Toc38225826)

[Figure 19.Equipo 30](#_Toc38225827)

[Figure 20.Notificación 30](#_Toc38225828)

[Figure 21.Partido 31](#_Toc38225829)

[Figure 22.Pista 31](#_Toc38225830)

[Figure 23.Usuario 32](#_Toc38225831)

[Figure 24.Valoraciones 32](#_Toc38225832)

[Figure 25.Vista 34](#_Toc38225833)

[Figure 26.Añadir Pista 35](#_Toc38225834)

[Figure 27.Crear Equipo 35](#_Toc38225835)

[Figure 28.Crear Partido 36](#_Toc38225836)

[Figure 29.Eliminar Equipo 36](#_Toc38225837)

[Figure 30.Eliminar Partido 37](#_Toc38225838)

[Figure 31.Eliminar Pista 37](#_Toc38225839)

[Figure 32.Iniciar Sesion 38](#_Toc38225840)

[Figure 33.Modificar Equipo 38](#_Toc38225841)

[Figure 34.Registrarse 39](#_Toc38225842)

[Figure 35.Salirse de Partido 39](#_Toc38225843)

[Figure 36.Unir a un no Registrado 40](#_Toc38225844)

[Figure 37.Unirse a Partido 40](#_Toc38225845)

[Figure 38.Unirse con Equipo 41](#_Toc38225846)

[Figure 39.Valorar Pistas 41](#_Toc38225847)

[Figure 40.Valorar Usuario 42](#_Toc38225848)

[Figure 41.Model 43](#_Toc38225849)

[Figure 42.Model 44](#_Toc38225850)

##


##
## **Introduction**

## **Purpose**

This document provides class, interface, and enumeration specification. The specification provides the details of the types being modeled within the system

## **Scope**

This document is intended to define class specification for the {System Name}.

## **Overview**

This document provides a list of all packages with a summary for each. Each package has a section that contains a list of its classes, interfaces and enumeration type, with a summary for each. Class and Interface contains description, summary tables, detailed member descriptions, and relation table.

##
## **Package Controlador**

![](RackMultipart20200420-4-dznjqm_html_b650934766e217e5.jpg)

1. Controlador

| **Name** | Controlador |
| --- | --- |
| **Qualified Name** | Controlador |

## **Interface Datos equipo**

![](RackMultipart20200420-4-dznjqm_html_b434d2473e96bb90.jpg)

1. Datos equipo

| **Name** | Datos equipo |
| --- | --- |
| **Qualified Name** | Controlador::Datos equipo |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Crear Equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Eliminar Equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Modificar Equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Crear Equipo
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Modificar Equipo
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Equipo
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Eliminar Equipo
 |

## **Interface Datos partido**

![](RackMultipart20200420-4-dznjqm_html_8743651fa9374146.jpg)

1. Datos partido

| **Name** | Datos partido |
| --- | --- |
| **Qualified Name** | Controlador::Datos partido |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Crear Partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Unirse a Partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Unir a un no Registrado |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Unirse con Equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Salirse de Partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Eliminar Partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Unir a un no Registrado
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Salirse de Partido
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Eliminar Partido
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Unirse con Equipo
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Unirse a Partido
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Crear Partido
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Partido
 |

## **Interface Datos pista**

![](RackMultipart20200420-4-dznjqm_html_67264d0995a8ee7b.jpg)

1. Datos pista

| **Name** | Datos pista |
| --- | --- |
| **Qualified Name** | Controlador::Datos pista |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Añadir Pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Eliminar Pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Pista
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Añadir Pista
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Eliminar Pista
 |

## **Interface Datos Usuario**

![](RackMultipart20200420-4-dznjqm_html_265514706eb8c7f3.jpg)

1. Datos Usuario

| **Name** | Datos Usuario |
| --- | --- |
| **Qualified Name** | Controlador::Datos Usuario |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Registrarse |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Iniciar Sesion |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Usuario |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Iniciar Sesion
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Usuario
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Registrarse
 |

## **Interface Notificaciones**

![](RackMultipart20200420-4-dznjqm_html_535b7443f8447e67.jpg)

1. Notificaciones

| **Name** | Notificaciones |
| --- | --- |
| **Qualified Name** | Controlador::Notificaciones |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Mandar Notificaciones |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Notificación |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Mandar Notificaciones
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Notificación
 |

## **Interface Valoraciones**

![](RackMultipart20200420-4-dznjqm_html_c86735f1c1d18090.jpg)

1. Valoraciones

| **Name** | Valoraciones |
| --- | --- |
| **Qualified Name** | Controlador::Valoraciones |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Valorar Usuario |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Valorar Pistas |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

| **Type** | Valoraciones |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valorar Usuario
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valorar Pistas
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoraciones
 |

##
## **Package Modelo**

![](RackMultipart20200420-4-dznjqm_html_9046463338d8bf8.jpg)

1. Modelo

| **Name** | Modelo |
| --- | --- |
| **Qualified Name** | Modelo |

## **Class Administrador**

![](RackMultipart20200420-4-dznjqm_html_10a12bc21e280b74.jpg)

1. Administrador

| **Name** | Administrador |
| --- | --- |
| **Qualified Name** | Modelo::Administrador |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
- [Usuario](#_4b60982d4efce049ad4b2de1e8045451)
 |
| **Realized Interface** |
 |

### **Attribute Detail**

#### Gestiona

| **Type** | Pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | \* |

### **Operation Detail**

#### añadirpista

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### eliminarpista

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in p : Pista
 |

### **Relation Detail**

#### Association

| **Name** | Gestiona |
| --- | --- |
| **Related Element** |
- Pista
 |

#### Generalization

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Usuario
 |

## **Class Date**

| **Name** | Date |
| --- | --- |
| **Qualified Name** | Modelo::Date |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
 |
| **Realized Interface** |
 |

## **Class Equipo**

![](RackMultipart20200420-4-dznjqm_html_1c2d6859eefb4aae.jpg)

1. Equipo

| **Name** | Equipo |
| --- | --- |
| **Qualified Name** | Modelo::Equipo |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
 |
| **Realized Interface** |
 |

### **Attribute Detail**

#### Compuesto

| **Type** | Jugador |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1..10 |

#### Creador

| **Type** | Jugador |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Juega

| **Type** | Partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1..\* |

#### Nombre

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Tamaño

| **Type** | int |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

### **Operation Detail**

#### getCompuesto

| **Type** | Jugador |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getCreador

| **Type** | Jugador |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getJuega

| **Type** | Partido |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getNombre

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getTamaño

| **Type** | int |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### setCompuesto

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in compuesto : Jugador [1..10]
 |

#### setCreador

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in creador : Jugador
 |

#### setJuega

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in juega : Partido [1..\*]
 |

#### setNombre

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in nombre : String
 |

#### setTamaño

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in tamaño : int
 |

#### unirpartido

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in Partido : Partido
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Jugador
 |

| **Name** | Partido |
| --- | --- |
| **Related Element** |
- Partido
 |

## **Class Jugador**

![](RackMultipart20200420-4-dznjqm_html_e47e7175676b1091.jpg)

1. Jugador

| **Name** | Jugador |
| --- | --- |
| **Qualified Name** | Modelo::Jugador |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
- [Usuario](#_4b60982d4efce049ad4b2de1e8045451)
 |
| **Realized Interface** |
 |

### **Attribute Detail**

#### Apellidos

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Fecha de nacimiento

| **Type** | Date |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Juega

| **Type** | Partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1..\* |

#### Nick

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Nombre

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Pertenece

| **Type** | Equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1 |

#### Posición fav.

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Recibe

| **Type** | Notificacion |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1 |

#### Tiene

| **Type** | Valoración Jugador |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | \* |

#### Valorar

| **Type** | Valoración |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | \* |

### **Operation Detail**

#### aceptarjugador

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in p : Partido
 |

#### crearpartido

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### eliminarequipo

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in e : Equipo
 |

#### getApellidos

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getFecha de nacimiento

| **Type** | Date |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getJuega

| **Type** | Partido |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getNick

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getNombre

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getPertenece

| **Type** | Equipo |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getPosición fav.

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getRecibe

| **Type** | Notificacion |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getTiene

| **Type** | Valoración Jugador |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getValorar

| **Type** | Valoración |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### salirsedeunpartido

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in p : Partido
 |

#### setApellidos

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in apellidos : String
 |

#### setFecha de nacimiento

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in fecha de nacimiento : Date
 |

#### setJuega

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in juega : Partido [1..\*]
 |

#### setNick

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in nick : String
 |

#### setNombre

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in nombre : String
 |

#### setPertenece

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in pertenece : Equipo [1]
 |

#### setPosición fav.

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in posición fav. : String
 |

#### setRecibe

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in recibe : Notificacion [1]
 |

#### setTiene

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in tiene : Valoración Jugador [\*]
 |

#### setValorar

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in valorar : Valoración [\*]
 |

#### uniranoregistrado

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in p : Partido
 |

#### unirpartido

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in p : Partido
 |

#### valorarjugador

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in j : Jugador
 |

#### valorarpista

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in p : Pista
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoración Jugador
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoración
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Notificacion
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Equipo
 |

| **Name** | Partido1 |
| --- | --- |
| **Related Element** |
- Partido
 |

#### Generalization

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Usuario
 |

## **Class Notificacion**

![](RackMultipart20200420-4-dznjqm_html_5f3b6c409cb9fe63.jpg)

1. Notificacion

| **Name** | Notificacion |
| --- | --- |
| **Qualified Name** | Modelo::Notificacion |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
 |
| **Realized Interface** |
 |

### **Attribute Detail**

#### Enviada a

| **Type** | Jugador |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | \* |

#### Mensaje

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

### **Operation Detail**

#### getEnviada a

| **Type** | Jugador |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getMensaje

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### setEnviada a

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in enviada a : Jugador [\*]
 |

#### setMensaje

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in mensaje : String
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Jugador
 |

## **Class Partido**

![](RackMultipart20200420-4-dznjqm_html_afd04bec8aadbaec.jpg)

1. Partido

| **Name** | Partido |
| --- | --- |
| **Qualified Name** | Modelo::Partido |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
 |
| **Realized Interface** |
 |

### **Attribute Detail**

| **Type** | Pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1 |

#### Equipo

| **Type** | Equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1..\* |

#### Fecha

| **Type** | Date |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Hora

| **Type** | Date |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Jugador

| **Type** | Jugador |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1..10 |

### **Operation Detail**

#### get

| **Type** | Pista |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getEquipo

| **Type** | Equipo |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getFecha

| **Type** | Date |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getHora

| **Type** | Date |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getJugador

| **Type** | Jugador |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### set

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in : Pista [1]
 |

#### setEquipo

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in equipo : Equipo [1..\*]
 |

#### setFecha

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in fecha : Date
 |

#### setHora

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in hora : Date
 |

#### setJugador

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in jugador : Jugador [1..10]
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Pista
 |

| **Name** | Partido |
| --- | --- |
| **Related Element** |
- Equipo
 |

| **Name** | Partido1 |
| --- | --- |
| **Related Element** |
- Jugador
 |

## **Class Pista**

![](RackMultipart20200420-4-dznjqm_html_8a3632297088465d.jpg)

1. Pista

| **Name** | Pista |
| --- | --- |
| **Qualified Name** | Modelo::Pista |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
 |
| **Realized Interface** |
 |

### **Attribute Detail**

| **Type** | Partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | \* |

#### Es gestionada

| **Type** | Administrador |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1..\* |

#### Hora fin

| **Type** | Date |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Hora inicio

| **Type** | Date |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Nombre

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Tiene

| **Type** | Valoración Pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | \* |

#### Ubicación

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

### **Operation Detail**

#### get

| **Type** | Partido |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getEs gestionada

| **Type** | Administrador |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getHora fin

| **Type** | Date |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getHora inicio

| **Type** | Date |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getNombre

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getTiene

| **Type** | Valoración Pista |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getUbicación

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### set

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in : Partido [\*]
 |

#### setEs gestionada

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in es gestionada : Administrador [1..\*]
 |

#### setHora fin

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in hora fin : Date
 |

#### setHora inicio

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in hora inicio : Date
 |

#### setNombre

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in nombre : String
 |

#### setTiene

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in tiene : Valoración Pista [\*]
 |

#### setUbicación

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in ubicación : String
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoración Pista
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Partido
 |

| **Name** | Gestiona |
| --- | --- |
| **Related Element** |
- Administrador
 |

## **Class Usuario**

![](RackMultipart20200420-4-dznjqm_html_7c1b0acccf111852.jpg)

1. Usuario

| **Name** | Usuario |
| --- | --- |
| **Qualified Name** | Modelo::Usuario |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
 |
| **Realized Interface** |
 |

### **Attribute Detail**

#### Contraseña

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Correo electrónico

| **Type** | String |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

### **Operation Detail**

#### getContraseña

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getCorreo electrónico

| **Type** | String |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### setContraseña

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in contraseña : String
 |

#### setCorreo electrónico

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in correo electrónico : String
 |

### **Relation Detail**

#### Generalization

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Jugador
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Administrador
 |

## **Class Valoración**

![](RackMultipart20200420-4-dznjqm_html_bab2b93050e3e198.jpg)

1. Valoración

| **Name** | Valoración |
| --- | --- |
| **Qualified Name** | Modelo::Valoración |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
 |
| **Realized Interface** |
 |

### **Attribute Detail**

#### Valoracion

| **Type** | int |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** |
 |

#### Valorada por

| **Type** | Jugador |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1 |

### **Operation Detail**

#### getValoracion

| **Type** | int |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### getValorada por

| **Type** | Jugador |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
 |

#### setValoracion

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in valoracion : int
 |

#### setValorada por

| **Type** |
 |
| --- | --- |
| **Visibility** | public |
| **Is Abstract** | false |
| **Parameter** |
- in valorada por : Jugador [1]
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Jugador
 |

#### Generalization

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoración Pista
 |

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoración Jugador
 |

## **Class Valoración Jugador**

![](RackMultipart20200420-4-dznjqm_html_bccec50bcc658b52.jpg)

1. Valoración Jugador

| **Name** | Valoración Jugador |
| --- | --- |
| **Qualified Name** | Modelo::Valoración Jugador |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
- [Valoración](#_87490824ae9f76b9d365493cd5dd3853)
 |
| **Realized Interface** |
 |

### **Attribute Detail**

#### Asociada

| **Type** | Jugador |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Jugador
 |

#### Generalization

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoración
 |

## **Class Valoración Pista**

![](RackMultipart20200420-4-dznjqm_html_f71431f5be721bb0.jpg)

1. Valoración Pista

| **Name** | Valoración Pista |
| --- | --- |
| **Qualified Name** | Modelo::Valoración Pista |
| **Visibility** | public |
| **Abstract** | false |
| **Base Classifier** |
- [Valoración](#_87490824ae9f76b9d365493cd5dd3853)
 |
| **Realized Interface** |
 |

### **Attribute Detail**

#### Asociada

| **Type** | Pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | private |
| **Multiplicity** | 1 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Pista
 |

#### Generalization

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoración
 |

## **Interface Equipo**

![](RackMultipart20200420-4-dznjqm_html_1b7c013e903afacf.jpg)

1. Equipo

| **Name** | Equipo |
| --- | --- |
| **Qualified Name** | Modelo::Equipo |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos equipo
 |

## **Interface Notificación**

![](RackMultipart20200420-4-dznjqm_html_ff5b223402342b0f.jpg)

1. Notificación

| **Name** | Notificación |
| --- | --- |
| **Qualified Name** | Modelo::Notificación |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Notificaciones |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Notificaciones
 |

## **Interface Partido**

![](RackMultipart20200420-4-dznjqm_html_eabe7c0ac449182f.jpg)

1. Partido

| **Name** | Partido |
| --- | --- |
| **Qualified Name** | Modelo::Partido |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos partido
 |

## **Interface Pista**

![](RackMultipart20200420-4-dznjqm_html_9365a15ded91d3be.jpg)

1. Pista

| **Name** | Pista |
| --- | --- |
| **Qualified Name** | Modelo::Pista |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos pista
 |

## **Interface Usuario**

![](RackMultipart20200420-4-dznjqm_html_614bf3c39d0b8259.jpg)

1. Usuario

| **Name** | Usuario |
| --- | --- |
| **Qualified Name** | Modelo::Usuario |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos Usuario |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos Usuario
 |

## **Interface Valoraciones**

![](RackMultipart20200420-4-dznjqm_html_2e991c9b15d5e8ef.jpg)

1. Valoraciones

| **Name** | Valoraciones |
| --- | --- |
| **Qualified Name** | Modelo::Valoraciones |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Valoraciones |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoraciones
 |

##
## **Package Vista**

![](RackMultipart20200420-4-dznjqm_html_42c0bd091e141e49.jpg)

1. Vista

| **Name** | Vista |
| --- | --- |
| **Qualified Name** | Vista |

## **Interface Añadir Pista**

![](RackMultipart20200420-4-dznjqm_html_5daf39df58b8166d.jpg)

1. Añadir Pista

| **Name** | Añadir Pista |
| --- | --- |
| **Qualified Name** | Vista::Añadir Pista |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos pista
 |

## **Interface Crear Equipo**

![](RackMultipart20200420-4-dznjqm_html_713ad8f2777fa6ea.jpg)

1. Crear Equipo

| **Name** | Crear Equipo |
| --- | --- |
| **Qualified Name** | Vista::Crear Equipo |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos equipo
 |

## **Interface Crear Partido**

![](RackMultipart20200420-4-dznjqm_html_a69511932a9aaa41.jpg)

1. Crear Partido

| **Name** | Crear Partido |
| --- | --- |
| **Qualified Name** | Vista::Crear Partido |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos partido
 |

## **Interface Eliminar Equipo**

![](RackMultipart20200420-4-dznjqm_html_280ddd73c04ed44d.jpg)

1. Eliminar Equipo

| **Name** | Eliminar Equipo |
| --- | --- |
| **Qualified Name** | Vista::Eliminar Equipo |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos equipo
 |

## **Interface Eliminar Partido**

![](RackMultipart20200420-4-dznjqm_html_c622d791eb7a5a9b.jpg)

1. Eliminar Partido

| **Name** | Eliminar Partido |
| --- | --- |
| **Qualified Name** | Vista::Eliminar Partido |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos partido
 |

## **Interface Eliminar Pista**

![](RackMultipart20200420-4-dznjqm_html_ae273469b91550b6.jpg)

1. Eliminar Pista

| **Name** | Eliminar Pista |
| --- | --- |
| **Qualified Name** | Vista::Eliminar Pista |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos pista |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos pista
 |

## **Interface Iniciar Sesion**

![](RackMultipart20200420-4-dznjqm_html_b22c6ab0b34a4684.jpg)

1. Iniciar Sesion

| **Name** | Iniciar Sesion |
| --- | --- |
| **Qualified Name** | Vista::Iniciar Sesion |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos Usuario |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos Usuario
 |

## **Interface Mandar Notificaciones**

| **Name** | Mandar Notificaciones |
| --- | --- |
| **Qualified Name** | Vista::Mandar Notificaciones |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Notificaciones |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Notificaciones
 |

## **Interface Modificar Equipo**

![](RackMultipart20200420-4-dznjqm_html_ace448f73ad3892.jpg)

1. Modificar Equipo

| **Name** | Modificar Equipo |
| --- | --- |
| **Qualified Name** | Vista::Modificar Equipo |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos equipo |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos equipo
 |

## **Interface Registrarse**

![](RackMultipart20200420-4-dznjqm_html_a21b9bd1d949be3.jpg)

1. Registrarse

| **Name** | Registrarse |
| --- | --- |
| **Qualified Name** | Vista::Registrarse |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos Usuario |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos Usuario
 |

## **Interface Salirse de Partido**

![](RackMultipart20200420-4-dznjqm_html_42623baf3f31b090.jpg)

1. Salirse de Partido

| **Name** | Salirse de Partido |
| --- | --- |
| **Qualified Name** | Vista::Salirse de Partido |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos partido
 |

## **Interface Unir a un no Registrado**

![](RackMultipart20200420-4-dznjqm_html_d87707e5e8e883ba.jpg)

1. Unir a un no Registrado

| **Name** | Unir a un no Registrado |
| --- | --- |
| **Qualified Name** | Vista::Unir a un no Registrado |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos partido
 |

## **Interface Unirse a Partido**

![](RackMultipart20200420-4-dznjqm_html_562e736fdfb83a07.jpg)

1. Unirse a Partido

| **Name** | Unirse a Partido |
| --- | --- |
| **Qualified Name** | Vista::Unirse a Partido |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos partido
 |

## **Interface Unirse con Equipo**

![](RackMultipart20200420-4-dznjqm_html_4f238e5f9aeb7ad2.jpg)

1. Unirse con Equipo

| **Name** | Unirse con Equipo |
| --- | --- |
| **Qualified Name** | Vista::Unirse con Equipo |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Datos partido |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Datos partido
 |

## **Interface Valorar Pistas**

![](RackMultipart20200420-4-dznjqm_html_f3ff94065736593c.jpg)

1. Valorar Pistas

| **Name** | Valorar Pistas |
| --- | --- |
| **Qualified Name** | Vista::Valorar Pistas |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Valoraciones |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoraciones
 |

## **Interface Valorar Usuario**

![](RackMultipart20200420-4-dznjqm_html_a5be9241a158dca3.jpg)

1. Valorar Usuario

| **Name** | Valorar Usuario |
| --- | --- |
| **Qualified Name** | Vista::Valorar Usuario |
| **Visibility** | public |
| **Base Classifier** |
 |

### **Attribute Detail**

| **Type** | Valoraciones |
| --- | --- |
| **Default Value** |
 |
| **Visibility** | public |
| **Multiplicity** |
 |

### **Relation Detail**

#### Association

| **Name** |
 |
| --- | --- |
| **Related Element** |
- Valoraciones
 |

##
## **Appendix A: Diagram**

## **Model**

![](RackMultipart20200420-4-dznjqm_html_bf50cd031678f08.jpg)

1. Model

## **Model**

![](RackMultipart20200420-4-dznjqm_html_51dda04224a0ba83.jpg)

1. Model

**Clase Usuario**

La clase Usuario contiene información sobre un determinado usuario: su nick, su correo electrónico y su contraseña.

**Clase Jugador**

La clase Jugador hereda de la clase Usuario, por lo que contiene información sobre un determinado usuario, además de su nombre, apellidos y fecha de nacimiento. También posee información sobre su posición favorita.

Este jugador puede tanto crear partidos y modificarlos como unirse a aquellos que ya estén creados. Además, podrá crear equipos con los cuales podrá unirse a un partido. Otra opción será la de unirse al partido con gente que no esté registrada.

Asimismo tendrá la opción de salirse del partido o eliminarlo (si es anfitrión) y de modificar y eliminar sus equipos. Este anfitrión podrá aceptar o rechazar a todo aquel que quiera unirse al partido.

Otra opción será la de valorar pistas y jugadores con los que ya haya jugado.

**Clase Equipo**

La clase Equipo contiene información de un determinado equipo como el tamaño del equipo, el nombre del mismo y el nombre del capitán de equipo(creador).

El equipo se podrá unir a un partido con alguno o todos sus miembros.

**Clase Partido**

La clase partido proporciona la fecha y hora en la que se realizará un partido en específico, se puede jugar un partido con equipo, solo o con jugadores no registrados, partido está relacionado con pista ya que estará asignado a una.

**Clase Administrador**

La clase Administrador hereda de la clase Usuario, por lo que contiene información sobre un determinado usuario, el administrador es el que gestiona las pistas.

**Clase Pista**

La clase Pista contiene información sobre una determinada pista, tal como su nombre, su ubicación y la hora de inicio y fin en la que se pueden realizar los partidos. Las pistas son modificadas por el administrador ya sea para eliminarlas, añadirlas o cambiar su información, también cuenta con valoraciones dadas por los usuarios.

**Clase Valoración**

Esta clase engloba todas las valoraciones, ya sean de usuario o de pista.

Como atributos tiene un entero Valoración que es la calificación entre 1 y 5 de una pista o usuario.

Relacionada con las clases Pista y Jugador.

**Clase Valoración Usuario**

Esta clase hereda de Valoración y contiene todas las valoraciones que los jugadores hacen de otros usuarios, también jugadores.

No contiene atributos propios, solo los que hereda de su superclase.

**Clase Valoración Pista**

Hereda de Valoración y contiene todas las calificaciones que los usuarios realizan a las pistas en las que han jugado algún partido.

No contiene atributos propios, solo Valoración, heredada de su superclase.

**Clase Notificación**

Esta clase representa las notificaciones que recibe el usuario por parte del sistema.

Tiene como atributos Mensaje, un String, que sería el cuerpo de la notificación.

Está relacionada con Jugador.