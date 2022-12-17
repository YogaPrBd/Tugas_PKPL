<?php
set_error_handler(function (int $errno, string $errstr) {
    if ((strpos($errstr, 'Undefined array key') === false) && (strpos($errstr, 'Undefined variable') === false)) {
        return false;
    } else {
        return true;
    }
}, E_WARNING);
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Random Number</title>
</head>

<body>
    <h1>Random Number</h1>
    <h2>
        <form id="numberForm" name="numberForm" method="POST" action="#">
            <label> Number Range <br>
                <input type="number" name="rangeStart" id="rangeStart" placeholder="Start">
                <input type="number" name="rangeEnd" id="rangeEnd" placeholder="End">
                <input type="submit" name="submit" id="submit" value="Submit" />
            </label>
        </form>
    </h2>

    <h3>
        <?php
        if (isset($_POST['submit'])) {
            if (isset($_POST['rangeStart']) && isset($_POST['rangeEnd'])) {
                $a = $_POST['rangeStart'];
                $b = $_POST['rangeEnd'];
                $randomNumA = rand($a, $b);
                echo ("Result:\t" . $randomNumA);
            }
        }
        ?>
    </h3>
</body>

</html>