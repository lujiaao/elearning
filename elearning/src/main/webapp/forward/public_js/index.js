/**
 * Created by 12644 on 2018/1/17.
 */
$(function () {
	 var weatherData=localStorage.getItem("weaData");
	if(weatherData!=null){
		setWeather(JSON.parse(weatherData));
		window.setTimeout(function() {
			localStorage.remove("weaData");
			window.reload();
		}, 60);
	}else{
		$.ajax({
		       url:"http://localhost:9090/elearning/forward_demo/weather",
		       data:{
		           city:"广州"
		       },
		       type:"post",
		       success:function (data) {
		    	   localStorage.setItem("weaData", JSON.stringify(data))
		    	   console.log(data);
		    	   setWeather(data);
		       	},
		    	    
		       error:function (e) {
//		           alert("天气获取异常，请重试！");
		       }
		   });
	}
   

   
   function setWeather(data){
	   if(data!=null){
 		  $("#city_icon").attr("src","img/city_photo/1/"+data[2]+".jpg");
 		  $("#city_name").text(data[1]);
 		  var str="";
 		  for(var i=0;i<5;i++){
 			  str+='<div class="col-md-2 wea_box">'
 				+'<h4>'+data[7+(i*5)]+'</h4>'
 				+'<div class="row">'
 					+'<div class="col-md-5">'
 						+'<img src="img/weather/a_'+data[7+(i*5)+3]+'">'
 					+'</div>'
 					+'<div class="col-md-5">'
 						+'<img src="img/weather/a_'+data[7+(i*5)+4]+'">'
 					+'</div>'
 				+'</div>'
 				+'<p>'+data[7+(i*5)+1]+'</p>'
 				+'<p>'+data[7+(i*5)+2]+'</p>'

 			+'</div>';
 		  }
 	   }
 		  $("#wea_box").html(str);
   }

});