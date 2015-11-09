/**
 * parameter 객체 형태 
 * {
 * 		pointcut : 'test*', advice : function(){}
 * }
 * 
 * 넘기지 않으면 기본값으로 실행
 */
var beforeParam = {
	advice : function(){
	}
}
aop.before(beforeParam);
aop.after();
