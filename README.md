# JeuDeBrique

Nous allons développer des classes pour générer les objets necessaire au développement d’un jeu de type casse brique. L'objectif est d'écrire les classes définies ci-dessous comme vue lors des cours.

1. Créer un package nommé ExamCnam

2. Créer la classe elementGraphique qui aura
- comme propriétés
nom de type String
hauteur de type int
largeur de type int
- comme méthodes :
afficher (fonction qui affichera dans la console ("Element affiché")
masquer (fonction qui affichera dans la console ("Element masqué")
description (fonction qui affichera dans la console ("Element graphique nommé : xxxxxx qui a zzz pixels de haut et zzz pixels de large" ou xxxxxx est le nom, yyy la hauteur et zzz la largeur).


3. Créer la classe elementFixe héritant de la classe elementGraphique qui aura en plus :
- comme propriété
positionX de type int (qui contient la position fixe X de l’élément)
positionY de type int (qui contient la position fixe Y de l’élément)

- comme méthodes :
afficher qui redéfinie celle de la classe mère : (fonction qui affichera dans la console ("Element fixe affiché")
description qui reprends la description héritée et ajoute en plus " qui est en position X aaaa et position Y bbbb" ou aaaa est la positionX et bbbb la positionY.

4. Créer la classe brique héritant de la classe elementFixe qui aura en plus :
- comme propriétés :
niveau de type int (2 pour brique pleine, 1 pour brique touchée une fois et abimée et 0 pour brique detruite)
aAfficher de type booléen qui dépends de la variable niveau (créer un mutateur qui l'alimente selon la règle (si niveau = 0 alors aAfficher = false sinon aAfficher = true)
- comme méthode :
estMoinsAbimeeQue : méthode qui a un objet de type Brique en entrée et qui renvoi un booléen à True si l'objet appelant à un niveau > niveau de l'objet passé en paramètre. On le mets à false sinon
description qui reprends la description héritée et ajoute en plus " dont le niveau est de ddd" ou ddd est le niveau.


5. Créer la classe mur héritant de la classe elementFixe qui aura en plus :
- comme propriété :
couleur de type String
- comme méthodes :
plusHautQue : méthode qui a un objet de type Mur en entrée et qui renvoi un booléen à True si l'objet appelant à un hauteur > hauteur de l'objet passé en paramètre. On le mets à false sinon
description qui reprends la description héritée et ajoute en plus " qui est de couleur ***" ou *** est couleur.

9. Créer une classe main qui va :

Instancier la classe elementGraphique en E1 avec un nom "balle" et une hauteur et largeur de 80

Instancier la classe elementFixe en F1 avec un nom "Titre", une hauteur de 40, une largeur de 1000, une positionX de 150 et positionY de 1300
Instancier la classe brique en B1 avec un nom "Brique 1"", une hauteur de 40, une largeur de 200, une positionX et positionY de 300
Instancier la classe brique en B2 avec un nom "Brique 2"", une hauteur de 40, une largeur de 200, une positionX de 700 et positionY de 300

Instancier la classe mur en M1 avec un nom "Mur 1", une hauteur de 40, une largeur de 20000, une positionX et positionY de 1 et une couleur "Bleu".
Instancier la classe mur en M2 avec un nom "Mur 2", une hauteur de 20000, une largeur de 40, une positionX et positionY de 1 et une couleur "Bleu".

Appeler la méthode description de E1
Appeler la méthode description de F1
Appeler la méthode description de B1


Appeler la méthode estMoinsAbimeeQue de B1 pour le comparer à B2
Appeler la méthode plusHautQue de M1 pour le comparer à M2 
