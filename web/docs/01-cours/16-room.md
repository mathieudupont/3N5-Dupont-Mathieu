---
title: Base de données
description: Base de données (Room)
hide_table_of_contents: true
---

# Semaine 10 - 11 : Android : persister des données avec Room / SQLite

## Contenu

Nous ferons quelques exemples pour revenir sur le code fourni.

Nous discuterons des différentes options de stockage (support, granularité) et des critères à considérer pour choisir ce qui est le plus approprié pour une application donnée.

<Row>

<Column>

:::warning Avant la séance (2h)

Regarder la page sur les différentes options de persistence [ici](https://developer.android.com/training/data-storage?hl=fr)

Nous utiliserons la librairie Room pour faciliter l'utilisation de SQLite.

:::

</Column>

<Column>

:::tip Vidéos

<Video url="https://youtu.be/XMN3y8d2Dr0" />

[Code après video 1](https://github.com/departement-info-cem/3N5-Prog3/tree/main/code/RoomSQL/01-Depart)

<Video url="https://youtu.be/t8O7EN61egA" />

[Code après video 2](https://github.com/departement-info-cem/3N5-Prog3/tree/main/code/RoomSQL/02-RoomDebug)

<Video url="https://youtu.be/SB58qEx9XBU" />

[Code après video 3](https://github.com/departement-info-cem/3N5-Prog3/tree/main/code/RoomSQL/03-RoomTransaction)

<Video url="https://youtu.be/fpdADjOecTw" />

[Code après video 4](https://github.com/departement-info-cem/3N5-Prog3/tree/main/code/RoomSQL/04-RoomPerformance)

**Optionnel**: vous trouverez un projet illustrant les différentes possibilités de stockage [ici](https://github.com/jorisdeguet/420406-Applications/tree/main/code/Persist).

Ensuite vous devez commencer les exercices . Arrêtez vous quand vous avez complété vos 2 heures.

:::

</Column>

<Column>

:::info À faire pendant la séance

Pendant le labo

Compléter les exercices de la semaine. Continuer le travail évalué en cours.

:::

</Column>

</Row>

:::note Exercices

### Exercice StockageDernierArret

Dans un nouveau projet, tu programmes la persistance suivante.

- Une seule activité
- À la fermeture de l'activité (événement onPause? onStop? onDestroy? [ici](https://developer.android.com/reference/android/app/Activity.html)), l'activité sauvegarde sur l'appareil l'heure de l'arrêt.
- Au démarrage de l'activité, on affiche dans un TextView l'heure du dernier arrêt de l'application. Au premier démarrage de l'application, on n'affiche rien mais on fait apparaître un Toast indiquant un tout premier démarrage. (tu peux supprimer l'application du périphérique pour pratiquer le premier démarrage)

### Exercice Persist

1. Créer une classe entité Personne à persister avec Room avec les champs suivants:
   - nom de type String
   - dateNaissance de type DateTime ([ici](https://www.joda.org/joda-time/quickstart.html))
   - sexe d'un type énuméré Sexe avec comme valeurs possibles Homme, Femme et Complexe
2. Programmer le DAO pour avoir les opérations suivantes possibles
   - sauver une personne
   - récupérer les personnes d'un sexe fourni en paramètre
   - récupérer toutes les personnes
3. Illustrer le fonctionnement de ton code avec des tests unitaires utilisant une base de données en mémoire vive.

ATTENTION ! Il n'est pas nécessaire de faire une interface graphique, les tests sont suffisants

:::
