
-- Créer une base de donnée /*-recette-*/
create database recette;
use recette;
---créer un tableau de listepatisserie
create table listepatisserie(id_recette integer primary key auto_increment,patisser VARCHAR(50));
---créer les tableaux
create table Recette(id_patisserie integer primary key auto_increment
                    ,id_recette integer default 0,Nombre_personne integer default 10,Farine FLOAT,
                    sucre FLOAT,Eau FLOAT default 0.0,
                    oeuf FLOAT default 0,huile FLOAT default 0,beurre FLOAT default 0,levure_chimique FLOAT default 0,
                    levure_boulanger FLOAT default 0,Lait FLOAT default 0,sel FLOAT default 0,
                    CONSTRAINT fk_recette
                    FOREIGN KEY (id_recette)	
                     REFERENCES listepatisserie(id_recette)
                     );
create table garniture(id_garniture integer primary key auto_increment,id_patisserie integer,fruit_autre VARCHAR(50),quantite float default 0,
                   CONSTRAINT fk_garnie
                    FOREIGN KEY (id_patisserie)	
                     REFERENCES Recette(id_patisserie)
);
 insert into listepatisserie(patisser) values ('Baba');
insert into listepatisserie(patisser) values ('Pao');
insert into listepatisserie(patisser) values ('Pain_panini');
 insert into listepatisserie(patisser) values ('Tarte');

insert into Recette(id_recette,Farine,sucre,oeuf,beurre,levure_boulanger,Lait,sel) values (1,450,45,4,150,12,100,3);
insert into Recette(id_recette,Farine,sucre,oeuf,huile,levure_boulanger,Lait,sel) values (2,500,60,2,35,10,250,2);
insert into Recette(id_recette,Nombre_personne,Farine,sucre,Eau,huile,levure_boulanger,sel) values (3,4,450,20,250,50,15,6);
insert into Recette(id_recette,Farine,sucre,oeuf,beurre) values (4,250,125,1,125);
insert into garniture(id_patisserie,fruit_autre,quantite) values (1,' jus_orange',600);
insert into garniture(id_patisserie,fruit_autre) values (2,'confiture_haricots',200);
insert into garniture(id_patisserie,fruit_autre) values (4,'confiture_fraise',500);


