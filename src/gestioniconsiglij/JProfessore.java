package gestioniconsiglij;
import java.io.*;

public class JProfessore {
    
    private String vett[];
    private String nomeFile="Professore.txt";
    private String riga;
    private FileReader reader;
    private StreamTokenizer t;
    
    public JProfessore(String fileName, FileReader reader)
    {  
        nomeFile=fileName;
        try{
        reader= new FileReader(nomeFile);
        }catch(FileNotFoundException e){System.out.println("File non Trovato");}      
    }
    
    public void setVettore()
    {
        vett=new String[5];
        t=new StreamTokenizer(reader);
        t.whitespaceChars(';',';'); 
        int res=-1;
        int i=0;
        do{
            try{
                res=t.nextToken();
             }catch(IOException e){}
            
        if(res==StreamTokenizer.TT_WORD)
        {
            vett[i]=t.sval;
            i++;   
        } 
        }while(res!=StreamTokenizer.TT_EOL && res!=StreamTokenizer.TT_EOF);
    }
    
    public String[] getVett()
    {
        return vett;
    }
    
}
