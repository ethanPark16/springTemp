/**
 * parameter 객체 형태 
 * {
 * 		pointcut : 'test*', advice : function(){}
 * }
 * 
 * 넘기지 않으면 기본값으로 실행
 */
aop.before({advice : function(){
	console.log("시작했다.");
}});
aop.after();
