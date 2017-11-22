
insert into besitzer (name, telefonnummer) values ('Nagima', '0700557577');
insert into besitzer (name, telefonnummer) values ('Islam', '0558551056');
insert into besitzer (name, telefonnummer) values ('Dosmir', '0700005500');
insert into besitzer (name, telefonnummer) values ('Aizada', '0778675600');
insert into besitzer (name, telefonnummer) values ('Nurbala', '0702895589');

insert into haus (address, schaetzung, preis, besitzer_id) values ('Tynystanova 14', 3, 27000, 2 );
insert into haus (address, schaetzung, preis, besitzer_id) values ('Fuchika 44', 3, 30000, 3 );
insert into haus (address, schaetzung, preis, besitzer_id) values ('Manas 4', 5, 95000, 1 );
insert into haus (address, schaetzung, preis, besitzer_id) values ('Manas 43', 3, 28000, 5 );
insert into haus (address, schaetzung, preis, besitzer_id) values ('Djal 15', 1, 15000, 4 );

insert into kaufinteressanten (name) values ('Aidar');
insert into kaufinteressanten (name) values ('Aibek');
insert into kaufinteressanten (name) values ('Arkhat');
insert into kaufinteressanten (name) values ('Aiana');
insert into kaufinteressanten (name) values ('Atai');

insert into verkauf(haus_id, name, datum, telefonnummer) values (3, 'Islam', '10.06.2006', '057029834384');
insert into verkauf(haus_id, name, datum, telefonnummer) values (5, 'Dosmir', '08.06.1998', '045635757357');
insert into verkauf(haus_id, name, datum, telefonnummer) values (2, 'Aizada', '24.11.2007', '08867856756');
insert into verkauf(haus_id, name, datum, telefonnummer) values (4, 'Nurbala', '20.1.2016', '0563424657');
insert into verkauf(haus_id, name, datum, telefonnummer) values (1, 'Nagima', '5.3.2015', '07831243626');


insert into haus_kaufint (haus_id, kauf_id) values (3, 2);
insert into haus_kaufint (haus_id, kauf_id) values (1, 2);
insert into haus_kaufint (haus_id, kauf_id) values (5, 1);
insert into haus_kaufint (haus_id, kauf_id) values (3, 4);
insert into haus_kaufint (haus_id, kauf_id) values (1, 5);
insert into haus_kaufint (haus_id, kauf_id) values (1, 4);
insert into haus_kaufint (haus_id, kauf_id) values (3, 1);
insert into haus_kaufint (haus_id, kauf_id) values (5, 2);
