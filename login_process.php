<?php
include ("includes/functions.php");

$username = isset($_POST['username'])?$_POST['username']:'';
$password = isset($_POST['password'])?$_POST['password']:'';

if(isset($_POST['login-submit'])){
    $query = "SELECT * FROM admins WHERE username='$username' AND password='$password'";

    $result = mysqli_query($con,$query);
    $user_row = mysqli_fetch_assoc($result);

    if($user_row){
        $_SESSION['user_id'] = $user_row['admin_id'];
        redirect(SITE_URL.'admin/index.php');
    }
    else{
        $_SESSION['error'] = "Invalid username or password!";
        redirect(SITE_URL.'admin/login.php');
    }
}else{
    redirect(SITE_URL.'admin/login.php');
}
?>