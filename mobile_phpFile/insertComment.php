<?php

	$check = $_GET['comment'].$_GET['lecture'];
	echo $check."<br/>";
	
	$commentValue = $_GET['comment'];
	$lectureValue = $_GET['lecture'];
	
	$con = mysqli_connect("localhost","jhy753","1q2w3e4r5t","jhy753");
	
	mysqli_query($con,"set names utf8");
	//Check connection_aborted
	if( mysqli_connect_errno() ){
		echo "Failed to connect to MySQL: " . mysqli_connect_error();
	}
	
	$insert_sql = 'INSERT INTO Comment(lecture,comment) VALUE("'.$lectureValue.'","'.$commentValue.'")';	
	
	echo "<pre>".$insert_sql."</pre>";

	
	$p2 = mysqli_query( $con, $insert_sql );
	echo $p2."<br/>";
	
	mysqli_close( $con );
	
?>

	
	
	
	
	
	
	