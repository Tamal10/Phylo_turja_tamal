/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phylo;
import java.util.ArrayList;
import java.lang.Math;
/**
 *
 * @author TAMAL
 */
public class Phylo {

    /**
     * @param args the command line arguments
     */
    
    static int noOfSpecies;
    static int seqLen=8;
    static Species s[];
    Phylo(int n, Species s[]){
        noOfSpecies=n;
        Phylo.s=s;
    }
    
    ArrayList<Node> genLeafNodes(Species s[]){
        ArrayList<Node> leaves= new ArrayList<Node>();
        for(int i=0;i<s.length;i++)
            leaves.add(new Node(s[i],i));
        return leaves;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        noOfSpecies=4;
        s= new Species[noOfSpecies];
        s[0]= new Species("cow","ATCGGTCT");
        s[1]= new Species("bat","AATCGACT");
        s[2]= new Species("man","CTAAGTGT");
        s[3]= new Species("spider","TAGAGTAT");
        Population p= new Population(3,s);
        p.RandomPopulation();
        //Tree t=p.pop.get(0);
        //t.HillClimb(3);
        p.print();
    }
}
