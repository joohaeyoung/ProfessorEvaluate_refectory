<?php

	$value = $_GET['avg'];
	$lectureValue = $_GET['lecture'];
	
  
	$con = mysqli_connect("localhost","jhy753","1q2w3e4r5t","jhy753");
	// Check connection
	if (mysqli_connect_errno()){
  		echo "Failed to connect to MySQL: " . mysqli_connect_error();
  	}

   $avgValue = (float) $value;
  
	// Perform queries 
  
  		$insert_sql = 'INSERT INTO avg( lecture,avg ) VALUE("'.$lectureValue.'","'.$avgValue.'")';	

  
	echo $insert_sql;
	$p2 = mysqli_query($con, $insert_sql);
	echo $p2."<br/>";

	mysqli_close($con);
	
?>
