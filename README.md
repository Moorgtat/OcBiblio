# Projet 7 : OcBiblio
Mon système de gestion de Bibliothèque OC.

# Features
* Se Connecter
* Rechercher de Livres
* Ajout de Livre
* Gestion de Prêt de Livre
* Limite de Prêt de livre
* Limite de Prolongation de Prêt
* Rendre un Livre
* Affichage des emprunts en cours pour chaque User
* Affichage d'un message lorsque la date limite d'un prêt est 
  passé 
* Site Web Responsive  

#Technologies utilisées :
Architecture Microservice autour de l'écosystème SPRING avec une
Interface Utilisateur développé sous VUE.js.

* Spring Boot
* Spring Data
* Spring Cloud 
* Vue.JS 
* Vue Material 
* MySQL (MySQL WorkBench)
* Axios

#Installation
Réaliser un gitclone du projet dans votre repertoire de travail à 
partir de ce lien : "https://github.com/Moorgtat/OcBiblio.git". 

L'importer dans IntelliJ Idea.

Executer le script SQL fourni via un editeur SQL. 

La BDD est créée ainsi que les tables du projet.

Modifier le fichier application.properties à la racine du projet:
"spring.datasource.url=" => Entrez le lien vers la BDD créée 
"spring.datasource.username=" => Entrez votre username 
"spring.datasource.password=" => Entrez votre Mot de passe

Démarrez chaque microservices ainsi que L'UI avec la commande 
"npm run dev".

#Se connecter
* Nom d'utilisateur : Mathieu Mdp: 1111 
* Nom d'utilisateur : Elorna Mdp: 2222
* Pour se connecter avec d'autres utilisateur se référer à la table 
"user" dans la Bdd.

#Auteur
Mathieu Le Cardinal dans le cadre de sa formation developpeur JAVA 
chez OpenClassroom.