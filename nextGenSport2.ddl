ALTER TABLE DescrizioneCorso DROP FOREIGN KEY FKDescrizion753301;
DROP TABLE IF EXISTS TipologiaCorso;
DROP TABLE IF EXISTS DescrizioneCorso;
CREATE TABLE TipologiaCorso (ID varchar(255) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE DescrizioneCorso (ID varchar(255) NOT NULL, TipologiaCorsoID varchar(255), Prenotazione tinyint(1), PRIMARY KEY (ID)) ENGINE=InnoDB;
ALTER TABLE DescrizioneCorso ADD INDEX FKDescrizion753301 (TipologiaCorsoID), ADD CONSTRAINT FKDescrizion753301 FOREIGN KEY (TipologiaCorsoID) REFERENCES TipologiaCorso (ID);
