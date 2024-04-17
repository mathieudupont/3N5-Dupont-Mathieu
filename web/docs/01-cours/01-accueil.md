---
title: Accueil
description: Accueil et intro à Kotlin
hide_table_of_contents: true
---

# Intro à Kotlin et environnement de développement

<Row>

<Column>

## Contenu

- Application : architecture, exceptions, robustesse et tests automatisés
- Kotlin comme langage, Android comme plateforme
- Plan de cours et logistique

</Column>

<Column>

## Évaluations et date

- Politique concernant les absences / retards
- Politique concernant le plagiat

</Column>

<Column>

## Théorie (voir les vidéos)

- Utilisation du script d'installation
- Installer l'IDE pour Kotlin (Intellij IDEA)
- Première classe Kotlin
- Point d'arrêt et débogueur
- Configuration d'exécution et .idea
- Ajouter une librairie avec MAVEN
- Définir une fonction en Kotlin
- Créer un fork du repo du cours privé pour mettre vos exercices 3N5-NomDeFamille-Prenom

</Column>

</Row>

<Row>

<Column>


:::danger Semaine type

Chaque semaine, il y a du travail préparatoire à faire pour découvrir le contenu (page web, vidéos et/ou d'exercices). Cela représente environ 2 heures de travail.

Pendant les séances en classe, il y aura...

- Discussion sur le contenu
- Démos supplémentaires
- Exercices
- Travaux personnels (TP)

:::

</Column>

<Column>

:::tip Vidéos de la matière

TODO Video sur premier projet, avec point d'arrêt et arguments

TODO Video sur ajouter une librairie Java dans un projet Kotlin

:::

:::tip Installation

Pour l'installation au collège, nous ferons une démo du [script](https://github.com/departement-info-cem/scripts-mobile/blob/main/installation-mobile.ps1)

Pour l'installation à la maison:
- installer [Intellij community edition](https://www.jetbrains.com/idea/download/other.html)
- vous pouvez utilisez jetbrains toolbox pour gérer les IDE jetbrains (Intellij, Android Studio, etc.)
- vous pouvez poser des questions à votre prof si vous avez des difficultés
- si vous avez un portable, apportez-le en cours si votre installation ne marche pas

:::

</Column>

<Column>

:::info À faire pendant la séance

- Se familiariser avec l'environnement de développement
- Compléter les exercices de la semaine
- Commencer le **[premier travail](../tp/tp1)** (création du projet, création de la classe pour l'application, exécution et débogue).

:::

</Column>

</Row>

:::note Exercices

TODO utiliser ChatGPT pour traduire de C# à kotlin.

### Exercice Bonjour Kotlin

Tu dois créer un projet Kotlin au format Maven dont le nom de package de base est **org.nomdefamille.demo** en changeant le nom de famille.

Créer 2 classes exécutables (avec un main qui suit la convention Kotlin). La première s'appelle **NomDeFamille.java** et affiche "Bonjour Nom de famille" à l'exécution.

La deuxième classe exécutable s'appelle **PrenomDuProf.kt** et affiche "Salut prénom du prof" à l'exécution.

### Exercice TraceManuelle

TODO faire un exo avec du code, dire quelle ligne s'exécute dans quel ordre et quels affichages se font en console.

```kotlin

```

### Exercice Triangle

Reproduisez un triangle en prenant sa hauteur par un argument de ligne de commandes.

```
*
**
***
****
```

Indications

- La méthode qui permet de transformer une chaîne de caractères en entier est une méthode statique de la classe Integer.
- Pour afficher un caractère sans sauter de ligne, print()

### Exercice Triangles

Tu dois produire 5 triangles de suite en utilisant une fonction kotlin qui:
- prend la hauteur en paramètre
- renvoie une **String** avec le triangle

```kotlin
fun triangle(hauteur : Int) : String {
    return "TODO"
}
```
Utilise cette fonction pour faire un main qui affiche 5 triangles de suite de taille 4, 8, 10 et 100.

### Exercice librairie JSOUP

Tu dois créer un projet Kotlin au format Maven dont le nom est DemoJSoup.

Tu dois inclure JSoup dans les dépendances de ton projet dans le pom.xml.

Tu dois créer une classe exécutable appelée **SuperDuperDemo.kt**. 

Dedans tu copieras un des exemples que tu trouves sur la page de JSOUP [https://jsoup.org/](https://jsoup.org/):
- les exemples sont en Java
- tu peux essayer de les traduire en Kotlin
- tu peux demander à ChatGPT de traduire l'exemple en Kotlin
- tu peux aussi copier le code de l'exemple en Java et le coller dans un fichier **.kt** dans Intellij, il te proposera de traduire pour toi.

Démontre la bonne exécution de ton programme.

## Défi de la semaine (optionnel)

### Exercice UnUn

Tu dois programmer une méthode en Kotlin qui transforme une String en une autre String:

```kotlin
fun unUn(source: String): String{
    TODO()
}
```

Par exemple, si la source est "111213", on compte le nombre de chiffres identiques

- source commence par "111" ce qui va donner 3 fois 1, soit "31"
- "2" va donner 1 fois 2 donc "12"
- "1" va donner 1 fois 1 donc "11"
- "3" va donner 1 fois 2 donc "13"

Le résultat de "111213" serait donc "31121113"

### Exercice UnUnSequence

Tu programmes une méthode qui affiche une séquence de _n_ String partant du paramètre source.

```kotlin
fun sequence(source: String, longueur: Int): List<String>{
    TODO()
}
```

Par exemple, pour **sequence("1", 6)** donne

```
1
11
21
1211
111221
312211
```

Tu produis des programmes exécutables pour répondre aux questions suivantes :

- Quel est le nombre le plus élevé qu'on peut atteindre en partant de "1"? Par exemple, dans les 100 000 premières itérations.
- Est-ce qu'il peut arriver que le résultat de unUn soit plus court que la source? Si oui, donne un exemple.

:::
