/*
 * 시스템 객체를 복사 저장
 */
var sys = window;
var sysObj = {};
for(var member in sys) { 
	sysObj[member] = sys[member];
}

var mode = "debug"
function stdInfo(str) {
	if(mode == "debug"){
		console.log('===================================================================');
		console.log(str);
		console.log('...................................................................\n');
	}
}

var aop = {
	/* 기본 인자값 설정 */
	defaults : {
		pointcut : '*', 
		advice : function(){}
	},
	aspect : function (pointcut, advice) {
		var ns = window;	// window 객체
		for(var member in ns) {
			//시스템 객체를 제외한 나머지에 적용
			if(sysObj[member] == undefined || sysObj[member] == null) {
				if(typeof ns[member] == 'function' && ns[member] != null) {
					console.log('ns[member] : '+ns[member]);
					(function(fn, fnName, ns) {
						ns[fnName] = function() {
							return advice.call(ns, { fn: fn, 
								fnName: fnName, 
								arguments: arguments });
						};
					})(ns[member], member, ns);
				}
			}
		}
	},
	
	before : function (options){
		var s = $.extend( {}, this.defaults, options );
		
		this.aspect(s.pointcut, function(f){
			stdInfo(f.fnName +' in');
			if(s.advice != null && typeof s.advice == 'function') {
				s.advice();
			}
			f.fn.apply(this, f.arguments);
		}, this);
	},
	
	after : function (options){
		var s = $.extend( {}, this.defaults, options );
		
		this.aspect(s.pointcut, function(f) {
			f.fn.apply(this, f.arguments);
			if(s.advice != null && typeof s.advice == 'function') {
				s.advice();
			}
			stdInfo(f.fnName +' out');
		}, this);
	}
}


