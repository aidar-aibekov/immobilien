 select haus.id_haus, haus.address, besitzer.name
    from haus
    inner join besitzer on
    haus.besitzer_id = besitzer.id_besitzer;
+---------+----------------+---------+
| id_haus | address        | name    |
+---------+----------------+---------+
|       3 | Manas 4        | Nagima  |
|       1 | Tynystanova 14 | Islam   |
|       2 | Fuchika 44     | Dosmir  |
|       5 | Djal 15        | Aizada  |
|       4 | Manas 43       | Nurbala |
+---------+----------------+---------+

 select haus.id_haus, haus.address, verkauf.id_verkauf
    from haus
    inner join verkauf on
    haus.id_haus = verkauf.haus_id;
+---------+----------------+------------+
| id_haus | address        | id_verkauf |
+---------+----------------+------------+
|       1 | Tynystanova 14 |          3 |
|       2 | Fuchika 44     |          1 |
|       3 | Manas 4        |          5 |
|       4 | Manas 43       |          4 |
|       5 | Djal 15        |          2 |
+---------+----------------+------------+

 select haus.id_haus, haus.address, verkauf.id_verkauf
    from haus
    inner join haus_kaufint on
    haus.id_haus = haus_kaufint.haus_id
    inner join verkauf on
    verkauf.id_verkauf = haus_kaufint.kauf_id;
+---------+----------------+------------+
| id_haus | address        | id_verkauf |
+---------+----------------+------------+
|       1 | Tynystanova 14 |          5 |
|       1 | Tynystanova 14 |          4 |
|       1 | Tynystanova 14 |          2 |
|       3 | Manas 4        |          1 |
|       3 | Manas 4        |          4 |
|       3 | Manas 4        |          2 |
|       5 | Djal 15        |          1 |
|       5 | Djal 15        |          2 |
+---------+----------------+------------+