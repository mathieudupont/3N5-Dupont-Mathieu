---
title: Exceptions
description: Exception, try catch throw throws
hide_table_of_contents: true
---

# Semaine 5 : Exceptions, lancer throw(s) et attraper catch

## Contenu

Cette semaine nous discuterons d'abord de comment gérer des exceptions lancées par le code qu'on utilise. Plus précisement, nous parlerons des 2 choix principaux:

- Attraper une exception (catch d'un "try catch") : attraper l'exception et gérer la situation
- Laisser passer l'exception. On espère alors qu'une des méthodes de la pile d'appels va attraper.

Nous discuterons du fait qu'il faut attraper l'exception quelque part si on veut éviter un crash de l'application.

Finalement nous parlerons de la possibilité de définir des classes d'exceptions (il suffit d'étendre exception).

<Row>

<Column>

:::warning Avant la séance (2h)

Vous regarderez le projet **[demo exceptions](https://github.com/departement-info-cem/3N5-Prog3/tree/master/code/Demo_Exceptions)**

Vous pouvez chercher les TODOS pour trouver les explications importantes

:::

</Column>

<Column>

:::tip Vidéos

<Video url="https://youtu.be/bJ4MXns-aqo" />

:::

</Column>

<Column>

:::info À faire pendant la séance

- Compléter les exercices de la semaine
- Continuer le **[premier travail](../tp/tp1)** (à remettre très bientôt)

:::

</Column>

</Row>

:::note Exercices

### Exercice TrouveLaValeur

Vous devez écrire une classe appelée Trouveru. Cette classe doit contenir une méthode statique appelée trouve qui prend en paramètre

- un tableau de String (String[]): la tableau dans lequel on cherche
- un String: l'élément qu'on cherche

La méthode doit avoir le comportement suivant:

- si l'élément est dans le tableau, vous renvoyez l'index de la première cellule où il se trouve
- si l'élément n'est pas dans le tableau, vous lancez une exception. Vous devez définir la classe d'exception dans une classe et choisir un nom d'exception significatif.

Finalement vous devez démontrer le fonctionnement de votre code dans une classe App avec un appel normal (où on trouve l'élément) et un appel exceptionnel (qui lance l'exception).

### Exercice Bon ✔️ ou Non ❌

Voici des situations. Dites si le code est bon, ou pas, et pourquoi en 1 ligne

#### Exemple 1

```java
public void uneFonction(){
	try {
		//du code…
	} catch (Exception e){
		System.out.println("Erreur : " + e);
	} catch (ArrayOutOfBoundsException a){
		System.out.println("Erreur : " + a);
	}
}
```

#### Exemple 2

```java
public void calculerPoidsSupernova() {
	try {
		//calculs compliqués...
	} catch (NumberFormatException e) {}
}
```

### Exercice Attrape 🎣 ou Transmet 📡 ?

Voici des situations. Dites si on devrait attraper (**catch**) ou transmettre (**throws**) et pourquoi

#### Exemple 1

```java
public static void main() {
	try {
		calcul();
		lireFichier();
	} catch (ArithmeticException a) {
		println("Problème dans les valeurs du calcul");
	} catch (IllegalArgumentException i ) {
		println("Problème dans les paramètres du programme");		
	} catch (InterruptedException t){
		println("Problème avec le thread en cours");	
	}
}

public static void lireFichier(){
	// Code qui lit un fichier...
    // highlight-next-line
	// Q : Catch ou Throws?
}
```

#### Exemple 2

```java
public static void main( String[] args ){
	List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
	List<List<Integer> > lists = Lists.partition(myList, -1);
			
	// Ce code utilise la librairie Guava.
    // highlight-next-line
	// Q : Catch ou Throws?
}
```

#### Exemple 3

```java
public void uneFonction(){
	etape1();
	etape2();
	etape3();
	etape4();
	etape5();
}

public void etape3(){
	//Code qui génère une exception
    // highlight-next-line
	// Q : Catch ou Throws?
}
```

### Exercice Jimmy et Johnny 👨‍🎤👨‍💼

Jimmy et Johnny se chicanent depuis 10 ans. Chacun a écrit une méthode afin de lire un fichier. Jimmy dit que les deux méthodes sont équivalentes alors que Johnny dit que le résultat n'est pas le même. Qui a raison et pourquoi?

Testez le [code](https://github.com/departement-info-cem/3N5-Prog3/tree/master/code/Demo_Exceptions/src/main/java/sabourin/exercices) pour démontrer si les méthodes sont pareilles ou non.

```java
public static void lireDesFichiersJimmy(){
    for (int i = 0 ; i < 10 ; i++ ){
        try {
            lireFichier(i); 
        } catch (FileNotFoundException e) {
            System.out.println("fichier n'existe pas");
        }
    }
}

public static void lireDesFichiersJohnny(){
    try {
        for (int i = 0 ; i < 10 ; i++ ){
            lireFichier(i); 
        }
    } catch (FileNotFoundException e) {
        System.out.println("fichier n'existe pas");
    }
}	
```

:::
