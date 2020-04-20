Clase Usuario

La clase Usuario contiene informaci├│n sobre un determinado usuario: su
nick, su correo electr├│nico y su contrase├▒a.

Clase Jugador

La clase Jugador hereda de la clase Usuario, por lo que contiene
informaci├│n sobre un determinado usuario, adem├ís de su nombre, apellidos
y fecha de nacimiento. Tambi├®n posee informaci├│n sobre su posici├│n
favorita.

Este jugador puede tanto crear partidos y modificarlos como unirse a
aquellos que ya est├®n creados. Adem├ís, podr├í crear equipos con los
cuales podr├í unirse a un partido. Otra opci├│n ser├í la de unirse al
partido con gente que no est├® registrada.

Asimismo tendr├í la opci├│n de salirse del partido o eliminarlo (si es
anfitri├│n) y de modificar y eliminar sus equipos. Este anfitri├│n podr├í
aceptar o rechazar a todo aquel que quiera unirse al partido.

Otra opci├│n ser├í la de valorar pistas y jugadores con los que ya haya
jugado.

Clase Equipo

La clase Equipo contiene informaci├│n de un determinado equipo como el
tama├▒o del equipo, el nombre del mismo y el nombre del capit├ín de
equipo(creador).

El equipo se podr├í unir a un partido con alguno o todos sus miembros.

Clase Partido

La clase partido proporciona la fecha y hora en la que se realizar├í un
partido en espec├¡fico, se puede jugar un partido con equipo, solo o con
jugadores no registrados, partido est├í relacionado con pista ya que
estar├í asignado a una.

Clase Administrador

La clase Administrador hereda de la clase Usuario, por lo que contiene
informaci├│n sobre un determinado usuario, el administrador es el que
gestiona las pistas.

Clase Pista

La clase Pista contiene informaci├│n sobre una determinada pista, tal
como su nombre, su ubicaci├│n y la hora de inicio y fin en la que se
pueden realizar los partidos. Las pistas son modificadas por el
administrador ya sea para eliminarlas, a├▒adirlas o cambiar su
informaci├│n, tambi├®n cuenta con valoraciones dadas por los usuarios.

Clase Valoraci├│n

Esta clase engloba todas las valoraciones, ya sean de usuario o de
pista.

Como atributos tiene un entero Valoraci├│n que es la calificaci├│n entre 1
y 5 de una pista o usuario.

Relacionada con las clases Pista y Jugador.

Clase Valoraci├│n Usuario

Esta clase hereda de Valoraci├│n y contiene todas las valoraciones que
los jugadores hacen de otros usuarios, tambi├®n jugadores.

No contiene atributos propios, solo los que hereda de su superclase.

Clase Valoraci├│n Pista

Hereda de Valoraci├│n y contiene todas las calificaciones que los
usuarios realizan a las pistas en las que han jugado alg├║n partido.

No contiene atributos propios, solo Valoraci├│n, heredada de su
superclase.

Clase Notificaci├│n

Esta clase representa las notificaciones que recibe el usuario por parte
del sistema.

Tiene como atributos Mensaje, un String, que ser├¡a el cuerpo de la
notificaci├│n.
