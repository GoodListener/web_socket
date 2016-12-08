/**
 * 
 */
var playCtrl = playCtrl ||(function () {
	
	var module;
	
	var _init,
		_startDrawLine,
		_drawLine;
	
	var canvas,
		context;
	
	_init = function (id) {
		canvas = document.getElementById(id);
		context = canvas.getContext('2d');
	};
	
	
	_startDrawLine = function (position) {
		context.beginPath();
		context.moveTo(position.x, position.y);
	};
	
	_drawLine = function (position) {
		
		context.lineTo(position.x, position.y);
		context.lineWidth=1;
		context.strokeStyle="#000000";
		context.stroke();
	};
	
	module = {
		init 			: _init,
		startDrawLine 	: _startDrawLine,
		drawLine		: _drawLine
	};
	
	return module;
})();