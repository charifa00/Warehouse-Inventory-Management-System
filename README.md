1-Pourquoi avez-vous choisi un HashMap pour stocker les informations des produits ? Quels sont ses avantages par rapport à d'autres structures de données ?
      Le HashMap est choisi pour stocker les produits par leur identifiant (ID) car il permet un accès rapide aux informations d'un produit via une recherche par clé.
Avec un HashMap, la recherche, l'insertion et la suppression d'un élément se font en moyenne en temps constant O(1), ce qui est particulièrement efficace pour 
les opérations de consultation rapide des produits par leur ID. Comparé à d'autres structures comme les listes (ArrayList ou LinkedList), 
un HashMap est plus performant pour des recherches par clé unique.

2-Comment l'utilisation d'une ArrayList pour les expéditions quotidiennes aide-t-elle à maintenir l'ordre d'arrivée ?
      Une ArrayList conserve l'ordre d'insertion des éléments, ce qui la rend adaptée pour enregistrer les expéditions quotidiennes dans l'ordre où les produits arrivent.
Lorsque les produits sont ajoutés à la ArrayList au fur et à mesure de leur réception, l'ordre d'arrivée est maintenu automatiquement. 
Lorsqu'il faut afficher les produits dans l'ordre d'arrivée, il suffit de parcourir la liste. Par ailleurs, l'accès par index dans une ArrayList est rapide, 
ce qui simplifie la gestion des expéditions.

3-Quels changements feriez-vous si les produits devaient être triés à la fois par nom et par ID ?
Si les produits devaient être triés par nom et id, en cas d'égalité, par ID, on pourrait utiliser un TreeSet avec un Comparator personnalisé pour gérer cet ordre de tri.
Le Comparator pourrait d'abord comparer les noms et l'ID, si ceux-ci sont identiques, comparer les identifiants. Une alternative serait d'utiliser
une ArrayList pour les produits et d'utiliser Collections.sort() avec un Comparator adapté chaque fois qu'un tri est nécessaire. Cette approche permettrait
de gérer les tris multiples sans modifier les structures de données sous-jacentes.

4-Que feriez-vous différemment si les produits pouvaient avoir des IDs non uniques ou si les expéditions devaient être suivies avec des horodatages ?
*-IDs non uniques : Si les produits peuvent avoir des IDs non uniques, un HashMap ne serait plus adapté car il exige des clés uniques.
Dans ce cas, une List ou une Map de type Map<String, List<Product>> pourrait être utilisée, où la clé est le nom ou un autre attribut unique du produit, 
et la valeur est une liste de produits ayant le même ID.
*-Suivi des expéditions avec horodatages : Pour enregistrer les expéditions avec un horodatage, on pourrait utiliser une LinkedHashMap pour stocker
chaque produit reçu avec son horodatage en tant que clé ou valeur (selon les besoins). Une autre option serait de créer une classe ShipmentEntry contenant un produit
et un horodatage, puis de stocker chaque expédition comme un objet ShipmentEntry dans une ArrayList.

*************Choix et implémentation des structures de données ********
HashMap<Integer, Product> : Pour stocker les produits par ID pour un accès rapide.
ArrayList<Product> pour les expéditions quotidiennes : Enregistre les produits dans l'ordre d'arrivée.
TreeSet<Product> pour trier par nom : Permet de maintenir un ensemble trié par ordre alphabétique .
