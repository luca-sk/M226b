# M226b


## 1 Teilnehmer/innen des Teams:
| Klasse | Team |
| ------------- | ------------- |
| BI17a  | Luca Kiefer, Haris Chandrakumar |



## 2 Anforderungsdefinition
| Klasse | Team |
| ------------- | ------------- |
| Auftrag  | Nutzen: Retro Spiel das gegen Langeweile hilft und Spass macht einen hohen Score zu erzielen.Szenario:Beim Spiel Snake geht es darum, dass man Früchte sammelt und grösser wird. Gleichzeitig muss man darauf achten, dass man mit dem Kopf der Schlange nichtden eigenen Körper berührt. Beim Sammeln der Früchte kriegt man Punkte das Ziel ist ein hohes Highscore zu erreichen.Details:Es soll wachsen könnenEs soll einen Gegner habenEs soll einen Score Zähler habenMachbarkeitsabklärung: |
| Muss Kriterien  | Folgende Features sollen implementiert werden (Funktionalität):Es muss wachsen könnenEs muss einen Gegner habenEs muss einen Score Zähler habenEs muss Früchte zufällig generieren |
| Kann Kriterien  | Folgende Features können zusätzlich implementiert werden: (Kreativität)Es kann Hintergrund Musik habenEs kann verschiedene Level habenEs kann Gegner geben, die die Schlange verfolgen |

### 2.1 Planung LB2
| MS | Tätigkeit/Abgabe | Soll-Datum | Ist-Datum |
| ------------- | ------------- | ------------- | ------------- |
| A | Projektstart Team BildungWahl / Ausarbeitung der AnforderungsdefinitionAbnahme Anforderungsdefinition durch Lehrperson | x | x |
| B | Teamaufgabe 1:Abgabe: Lösungsdesign (Analyse, Design: Funktionsmodell,UseCase, GUI, Storyboard) | x | x |
| B2 | Teamaufgabe 2:Abgabe: Testvorschrift und Testfälle | x | x |
| C | Einzelaufgabe 3:Abgabe Szenario (.zip) mit Inline-Dokumentation, Systemdokumentation(UML Klassen-, Sequenzdiagramm)Fachgespräch Projektabnahme | x | x |
| C2 | Einzelaufgabe 4:Abgabe: Ausgefüllter Systemtest | x | x |


## 3 Anforderungsdefinition (Meilenstein B: Teamaufgabe 1)
Anhand der Analyse wurde folgendes Lösungsdesign entworfen:


### 3.1 Funktionsmodell
Im Folgenden sind die erwarteten Eingaben und Ausgaben beschrieben / dargestellt:

BILD

Legende: 
* Eingabe: Benutzer startet das Spiel per Mausklick auf Run
* Ausgabe: Das Spiel beginnt mit einer kleinen Schlange
Simulation / Funktionalität:
Simulation / Funktionalität:
* Eine Zufällige Frucht wird generiert
* Die Schlange kann mit den Pfeiltasten gesteuert werden 
* Man kann gar nicht in die entgegengesetzte Richtung mit der Schlange wechseln
* Isst die Schlange eine Frucht wächst Sie
* Wurde die Frucht gegessen erscheinen weitere
* Berührt die Schlange mit dem Kopf den Eigenen Körper stirbt Sie.

### 3.2 Anwendungsfall (UseCases)
Folgende Anwendungsfälle sind hier detailliert dokumentiert:
Legende: 

BILD

Akteur User: 
* Der Benutzer (externer User an Greenfoot-Konsole) öffnet und startet ein Szenario
* Der Benutzer steuert die Schlange
* Er kann Sie mit der Pfeiltaste steuern.

Snake: 
* Zu Beginn wird eine Frucht erzeugt und in der Welt positioniert.
* Die Schlange bewegt sich konstant 
* Wenn eine Frucht gegessen wurde wächst die Schlange
* Geschwindigkeit bleibt gleich.
* Das Szenario wird dann gestoppt wenn die Schlange mit dem Kopf seinen eigenen Körper berührt.06.12.2020 19:56:00Seite 4 von 6TBZ Technische Berufsschule Zürich





