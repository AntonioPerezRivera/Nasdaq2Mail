
package eventos;

public class EventoBolsa {	
	
	private String symbol;
	private String queryDate;
	private String ask;
	private String change;
	private String percentChange;
	private String currency;
	private String daysLow;
	private String daysHigh;
	
	public EventoBolsa(String v, String qd, String a, String ch, String pch, String cur, String dL, String dH){
		symbol = v;
		queryDate = qd;
		ask = a;
		change = ch;
		percentChange = pch;
		currency = cur;
		daysLow = dL;
		daysHigh = dH;
	}
		
	public EventoBolsa() {
	}

	public String getSymbol() {
		return symbol;
	}
	
	public String getQueryDate(){
		return queryDate;
	}

	public String getAsk(){
		return ask;
	}
	
	public String getChange(){
		return change;
	}
	
	public String getPChange(){
		return percentChange;
	}
	
	public String getCurrency(){
		return currency;
	}
	
	public String getDaysLow(){
		return daysLow;
	}
	
	public String getDaysHigh(){
		return daysHigh;
	}
	
	public void setSymbol(String s) {
		symbol = s;
	}
	
	public void setQueryDate(String qd){
		queryDate = qd;
	}

	public void setAsk(String a){
		ask = a;
	}
	
	public void setChange(String c){
		change = c;
	}
	
	public void setPChange(String pc){
		percentChange = pc;
	}
	
	public void setCurrency(String cur){
		currency = cur;
	}
	
	public void setDaysLow(String dl){
		daysLow = dl;
	}
	
	public void setDaysHigh(String dh){
		daysHigh = dh;
	}
	
	
	@Override
	public String toString() {
		return ("Symbol: "+"["+getSymbol()+"]"+"\n"
				+"Date: "+getQueryDate()+"\n"
				+"Ask: "+getAsk()+"\n"
				+"Change: "+getChange()+"\n"
				+"Currency: "+getCurrency()+"\n"
				+"Days Low: "+getDaysLow()+"\n"+"Days High: "+getDaysHigh());
	}
}
