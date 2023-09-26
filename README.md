# PracticaGitBecarios
Esta es una practica utilizando git y Github

## Lista de comandos git

- Clonar un repositorio:

```
git clone <link_repositorio>
```

- Ver es estatus de cambios hechos:

```
git status
```

- Configurar a nivel global un usuario de git:

```
git config --global user.name noelsilis
```

- Configurar a nivel global un email de usuario en git:

```
git config --global user.email noel.maye@corvusdata.org
```

- Configurar a nivel de repositorio o proyecto un usuario de git:
> [!NOTE]
> Antes de ejecutar debes colocarte en la carpeta del repositorio

```
git config user.name noelsilis
```

- Configurar a nivel de repositorio o proyecto un email de usuario en git:
> [!NOTE]
> Antes de ejecutar debes colocarte en la carpeta del repositorio

```
git config user.email noel.maye@corvusdata.org
```

- Crea un nuevo repositorio local con el nombre especificado:

```
git init <nombre del proyecto>
```

- Toma una instantanea del archivo para preparar la version:

```
git add .
```

- Registra las instantaneas del archivo permanete en el historial de version:

```
git commit -m <mensaje>
```

- Modifica el mensaje del ultimo commit:

```
git commit --amend -m <mensaje>
```

- Enumera todas las ramas en el repositorio actual:

```
git branch
```

- Crea una nueva rama:

```
git branch <nombre de la rama>
```

- Descarga el historial del marcador e incorpora cambios:

```
git pull
```

- Carga todos los commits de la rama local a github:

```
git push
```

- Descarga el historial del marcador sin hacer cambios:
```
git fetch <Nombre de la rama remota> <Nombre de la rama local>
```

- Crea una nueva rama:

```
git checkout -b <nombre de la rama>
```

- Cambia a la rama especificada y actualiza el directorio activo:

```
git checkout <nombre de la rama>
```

- Combina el historial de la rama especificada con la rama actual:

```
git merge <nombre de la rama a combinar>
```

- Muestra el historico de revisiones:
```
git log
```

- Muestra graficamente las ramas:
```
git log -graph
```

- Configurar nuestro commit como actual, antes de hacer pull y descargar los cambios:
```
git config  rebase.auto true                                 
```

