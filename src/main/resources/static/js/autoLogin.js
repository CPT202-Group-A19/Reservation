$(function() {
<<<<<<< HEAD
	// When the user clicks the login button
	$("#loginBtn").click(function() {
			// If the user does not check the automatic login
			if (!$("#auto").prop("checked")) {
				// Clear the content of the cookie
=======
	//用户点击登录按钮时
	$("#loginBtn").click(function() {
			//如果用户没有勾选自动登录
			if (!$("#auto").prop("checked")) {
				//清空cookie中的内容
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
				$.cookie("isAutoLogin", "false", {
					expire: -1
				});
				$.cookie("username", "", {
					expires: -1
				});
				$.cookie("password", "", {
					expires: -1
				});
			} else {
<<<<<<< HEAD
				// If the user checked automatic login
				// Get username and password
				var vusername = $("#username").val();
				var vpassword = $("#password").val();
				// store cookies
				// expires: 7 means store a cookie with a 7-day expiration
=======
				//如果用户勾选了自动登录
				//获得用户名密码
				var vusername = $("#username").val();
				var vpassword = $("#password").val();
				//存入cookie
				//expires: 7 表示存储一个带7天期限的cookie
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
				$.cookie("isAutoLogin", "true", {
					expires: 7
				});
				$.cookie("username", vusername, {
					expires: 7
				});
				$.cookie("password", vpassword, {
					expires: 7
				});
			}
		})
<<<<<<< HEAD
		// Code that runs when the page loads
		// Determine whether there is automatic login content
	if ($.cookie("isAutoLogin") == "true") {
		// If it is an automatic login, automatically fill in the information from the cookie into the username and password boxes
=======
		//页面加载时运行的代码
		//判断是否有自动登录的内容
	if ($.cookie("isAutoLogin") == "true") {
		//如果是自动登录，将cookie中的信息自动填写到用户名和密码框中
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
		$("#auto").prop("checked", true);
		$("#username").val($.cookie("username"));
		$("#password").val($.cookie("password"));
	}

});