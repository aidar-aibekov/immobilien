
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
Query OK, 1 row affected (0.01 sec)

mysql> insert into kaufinteressanten (name) values ('Aiana');
Query OK, 1 row affected (0.00 sec)

mysql> insert into kaufinteressanten (name) values ('Atai');
Query OK, 1 row affected (0.00 sec)

mysql> insert into verkauf(haus) values ('Atai');
ERROR 1054 (42S22): Unknown column 'haus' in 'field list'
mysql> insert into verkauf(haus_id) values (2);
Query OK, 1 row affected (0.00 sec)

mysql> insert into verkauf(haus_id) values (5);
Query OK, 1 row affected (0.31 sec)

mysql> insert into verkauf(haus_id) values (1);
Query OK, 1 row affected (0.00 sec)

mysql> insert into verkauf(haus_id) values (4);
Query OK, 1 row affected (0.02 sec)

mysql> insert into verkauf(haus_id) values (3);
Query OK, 1 row affected (0.00 sec)

mysql> insert into haus_kaufint (haus_id) values (3);
