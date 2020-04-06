// Initialize your app
var myApp = new Framework7({ //初始化应用
	animateNavBackIcon : true,
	// 启用模板自动预编译
	precompileTemplates : true,
	// 用Template7渲染页面
	swipeBackPage : false, //取消右滑关闭
	swipePanelOnlyClose : true,
	pushState : true,// 启用哈希（#）导航
	template7Pages : true// 指定Template7数据
});

// Export selectors engine将自定义DOM7库存在变量
var $$ = Dom7;

// 登录

function isLoginFormValid(){
	return $("#LoginForm").validate({
		rules:
        {
            userName://定位到元素属性的name值
            {
                required:true,
                minlength:2,
                maxlength:10
            },
            userPwd://定位到元素属性的name值
            {
                required:true,
                minlength:2,
                maxlength:16
            }
        },
        messages:
        {//定义规则提示信息
            userName:
            {
                required:"用户名不能为空",
                minlength:"不能少于2位",
                maxlength:"不能大于10位"
            },
            userPwd:
            {
                required:"密码框不能为空",
                minlength:"密码长度不能短于2位",
                maxlength:"密码长度不能大于10位"
            }
        }
	})
}

$$('input[name="login"]').on('click', function() {
	
	if(!isLoginFormValid().form()){
//		alert("请正确填写表单");
		return;
	}
	
	var userNameValue = $('input#userNameLi').val().trim();
	var userPwdValue = $('input#userPwdLi').val().trim();
	
	var url = "/userlogin.do" + "?userName=" + userNameValue + "&userPwd=" + userPwdValue;
			
	$.ajax({//AJAX 是一种在无需重新加载整个网页的情况下，能够更新部分网页的技术。
		type : "POST",
		// 异步改为同步,在接收到后台返回数据之前,调用方不得继续操作
		async : false,
		url : url, //要求为String类型的参数，（默认为当前页地址）发送请求的地址。
		// data: formData,
		success : function(response) {
			if (response.result === 1) {
				alert("result=" + response.result + ", login success!");
			} else {
				alert("result=" + response.result + ", login failed!");
			}
		}
	});

});

// 注册
function isRegisterFormValid(){
	return $("#RegisterForm").validate({
		rules:
        {
            userName://定位到元素属性的name值
            {
                required:true,
                minlength:3,
                maxlength:10
            },
            userPwd://定位到元素属性的name值
            {
                required:true,
                minlength:6,
                maxlength:16
            },
            userPhone:
            {
            	 required:true,
            },
            userEmail:
            {
            	 required:true,
            }
        },
        messages:
        {//定义规则提示信息
            userName:
            {
                required:"用户名不能为空",
                minlength:"不能少于3位",
                maxlength:"不能大于10位"
            },
            userPwd:
            {
                required:"密码框不能为空",
                minlength:"密码长度不能短于6位",
                maxlength:"密码长度不能大于10位"
            },
            userPhone:
            {
            	 required:"电话不能为空"
            },
            userEmail:
            {
            	 required:"Email不能为空"
            }
        }
	})
}

$$('input[name="register"]').on('click', function() {

	var formData = myApp.formToJSON('#RegisterForm');
    
	var userNameValue = $('input#userNameRg').val().trim();
	var userPwdValue = $('input#userPwdRg').val().trim();
	var userPhoneValue = $('input[name="userPhone"]').val().trim();
	var userEmailValue = $('input[name="userEmail"]').val().trim();

	if(!isRegisterFormValid().form())
	{
		return;
	}
	
	$.ajax({
		type : "POST",
		// 异步改为同步,在接收到后台返回数据之前,调用方不得继续操作
		async : false,
		url : "/userregister.do",
		data : formData,
		success : function(response) {

			if (response.result === 1) {
				alert("result=" + response.result + ", " + response.msg);
			} else {
				alert("result=" + response.result + ", " + response.msg);
			}
		}
	});

});

// Add main View
var mainView = myApp.addView('.view-main', { //初始化视图
	// Enable dynamic Navbar
	dynamicNavbar : false,
});
var subnaview = myApp.addView('.view-subnav');//初始化subnav视图（左边菜单）

$(document).ready(function() { //用来在DOM加载完成之后执行一系列预先定义好的函数。
	$(".close-popup").click(function() {
		$("label.error").hide();
	});
});

myApp.onPageInit('index', function(page) { //初始化index页面的组件和导航栏的时候会触发。
})

$$(document).on('pageInit', function(e) { //为所有page的init事件定义相应函数,当Framework7初始化页面的组件的时候会触发
	$(".close-popup").click(function() {
		$("label.error").hide();
	});

})

//Claim Now
function isClaimFormValid(){
	return $("#ClaimForm").validate({
		rules:
        {
			insuredName://定位到元素属性的name值
            {
                required:true
            },
            insuredId://定位到元素属性的name值
            {
                required:true
            },
            claimType:
            {
            	 required:true
            },
            icdCode:
            {
            	 required:true
            },
            admissionDate:
            {
            	required:true
            },
            dischargeDate:
            {
            	required:true
            }
        },
        messages:
        {//定义规则提示信息
        	insuredName:
            {
                required:"被保人姓名不能为空"
            },
            insuredId:
            {
                required:"被保人证件号不能为空"
            },
            claimType:
            {
            	 required:"理赔类型不能为空"
            },
            icdCode:
            {
            	 required:"疾病代码不能为空"
            },
            admissionDate:
            {
            	required:"入院日不能为空"
            },
            dischargeDate:
            {
            	required:"出院日不能为空"
            }
        }
	})
}

myApp.onPageInit('claimnow', function(page) {
	$$('input[name="claimnow"]').on('click', function() {

	    var formData = myApp.formToJSON('#ClaimForm');	
	    //alert(formData);
	    
	    var insuredNameValue = $('input[name="insuredName"]').val().trim();
	    var insuredIdValue = $('input[name="insuredId"]').val().trim();
	    var claimTypeValue = $('select[name="claimType"]').val().trim();
	    var icdCodeValue = $('select[name="icdCode"]').val().trim();
	    var admissionDateValue = $('input[name="admissionDate"]').val().trim();
	    var dischargeDateValue = $('input[name="dischargeDate"]').val().trim();
	    	    
		if(!isClaimFormValid().form())
		{
			return;
		}
	    
	    //jQuery
		$.ajax({
			type : "POST",
			// 异步改为同步,在接收到后台返回数据之前,调用方不得继续操作
			async : false,
			url : "http://localhost:8080/saveClaim.do",
			data: $('#ClaimForm').serialize(),
			
			success : function(response) {
				
				console.log(response);//打印服务端返回的数据(调试用)
				
				if (response.result === 1) {
					alert("result=" + response.result + ", save success!");
				} else {
					alert("result=" + response.result + ", save failed!");
				}
			},
			error: function(response) {
				console.log(response);//打印服务端返回的数据(调试用)
			}
				
		});

	});
})




