<?php
 include "config.php";
 ?>

<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <title>Immobilien</title>
</head>

<body>
  <table>
      <td>
        <th>
          <form method="post">
            <input type="submit" name="create11" value="1:1 Beziehung zeigen">
          </form>
        </th>
        <th>
          <form method="post">
            <input type="submit" name="drop11" value="1:1 Beziehung schließen">
          </form>
        </th>
        <th>
          <form method="post">
            <input type="submit" name="create1M" value="1:M Beziehung zeigen">
          </form>
        </th>
        <th>
          <form method="post">
            <input type="submit" name="drop1M" value="1:M Beziehung schließen">
          </form>
        </th>
        <th>
          <form method="post">
            <input type="submit" name="createNM" value="N:M Beziehung zeigen">
          </form>
        </th>
        <th>
          <form method="post">
            <input type="submit" name="dropNM" value="N:M Beziehung schließen">
          </form>
        </th>
      </td>
    </table>

  <?php
    if($_POST["create11"])
    {
      $hausen = mysqli_query($connection, "SELECT * FROM `haus`");
      $besitzers = mysqli_query($connection, "SELECT * FROM `besitzer`");
?><br>Häusen:<br><?php
      while($haus = mysqli_fetch_assoc($hausen)){
    ?>


      <?php echo $haus['id_haus'] . ". ";?>
Address:
      <?php echo $haus['address'];?><br>

      <?php
      while($bes = mysqli_fetch_assoc($besitzers)){
                         $besits[] = $bes;
                       }

                                foreach ($besits as $be) {
                                  if($haus['id_haus'] == $be['haus_id']){

                                      echo "Besitzer: " . $be['name']; ?><br><?php
                                      break;
                                  }


                              ?>

                                <?php
                              }

      }

    }

        ?>

        <?php
          if($_POST["create1M"])
          {
            $hausen = mysqli_query($connection, "SELECT * FROM `haus`");
            $einkaufer = mysqli_query($connection, "SELECT * FROM `verkauf`");
        ?><br>Häusen:<br><?php
            while($haus = mysqli_fetch_assoc($hausen)){
          ?>


            <?php echo $haus['id_haus'] . ". ";?>
        Address:
            <?php echo $haus['address'];?><br>

            <?php
            while($ein = mysqli_fetch_assoc($einkaufer)){
                               $einkau[] = $ein;
                             }

                                      foreach ($einkau as $ei) {
                                        if($haus['id_haus'] == $ei['haus_id']){

                                            echo "Einkäufer: " . $ei['name'];
                                            echo " hat am " . $ei['datum'] .
                                            " gekauft.";
                                            ?><br><?php

                                        }


                                    ?>

                                      <?php
                                    }

            }

          }

              ?>

              <?php
                if($_POST["createNM"])
                {
                  $hausen = mysqli_query($connection, "SELECT * FROM `haus`");
                  $kaufinteressanten = mysqli_query($connection, "SELECT * FROM `kaufinteressanten`");
                  $haus_kaufint = mysqli_query($connection, "SELECT * FROM `haus_kaufint`");
              ?><br>Häusen:<br><?php
                  while($haus = mysqli_fetch_assoc($hausen)){
                ?>
                  <?php echo $haus['id_haus'] . ". ";?>
              Address:
                  <?php echo $haus['address'];?><br>

                  <?php
                  while($kau = mysqli_fetch_assoc($kaufinteressanten)){
                                     $kaufint[] = $kau;
                   }
                  while($int = mysqli_fetch_assoc($haus_kaufint)){
                                      $haus_kauf[] = $int;
                    }

echo "Kaufinteressanten: ";
                    foreach ($haus_kauf as $ha) {
                          if($haus['id_haus'] == $ha['haus_id']){
                            foreach ($kaufint as $ka){
                              if($ka['id_kaufinteressanten']==$ha['kauf_id']){
                                echo $ka['name'] . " | ";
                                ?><?php
                              }
                            }

                          }

                                          }
                                          ?> <br> <?php

                  }
                  $hausen = mysqli_query($connection, "SELECT * FROM `haus`");
                  $kaufinteressanten = mysqli_query($connection, "SELECT * FROM `kaufinteressanten`");
                  $haus_kaufint = mysqli_query($connection, "SELECT * FROM `haus_kaufint`");
                  ?><br>Häusen:<br><?php
                  while($kauf = mysqli_fetch_assoc($kaufinteressanten)){
                  ?>
                  <?php echo $kauf['id_kaufinteressanten'] . ". ";?>
                  Kaufinteressant:
                  <?php echo $kauf['name'];?><br>

                  <?php
                  while($hau = mysqli_fetch_assoc($hausen)){
                                     $hesen[] = $hau;
                   }
                  while($int = mysqli_fetch_assoc($haus_kaufint)){
                                      $haus_kauf[] = $int;
                    }

                  echo "Addressen: ";
                    foreach ($haus_kauf as $ka) {
                          if($kauf['id_kaufinteressanten'] == $ka['kauf_id']){
                            foreach ($hesen as $he){
                              if($he['id_haus']==$ka['haus_id']){
                                echo $he['address'] . " | ";
                                ?><?php
                              }
                            }




                          }

                                          }
                                          ?> <br> <?php

                  }

                }

                    ?>





</body>

</html>
