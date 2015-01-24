ALTER TABLE descrizioneabbonamento DROP FOREIGN KEY FKDescrizion772374;
ALTER TABLE descrizioneabbonamento DROP INDEX FKDescrizion772374;
ALTER TABLE DescrizioneAbbonamento modify column CategoriaClienteNomeCat varchar(255);
ALTER TABLE DescrizioneAbbonamento ADD INDEX FKDescrizion772374 (CategoriaClienteNomeCat), ADD CONSTRAINT FKDescrizion772374 FOREIGN KEY (CategoriaClienteNomeCat) REFERENCES CategoriaCliente (NomeCat);
