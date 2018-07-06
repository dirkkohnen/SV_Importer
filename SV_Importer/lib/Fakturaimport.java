package default;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * @author dirk.kohnen
 *
 */
@JacksonXmlRootElement(localName = "fakturaimport") 
public class Fakturaimport {

	/**
	 *  Variablen
	 */
	@JacksonXmlProperty(localName = "xmlns", isAttribute = true)
	private String xmlns="https://scopevisio.com/accounting/fakturaimport";
	@JacksonXmlProperty(localName = "version", isAttribute = true)
	private String xmversionlns="2";
	
	
	/**
	 * Kontruktor
	 */
	public Fakturaimport() {
	}
	
	@JacksonXmlRootElement(localName = "customer") 
	public static final class Customer{
		
		/**
		 * Kundennummer (Personenkontonummer)
		 */
		@JacksonXmlProperty(localName = "account", isAttribute = true)
		public int account;
		
		/**
		 * Kundenname
		 */
		@JacksonXmlProperty(localName = "accountname", isAttribute = true)
		public String accountname;
		
		/**
		 * FiBu Personenkonto Sammelkonto (Sachkontonummer)
		 */
		@JacksonXmlProperty(localName = "summaryaccount", isAttribute = true)
		public int summaryaccount;
		
		/**
		 * ISO 4217, zB. EUR
		 */
		@JacksonXmlProperty(localName = "currency", isAttribute = true)
		public String currency;
		
		/**
		 * Umsatzsteuer ID
		 */
		@JacksonXmlProperty(localName = "ustid", isAttribute = true)
		public String ustid;
		
		/**
		 * Ist gesperrt
		 */
		@JacksonXmlProperty(localName = "islocked", isAttribute = true)
		public boolean islocked;
		
		/**
		 * Limit
		 */
		@JacksonXmlProperty(localName = "limit", isAttribute = true)
		public float limit;
		
		/**
		 * Steuernummer Prefix (ISO 3166, z.B: DE)
		 */
		@JacksonXmlProperty(localName = "vatcode", isAttribute = true)
		public String vatcode;
		
		/**
		 * Steuernummer
		 */
		@JacksonXmlProperty(localName = "vatregnumber", isAttribute = true)
		public String vatregnumber;
		
		/**
		 * Sprache
		 */
		@JacksonXmlProperty(localName = "language", isAttribute = true)
		public String language;
		
		/**
		 * Land
		 */
		@JacksonXmlProperty(localName = "country", isAttribute = true)
		public String country;
		
		/**
		 * Postleitzahl
		 */
		@JacksonXmlProperty(localName = "plz", isAttribute = true)
		public String plz;
		
		/**
		 * Stadt / Ort
		 */
		@JacksonXmlProperty(localName = "town", isAttribute = true)
		public String town;
		
		/**
		 * Straße
		 */
		@JacksonXmlProperty(localName = "street", isAttribute = true)
		public String street;
		
		/**
		 * c/o
		 */
		@JacksonXmlProperty(localName = "postbox", isAttribute = true)
		public boolean postbox;
		
		/**
		 * Telefon
		 */
		@JacksonXmlProperty(localName = "fone", isAttribute = true)
		public float fone;
		
		/**
		 * Fax
		 */
		@JacksonXmlProperty(localName = "fax", isAttribute = true)
		public String fax;
		
		/**
		 * E-Mail
		 */
		@JacksonXmlProperty(localName = "email", isAttribute = true)
		public String email;
		
		/**
		 * Bankkonto Inhaber
		 */
		@JacksonXmlProperty(localName = "bankowner", isAttribute = true)
		public String bankowner;
		
		/**
		 * Bankkonto Nummer
		 */
		@JacksonXmlProperty(localName = "bankaccount", isAttribute = true)
		public String bankaccount;
		
		/**
		 * Bankleitzahl
		 */
		@JacksonXmlProperty(localName = "bankcode", isAttribute = true)
		public String bankcode;
		
		/**
		 * IBAN
		 */
		@JacksonXmlProperty(localName = "iban", isAttribute = true)
		public String iban;
		
		/**
		 * Zahlungsbedingung
		 */
		@JacksonXmlProperty(localName = "paymentcondition", isAttribute = true)
		public float paymentcondition;
		
		/**
		 *  Skonto 1 Frist in Tagen
		 */
		@JacksonXmlProperty(localName = "discountperiod1", isAttribute = true)
		public int discountperiod1;
		
		/**
		 * Skonto 1
		 */
		@JacksonXmlProperty(localName = "discountpercent1", isAttribute = true)
		public float discountpercent1;
		
		/**
		 * Skonto 2 Frist in Tagen
		 */
		@JacksonXmlProperty(localName = "discountperiod2", isAttribute = true)
		public int discountperiod2;
		
