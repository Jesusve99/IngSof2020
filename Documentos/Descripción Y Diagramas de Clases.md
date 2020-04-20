![Documentos/Diagramas de Clases/Diagrama de Clases.jpg](media/image1.jpg){width="5.905555555555556in"
height="4.097343613298338in"}

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
