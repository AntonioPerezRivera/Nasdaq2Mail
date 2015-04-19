package eventos;

import org.mule.api.annotations.ContainsTransformerMethods;
import org.mule.api.annotations.Transformer;
import org.mule.module.json.JsonData;

import eventos.EventoBolsa;

@ContainsTransformerMethods
public class Transformador
{
	@Transformer  
	public EventoBolsa JSONToEventoHogar(JsonData obj) throws Exception 
	{	  	  
		EventoBolsa evento = new EventoBolsa();
		String symbol = obj.getAsString("query/results/quote/symbol");
		
		evento.setSymbol(symbol);
		
	
			evento.setQueryDate(obj.getAsString("query/created")); 
			evento.setAsk(obj.getAsString("query/results/quote/Ask"));
			evento.setChange(obj.getAsString("query/results/quote/Change"));
			evento.setPChange(obj.getAsString("query/results/quote/Change_PercentChange"));
			evento.setCurrency(obj.getAsString("query/results/quote/Currency"));
			evento.setDaysLow(obj.getAsString("query/results/quote/DaysLow"));
			evento.setDaysHigh(obj.getAsString("query/results/quote/DaysHigh"));

			
		
		return evento; 
	}
}
