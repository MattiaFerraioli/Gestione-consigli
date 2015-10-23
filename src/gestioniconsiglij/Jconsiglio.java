package gestioniconsiglij;

public class Jconsiglio
{
    private String d;
    private String oraInizio;
    private String oraFine;
    private String classe;

	public Jconsiglio()
        {
            
        }
        
	public Jconsiglio(String d, String oraInizio, String oraFine, String classe)
        {
            this.d=d;
            this.oraFine=oraFine;
            this.oraInizio=oraInizio;
            this.classe= classe;
            
        }
	public	String getData()
        {
            return d;
        }
	public	String getOraInizio()
        {
            return oraInizio;
        }
	public	String getOraFine()
        {
            return oraFine;
        }
	public	String getClasse()
        {
            return classe;
        }
	public	void setData(String newdata)
        {
            d= newdata;
        }
	public	void setOraInizio(String nuovaOra)
        {
            oraInizio = nuovaOra;
        }
	public	void setOraFine(String nuovaOra)
        {
            oraFine = nuovaOra;
        }
	public	void setClasse(String newClasse)
        {
            classe = newClasse;
        }
}
