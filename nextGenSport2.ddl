CREATE TABLE SalaPesi (ID varchar(255) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE CategoriaCliente (ID varchar(255) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE DescrizioneAbbonamento (ID varchar(255) NOT NULL, PrezzoBaseMensile float NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE PoliticaScontoAbbonamento (ID varchar(255) NOT NULL, CategoriaClienteID varchar(255), NumeroMesi int(11), ScontoPercentuale float, Discriminator varchar(255) NOT NULL, NumeroMesi2 int(11), ScontoFisso float, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE TipologiaCorso (ID varchar(255) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE DescrizioneCorso (ID varchar(255) NOT NULL, TipologiaCorsoID varchar(255), Prenotazione tinyint(1) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE PreventivoAbbonamento (ID int(11) NOT NULL AUTO_INCREMENT, CategoriaClienteID varchar(255), DescrizioneAbbonamentoID varchar(255), Prezzo float NOT NULL, NumeroMesi int(11) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Cliente (ID varchar(255) NOT NULL, Nome varchar(255), Cognome varchar(255), Telefono varchar(255) NOT NULL, Email varchar(255), PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE CertificatoMedico (ID int(11) NOT NULL AUTO_INCREMENT, ClienteID varchar(255), Scadenza date, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Pagamento (ID int(11) NOT NULL AUTO_INCREMENT, AbbonamentoID int(11), Data date, Importo float NOT NULL, Stato tinyint(1) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Abbonamento (ID int(11) NOT NULL AUTO_INCREMENT, PreventivoAbbonamentoID int(11), ClienteID varchar(255), DataInizio date, DataFine date, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE AnagraficaUniversitario (Matricola int(11) NOT NULL AUTO_INCREMENT, Nome varchar(255), Cognome varchar(255), PRIMARY KEY (Matricola)) ENGINE=InnoDB;
CREATE TABLE DescrizioneAbbonamento_SalaPesi (DescrizioneAbbonamentoID varchar(255) NOT NULL, SalaPesiID varchar(255) NOT NULL, PRIMARY KEY (DescrizioneAbbonamentoID, SalaPesiID)) ENGINE=InnoDB;
CREATE TABLE DescrizioneAbbonamento_DescrizioneCorso (DescrizioneAbbonamentoID varchar(255) NOT NULL, DescrizioneCorsoID varchar(255) NOT NULL, PRIMARY KEY (DescrizioneAbbonamentoID, DescrizioneCorsoID)) ENGINE=InnoDB;
CREATE TABLE DipendenteAleniaSpazio (CodiceDipendente int(11) NOT NULL AUTO_INCREMENT, Nome varchar(255), Cognome varchar(255), PRIMARY KEY (CodiceDipendente)) ENGINE=InnoDB;
ALTER TABLE DescrizioneAbbonamento_SalaPesi ADD INDEX FKDescrizion292997 (DescrizioneAbbonamentoID), ADD CONSTRAINT FKDescrizion292997 FOREIGN KEY (DescrizioneAbbonamentoID) REFERENCES DescrizioneAbbonamento (ID);
ALTER TABLE DescrizioneAbbonamento_SalaPesi ADD INDEX FKDescrizion819976 (SalaPesiID), ADD CONSTRAINT FKDescrizion819976 FOREIGN KEY (SalaPesiID) REFERENCES SalaPesi (ID);
ALTER TABLE PoliticaScontoAbbonamento ADD INDEX FKPoliticaSc731513 (CategoriaClienteID), ADD CONSTRAINT FKPoliticaSc731513 FOREIGN KEY (CategoriaClienteID) REFERENCES CategoriaCliente (ID);
ALTER TABLE DescrizioneCorso ADD INDEX FKDescrizion753301 (TipologiaCorsoID), ADD CONSTRAINT FKDescrizion753301 FOREIGN KEY (TipologiaCorsoID) REFERENCES TipologiaCorso (ID);
ALTER TABLE DescrizioneAbbonamento_DescrizioneCorso ADD INDEX FKDescrizion389116 (DescrizioneAbbonamentoID), ADD CONSTRAINT FKDescrizion389116 FOREIGN KEY (DescrizioneAbbonamentoID) REFERENCES DescrizioneAbbonamento (ID);
ALTER TABLE DescrizioneAbbonamento_DescrizioneCorso ADD INDEX FKDescrizion963998 (DescrizioneCorsoID), ADD CONSTRAINT FKDescrizion963998 FOREIGN KEY (DescrizioneCorsoID) REFERENCES DescrizioneCorso (ID);
ALTER TABLE PreventivoAbbonamento ADD INDEX FKPreventivo760262 (DescrizioneAbbonamentoID), ADD CONSTRAINT FKPreventivo760262 FOREIGN KEY (DescrizioneAbbonamentoID) REFERENCES DescrizioneAbbonamento (ID);
ALTER TABLE CertificatoMedico ADD INDEX FKCertificat475831 (ClienteID), ADD CONSTRAINT FKCertificat475831 FOREIGN KEY (ClienteID) REFERENCES Cliente (ID);
ALTER TABLE Abbonamento ADD INDEX FKAbbonament458646 (ClienteID), ADD CONSTRAINT FKAbbonament458646 FOREIGN KEY (ClienteID) REFERENCES Cliente (ID);
ALTER TABLE Abbonamento ADD INDEX FKAbbonament201325 (PreventivoAbbonamentoID), ADD CONSTRAINT FKAbbonament201325 FOREIGN KEY (PreventivoAbbonamentoID) REFERENCES PreventivoAbbonamento (ID);
ALTER TABLE PreventivoAbbonamento ADD INDEX FKPreventivo62180 (CategoriaClienteID), ADD CONSTRAINT FKPreventivo62180 FOREIGN KEY (CategoriaClienteID) REFERENCES CategoriaCliente (ID);
ALTER TABLE Pagamento ADD INDEX FKPagamento974926 (AbbonamentoID), ADD CONSTRAINT FKPagamento974926 FOREIGN KEY (AbbonamentoID) REFERENCES Abbonamento (ID);
