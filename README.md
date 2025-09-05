## Kevin cuitiva - Juan Silva
# parte 1

- creacion del repositorio local y luego subir el documento reamde.md a github 
![imagen1](./image.png)



# parte 2

- se creo el repositorio compartido con el owner y el colaborador, luego intentamos subir el mismo
readme.md con cambios diferentes al mismo tiempo y mientras que al colaborador no le tiraba error
el owner recibia el siguiente error;

![Captura de WhatsApp](./Imagen%20de%20WhatsApp%202025-08-14%20a%20las%2015.36.17_445e701a.jpg)

- al colaborador todo le salia correcto:

![Descripción de la imagen](./Captura%20de%20pantalla%202025-08-14%20153613.png)
- la forma de solucionar esto era simplemente utilizar intellij como medio de modificacion para el repositorio
ya que el lo hace de forma automatica, ya que los errores que tenia el owner era por falta de hacer un pull
y descargar las actualizaciones del archivo.

![Captura de pantalla](./Captura%20de%20pantalla%202025-08-20%20141139.png)



# parte 3

- ¿Hay una mejor forma de trabajar con git para no tener conflictos?

hay cierto tipo de forma para trabajar de mejor forma en github, lo que podemos usar es crear ramas 
para que cada persona trabaje en una rama diferente. Adicionalmente se recomienda que que no se editen
los mismos archivos al mismo tiempo, pero que si hay que hacerlo que se coordine por seccines.

- ¿Qué es y como funciona el Pull Request?

el pull request es una solicitud de fusion en github, esta hace que los cambios dados por las personas 
tengan que ser aprobador antes de unirse a la rama principal, esto sirve para tener un control de calidad
y coordinacion en el equipo.

- creacion de ramas cada una:

![ramas](./ramas.png)

- creacion del pull request:

![pullrequest](./pullrequest.jpg)

- Test final:

![final](./pull.jpg)

## Retos

# Reto1
- Presentacion

![reto1.png](reto1.png)

# Reto2

- carrera de ramas

- Carril1

![img_2.png](img_2.png)


-Carril2

![img_3.png](img_3.png)


# Reto3 

- builder 

![builderreto3.png](builderreto3.png)

- buffer

![buffer](./reto3buffer.png)

# Reto 4

- primer merge

![reto4.1](./reto4.1.png)

- segundo merge

![reto4.2](./reto4.2.png)

# Reto 5

- primer merge

![reto5](./reto5.1.jpg)

- segundo merge

![reto5](./reto5.2.png)

# Reto 6

- salidas 

![reto6.1](./reto6.1.jpg)

![reto6.2](./reto6.2.jpg)

- merges 

![reto6.3](./reto6.3.jpg)

![reto6.4](./reto6.4.jpg)


### Preguntas

Cuál es la diferencia e	ntre git merge y git rebase

- merge: combina dos ramas creando un nuevo commit de merge que une sus historiales. 
Mantiene la historia tal como sucedió.

- rebase: reescribe la historia aplicando los commits de una rama “encima” de otra, 
como si hubieran nacido ahí. Hace la historia más lineal y limpia.

Si dos ramas modifican la misma línea de un archivo ¿Qué sucede al hacer merge?

- Se genera un conflicto ⚠️. Git no puede decidir cuál cambio conservar, 
por lo que pide al usuario resolverlo manualmente.

¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

- "git log --oneline --graph --all" Esto muestra un árbol visual simplificado con ramas y merges.

Explica la diferencia entre un commit y un push?

- commit: guarda los cambios en tu repositorio local (tu máquina).

- push: envía esos commits al repositorio remoto (ej. GitHub, GitLab).

Para que sirve git stash y git pop?

- git stash: guarda temporalmente cambios sin comprometerlos en un commit.

- git stash pop: restaura esos cambios guardados en tu directorio de trabajo y los quita del stash.


Qué diferencia hay entre HashMap y HashTable?

- HashMap:

    - No es thread-safe.
    - Permite null como clave y valores.
    - Mejor rendimiento en entornos de un solo hilo.
    - 
- HashTable:
  - Es thread-safe (sincronizado).
   - No permite claves ni valores null.
   - Más lenta en la mayoría de casos.

Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?

- Más declarativo y legible (usando streams).
- Se puede combinar con operaciones intermedias como filter, map, etc.
- Permite manejar colisiones de claves fácilmente con un merge function.

Si usas List con objetos y luego aplicas stream().map() que tipo de operación estas haciendo?

- Es una operación de transformación.

    - map() toma cada elemento del stream y lo convierte en otro (cambia tipo o contenido).
    - Devuelve un Stream con los elementos transformados.

Que hace el método stream().filter() y que retorna?

- filter(): recibe un predicado (condición booleana) y conserva solo los elementos que cumplen la condición.
- Retorna un Stream con esos elementos filtrados.

Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.

1. Cambiar a develop:
    - git checkout develop
2. Actualizar develop:
    - git pull origin develop
3. Crear la nueva rama:
    - git checkout -b feature/nueva-funcionalidad

¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?

- git branch nombre: crea la rama pero no te mueve a ella.
- git checkout -b nombre: crea la rama y te cambia automáticamente a esa rama.

¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente? 

 - Mantienes main estable y libre de errores.
- Permite trabajar en paralelo sin romper el código base.
- Facilita revisiones de código (pull requests).
- Hace el historial más limpio y organizado.