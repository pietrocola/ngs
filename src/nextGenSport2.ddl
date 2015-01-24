ALTER TABLE DescrizioneCorso DROP FOREIGN KEY FKDescrizion206888;
DROP TABLE IF EXISTS TipologiaCorso;
DROP TABLE IF EXISTS DescrizioneCorso;
CREATE TABLE TipologiaCorso (NomeTip varchar(255) NOT NULL, PRIMARY KEY (NomeTip)) ENGINE=InnoDB;
CREATE TABLE DescrizioneCorso (NomeCorso varchar(255) NOT NULL, TipologiaCorsoNomeTip varchar(255), Prenotazione tinyint(1) NOT NULL, PRIMARY KEY (NomeCorso)) ENGINE=InnoDB;
ALTER TABLE DescrizioneCorso ADD INDEX FKDescrizion206888 (TipologiaCorsoNomeTip), ADD CONSTRAINT FKDescrizion206888 FOREIGN KEY (TipologiaCorsoNomeTip) REFERENCES TipologiaCorso (NomeTip);
