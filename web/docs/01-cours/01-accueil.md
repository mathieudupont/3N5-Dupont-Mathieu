---
title: Accueil
description: Accueil et intro à Java
hide_table_of_contents: true
---

# Semaine 1 : Introduction à Java et environnement de développement

<Row>

<Column>

## Contenu

- Application : architecture, exceptions, robustesse et tests automatisés
- Java comme langage, Android comme plateforme
  Plan de cours et logistique

</Column>

<Column>

## Évaluations et date

- Politique concernant les absences non justifiées
- Politique concernant le plagiat

</Column>

<Column>

## Théorie (voir les vidéos)

- Installer l'IDE pour Java (Intellij IDEA)
- Première classe Java
- Point d'arrêt et débogueur
- Configuration d'exécution et .idea
- Ajouter une librairie dans MAVEN

</Column>

</Row>

<Row>

<Column>

TODO accompagner pendant la séance à se créer un repo github
- pour leurs exercices 
- en forkant le repo du cours
- privé pour éviter le plagiat
- en suggérant un nom de type 3N5-NomDeFamille-Prenom

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

<Video url="https://youtu.be/mu2-0jfpmxc"/>

<Video url="https://youtu.be/UsdhEb-7kec"/>

<Video url="https://youtu.be/NHZJdK_6dA8"/>

:::

:::tip Installation

<Video url="https://youtu.be/b7MgJDd1Iks"/>

<Video url="https://youtu.be/aWd160BjRYE"/>

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

Créer 2 classes exécutables (avec un main qui suit la convention Java). La première s'appelle **NomDeFamille.java** et affiche "Bonjour Nom de famille" à l'exécution.

La deuxième classe exécutable s'appelle **PrenomDuProf.java** et affiche "Salut prénom du prof" à l'exécution.

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

### Exercice librairie JSOUP

Tu dois créer un projet Kotlin au format Maven dont le nom est DemoJSoup.

Tu dois inclure JSoup dans les dépendances de ton projet dans le pom.xml.

Tu dois créer une classe exécutable appelée **SuperDuperDemo.kt**. Dedans tu copieras un des exemples que tu trouves sur la page de JSOUP [https://jsoup.org/](https://jsoup.org/) et tu démontreras la bonne exécution.

## Défi semaine 1 (optionnel)

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
