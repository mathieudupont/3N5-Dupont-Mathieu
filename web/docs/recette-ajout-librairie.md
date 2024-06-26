# Ajouter une librairie dans un projet Kotlin / gradle

## Etape 1 : Trouver la librairie

Le plus simple est d'utiliser un site comme mavenrepository.com pour trouver la librairie que vous voulez ajouter.

Dans un navigateur:
- naviguer vers [mavenrepository.com](https://mvnrepository.com/)
- taper le nom de la librairie dans la barre de recherche, par exemple `jsoup`
- cliquer sur la librairie que vous cherchez
- on arrive sur une liste des versions. Comment choisir une version:
  - éviter une version avec une **vulnerability**
  - prendre une version stable (pas une alpha, beta, RC, etc.)
- cliquer sur le numero de version désiré
- on arrive sur une page avec plusieurs onglets en bas: **Maven**, **Gradle** etc.
- dans notre cas, on va choisir **Gradle** pour avoir le code à ajouter dans le fichier `build.gradle`
- faire un CTRL+C pour copier la ligne qui commence par `implementation ...`

## Etape 2 : Ajouter la librairie dans le fichier `build.gradle`

- ouvrir le projet dans ton environnement de développement (IntelliJ, Android Studio, etc.).
- ouvrir le fichier build.gradle, s'il y en a plusieurs ouvrir celui qui contient des lignes `implementation ...`
- coller la ligne copiée à l'étape 1 dans la section `dependencies` du fichier `build.gradle` avec les autres lignes `implementation ...`
- à ce stage, il faut que le projet recharge le build.gradle ce qui va télécharger la librairie et rendre les classes disponibles:
  - soit tu fermes l'IDE et tu le repars, cela force à recharger le build.gradle
  - soit tu trouves l'icône d'un éléphant, ou gradle sync, ou refresh gradle, ou quelque chose du genre et tu cliques dessus

## Etape 3 : Tester

Dans un des fichiers Kotlin de ton projet, essaie de créer un objet d'une classe venant de la librairie:
- par exemple pour jsoup, tu peux essayer d'ajouter **var doc : Document = Jsoup.connect("http://example.com/").get();**
- ton IDE va te proposer de faire les imports nécessaires
- si ton code compile tu as ajouté la librairie avec succès
