# Gestione_zoo

Questo progetto in Java simula la gestione di un piccolo **zoo virtuale**, con animali che possono essere nutriti e che hanno un fabbisogno alimentare giornaliero calcolato in base alla loro età.

## 📁 Struttura del Progetto

Il progetto contiene le seguenti classi:

### 🧱 Classi principali

- **Animal (abstract)**:  
  Classe astratta che rappresenta un animale generico, con nome e età.  
  - Metodo astratto: `calculateDailyFoodRequirement()`
  - Override di `toString()` per descrivere l'animale.
  - Lancia un'eccezione `InvalidAgeException` se l'età è negativa.

- **Lion** e **Elephant**:  
  Estendono `Animal` e implementano l'interfaccia `Feedable`.  
  Definiscono il comportamento di alimentazione e il calcolo del fabbisogno alimentare:
  - Leone: `età * 5.0` kg
  - Elefante: `età * 50.0` kg

- **Feedable (interfaccia)**:  
  Interfaccia per animali che possono essere nutriti.  
  - Metodo: `String feed()`

- **InvalidAgeException**:  
  Eccezione personalizzata per gestire animali con età non valida.

### 🦁 Zoo<T extends Animal>

Classe generica che gestisce una lista di animali:
- `addAnimal()`, `removeAnimal()`
- `listAnimals()`: stampa gli animali e le info sul loro nutrimento
- `getAnimals()`: restituisce la lista

## 🚀 Esecuzione

Il file `Main` crea un oggetto `Zoo`, aggiunge un leone e un elefante, e stampa le informazioni su ciascun animale.

Esempio di output:
- Lion [Name=Leo, age=4, KG=20.0] Leo,il nostro leone, va nutrito con carne fresca e di qualità(leone raffinato) 
- Elephant [Name=Elephant, age=5, KG=250.0] Elephant,il nostro elefante, mangia qualsiasi cosa(menomale)

## 📌 Note

- Il codice utilizza **Generics** per rendere lo zoo riutilizzabile con qualsiasi sottoclasse di `Animal`.
- È gestito il caso di età negativa tramite eccezione personalizzata.
- Il comportamento di nutrizione è **polimorfico** tramite l'interfaccia `Feedable`.

## ✅ Requisiti

- Java 8+
- Compilazione con `javac` o qualsiasi IDE Java (es: IntelliJ, Eclipse)

## 🐘🦁 Autore

Progetto didattico per imparare l’uso di:
- Classi astratte
- Interfacce
- Eccezioni personalizzate
- Generics
- Override di metodi
