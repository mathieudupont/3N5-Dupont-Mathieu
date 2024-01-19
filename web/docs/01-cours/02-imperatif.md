---
title: Impératif
description: Prog. impérative
hide_table_of_contents: true
---

# Semaine 2 : Programmation impérative en Kotlin

## Contenu

- Exemples d'applications pour revenir sur les éléments couverts dans la video
- Correction commentée de certains exercices de la semaine
- Focus sur la null safety 
  - https://en.wikipedia.org/wiki/Null_pointer#History
  - https://en.wikipedia.org/wiki/Null_pointer#History
- Focus sur val et var
- Focus sur les annotations de types

<Row>

<Column>

:::danger Avant la séance (2h)

1. Parcourir la page Wikipedia concernant **[Kotlin](<https://fr.wikipedia.org/wiki/Java_(langage)>)** (max 20 minutes)
2. Parcourir le site officiel (en anglais) **[fondamentaux au Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/)** (max 20 minutes)
3. Regarder les vidéos de théorie
4. Commencer les exercices de la semaine. Arrêter après 2h de travail

:::

</Column>

<Column>

:::tip Vidéos

<Video url="https://youtu.be/PSnfqJ8pW2k"/>

<Video url="https://youtu.be/kpBcxKXacZM"/>

<Video url="https://youtu.be/BzFx1dszk4I"/>

:::

</Column>

<Column>

:::info À faire pendant la séance

- Compléter les exercices de la semaine
- Avancer le **[premier travail](../tp/tp1)**

:::

</Column>

</Row>

:::note Exercices

Le but des exercices est de découvrir kotlin par la pratique.

Certaines syntaxes sont pareilles en C# et en Kotlin, alors que d'autres sont différentes. À toi de trouver lesquelles.

### Exercice de compréhension sur val var

**val** et **var** sont des mots clés très similaires en lecture rapide. Pourtant, ils sont très différents.

### Exercice de compréhension sur les types

Etant donné le code suivant et sans utiliser l'IDE, déterminer le type de chaque variable.

Consigne ta réponse dans un document Word appelé **types.docx**

TODO
```kotlin
val a = 1                                   // type est            
val aa = 1L                                 // type est
val aaa = a * 25 + aa * 100
val b = 1.0                                 // type est 
val c = "1"                                 // type est 
val d = true                                // type est
val laChose = a +  b + c                    // type est
val lautreChose = b + c                    // type est
val k = listOf("1", "2", "3")
val l = mutableListOf(true, false, true)
```

Fais-toi un projet avec un main pour exécuter le code en débogage. Prends des screenshots de l'écran du débogueur
qui te permet de déterminer le type de chaque **val**.

Des surprises?

### Exercice Pyramide

Reproduisez un triangle en prenant sa hauteur par un argument de ligne de commandes.

```
  *
 ***
*****
```

### Exercice Moyenne

Créez un tableau d’entiers tirés au hasard entre 0 et 100. Calcule la somme, la moyenne, le min et le max et affiche les dans la console.

Indications

- besoin d’un objet de la classe Random pour les tirages aléatoires
- pour trouver la documentation d’une classe, on Google `javadoc nomdelaclasse`, ici `javadoc Random`

### Exercice Web

Ton programme doit prendre en argument une adresse (URL) d’un site web et afficher son contenu dans la console. Pour faire cela, tu peux utiliser une librairie externe ou la librairie standard.

Commence par l'implémenter en utilisant la librairie [jsoup](https://jsoup.org/), puis refais-le avec l'une des autres alternatives suivantes pour comparer :

- [Librairie standard](http://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html)
- [Librairie Guava](https://stackoverflow.com/a/6068228/1227197)
- [Autres (Java 9, Scanner, Apache Commons)](https://www.techiedelight.com/read-contents-of-url-into-string-java/)

### Exercice EclateTaString

Crée un programme qui prend en argument (le paramètre de la méthode main) une chaîne de caractères et qui affiche chaque caractère de la chaîne individuellement sur une ligne.

### Exercice BinariseTonEntier

Crée un programme qui prend en argument (le paramètre de la méthode main) une chaîne de caractères.

Tu dois d'abord convertir le String que tu as reçu en Integer. Ensuite tu dois chercher comment afficher ce nombre en binaire.

### Exercice ConvertisDansTousLesSens

Crée un programme qui teste différentes conversions de type et affiche les résultats.

- convertis un int en float
- convertis un double en int. Qu'est-ce qui se passe après la virgule ?
- convertis une String en int. Qu'est-ce qui se passe s'il y a autre chose que des chiffres ?
- convertis un int en String
- convertis un float en double
- etc.

:::
