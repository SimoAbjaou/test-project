# TEST JAVA

Requirements
============

* JAVA >= 8

Installation
============

* Récupérater le fichier « adneom-project-1.0-Release.jar » disponible dans le répertoire "test-project/target/" du livrable.

* Importer et ajouter le jar dans le build path du votre projet java en tant que jar externe.

Usage
=====

* Ajouter « import org.adneom.ListPartition; » dans votre classe java .

* signature de la méthode : ListPartition.partition(List<Integer> arg0, Integer arg1)
  
Exemple
=======
  
* partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ] 
* partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ] 
* partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]


Author
=======

* Mohamed Abjaou

