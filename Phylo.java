/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phylo;

/**
 *
 * @author TAMAL
 */
public class Phylo {

    /**
     * @param args the command line arguments
     */
    
    static int noOfSpecies;
    static Species s[];
    Phylo(int n, Species s[]){
        noOfSpecies=n;
        this.s=s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        noOfSpecies=4;
        s= new Species[noOfSpecies];
        s[0]= new Species("cow","ATCGGTCT");
        s[1]= new Species("bat","AATCGACT");
        s[2]= new Species("man","CTAAGTGT");
        s[3]= new Species("spider","TAGAGTAT");
        Population p= new Population(3);
        p.RandomPopulation();
        p.print();
    }
}
