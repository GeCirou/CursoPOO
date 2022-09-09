<?
require_once('car.php');
require_once('uberX');
require_once('uberPool');
require_once('account.php');

$uberX = new UberX("CVB687", new Account("Andres Herrera", "ASD441"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("ASJ765", new Account("Andrea Herrera", "SJHy676"), "Dodge", "Attitude")
$uberPool->printDataCar();
?>