		/**
		 * Skonto 2
		 */
		@JacksonXmlProperty(localName = "discountpercent2", isAttribute = true)
		public float discountpercent2;
		
		/**
		 * Fälligkeitsfrist in Tagen
		 */
		@JacksonXmlProperty(localName = "nettimelimit", isAttribute = true)
		public int nettimelimit;
		
		/**
		 * Kundennummer
		 */
		@JacksonXmlProperty(localName = "externalnumber", isAttribute = true)
		public String externalnumber;
		
		/**
		 * Zahlungsart
		 */
		@JacksonXmlProperty(localName = "paymenttype", isAttribute = true)
		public String paymenttype;
		
		/**
		 * Für Zahlung gesperrt
		 */
		@JacksonXmlProperty(localName = "isdisablepayment", isAttribute = true)
		public Boolean isdisablepayment;
		
		/**
		 *  CpD: contoprodiverse
		 */
		@JacksonXmlProperty(localName = "contoprodiverse", isAttribute = true)
		public Boolean contoprodiverse;
		
		/**
		 * Für Mahnlauf gesperrt
		 */
		@JacksonXmlProperty(localName = "isdisablereminder", isAttribute = true)
		public Boolean isdisablereminder;
		
		/**
		 * Bank Name
		 */
		@JacksonXmlProperty(localName = "bank", isAttribute = true)
		public String bank;
		
		/**
		 * SWIFT BIC
		 */
		@JacksonXmlProperty(localName = "swiftbic", isAttribute = true)
		public String swiftbic;
		
		/**
		 * Kreditorischer Debitor (Personenkontonummer)
		 */
		@JacksonXmlProperty(localName = "kontokorrent", isAttribute = true)
		public String kontokorrent;

		/**
		 * Konstruktor
		 */
		public Customer() {
			
		}
	}

	@JacksonXmlRootElement(localName = "invoice") 
	public static final class Invoice{
	
		/**
		 * Rechnungsnummer
		 */
		@JacksonXmlProperty(localName = "documentNumber", isAttribute = true)
		public String documentNumber;
		
		/**
		 * Rechnungsdatum
		 */
		@JacksonXmlProperty(localName = "documentDate", isAttribute = true)
		public String documentDate;
			
		/**
		 * User
		 */
		@JacksonXmlProperty(localName = "user", isAttribute = true)
		public String user;
		
		/**
		 * customer
		 */
		@JacksonXmlProperty(localName = "customer", isAttribute = true)
		public String customer;
		
		/**
		 * deliveryDateFrom
		 */
		@JacksonXmlProperty(localName = "deliveryDateFrom", isAttribute = true)
		public String deliveryDateFrom;
		
		/**
		 * Sprache
		 */
		@JacksonXmlProperty(localName = "language", isAttribute = true)
		public String language;
			
		/**
		 * endDiscount
		 */
		@JacksonXmlProperty(localName = "endDiscount", isAttribute = true)
		public String endDiscount;
		
		/**
		 * isEndDiscountAbsolute
		 */
		@JacksonXmlProperty(localName = "isEndDiscountAbsolute", isAttribute = true)
		public Boolean isEndDiscountAbsolute;

		/**
		 * Child-Tag "texts"
		 */
		public Texts texts;

		/**
		 * Child-Tag "adress"
		 */
		public Adress adress;

		/**
		 * Child-Tag "payment"
		 */
		public Payment payment;

		/**
		 * Child-Tag "delivery"
		 */
		public Delivery delivery;
		
		public Invoice() {
			
		}
	}
	
	@JacksonXmlRootElement(localName = "texts") 
	public static final class Texts{
		
		/**
		 * Child-Tag "titel"
		 */
		public Title title;
		/**
		 * Child-Tag "subtitle"
		 */
		public Subtitle subtitle;
		/**
		 * Child-Tag "intro"
		 */
		public Intro intro;
		/**
		 * Child-Tag "extro"
		 */
		public Extro extro;
		
		/**
		 * Kontruktor
		 */
		public Texts() {
			
		}
	}
	
	@JacksonXmlRootElement(localName = "title") 
	public static final class Title{
		
		/**
		 * Text
		 */
		public String text;
		
		/**
		 * Kontruktor
		 */
		public Title() {
		}
		
	}

	@JacksonXmlRootElement(localName = "subtitle") 
	public static final class Subtitle{
		
		/**
		 * Text
		 */
		public String text;
		
		/**
		 * Kontruktor
		 */
		public Subtitle() {
		}
		
	}

	@JacksonXmlRootElement(localName = "intro") 
	public static final class Intro{
		
		/**
		 * Text
		 */
		public String text;
		
		/**
		 * Kontruktor
		 */
		public Intro() {
		}
		
	}

	@JacksonXmlRootElement(localName = "extro") 
	public static final class Extro{
		
		/**
		 * Text
		 */
		public String text;
		
		/**
		 * Kontruktor
		 */
		public Extro() {
		}
		
	}

