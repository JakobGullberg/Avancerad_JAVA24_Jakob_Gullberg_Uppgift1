Virtuell Fordonuthyrning
Projektbeskrivning
Detta projekt är en konsolbaserad applikation för att hantera fordonuthyrningstjänster. Applikationen simulerar ett system där användare kan hyra olika typer av fordon, returnera dem och få en sammanställning av hyreskostnaden. Den är byggd i Java och demonstrerar objektorienterade principer såsom abstraktion, arv, inkapsling, och interfaces.

Syftet med projektet är att ge användaren möjlighet att interagera med systemet via ett textbaserat gränssnitt, välja ett fordon, ange hyresdagar och beräkna kostnaden för hyran. Applikationen använder olika klasser och interfaces för att organisera kod och göra systemet skalbart och flexibelt.

Följande fordonstyper finns i applikationen:

Bil (Car)
SUV (Sport Utility Vehicle)
Lastbil (Truck)
Motorcykel (Motorcycle)
Applikationen hanterar inte bara fordonens data utan erbjuder också olika kostnadsberäkningsstrategier som kan appliceras beroende på typ av fordon eller uthyrningens längd.

Funktionalitet
Hyra ett fordon.
Returnera ett fordon.
Beräkna hyreskostnad baserat på fordonstyp och hyresdagar.
Flexibla kostnadsstrategier beroende på fordonstyp.
Teknisk Beskrivning
Projektet är byggt med Java och utnyttjar flera objektorienterade principer:

Abstraktion: Genom den abstrakta klassen Vehicle döljs detaljer om fordonets egenskaper, vilket gör koden mer hanterbar.
Arv: De specifika fordonstyperna ärver från bas-klassen Vehicle, vilket gör att vi kan återanvända gemensam funktionalitet.
Inkapsling: Attributen i klasserna är privata, vilket gör att de inte kan ändras direkt utifrån utan måste hanteras genom getter och setter-metoder.
Interfaces: Rentable definierar metoder för att hyra och returnera fordon samt beräkna kostnader. Genom att använda interfaces gör vi koden mer flexibel och lätt att underhålla.
Så här ställer du in och kör applikationen

Installation;
Kloning av projektet:

För att klona repositoryt, öppna en terminal och kör följande kommando:
git clone https://github.com/JakobGullberg/VirituellFordonuthyrning.git
Byt ut ditt-användarnamn mot ditt faktiska GitHub-användarnamn.
Navigera till projektmappen:

Gå till den klonade mappen:
Komplettera beroenden (om det behövs):


Exempel på hur mitt användargränssnitt ser ut:
Välj ett fordon att hyra:
1. Bil
2. SUV
3. Lastbil
4. Motorcykel
Ange ditt val: 1

Ange antal hyresdagar: 5

Totalkostnad för hyra av Bil: 500 kr
