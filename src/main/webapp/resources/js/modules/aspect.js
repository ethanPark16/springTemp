
define(function(){
	return {
		before : function(pointcut, advice){
			aspect(pointcut, function(f){
				stdInfo(f.fnName);
				if(advice != null && typeof advice == 'function') advice();
				f.fn.apply(this, f.arguments);
			});
		},
		after : function(pointcut, advice){
			aspect(pointcut, function(f){
				f.fn.apply(this, f.arguments);
				if(advice != null && typeof advice == 'function') advice();
				stdInfo(f.fnName);
			});
		}
	}
	
	function aspect(pointcut, advice) {
		var namespaces = [ (function(){return this;}).call() ];
		
		for(var i in namespaces) {
			var ns = namespaces[i];
			for(var member in ns) { 
				if(typeof ns[member] == 'function' && member.match(pointcut)) {
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
	}
	
	function stdInfo(str) {
		console.log('===================================================================');
		console.log(str);
		console.log('...................................................................\n');
	}
	
});


