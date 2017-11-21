delimiter ;;
create trigger immobilien.verkauf_after_insert after insert on verkauf for each row
begin 
 	update besitzer 
 		set name = (select name
 			from verkauf
 			order by id_verkauf desc limit 1)
 		where besitzer.haus_id = new.haus_id;
 	update besitzer
 		set telefonnummer =(select telefonnummer
 			from verkauf
 			order by id_verkauf desc limit 1)
 		where besitzer.haus_id = new.haus_id;
 	update besitzer
 		set id_besitzer =(select id_verkauf
 			from verkauf
 			order by id_verkauf desc limit 1)
 		where besitzer.haus_id = new.haus_id;
 end ;;
 delimiter ;

 mysql> select * from besitzer;
+-------------+---------+---------------+---------+
| id_besitzer | name    | telefonnummer | haus_id |
+-------------+---------+---------------+---------+
|           1 | Nagima  | 0700557577    |       1 |
|           2 | Islam   | 0558551056    |       3 |
|           3 | Dosmir  | 0700005500    |       5 |
|           4 | Aizada  | 0778675600    |       2 |
|           5 | Nurbala | 0702895589    |       1 |
+-------------+---------+---------------+---------+

mysql> select * from verkauf;
+------------+---------+------------+---------------+---------+
| id_verkauf | name    | datum      | telefonnummer | haus_id |
+------------+---------+------------+---------------+---------+
|          1 | Islam   | 10.06.2006 | 081985198894  |       3 |
|          2 | Dosmir  | 08.06.1998 | 048946511198  |       5 |
|          3 | Aizada  | 26.07.1997 | 05849849856   |       2 |
|          4 | Nurbala | 27.05.1997 | 0489495948    |       4 |
|          5 | Nagima  | 20.12.2016 | 08494984984   |       1 |
+------------+---------+------------+---------------+---------+

insert into verkauf (name, datum, telefonnummer, haus_id) 
	values ('Kamchybek', '12.12.17', '06251615062', 1);

mysql> select * from besitzer;
+-------------+-----------+---------------+---------+
| id_besitzer | name      | telefonnummer | haus_id |
+-------------+-----------+---------------+---------+
|           2 | Islam     | 0558551056    |       3 |
|           3 | Dosmir    | 0700005500    |       5 |
|           4 | Aizada    | 0778675600    |       2 |
|           5 | Nurbala   | 0702895589    |       4 |
|           7 | Kamchybek | 06251615062   |       1 |
+-------------+-----------+---------------+---------+


mysql> select * from verkauf;
+------------+-----------+------------+---------------+---------+
| id_verkauf | name      | datum      | telefonnummer | haus_id |
+------------+-----------+------------+---------------+---------+
|          1 | Islam     | 10.06.2006 | 081985198894  |       3 |
|          2 | Dosmir    | 08.06.1998 | 048946511198  |       5 |
|          3 | Aizada    | 26.07.1997 | 05849849856   |       2 |
|          4 | Nurbala   | 27.05.1997 | 0489495948    |       4 |
|          5 | Nagima    | 20.12.2016 | 08494984984   |       1 |
|          7 | Kamchybek | 12.12.17   | 06251615062   |       1 |
+------------+-----------+------------+---------------+---------+



