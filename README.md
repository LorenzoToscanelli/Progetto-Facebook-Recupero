# Progetto-Tosco-Sona-2
Review del vecchio progetto
# FUNZIONAMENTO

La nostra applicazione permette di effettuare delle statistiche su Post di un utente Facebook, collegandosi con la API di Facebook.
Le statistiche, nello specifico, riguardano la lunghezza del Post, la presenza di Hashtag e la presenza di testo esclusivamente in maiuscolo.

Mediante l'utilizzo di SpringBoot è stato possibile effettuare delle richieste di POST o GET con rotte distinte, restituendo:
- Metadati, in formato JSON (ovvero le informazioni generali di un post);
- Dati, in formato JSON (ovvero le informazioni specifiche di ogni post);
- Dati filtrati, in formato JSON;
- Statistiche sulle lunghezze dei post (media, massimo e minimo);
- Statistiche sulla presenza di hashtag in un post;
- Statistiche sulla presenza di testo esclusivamente in maiuscolo in un post;

# ESECUZIONE RICHIESTE

Per eseguire le richieste, dopo aver fatto partire l'applicazione, si possono effettuare attraverso un API testing.
Le richieste possibili sono:
- GET /Metadata               , dove restituisce in formato JSON i dati generali di un post;
- GET /Data                   , dove restituisce in formato JSON i dati specifichi di ogni post;
- GET /Stats                  , dove restituisce in formato JSON tutte le statistiche dei post;
- GET /Stats/Lunghezze        , dove restituisce in formato JSON tutte le statistiche relative alla lunghezza dei post;
- GET /Stats/Others           , dove restituisce in formato JSON tutte le statistiche relative alla presenza di Hashtag o testo esclusivamente in maiuscolo;
- POST /Filtri/Lunghezze      , dove filtra i post attraverso tre operazioni;
- POST /Filtri/Hashtag        , dove filtra i post attraverso la presenza di hashtag;

# FILTRI
Filtri per lunghezze:
- min : restituisce i post con messaggio minore della media di tutti i post;
- max : restituisce i post con messaggio maggiore della media di tutti i post;
- equals : restituisce i post con messaggio di uguale lunghezza della media di tutti i post;

Filtri per hashtag:
- checkhashtag : restituisce i post nella quale sono presenti hashtag;
# SOFTWARE UTILIZZATI

- Eclipse       (per sviluppare il codice)
- Postman       (per effettuare call)
- Spring Boot   (per poter effettuare le chiamate di GET o POST)

# NOTE
AccessToken Matteo Sonaglioni : EAAjCznvVZCs4BAOlZAuzJHaj0tPkwkDfNyLjC6e1IzOtg2aopEwVfCTPGc2cLQeioMX8dUoRFQvWX503YFKwcUgVL525BXEeONybbcIiJi4SbZCYCVXd6myUouIcZB75YTbJ0AGcZAS7M6vspZAbilnqpWezMvK4SKeZAfeAtTZASQZDZD

AccessToken Lorenzo Toscanelli : EAAKdS6UMQ6QBAMb3oNDOmZA1n7e2ZAoAGkJcbmDfuKtKnIDX4C4gZBIsSmhaCbYOUUuG3PPSLovKG36tPeyAyiNyHuedicxd8DDlfKwUVZCny8crH27QYQ94tZAn0kZB4OarWnwim7QcZA9v9AXWX17gFqduUlmZCMIFgAfIsuZCZBcwZDZD

AccessToken Account Test : EAAksDd12x1IBAGLtHsZAwciowEAumusjZBCJ2PhiP7xrjJkacNkLx1ZClJPZAaCzF1CYGhDrvDkvariE3woT3qk1t0nvBzPVAOTmoZBVNNlCeygH2DoFSvAj6v03GHzIKIlHzOaZAJJoYZBua0YRRJHTiOlNEltIl7nhSo2gZA9BLpdrTFS0vnZBJ

Alcune librerie fanno parte di restfb.jar, quindi questo jar esterno deve essere incluso nelle librerie del progetto.
Download: https://restfb.com/

# AUTORI

Matteo Sonaglioni,
Lorenzo Toscanelli
