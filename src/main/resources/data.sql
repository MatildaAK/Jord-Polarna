INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 1')
INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 2')
INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 3')

-- Questions lvl 1
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Oj! Här har någon slängt en glasburk i buskarna.   Vart ska glasburken egentligen slängas?', 2, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Den här tomma plastflaskan ska inte vara här! Vart ska den tomma plastflaskan vara?', 7, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Nämen, här har någon lagt batterier i en soptunna för matavfall. Vart borde batterierna slängas?',  9, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Vad gör en tom kaviartub på skolgården? Här ska den ju inte vara! Den tomma kaviartuben ska vara i: ',  15, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Det här glasspappret måste legat bredvid busskuren sedan snön smälte. Vi lägger det istället där det ska vara vilket är: ', 17, 1)

-- Questions lvl 2
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Upp och hoppa, det är strålande solsken och en ny veckodag! Hur ska vi ta oss till skolan idag? ', 21, 2)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Det är så många kompisar vi vill träffa och prata med! Hur kan vi göra det när vi är på till skolan eller på väg hem från skolan? ', 24, 2)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Äntligen helg och nu ska vi iväg på fotbollsmatch med laget! Matchen ligger en bit bort från där vi bor. Hur tar vi oss till fotbollsmatchen? ',  30, 2)

-- Answers question 1 lvl 1
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) VALUES ('batterikärl.png','Batterikärl', 1)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('glaskärl.png','Glaskärl', 1)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('buske.png','Buske', 1)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('lekplats.png','Lekplats', 1)

-- Answers question 2 lvl 1
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) VALUES ('parkbänk.png','Parkbänk', 2)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('buske.png','Buske', 2)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('plastkärl.png','Plastkärl', 2)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('lekplats.png','Lekplats', 2)

-- Answers question 3 lvl 1
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) VALUES ('batterikärl.png','Batterikärl', 3)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('lekplats.png','Lekplats', 3)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('plastkärl.png','Plastkärl', 3)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('skräpkärl.png','Skräpkärl', 3)

-- Answers question 4 lvl 1
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) VALUES ('batterikärl.png','batterikärl', 4)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('parkbänk.png','Parkbänk', 4)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('metallkärl2.png','Metallkärl', 4)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('lekplats.png','Lekplats', 4)

-- Answers question 5 lvl 1
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) VALUES ('sopkorg.png','Sopkorg', 5)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('glaskärl.png','Glaskärl', 5)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('buske.png','Buske', 5)
INSERT INTO ANSWER(PICTURE,ALT, PAGE_ID) values ('plastkärl.png','Plastkärl', 5)


