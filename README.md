
# 🧮 Gestion des fichiers

## 📘 Description

Ces projets Java illustrent les principes fondamentaux de la programmation orientée objet et de la manipulation de fichiers, appliqués à des cas concrets de traitement de données :

- Encapsulation des données dans des objets sérialisables

- Sérialisation et désérialisation d’objets complexes

- Lecture et écriture de fichiers texte et CSV avec validation

- Agrégation d’objets dans des collections typées

- Journalisation horodatée avec niveaux de gravité

- Génération de contenu HTML structuré avec flux de sortie

- Organisation modulaire et séparation des responsabilités

## 📂 Project Structure
````
projets/
├── Exercice1/
│   ├── CsvParser.java
│   ├── ObjectSerializer.java
│   ├── Record.java
│   ├── TextReader.java
│   ├── TextWriter.java
│   └── Main.java
├── Exercice2/
│   ├── CsvWriter.java
│   ├── HtmlGenerator.java
│   ├── LogManager.java
│   └── Main.java
└── README.md
````


## ⚙️ Features

### **1.** TpFichier – Lecture, filtrage et sérialisation de données 
Classe Record

- Attributs privés : id, name, score

Méthodes :

- getId() : retourne l’identifiant

- getName() : retourne le nom

- getScore() : retourne le score

- toString() : retourne une ligne CSV formatée

Classe CsvParser

Méthodes statiques :

- readCsv(path) : lit un fichier CSV et retourne une liste de Record

- writeCsv(records, path) : écrit une liste de Record dans un fichier CSV

Classe ObjectSerializer

Méthodes statiques :

- serialize(data, path) : sérialise une liste de Record dans un fichier

- deserialize(path) : désérialise une liste de Record depuis un fichier

Classe TextReader

- Méthode statique :

- readLines(path) : lit et affiche les lignes d’un fichier texte

Classe TextWriter

- Méthode statique :

- copyWithSummary(src, dest) : copie un fichier ligne par ligne et ajoute un résumé

### **2.** TpGeneration – Génération de fichiers CSV, HTML et journalisation 
Classe CsvWriter

Méthode statique :

- writeCsv(path, header, rows) : écrit un fichier CSV avec en-tête et lignes de données

Classe HtmlGenerator

Méthode statique :

- writeHtml(path, pageTitle, bodyText) : génère une page HTML avec titre et paragraphe

Classe LogManager

- Attribut privé : logPath

Méthode :

- log(level, message) : ajoute une ligne de log horodatée dans le fichier
## 🖥️ Example Execution


### Séparer proprement une classe unique :

### Mini-bibliothèque géométrique : 

### Création d’une librairie statique (.a) ou partagée (.so) :

### Classe template et fichier d’en-tête uniquement :


## 💡 Concepts Practiced

- Utiliser les flux de lecture et d’écriture pour manipuler des fichiers

- Sérialiser des objets avec ObjectOutputStream et les restaurer avec ObjectInputStream

- Générer des fichiers structurés (CSV, HTML) avec PrintWriter

- Organiser les classes selon le principe de responsabilité unique

- Implémenter une journalisation simple avec horodatage et niveaux

- Manipuler des collections typées pour filtrer et transformer les données
## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Programmation orientée objet : java
- 🎓 Instructor	Mr.LACHGAR
- 📅 09	novembre 2025
