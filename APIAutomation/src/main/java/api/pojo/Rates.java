package api.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Rates{

	@JsonProperty("GBP") 
	public double gBP;
	@JsonProperty("ILS") 
	public double iLS;
	@JsonProperty("ISK") 
	public double iSK;
	@JsonProperty("HKD") 
	public double hKD;
	@JsonProperty("IDR") 
	public double iDR;
	@JsonProperty("PLN") 
	public double pLN;
	@JsonProperty("DKK") 
	public double dKK;
	@JsonProperty("LVL") 
	public double lVL;
	@JsonProperty("INR") 
	public double iNR;
	@JsonProperty("CHF") 
	public double cHF;
	@JsonProperty("MXN") 
	public double mXN;
	@JsonProperty("CZK") 
	public double cZK;
	@JsonProperty("SGD") 
	public double sGD;
	@JsonProperty("THB") 
	public double tHB;
	@JsonProperty("BGN") 
	public double bGN;
	@JsonProperty("MYR") 
	public double mYR;
	@JsonProperty("NOK") 
	public double nOK;
	@JsonProperty("CNY") 
	public double cNY;
	@JsonProperty("HRK") 
	public double hRK;
	@JsonProperty("PHP") 
	public double pHP;
	@JsonProperty("SEK") 
	public double sEK;
	@JsonProperty("LTL") 
	public double lTL;
	@JsonProperty("ZAR") 
	public double zAR;
	@JsonProperty("CAD") 
	public double cAD;
	@JsonProperty("BRL") 
	public double bRL;
	@JsonProperty("RON") 
	public double rON;
	@JsonProperty("EEK") 
	public double eEK;
	@JsonProperty("NZD") 
	public double nZD;
	@JsonProperty("TRY") 
	public double tRY;
	@JsonProperty("JPY") 
	public double jPY;
	@JsonProperty("RUB") 
	public double rUB;
	@JsonProperty("KRW") 
	public double kRW;
	@JsonProperty("USD") 
	public double uSD;
	@JsonProperty("HUF") 
	public double hUF;
	@JsonProperty("AUD") 
	public double aUD;

	public double getgBP() {
		return gBP;
	}
	public void setgBP(double gBP) {
		this.gBP = gBP;
	}
	public double gethKD() {
		return hKD;
	}
	public void sethKD(double hKD) {
		this.hKD = hKD;
	}
	public double getiDR() {
		return iDR;
	}
	public void setiDR(double iDR) {
		this.iDR = iDR;
	}
	public double getpLN() {
		return pLN;
	}
	public void setpLN(double pLN) {
		this.pLN = pLN;
	}
	public double getdKK() {
		return dKK;
	}
	public void setdKK(double dKK) {
		this.dKK = dKK;
	}
	public double getlVL() {
		return lVL;
	}
	public void setlVL(double lVL) {
		this.lVL = lVL;
	}
	public double getiNR() {
		return iNR;
	}
	public void setiNR(double iNR) {
		this.iNR = iNR;
	}
	public double getcHF() {
		return cHF;
	}
	public void setcHF(double cHF) {
		this.cHF = cHF;
	}
	public double getmXN() {
		return mXN;
	}
	public void setmXN(double mXN) {
		this.mXN = mXN;
	}
	public double getcZK() {
		return cZK;
	}
	public void setcZK(double cZK) {
		this.cZK = cZK;
	}
	public double getsGD() {
		return sGD;
	}
	public void setsGD(double sGD) {
		this.sGD = sGD;
	}
	public double gettHB() {
		return tHB;
	}
	public void settHB(double tHB) {
		this.tHB = tHB;
	}
	public double getbGN() {
		return bGN;
	}
	public void setbGN(double bGN) {
		this.bGN = bGN;
	}
	public double getmYR() {
		return mYR;
	}
	public void setmYR(double mYR) {
		this.mYR = mYR;
	}
	public double getnOK() {
		return nOK;
	}
	public void setnOK(double nOK) {
		this.nOK = nOK;
	}
	public double getcNY() {
		return cNY;
	}
	public void setcNY(double cNY) {
		this.cNY = cNY;
	}
	public double gethRK() {
		return hRK;
	}
	public void sethRK(double hRK) {
		this.hRK = hRK;
	}
	public double getpHP() {
		return pHP;
	}
	public void setpHP(double pHP) {
		this.pHP = pHP;
	}
	public double getsEK() {
		return sEK;
	}
	public void setsEK(double sEK) {
		this.sEK = sEK;
	}
	public double getlTL() {
		return lTL;
	}
	public void setlTL(double lTL) {
		this.lTL = lTL;
	}
	public double getzAR() {
		return zAR;
	}
	public void setzAR(double zAR) {
		this.zAR = zAR;
	}
	public double getcAD() {
		return cAD;
	}
	public void setcAD(double cAD) {
		this.cAD = cAD;
	}
	public double getbRL() {
		return bRL;
	}
	public void setbRL(double bRL) {
		this.bRL = bRL;
	}
	public double getrON() {
		return rON;
	}
	public void setrON(double rON) {
		this.rON = rON;
	}
	public double geteEK() {
		return eEK;
	}
	public void seteEK(double eEK) {
		this.eEK = eEK;
	}
	public double getnZD() {
		return nZD;
	}
	public void setnZD(double nZD) {
		this.nZD = nZD;
	}
	public double gettRY() {
		return tRY;
	}
	public void settRY(double tRY) {
		this.tRY = tRY;
	}
	public double getjPY() {
		return jPY;
	}
	public void setjPY(double jPY) {
		this.jPY = jPY;
	}
	public double getrUB() {
		return rUB;
	}
	public void setrUB(double rUB) {
		this.rUB = rUB;
	}
	public double getkRW() {
		return kRW;
	}
	public void setkRW(double kRW) {
		this.kRW = kRW;
	}
	public double getuSD() {
		return uSD;
	}
	public void setuSD(double uSD) {
		this.uSD = uSD;
	}
	public double gethUF() {
		return hUF;
	}
	public void sethUF(double hUF) {
		this.hUF = hUF;
	}
	public double getaUD() {
		return aUD;
	}
	public void setaUD(double aUD) {
		this.aUD = aUD;
	}
	
	public double getiLS() {
		return aUD;
	}
	public void setiLS(double iLS) {
		this.iLS = iLS;
	}
	
	public double getiSK() {
		return iSK;
	}
	public void setiSK(double iSK) {
		this.iSK = iSK;
	}

}
