
// ou coloca "open" antes da palavra module ou utilize a forma abaixo com "to"
module app_calculo {
	
	exports br.com.cardoso.app.calculo;
	exports br.com.cardoso.app.calculo.interno;
		
	requires transitive app_logging;
	
	// ou utiliza esse


opens br.com.cardoso.app.calculo to app_logging, app_financeiro;
	
	requires app_api_publica;
	
	provides br.com.cardoso.app.Calculadora
	with br.com.cardoso.app.calculo.CalculadoraImpl;
	
}