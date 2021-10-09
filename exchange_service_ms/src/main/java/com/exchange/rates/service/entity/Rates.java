package com.exchange.rates.service.entity;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rates{


	private Double GBP;

    private Double USD;

    private Double HKD;

    private Double AED;
    
    private Double AFN;
    
	private Double AMD;

	private Double ANG;
	private Double AOA;
	private Double ARS;
	private Double AUD;
	private Double AWG;
	private Double AZN;
	private Double BAM;
	private Double BBD;
	private Double BDT;
	private Double BGN;
	private Double BHD;
	private Double BIF;
	private Double BMD;
	private Double BND;
	private Double BOB;
	private Double BRL;
	private Double BSD;
	private Double BTC;
	private Double BTN;
	private Double BWP;
	private Double BYR;
	private Double BZD;
	private Double CAD;
	private Double CDF;
	private Double CHF;
	private Double CLF;
	private Double CLP;
	private Double CNY;
	private Double COP;
	private Double CRC;
	private Double CUP;
	private Double CVE;
	private Double CZK;
	private Double DJF;
	private Double DKK;
	private Double DOP;
	private Double DZD;
	private Double EGP;
	private Double ERN;
	private Double ETB;
	private Double EUR;
	private Double FJD;
	private Double FKP;
	private Double GEL;
	private Double GHS;
	private Double GIP;
	private Double GMD;
	private Double GNF;
	private Double GTQ;
	private Double GYD;
	private Double HNL;
	private Double HRK;
	private Double HTG;
	private Double HUF;
	private Double IDR;
	private Double ILS;
	private Double INR;
	private Double IQD;
	private Double IRR;
	private Double ISK;
	private Double JEP;
	private Double JMD;
	private Double JOD;
	private Double JPY;
	private Double KES;
	private Double KGS;
	private Double KHR;
	private Double KMF;
	private Double KPW;
	private Double KRW;
	private Double KWD;
	private Double KYD;
	private Double KZT;
	private Double LAK;
	private Double LBP;
	private Double LKR;
	private Double LRD;
	private Double LSL;
	private Double LTL;
	private Double LVL;
	private Double LYD;
	private Double MAD;
	private Double MDL;
	private Double MGA;
	private Double MKD;
	private Double MMK;
	private Double MNT;
	private Double MOP;
	private Double MRO;
	private Double MUR;
	private Double MVR;
	private Double MWK;
	private Double MXN;
	private Double MYR;
	private Double MZN;
	private Double NAD;
	private Double NGN;
	private Double NIO;
	private Double NOK;
	private Double NPR;
	private Double NZD;
	private Double OMR;
	private Double PAB;
	private Double PEN;
	private Double PGK;
	private Double PHP;
	private Double PKR;
	private Double PLN;
	private Double PYG;
	private Double QAR;
	private Double RON;
	private Double RSD;
	private Double RUB;
	private Double RWF;
	private Double SAR;
	private Double SBD;
	private Double SCR;
	private Double SDG;
	private Double SEK;
	private Double SGD;
	private Double SHP;
	private Double SLL;
	private Double SOS;
	private Double SRD;
	private Double STD;
	private Double SVC;
	private Double SYP;
	private Double SZL;
	private Double THB;
	private Double TJS;
	private Double TMT;
	private Double TND;
	private Double TOP;
	private Double TRY;
	private Double TTD;
	private Double TWD;
	private Double TZS;
	private Double UAH;
	private Double UGX;
	private Double UYU;
	private Double UZS;
	private Double VEF;
	private Double VND;
	private Double VUV;
	private Double WST;
	private Double XAF;
	private Double XAG;
	private Double XAU;
	private Double XCD;
	private Double XDR;
	private Double XOF;
	private Double XPF;
	private Double YER;
	private Double ZAR;
	private Double ZMK;
	private Double ZMW;
	private Double ZWL;
	public Double getBAM() {
		return BAM;
	}
	@JsonProperty("BAM")
	public void setBAM(Double BAM) {
		this.BAM = BAM;
	}
	public Double getBBD() {
		return BBD;
	}
	@JsonProperty("BBD")
	public void setBBD(Double BBD) {
		this.BBD = BBD;
	}
	public Double getBDT() {
		return BDT;
	}
	@JsonProperty("BDT")
	public void setBDT(Double BDT) {
		this.BDT = BDT;
	}
	public Double getBGN() {
		return BGN;
	}
	@JsonProperty("BGN")
	public void setBGN(Double BGN) {
		this.BGN = BGN;
	}
	public Double getBHD() {
		return BHD;
	}
	@JsonProperty("BHD")
	public void setBHD(Double BHD) {
		this.BHD = BHD;
	}
	public Double getBIF() {
		return BIF;
	}
	@JsonProperty("BIF")
	public void setBIF(Double BIF) {
		this.BIF = BIF;
	}
	public Double getBMD() {
		return BMD;
	}
	@JsonProperty("BMD")
	public void setBMD(Double BMD) {
		this.BMD = BMD;
	}
	public Double getBND() {
		return BND;
	}
	@JsonProperty("BND")
	public void setBND(Double BND) {
		this.BND = BND;
	}
	public Double getBOB() {
		return BOB;
	}
	@JsonProperty("BOB")
	public void setBOB(Double BOB) {
		this.BOB = BOB;
	}
	public Double getBRL() {
		return BRL;
	}
	@JsonProperty("BRL")
	public void setBRL(Double BRL) {
		this.BRL = BRL;
	}
	public Double getBSD() {
		return BSD;
	}
	@JsonProperty("BSD")
	public void setBSD(Double BSD) {
		this.BSD = BSD;
	}
	public Double getBTC() {
		return BTC;
	}
	@JsonProperty("BTC")
	public void setBTC(Double BTC) {
		this.BTC = BTC;
	}
	public Double getBTN() {
		return BTN;
	}
	@JsonProperty("BTN")
	public void setBTN(Double BTN) {
		this.BTN = BTN;
	}
	public Double getBWP() {
		return BWP;
	}
	@JsonProperty("BWP")
	public void setBWP(Double BWP) {
		this.BWP = BWP;
	}
	public Double getBYR() {
		return BYR;
	}
	@JsonProperty("BYR")
	public void setBYR(Double BYR) {
		this.BYR = BYR;
	}
	public Double getBZD() {
		return BZD;
	}
	@JsonProperty("BZD")
	public void setBZD(Double BZD) {
		this.BZD = BZD;
	}

	

	public Double getAED() {
		return AED;
	}
	@JsonProperty("AED")
	public void setAED(Double AED) {
		this.AED = AED;
	}
	public Double getAFN() {
		return AFN;
	}
	@JsonProperty("AFN")
	public void setAFN(Double AFN) {
		this.AFN = AFN;
	}
	public Double getAMD() {
		return AMD;
	}
	@JsonProperty("AMD")
	public void setAMD(Double AMD) {
		this.AMD = AMD;
	}
	
	public Double getANG() {
		return ANG;
	}
	@JsonProperty("ANG")
	public void setANG(Double ANG) {
		this.ANG = ANG;
	}
	public Double getAOA() {
		return AOA;
	}
	@JsonProperty("AOA")
	public void setAOA(Double AOA) {
		this.AOA = AOA;
	}
	public Double getARS() {
		return ARS;
	}
	@JsonProperty("ARS")
	public void setARS(Double ARS) {
		this.ARS = ARS;
	}
	public Double getAUD() {
		return AUD;
	}
	@JsonProperty("AUD")
	public void setAUD(Double AUD) {
		this.AUD = AUD;
	}
	public Double getAWG() {
		return AWG;
	}
	@JsonProperty("AWG")
	public void setAWG(Double AWG) {
		this.AWG = AWG;
	}
	public Double getAZN() {
		return AZN;
	}
	@JsonProperty("AZN")
	public void setAZN(Double AZN) {
		this.AZN = AZN;
	}
	public Double getCAD() {
		return CAD;
	}
	@JsonProperty("CAD")
	public void setCAD(Double CAD) {
		this.CAD = CAD;
	}
	public Double getCDF() {
		return CDF;
	}
	@JsonProperty("CDF")
	public void setCDF(Double CDF) {
		this.CDF = CDF;
	}
	public Double getCHF() {
		return CHF;
	}
	@JsonProperty("CHF")
	public void setCHF(Double CHF) {
		this.CHF = CHF;
	}
	public Double getCLF() {
		return CLF;
	}
	@JsonProperty("CLF")
	public void setCLF(Double CLF) {
		this.CLF = CLF;
	}
	public Double getCLP() {
		return CLP;
	}
	@JsonProperty("CLP")
	public void setCLP(Double CLP) {
		this.CLP = CLP;
	}
	public Double getCNY() {
		return CNY;
	}
	@JsonProperty("CNY")
	public void setCNY(Double CNY) {
		this.CNY = CNY;
	}
	public Double getCOP() {
		return COP;
	}
	@JsonProperty("COP")
	public void setCOP(Double COP) {
		this.COP = COP;
	}
	public Double getCRC() {
		return CRC;
	}
	@JsonProperty("CRC")
	public void setCRC(Double CRC) {
		this.CRC = CRC;
	}
	public Double getCUP() {
		return CUP;
	}
	@JsonProperty("CUP")
	public void setCUP(Double CUP) {
		this.CUP = CUP;
	}
	public Double getCVE() {
		return CVE;
	}
	@JsonProperty("CVE")
	public void setCVE(Double CVE) {
		this.CVE = CVE;
	}
	public Double getCZK() {
		return CZK;
	}
	@JsonProperty("CZK")
	public void setCZK(Double CZK) {
		this.CZK = CZK;
	}
	public Double getDJF() {
		return DJF;
	}
	@JsonProperty("DJF")
	public void setDJF(Double DJF) {
		this.DJF = DJF;
	}
	public Double getDKK() {
		return DKK;
	}
	@JsonProperty("DKK")
	public void setDKK(Double DKK) {
		this.DKK = DKK;
	}
	public Double getDOP() {
		return DOP;
	}
	@JsonProperty("DOP")
	public void setDOP(Double DOP) {
		this.DOP = DOP;
	}
	public Double getDZD() {
		return DZD;
	}
	@JsonProperty("DZD")
	public void setDZD(Double DZD) {
		this.DZD = DZD;
	}
	public Double getEGP() {
		return EGP;
	}
	@JsonProperty("EGP")
	public void setEGP(Double EGP) {
		this.EGP = EGP;
	}
	public Double getERN() {
		return ERN;
	}
	@JsonProperty("ERN")
	public void setERN(Double ERN) {
		this.ERN = ERN;
	}
	public Double getETB() {
		return ETB;
	}
	@JsonProperty("ETB")
	public void setETB(Double ETB) {
		this.ETB = ETB;
	}
	public Double getEUR() {
		return EUR;
	}
	@JsonProperty("EUR")
	public void setEUR(Double EUR) {
		this.EUR = EUR;
	}
	public Double getFJD() {
		return FJD;
	}
	@JsonProperty("FJD")
	public void setFJD(Double FJD) {
		this.FJD = FJD;
	}
	public Double getFKP() {
		return FKP;
	}
	@JsonProperty("FKP")
	public void setFKP(Double FKP) {
		this.FKP = FKP;
	}
	public Double getGBP() {
		return GBP;
	}
	@JsonProperty("GBP")
	public void setGBP(Double GBP) {
		this.GBP = GBP;
	}
	public Double getGEL() {
		return GEL;
	}
	@JsonProperty("GEL")
	public void setGEL(Double GEL) {
		this.GEL = GEL;
	}
	public Double getGHS() {
		return GHS;
	}
	@JsonProperty("GHS")
	public void setGHS(Double GHS) {
		this.GHS = GHS;
	}
	public Double getGIP() {
		return GIP;
	}
	@JsonProperty("GIP")
	public void setGIP(Double GIP) {
		this.GIP = GIP;
	}
	public Double getGMD() {
		return GMD;
	}
	@JsonProperty("GMD")
	public void setGMD(Double GMD) {
		this.GMD = GMD;
	}
	public Double getGNF() {
		return GNF;
	}
	@JsonProperty("GNF")
	public void setGNF(Double GNF) {
		this.GNF = GNF;
	}
	public Double getGTQ() {
		return GTQ;
	}
	@JsonProperty("GTQ")
	public void setGTQ(Double GTQ) {
		this.GTQ = GTQ;
	}
	public Double getGYD() {
		return GYD;
	}
	@JsonProperty("GYD")
	public void setGYD(Double GYD) {
		this.GYD = GYD;
	}
	public Double getHKD() {
		return HKD;
	}
	@JsonProperty("HKD")
	public void setHKD(Double HKD) {
		this.HKD = HKD;
	}
	public Double getHNL() {
		return HNL;
	}
	@JsonProperty("HNL")
	public void setHNL(Double HNL) {
		this.HNL = HNL;
	}
	public Double getHRK() {
		return HRK;
	}
	@JsonProperty("HRK")
	public void setHRK(Double HRK) {
		this.HRK = HRK;
	}
	public Double getHTG() {
		return HTG;
	}
	@JsonProperty("HTG")
	public void setHTG(Double HTG) {
		this.HTG = HTG;
	}
	public Double getHUF() {
		return HUF;
	}
	@JsonProperty("HUF")
	public void setHUF(Double HUF) {
		this.HUF = HUF;
	}
	public Double getIDR() {
		return IDR;
	}
	@JsonProperty("IDR")
	public void setIDR(Double IDR) {
		this.IDR = IDR;
	}
	public Double getILS() {
		return ILS;
	}
	@JsonProperty("ILS")
	public void setILS(Double ILS) {
		this.ILS = ILS;
	}
	public Double getINR() {
		return INR;
	}
	@JsonProperty("INR")
	public void setINR(Double INR) {
		this.INR = INR;
	}
	public Double getIQD() {
		return IQD;
	}
	@JsonProperty("IQD")
	public void setIQD(Double IQD) {
		this.IQD = IQD;
	}
	public Double getIRR() {
		return IRR;
	}
	@JsonProperty("IRR")
	public void setIRR(Double IRR) {
		this.IRR = IRR;
	}
	public Double getISK() {
		return ISK;
	}
	@JsonProperty("ISK")
	public void setISK(Double ISK) {
		this.ISK = ISK;
	}
	public Double getJEP() {
		return JEP;
	}
	@JsonProperty("JEP")
	public void setJEP(Double JEP) {
		this.JEP = JEP;
	}
	public Double getJMD() {
		return JMD;
	}
	@JsonProperty("JMD")
	public void setJMD(Double JMD) {
		this.JMD = JMD;
	}
	public Double getJOD() {
		return JOD;
	}
	@JsonProperty("JOD")
	public void setJOD(Double JOD) {
		this.JOD = JOD;
	}
	public Double getJPY() {
		return JPY;
	}
	@JsonProperty("JPY")
	public void setJPY(Double JPY) {
		this.JPY = JPY;
	}
	public Double getKES() {
		return KES;
	}
	@JsonProperty("KES")
	public void setKES(Double KES) {
		this.KES = KES;
	}
	public Double getKGS() {
		return KGS;
	}
	@JsonProperty("KGS")
	public void setKGS(Double KGS) {
		this.KGS = KGS;
	}
	public Double getKHR() {
		return KHR;
	}
	@JsonProperty("KHR")
	public void setKHR(Double KHR) {
		this.KHR = KHR;
	}
	public Double getKMF() {
		return KMF;
	}
	@JsonProperty("KMF")
	public void setKMF(Double KMF) {
		this.KMF = KMF;
	}
	public Double getKPW() {
		return KPW;
	}
	@JsonProperty("KPW")
	public void setKPW(Double KPW) {
		this.KPW = KPW;
	}
	public Double getKRW() {
		return KRW;
	}
	@JsonProperty("KRW")
	public void setKRW(Double KRW) {
		this.KRW = KRW;
	}
	public Double getKWD() {
		return KWD;
	}
	@JsonProperty("KWD")
	public void setKWD(Double KWD) {
		this.KWD = KWD;
	}
	public Double getKYD() {
		return KYD;
	}
	@JsonProperty("KYD")
	public void setKYD(Double KYD) {
		this.KYD = KYD;
	}
	public Double getKZT() {
		return KZT;
	}
	@JsonProperty("KZT")
	public void setKZT(Double KZT) {
		this.KZT = KZT;
	}
	public Double getLAK() {
		return LAK;
	}
	@JsonProperty("LAK")
	public void setLAK(Double LAK) {
		this.LAK = LAK;
	}
	public Double getLBP() {
		return LBP;
	}
	@JsonProperty("LBP")
	public void setLBP(Double LBP) {
		this.LBP = LBP;
	}
	public Double getLKR() {
		return LKR;
	}
	@JsonProperty("LKR")
	public void setLKR(Double LKR) {
		this.LKR = LKR;
	}
	public Double getLRD() {
		return LRD;
	}
	@JsonProperty("LRD")
	public void setLRD(Double LRD) {
		this.LRD = LRD;
	}
	public Double getLSL() {
		return LSL;
	}
	@JsonProperty("LSL")
	public void setLSL(Double LSL) {
		this.LSL = LSL;
	}
	public Double getLTL() {
		return LTL;
	}
	@JsonProperty("LTL")
	public void setLTL(Double LTL) {
		this.LTL = LTL;
	}
	public Double getLVL() {
		return LVL;
	}
	@JsonProperty("LVL")
	public void setLVL(Double LVL) {
		this.LVL = LVL;
	}
	public Double getLYD() {
		return LYD;
	}
	@JsonProperty("LYD")
	public void setLYD(Double LYD) {
		this.LYD = LYD;
	}
	public Double getMAD() {
		return MAD;
	}
	@JsonProperty("MAD")
	public void setMAD(Double MAD) {
		this.MAD = MAD;
	}
	public Double getMDL() {
		return MDL;
	}
	@JsonProperty("MDL")
	public void setMDL(Double MDL) {
		this.MDL = MDL;
	}
	public Double getMGA() {
		return MGA;
	}
	@JsonProperty("MGA")
	public void setMGA(Double MGA) {
		this.MGA = MGA;
	}
	public Double getMKD() {
		return MKD;
	}
	@JsonProperty("MKD")
	public void setMKD(Double MKD) {
		this.MKD = MKD;
	}
	public Double getMMK() {
		return MMK;
	}
	@JsonProperty("MMK")
	public void setMMK(Double MMK) {
		this.MMK = MMK;
	}
	public Double getMNT() {
		return MNT;
	}
	@JsonProperty("MNT")
	public void setMNT(Double MNT) {
		this.MNT = MNT;
	}
	public Double getMOP() {
		return MOP;
	}
	@JsonProperty("MOP")
	public void setMOP(Double MOP) {
		this.MOP = MOP;
	}
	public Double getMRO() {
		return MRO;
	}
	@JsonProperty("MRO")
	public void setMRO(Double MRO) {
		this.MRO = MRO;
	}
	public Double getMUR() {
		return MUR;
	}
	@JsonProperty("MUR")
	public void setMUR(Double MUR) {
		this.MUR = MUR;
	}
	public Double getMVR() {
		return MVR;
	}
	@JsonProperty("MVR")
	public void setMVR(Double MVR) {
		this.MVR = MVR;
	}
	public Double getMWK() {
		return MWK;
	}
	@JsonProperty("MWK")
	public void setMWK(Double MWK) {
		this.MWK = MWK;
	}
	public Double getMXN() {
		return MXN;
	}
	@JsonProperty("MXN")
	public void setMXN(Double MXN) {
		this.MXN = MXN;
	}
	public Double getMYR() {
		return MYR;
	}
	@JsonProperty("MYR")
	public void setMYR(Double MYR) {
		this.MYR = MYR;
	}
	public Double getMZN() {
		return MZN;
	}
	@JsonProperty("MZN")
	public void setMZN(Double MZN) {
		this.MZN = MZN;
	}
	public Double getNAD() {
		return NAD;
	}
	@JsonProperty("NAD")
	public void setNAD(Double NAD) {
		this.NAD = NAD;
	}
	public Double getNGN() {
		return NGN;
	}
	@JsonProperty("NGN")
	public void setNGN(Double NGN) {
		this.NGN = NGN;
	}
	public Double getNIO() {
		return NIO;
	}
	@JsonProperty("NIO")
	public void setNIO(Double NIO) {
		this.NIO = NIO;
	}
	public Double getNOK() {
		return NOK;
	}
	@JsonProperty("NOK")
	public void setNOK(Double NOK) {
		this.NOK = NOK;
	}
	public Double getNPR() {
		return NPR;
	}
	@JsonProperty("NPR")
	public void setNPR(Double NPR) {
		this.NPR = NPR;
	}
	public Double getNZD() {
		return NZD;
	}
	@JsonProperty("NZD")
	public void setNZD(Double NZD) {
		this.NZD = NZD;
	}
	public Double getOMR() {
		return OMR;
	}
	@JsonProperty("OMR")
	public void setOMR(Double OMR) {
		this.OMR = OMR;
	}
	public Double getPAB() {
		return PAB;
	}
	@JsonProperty("PAB")
	public void setPAB(Double PAB) {
		this.PAB = PAB;
	}
	public Double getPEN() {
		return PEN;
	}
	@JsonProperty("PEN")
	public void setPEN(Double PEN) {
		this.PEN = PEN;
	}
	public Double getPGK() {
		return PGK;
	}
	@JsonProperty("PGK")
	public void setPGK(Double PGK) {
		this.PGK = PGK;
	}
	public Double getPHP() {
		return PHP;
	}
	@JsonProperty("PHP")
	public void setPHP(Double PHP) {
		this.PHP = PHP;
	}
	public Double getPKR() {
		return PKR;
	}
	@JsonProperty("PKR")
	public void setPKR(Double PKR) {
		this.PKR = PKR;
	}
	public Double getPLN() {
		return PLN;
	}
	@JsonProperty("PLN")
	public void setPLN(Double PLN) {
		this.PLN = PLN;
	}
	public Double getPYG() {
		return PYG;
	}
	@JsonProperty("PYG")
	public void setPYG(Double PYG) {
		this.PYG = PYG;
	}
	public Double getQAR() {
		return QAR;
	}
	@JsonProperty("QAR")
	public void setQAR(Double QAR) {
		this.QAR = QAR;
	}
	public Double getRON() {
		return RON;
	}
	@JsonProperty("RON")
	public void setRON(Double RON) {
		this.RON = RON;
	}
	public Double getRSD() {
		return RSD;
	}
	@JsonProperty("RSD")
	public void setRSD(Double RSD) {
		this.RSD = RSD;
	}
	public Double getRUB() {
		return RUB;
	}
	@JsonProperty("RUB")
	public void setRUB(Double RUB) {
		this.RUB = RUB;
	}
	public Double getRWF() {
		return RWF;
	}
	@JsonProperty("RWF")
	public void setRWF(Double RWF) {
		this.RWF = RWF;
	}
	public Double getSAR() {
		return SAR;
	}
	@JsonProperty("SAR")
	public void setSAR(Double SAR) {
		this.SAR = SAR;
	}
	public Double getSBD() {
		return SBD;
	}
	@JsonProperty("SBD")
	public void setSBD(Double SBD) {
		this.SBD = SBD;
	}
	public Double getSCR() {
		return SCR;
	}
	@JsonProperty("SCR")
	public void setSCR(Double SCR) {
		this.SCR = SCR;
	}
	public Double getSDG() {
		return SDG;
	}
	@JsonProperty("SDG")
	public void setSDG(Double SDG) {
		this.SDG = SDG;
	}
	public Double getSEK() {
		return SEK;
	}
	@JsonProperty("SEK")
	public void setSEK(Double SEK) {
		this.SEK = SEK;
	}
	public Double getSGD() {
		return SGD;
	}
	@JsonProperty("SGD")
	public void setSGD(Double SGD) {
		this.SGD = SGD;
	}
	public Double getSHP() {
		return SHP;
	}
	@JsonProperty("SHP")
	public void setSHP(Double SHP) {
		this.SHP = SHP;
	}
	public Double getSLL() {
		return SLL;
	}
	@JsonProperty("SLL")
	public void setSLL(Double SLL) {
		this.SLL = SLL;
	}
	public Double getSOS() {
		return SOS;
	}
	@JsonProperty("SOS")
	public void setSOS(Double SOS) {
		this.SOS = SOS;
	}
	public Double getSRD() {
		return SRD;
	}
	@JsonProperty("SRD")
	public void setSRD(Double SRD) {
		this.SRD = SRD;
	}
	public Double getSTD() {
		return STD;
	}
	@JsonProperty("STD")
	public void setSTD(Double STD) {
		this.STD = STD;
	}
	public Double getSVC() {
		return SVC;
	}
	@JsonProperty("SVC")
	public void setSVC(Double SVC) {
		this.SVC = SVC;
	}
	public Double getSYP() {
		return SYP;
	}
	@JsonProperty("SYP")
	public void setSYP(Double SYP) {
		this.SYP = SYP;
	}
	public Double getSZL() {
		return SZL;
	}
	@JsonProperty("SZL")
	public void setSZL(Double SZL) {
		this.SZL = SZL;
	}
	public Double getTHB() {
		return THB;
	}
	@JsonProperty("THB")
	public void setTHB(Double THB) {
		this.THB = THB;
	}
	public Double getTJS() {
		return TJS;
	}
	@JsonProperty("TJS")
	public void setTJS(Double TJS) {
		this.TJS = TJS;
	}
	public Double getTMT() {
		return TMT;
	}
	@JsonProperty("TMT")
	public void setTMT(Double TMT) {
		this.TMT = TMT;
	}
	public Double getTND() {
		return TND;
	}
	@JsonProperty("TND")
	public void setTND(Double TND) {
		this.TND = TND;
	}
	public Double getTOP() {
		return TOP;
	}
	@JsonProperty("TOP")
	public void setTOP(Double TOP) {
		this.TOP = TOP;
	}
	public Double getTRY() {
		return TRY;
	}
	@JsonProperty("TRY")
	public void setTRY(Double TRY) {
		this.TRY = TRY;
	}
	public Double getTTD() {
		return TTD;
	}
	@JsonProperty("TTD")
	public void setTTD(Double TTD) {
		this.TTD = TTD;
	}
	public Double getTWD() {
		return TWD;
	}
	@JsonProperty("TWD")
	public void setTWD(Double TWD) {
		this.TWD = TWD;
	}
	public Double getTZS() {
		return TZS;
	}
	@JsonProperty("TZS")
	public void setTZS(Double TZS) {
		this.TZS = TZS;
	}
	public Double getUAH() {
		return UAH;
	}
	@JsonProperty("UAH")
	public void setUAH(Double UAH) {
		this.UAH = UAH;
	}
	public Double getUGX() {
		return UGX;
	}
	@JsonProperty("UGX")
	public void setUGX(Double UGX) {
		this.UGX = UGX;
	}
	
	public Double getUSD() {
		return USD;
	}
	@JsonProperty("USD")
	public void setUSD(Double USD) {
		this.USD = USD;
	}
	public Double getUYU() {
		return UYU;
	}
	@JsonProperty("UYU")
	public void setUYU(Double UYU) {
		this.UYU = UYU;
	}
	public Double getUZS() {
		return UZS;
	}
	@JsonProperty("UZS")
	public void setUZS(Double UZS) {
		this.UZS = UZS;
	}
	public Double getVEF() {
		return VEF;
	}
	@JsonProperty("VEF")
	public void setVEF(Double VEF) {
		this.VEF = VEF;
	}
	public Double getVND() {
		return VND;
	}
	@JsonProperty("VND")
	public void setVND(Double VND) {
		this.VND = VND;
	}
	public Double getVUV() {
		return VUV;
	}
	@JsonProperty("VUV")
	public void setVUV(Double VUV) {
		this.VUV = VUV;
	}
	public Double getWST() {
		return WST;
	}
	@JsonProperty("WST")
	public void setWST(Double WST) {
		this.WST = WST;
	}
	public Double getXAF() {
		return XAF;
	}
	@JsonProperty("XAF")
	public void setXAF(Double XAF) {
		this.XAF = XAF;
	}
	public Double getXAG() {
		return XAG;
	}
	@JsonProperty("XAG")
	public void setXAG(Double XAG) {
		this.XAG = XAG;
	}
	public Double getXAU() {
		return XAU;
	}
	@JsonProperty("XAU")
	public void setXAU(Double XAU) {
		this.XAU = XAU;
	}
	public Double getXCD() {
		return XCD;
	}
	@JsonProperty("XCD")
	public void setXCD(Double XCD) {
		this.XCD = XCD;
	}
	public Double getXDR() {
		return XDR;
	}
	@JsonProperty("XDR")
	public void setXDR(Double XDR) {
		this.XDR = XDR;
	}
	public Double getXOF() {
		return XOF;
	}
	@JsonProperty("XOF")
	public void setXOF(Double XOF) {
		this.XOF = XOF;
	}
	public Double getXPF() {
		return XPF;
	}
	@JsonProperty("XPF")
	public void setXPF(Double XPF) {
		this.XPF = XPF;
	}
	public Double getYER() {
		return YER;
	}
	@JsonProperty("YER")
	public void setYER(Double YER) {
		this.YER = YER;
	}
	public Double getZAR() {
		return ZAR;
	}
	@JsonProperty("ZAR")
	public void setZAR(Double ZAR) {
		this.ZAR = ZAR;
	}
	public Double getZMK() {
		return ZMK;
	}
	@JsonProperty("ZMK")
	public void setZMK(Double ZMK) {
		this.ZMK = ZMK;
	}
	public Double getZMW() {
		return ZMW;
	}
	@JsonProperty("ZMW")
	public void setZMW(Double ZMW) {
		this.ZMW = ZMW;
	}
	public Double getZWL() {
		return ZWL;
	}
	@JsonProperty("ZWL")
	public void setZWL(Double ZWL) {
		this.ZWL = ZWL;
	}

}
