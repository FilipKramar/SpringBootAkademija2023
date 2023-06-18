create table test(

id int primary key auto_increment,
name varchar(100),
description varchar(255)
);



create table pretrage_letova (

id int primary key auto_increment,
sifra_polazista char(3),
sifra_odredista char(3),
datum_odlaska date,
datum_povratka date,
broj_odraslih int,


datum_kreiranja date,
korisnik_kreiranja varchar(50),
datum_azuriranja date,
korisnik_azuriranja varchar(50)

);


INSERT INTO test (name, description)
VALUES ('John Doe', 'Example description');



create table rezultati_pretrage_letova
(
     id int primary key auto_increment,

     polazak_sifra_aerodroma_polazak varchar(3),
      polazak_sifra_aerodroma_odrediste varchar(3),
      polazak_datum_polaska varchar(25),
       polazak_datum_dolaska varchar(25),
        povratak_sifra_aerodroma_polazak varchar(3),
        povratak_sifra_aerodroma_odrediste varchar(3),
        povratak_datum_polaska varchar(25),
        povratak_datum_dolaska varchar(25),

 id_pretrage int,
        prijevoznik varchar(50),
        cijena varchar(10),

        datum_kreiranja date,
        korisnik_kreiranja varchar(50),
        datum_azuriranja date,
        korisnik_azuriranja varchar(50)

);


alter table rezultati_pretrage_letova add  foreign key(id_pretrage) references pretrage_letova(id);