	@JacksonXmlRootElement(localName = "adress") 
	public static final class Adress{
		/**
		 * Adressart
		 */
		@JacksonXmlProperty(localName = "selectedAddress", isAttribute = true)
		public String selectedAddress;
		/**
		 * Freie Adressangabe
		 */
		@JacksonXmlProperty(localName = "otherAddress", isAttribute = true)
		public String otherAddress;
		
		public Adress() {
			
		}
	}

	@JacksonXmlRootElement(localName = "payment ") 
	public static final class Payment {
		/**
		 * Zahlungsart
		 */
		@JacksonXmlProperty(localName = "type", isAttribute = true)
		public String type;
		/**
		 * Auf exportiertem Beleg als bezahlt ausweisen
		 */
		@JacksonXmlProperty(localName = "paidOnExport", isAttribute = true)
		public Boolean paidOnExport;
		/**
		 * Skontodatum 1
		 */
		@JacksonXmlProperty(localName = "discountDate1", isAttribute = true)
		public Date discountDate1;
		/**
		 * Skontodatum 2
		 */
		@JacksonXmlProperty(localName = "discountDate2", isAttribute = true)
		public Date discountDate2;
		/**
		 * Skonto 1 in Prozent
		 */
		@JacksonXmlProperty(localName = "discountPercent1", isAttribute = true)
		public float discountPercent1;
		/**
		 * Skonto 2 in Prozent
		 */
		@JacksonXmlProperty(localName = "discountPercent2", isAttribute = true)
		public float discountPercent2;
		/**
		 * Skontobeträge manuell angeben
		 */
		@JacksonXmlProperty(localName = "explicitDiscount", isAttribute = true)
		public Boolean explicitDiscount;
		/**
		 * Skontobetrag 1
		 */
		@JacksonXmlProperty(localName = "discountAmount1", isAttribute = true)
		public float discountAmount1;
		/**
		 * Skontobetrag 2
		 */
		@JacksonXmlProperty(localName = "discountAmount2", isAttribute = true)
		public float discountAmount2;
		/**
		 * Fälligkeitsdatum
		 */
		@JacksonXmlProperty(localName = "dueDate", isAttribute = true)
		public Date dueDate;
		
		public Payment() {
			
		}
		
	}

	@JacksonXmlRootElement(localName = "delivery") 
	public static final class Delivery{
		/**
		 * Lieferart
		 */
		@JacksonXmlProperty(localName = "type", isAttribute = true)
		public String type;
		/**
		 * Lieferkosten
		 */
		@JacksonXmlProperty(localName = "costs", isAttribute = true)
		public float costs;
		/**
		 * Nachnahme
		 */
		@JacksonXmlProperty(localName = "cashOnDelivery", isAttribute = true)
		public float cashOnDelivery;
		
		public Delivery() {
			
		}
	}

	@JacksonXmlRootElement(localName = "lines") 
	public static final class Lines{
		
		/**
		 * Child-Tags "line"
		 */
		public List<Line> positionen;
		
		/**
		 * Kontruktor
		 */
		public Lines() {
			
		}
	}
	
	@JacksonXmlRootElement(localName = "line") 
	public static final class Line{
	
		/**
		 * Art der Postition
		 */
		@JacksonXmlProperty(localName = "positionType", isAttribute = true)
		public String positionType;
		
		/**
		 * Produktnummer
		 */
		@JacksonXmlProperty(localName = "productNumber", isAttribute = true)
		public String productNumber;
			
		/**
		 * Einheit
		 */
		@JacksonXmlProperty(localName = "unit", isAttribute = true)
		public String unit;
		
		/**
		 * Rabatt
		 */
		@JacksonXmlProperty(localName = "discount", isAttribute = true)
		public String discount;
		
		/**
		 * FiBu Steuerschlüssel
		 */
		@JacksonXmlProperty(localName = "vatkey", isAttribute = true)
		public String vatkey;
		
		/**
		 * Steuer
		 */
		@JacksonXmlProperty(localName = "taxrate", isAttribute = true)
		public String taxrate;
			
		/**
		 * Einzelpreis, netto
		 */
		@JacksonXmlProperty(localName = "netitemprice", isAttribute = true)
		public String netitemprice;
		
		/**
		 * Einzelpreis, brutto
		 */
		@JacksonXmlProperty(localName = "grossitemprice", isAttribute = true)
		public Boolean grossitemprice;
			
		/**
		 * Menge
		 */
		@JacksonXmlProperty(localName = "quantity", isAttribute = true)
		public String quantity;
		
		/**
		 * FiBu Sachkonto (Sachkontonummer)
		 */
		@JacksonXmlProperty(localName = "account", isAttribute = true)
		public Boolean account;

		/**
		 * Produktname (8192 Zeichen) 
		 */
		public String text;

		public Line() {
			
		}
	}



}