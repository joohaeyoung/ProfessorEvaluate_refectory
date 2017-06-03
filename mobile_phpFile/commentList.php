<?php
	$lectureValue = $_GET['lecture'];

	define('HOST','localhost'); // change your IP address or Default enter as localhost
	define('USER','jhy753');  	// change your user name
	define('PASS','1q2w3e4r5t');// change your Password
	define('DB','jhy753'); 		// change your Database Name

	$con = mysqli_connect(HOST,USER,PASS,DB);
	mysqli_query($con,"set names utf8");
	
	//	echo $lectureValue;

	
	$sql = "select cid,comment,time from Comment where lecture="."'".$lectureValue."' order by cid desc";
	
	
	$res = mysqli_query($con,$sql);
	$result = array();
	while($row = mysqli_fetch_array($res)){
		
		array_push($result, array('cid'=>$row[0], 'comment'=>$row[1], 'time'=>$row[2] )  );
	}
	echo json_encode(array("commentData"=>$result));
	mysqli_close($con);
?>