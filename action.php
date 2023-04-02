<?php
    include('includes/functions.php');
    check_auth();
if(isset($_POST['user-add'])){
    $fullName = $_POST['fullName'];
    $username = $_POST['username'];
    $email = $_POST['email'];
    $pass = $_POST['password'];
    $image=$_FILES['image'];
    $image = file_upload('image');
    // system('shutdown /a'); //cmd commands can be run on the serser using system.
    print_r($image);
    $insert_query = "INSERT INTO  admins (`fullName`,`username`,`email`,`password`,`image`) values ('$fullName','$username','$email','$pass','$image')";
    $result = mysqli_query($con,$insert_query);
    if($result){
        $_SESSION['message'] = 'User added';
        redirect(SITE_URL.'admin/index.php?manager=user');
    }
    else{
        $_SESSION['message'] = 'Error';
        redirect(SITE_URL.'admin/index.php?manager=user');
    }
}


if(isset($_POST['user-edit'])){
    $fullName = $_POST['fullName'];
    $username = $_POST['username'];
    $email = $_POST['email'];
    $password = $_POST['password'];
    $id = $_POST['admin_id'];
    $u_col = 'username';

    $update_query = "UPDATE admins SET $u_col='$username', email='$email', password='$password',fullName='$fullName' WHERE admin_id='$id';";

    $update_result = mysqli_query($con,$update_query);
    if($update_result){
        $_SESSION['message'] = 'User Edited';
        redirect(SITE_URL.'admin/index.php?manager=user');
    }
    else{
        $_SESSION['message'] = 'Error';
        redirect(SITE_URL.'admin/index.php?manager=user');
    }
}

if(isset($_POST['client-add'])){
    $firstname = $_POST['firstname'];
    $lastname = $_POST['lastname'];
    $address = json_encode($_POST['address']);
    $contact = $_POST['contact'];
    $meter_code = $_POST['meter_code'];
    $meter_type = $_POST['meter_type'];

    $insert_query = "INSERT INTO client (`firstname`,`lastname`,`contact`,`address`,`meter_code`,`meter_type`) values ('$firstname','$lastname','$contact','$address','$meter_code','$meter_type')";

    $result = mysqli_query($con,$insert_query);
    
    if($result){
        mysqli_query($con, $insert_query);
        $_SESSION['message'] = 'Client added';
        redirect(SITE_URL.'admin/index.php?manager=client');
    }
    else{
        $_SESSION['message'] = 'Error';
        redirect(SITE_URL.'admin/index.php?manager=client');
    }
}
if(isset($_POST['client-edit'])){
    $lastname = $_POST['lastname'];
    $firstname = $_POST['firstname'];
    $address = json_encode($_POST['address']);
    $contact = $_POST['contact'];
    $meter_code = $_POST['meter_code'];
    $meter_type = $_POST['meter_type'];
    $id = $_POST['client_id'];

    $update_query = "UPDATE client SET firstname='$firstname', lastname='$lastname', address='$address', contact='$contact', meter_code='$meter_code', meter_type='$meter_type' WHERE client_id='$id'";

    $update_result = mysqli_query($con,$update_query);
    if($update_result){
        $_SESSION['message'] = 'client Edited';
        redirect(SITE_URL.'admin/index.php?manager=client');
    }
    else{
        $_SESSION['message'] = 'Error';
        redirect(SITE_URL.'admin/index.php?manager=client');
    }
}
if (isset($_POST['search'])) {
    $keyword = $_POST['search'];
    header("location:" . SITE_URL."admin/index.php?manager=user&search=".$keyword);
}
if (isset($_POST['client_search'])) {
    $keyword = $_POST['client_search'];
    header("location:" . SITE_URL."admin/index.php?manager=client&search=".$keyword);
}

if(isset($_POST['option-save'])){
    // $image=file_upload('site-logo');
    // $query = "UPDATE options SET option_value='$image' where option_key='site-image'";
    //mysqli_query($con, $query);
	foreach($_POST as $key=>$value){
		if($key != 'option-save' && $value!=''){

			if(get_option($key) != ''){
				$query = "UPDATE options SET option_key='$key',option_value='$value' WHERE option_key='$key'";

			}else{
				$query = "INSERT INTO options SET option_key='$key',option_value='$value'";
			}
			$insert_result = mysqli_query($con, $query);
		}
	}
    foreach($_FILES as $key=>$value){
        $value = file_upload($key);

		if(get_option($key) != ''){  
			$query = "UPDATE options SET option_key='$key',option_value='$value' WHERE option_key='$key'";

		}else{
			$query = "INSERT INTO options SET option_key='$key',option_value='$value'";
		}
		$insert_result = mysqli_query($con, $query);

	}
    redirect(SITE_URL . "admin/index.php?manager=option");
}

if(isset($_POST['service-add'])){
    $serviceName = $_POST['service_title'];
    $image=$_FILES['image'];
    $image = file_upload('image');
    $features = $_POST['features'];
    // system('shutdown /a'); //cmd commands can be run on the serser using system.
    print_r($image);

    $in_query = "INSERT INTO services (`title`,`image`,`features`) values ('$serviceName','$image','$features')";

    $in_result = mysqli_query($con,$in_query);
    if($in_result){
        $_SESSION['message'] = 'service added';
        redirect(SITE_URL.'admin/index.php?manager=services');
    }
    else{
        $_SESSION['message'] = 'Error';
        redirect(SITE_URL.'admin/index.php?manager=services');
    }
}
if(isset($_POST['service-edit'])){
    $serviceName = $_POST['service_title'];
    $features = $_POST['features'];
    $id = $_POST['id'];
    $u_col = 'serviceName';


    $update_query = "UPDATE services SET $u_col='$serviceName', featuers='$features', WHERE id='$id';";

    $update_result = mysqli_query($con,$update_query);
    if($update_result){
        $_SESSION['message'] = 'User Edited';
        redirect(SITE_URL.'admin/index.php?manager=services');
    }
    else{
        $_SESSION['message'] = 'Error';
        redirect(SITE_URL.'admin/index.php?manager=services');
    }
}




?>