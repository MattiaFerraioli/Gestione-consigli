/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioniconsiglij;
import java.io.*;

/**
 *
 * @author abru
 */
public class Jarchivio {
    private String fileName;
    private int numEl;
    private Jconsiglio vett[];
    private FileReader f;
    private StreamTokenizer t;
    
    public Jarchivio(String fileName){
        this.fileName=fileName;
        numEl=0;
        try
        {
            f = new FileReader(fileName);
            t = new StreamTokenizer(f);
            
        }catch(FileNotFoundException e){
            System.out.print("file non trovato");
        }
        
    }
    
    public void lettura(){
        String s1,s2;
        int oraInizio=0,i=0;
        Jconsiglio c = new Jconsiglio();
        t.whitespaceChars(';', ';');
        int res=-1;
        do
        {
           try{
               res=t.nextToken();
           
           }catch(IOException e){} 
           
           if(res==StreamTokenizer.TT_WORD)
           {
               if(i<=1)
               {
                   s1=t.sval;
                   i++;
                   c.setClasse(s1);
               }
           }
            
        }while(res!=StreamTokenizer.TT_EOL);
    }
    
}

