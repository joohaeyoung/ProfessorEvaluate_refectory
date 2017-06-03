<?php

	$professor = $_GET['professorName'];
	
	define('HOST','localhost'); // change your IP address or Default enter as localhost
	define('USER','jhy753');  	// change your user name
	define('PASS','1q2w3e4r5t');// change your Password
	define('DB','jhy753'); 		// change your Database Name

	$con = mysqli_connect(HOST,USER,PASS,DB);
	

	if($professor=="cyg"){
		$sql = "SELECT lecture, AVG(avg) FROM `avg`  WHERE lecture IN('cyg_cplusplus','cyg_datastructure','cyg_graphic') GROUP BY lecture ";
	}
	else if($professor=="jgc"){
		$sql = "SELECT lecture, AVG(avg) FROM `avg`  WHERE lecture IN('jgc_computerEngineerBasic','jgc_C') GROUP BY lecture ";
	}else if($professor=="jgs"){
		$sql = "SELECT lecture, AVG(avg) FROM `avg`  WHERE lecture IN('jgs_microprocessor','jgs_embedded') GROUP BY lecture ";
	}else if($professor=="kys"){
		$sql = "SELECT lecture, AVG(avg) FROM `avg`  WHERE lecture IN('kys_base_electric_electron','kys_computer_architecture','kys_animation') GROUP BY lecture ";
	}else if($professor=="ljh"){
		$sql = "SELECT lecture, AVG(avg) FROM `avg`  WHERE lecture IN('ljh_C','ljh_Cplusplus','ljh_java') GROUP BY lecture ";
	}else if($professor=="uhg"){
		$sql = "SELECT lecture, AVG(avg) FROM `avg`  WHERE lecture IN('uhg_trash','uhg_ai') GROUP BY lecture ";
	}else if($professor=="hyh"){
		$sql = "SELECT lecture, AVG(avg) FROM `avg`  WHERE lecture IN('hyh_network','hyh_script','hyh_spring') GROUP BY lecture ";
	}else if($professor=="jjs"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('jjs_cplusplus','jjs_digital','jjs_digitalsignal','jjs_c') GROUP BY lecture";                                                 
	}else if($professor=="jyb"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('jyb_window','jyb_digital','jyb_java','jyb_datastructure') GROUP BY lecture";
	}else if($professor=="jth"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('jth_c','jth_computervision') GROUP BY lecture";
	}else if($professor=="khj"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('khj_c','khj_baseelectricelectron','khj_digital','khj_microprocessor') GROUP BY lecture";
	}else if($professor=="lkh"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('lkh_base','lkh_digital','lkh_digitalsystem') GROUP BY lecture";
	}else if($professor=="ksw"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('ksw_computer','ksw_mobile','ksw_mobilesystem','ksw_script') GROUP BY lecture";
	}else if($professor=="kek"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('kek_creative','kek_database') GROUP BY lecture";
	}else if($professor=="ksj"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('ksj_java','ksj_object','ksj_protect') GROUP BY lecture";
	}else if($professor=="ksy"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('ksy_microprocessor','ksy_smart') GROUP BY lecture";
	}else if($professor=="kwt"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('kwt_base','kwt_network','kwt_data','kwt_smart') GROUP BY lecture";
	}else if($professor=="koy"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('koy_operation','koy_compile','koy_embeded','koy_script') GROUP BY lecture";
	}else if($professor=="mjk"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('mjk_database','mjk_software') GROUP BY lecture";
	}else if($professor=="mhmd"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('mhmd_java','mhmd_datastructure','mhmd_algo','mhmd_databasepro') GROUP BY lecture";
	}else if($professor=="miy"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('miy_web','miy_mobile','miy_advancedweb') GROUP BY lecture";
	}else if($professor=="psc"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('psc_smartnetwork') GROUP BY lecture";
	}else if($professor=="shs"){
		$sql = "SELECT lecture, AVG(avg) from `avg` WHERE lecture IN('shs_operation','shs_system') GROUP BY lecture";
	}
		
		
	$res = mysqli_query($con,$sql);
	$result = array();
	while($row = mysqli_fetch_array($res)){
		
		array_push($result, array('lecture'=>$row[0],'avg'=>$row[1] ));
	}
	
	echo json_encode(array( "avgData"=>$result ) );
		
	mysqli_close($con);
?>