create database flota;


use flota;

create table muntenia (
                          `id` INT NOT NULL AUTO_INCREMENT,
                          `numar_inmatriculare` char(7) NOT NULL,
                          `marca` char(13) NOT NULL,
                          `tip` char(13) NOT NULL,
                          `model` varchar(13) not null,
                          `dotari` varchar(13) not null,
                          `utilaj` varchar(13) not null,
                          `data_pif` date not null,
                          `serie_sasiu` varchar(17) not null,
                          `nr_mijloc_fix_sap` bigint not null,
                          `stare` varchar(10) not null,
                          `locatie_judet` varchar(14) not null,
                          `locatie_oras` varchar(15) not null,
                          `directia` varchar(15) not null,
                          `departamentul` varchar(15) not null,
                          `formatia_de_lucru` varchar(15) not null,
                          `utilizator_titular` varchar(30) not null,
                          `marca_utilizator` varchar(30) not null,
                          `tip_auto_cf_tipologie_rar` varchar(30) not null,
                          `tip_auto_ptr_rapoarte_la_mediu` varchar(30) not null,
                          `tip_auto_ptr_rapoarte_la_anre` varchar(30) not null,
                          `tip_auto_dupa_mod_utilizare_ptr_rapoarte_calcul_tarife` varchar(30) not null,
                          `tip_combustibil_ptr_rapoarte_la_audit_energetic` varchar(30) not null,
                          `data_urmatoarei_itp` date not null,
                          `valabilitate_rovigneta` date not null,
                          `valabilitate_rca` date not null,
                          `valabilitate_casco` date not null,
                          `serie_civ` varchar(15) not null,
                          `serie_certificat_inmatriculare` varchar(15) not null,

                          PRIMARY KEY(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



