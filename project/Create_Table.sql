CREATE TABLE `bucatar` (
  `id_bucatar` int NOT NULL AUTO_INCREMENT,
  `nume` varchar(45) NOT NULL,
  `prenume` varchar(45) NOT NULL,
  `gen` varchar(45) NOT NULL,
  `varsta` int NOT NULL,
  `salariu` int NOT NULL,
  `vechime` int NOT NULL,
  `ani_experienta` int NOT NULL,
  `nivel_indemanare` int NOT NULL,
  PRIMARY KEY (`id_bucatar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `client` (
  `id_client` int NOT NULL AUTO_INCREMENT,
  `nume` varchar(45) NOT NULL,
  `prenume` varchar(45) NOT NULL,
  `gen` varchar(45) NOT NULL,
  `varsta` int NOT NULL,
  `in_asteptare` tinyint NOT NULL,
  `nr_comanda` int NOT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `comanda` (
  `numar_comanda` int NOT NULL AUTO_INCREMENT,
  `timp_preparare` int NOT NULL,
  `nr_produse` int NOT NULL,
  PRIMARY KEY (`numar_comanda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `local` (
  `id_local` int NOT NULL AUTO_INCREMENT,
  `livreaza_drumuri_bune` tinyint NOT NULL,
  `livreaza_localitati_periculoase` tinyint NOT NULL,
  `nume` varchar(45) NOT NULL,
  `adresa` varchar(45) NOT NULL,
  `nr_angajati` int NOT NULL,
  `nr_clienti` int NOT NULL,
  `stele` float NOT NULL,
  `nr_minim_populatie` int NOT NULL,
  PRIMARY KEY (`id_local`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `localitate` (
  `id_localitate` int NOT NULL AUTO_INCREMENT,
  `denumire` varchar(45) NOT NULL,
  `nr_locuitori` int NOT NULL,
  `drumuri_bune` tinyint NOT NULL,
  `periculoasa` tinyint NOT NULL,
  `localitatecol` varchar(45) NOT NULL,
  PRIMARY KEY (`id_localitate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `mancare` (
  `id_mancare` int NOT NULL AUTO_INCREMENT,
  `dificultate` int NOT NULL,
  `denumire` varchar(45) NOT NULL,
  PRIMARY KEY (`id_mancare`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `sofer` (
  `id_sofer` int NOT NULL AUTO_INCREMENT,
  `nume` varchar(45) NOT NULL,
  `prenume` varchar(45) NOT NULL,
  `gen` varchar(45) NOT NULL,
  `varsta` int NOT NULL,
  `salariu` int NOT NULL,
  `vechime` int NOT NULL,
  `vehicul` varchar(45) NOT NULL,
  `experienta` int NOT NULL,
  `in_cursa` tinyint NOT NULL,
  PRIMARY KEY (`id_sofer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `food_delivery`.`bucatar`
(`id_bucatar`,
`nume`,
`prenume`,
`gen`,
`varsta`,
`salariu`,
`vechime`,
`ani_experienta`,
`nivel_indemanare`)
VALUES
("Daniel",
"Catalin",
"Masculin",
50,
5000,
20,
20,
7);
INSERT INTO `food_delivery`.`bucatar`
(`id_bucatar`,
`nume`,
`prenume`,
`gen`,
`varsta`,
`salariu`,
`vechime`,
`ani_experienta`,
`nivel_indemanare`)
VALUES
("Mihai",
"Pascu",
"Masculin",
26,
2500,
7,
7,
4);

INSERT INTO `food_delivery`.`bucatar`
(`id_bucatar`,
`nume`,
`prenume`,
`gen`,
`varsta`,
`salariu`,
`vechime`,
`ani_experienta`,
`nivel_indemanare`)
VALUES
("Darius",
"Marin",
"Masculin",
20,
1500,
0,
2,
2);

INSERT INTO `food_delivery`.`client`
(`nume`,
`prenume`,
`gen`,
`varsta`,
`in_asteptare`,
`nr_comanda`)
VALUES
("Dorian",
"Popa",
"Masculin",
32,
1,
255);
INSERT INTO `food_delivery`.`client`
(`nume`,
`prenume`,
`gen`,
`varsta`,
`in_asteptare`,
`nr_comanda`)
VALUES
("Tudor",
"Marcel",
"Masculin",
20,
0,
225);
INSERT INTO `food_delivery`.`client`
(`nume`,
`prenume`,
`gen`,
`varsta`,
`in_asteptare`,
`nr_comanda`)
VALUES
("Vali",
"Cristi",
"Masculin",
45,
0,
1017);



