INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 1')
INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 2')
INSERT INTO GAMELEVEL (NAME) VALUES ('LEVEL 3')

-- Questions lvl 1
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Oj! Här har någon slängt en glasburk i buskarna.   Vart ska glasburken egentligen slängas?', 2, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Den här tomma plastflaskan ska inte vara här! Vart ska den tomma plastflaskan vara?', 5, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Nämen, här har någon lagt batterier i en soptunna för matavfall. Vart borde batterierna slängas?',  4, 1)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Vad gör en tom kaviartub på skolgården? Här ska den ju inte vara! Den tomma kaviartuben ska vara i: ',  5, 2)
INSERT INTO PAGE (QUESTION , CORRECTANSWER, GAME_LEVEL_ID) VALUES ( 'Det här glasspappret måste legat bredvid busskuren sedan snön smälte. Vi lägger det istället där det ska vara vilket är: ', 5, 2)

-- Answers question 1 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) VALUES ('På gatan', 1)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Glasåtervinning', 1)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('Skogen', 1)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('I sjön', 1)

-- Answers question 2 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('3', 2)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('5', 2)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('7', 2)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('2', 2)

-- Answers question 3 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('3', 3)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('5', 3)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('7', 3)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('2', 3)

-- Answers question 4 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('3', 4)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('5', 4)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('7', 4)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('2', 4)

-- Answers question 5 lvl 1
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('3', 5)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('5', 5)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('7', 5)
INSERT INTO ANSWER(ANSWER, PAGE_ID) values ('2', 5)

