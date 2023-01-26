INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 1')
INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 2')
INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 3')

-- Questions lvl 1
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Oj! Här har någon slängt en glasburk i buskarna.   Vart ska glasburken egentligen slängas?', 2, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Den här tomma plastflaskan ska inte vara här! Vart ska den tomma plastflaskan vara?', 7, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Nämen, här har någon lagt batterier i en soptunna för matavfall. Vart borde batterierna slängas?',  9, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Vad gör en tom kaviartub på skolgården? Här ska den ju inte vara! Den tomma kaviartuben ska vara i: ',  15, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Det här glasspappret måste legat bredvid busskuren sedan snön smälte. Vi lägger det istället där det ska vara vilket är: ', 17, 1)

-- Answers question 1 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) VALUES ('batterikärl.png', 1)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('glasskärl.gif', 1)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('lekplats.png', 1)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('buske.png§', 1)

-- Answers question 2 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('På parkbänken', 2)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Skogen', 2)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Behållaren för plastförpackningar på återvinningsstationen', 2)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('På gatan', 2)

-- Answers question 3 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('En låda för småbatterier som man sen lämnar på en återvinningscentral eller i soprummet', 3)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi låter batterierna ligga kvar i soptunnan för matavfall', 3)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('I sopkorgen bredvid busskuren', 3)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('I sjön', 3)

-- Answers question 4 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Naturen', 4)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Ingenstans. Jag låter tuben ligga kvar.', 4)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Behållaren för metallförpackningar.', 4)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Skogen', 4)

-- Answers question 5 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Sopkorgen bredvid busskuren', 5)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Gräset', 5)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Lådan för småbatterier', 5)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Kartongåtervinningen', 5)


-- Questions lvl 2
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Upp och hoppa, det är strålande solsken och en ny veckodag! Hur ska vi ta oss till skolan idag? ', 21, 2)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Det är så många kompisar vi vill träffa och prata med! Hur kan vi göra det när vi är på till skolan eller på väg hem från skolan? ', 24, 2)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Äntligen helg och nu ska vi iväg på fotbollsmatch med laget! Matchen ligger en bit bort från där vi bor. Hur tar vi oss till fotbollsmatchen? ',  30, 2)

-- Answers question 1 lvl 2
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi promenerar eftersom skolan ligger nära.', 6)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi cyklar eftersom skolan ligger nära.', 6)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi ber våra föräldrar skjutsa oss med bilen', 6)

-- Answers question 2 lvl 2
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi tar en promenad till skolan.', 7)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi åker bil till skolan.', 7)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi cyklar till skolan.', 7)

-- Answers question 3 lvl 2
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Varje lagkamrats förälder kör till idrottsplatsen.', 8)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi samlas vid en plats i närheten av där vi bor och åker gemensamt.', 8)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi åker tillsammans med laget buss eller tåg till idrottsplatsen.', 8)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Vi cyklar till idrottsplatsen.', 8)
