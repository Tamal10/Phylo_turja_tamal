/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phylo;

/**
 *
 * @author TAMAL
 */
public class Species {
    String speciesName;
    char seq[];
    
    Species(String name, String seq){
        speciesName= name;
        this.seq=seq.toCharArray();
    }
    Species()
    {
    	speciesName="";
    	seq=new char[Phylo.seqLen];
    }
    void PrintSpecies(){
        System.out.println(speciesName +" " + new String(seq));
    }
}
