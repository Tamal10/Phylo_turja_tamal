/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phylo;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author TAMAL
 */
public class Population {
    int popSize;
    ArrayList<Tree> pop;
    ArrayList<Node> leaves;
    Population(int n, ArrayList<Tree> p, Species s[]){
        popSize=n;
        pop=p;
        leaves= new ArrayList<Node>();
        for(int i=0;i<s.length;i++)
            leaves.add(new Node(s[i],i));
    }
    Population(int n, Species s[]){
        popSize=n;
        pop= new ArrayList<Tree>();
        leaves= new ArrayList<Node>();
        for(int i=0;i<s.length;i++)
            leaves.add(new Node(s[i],i));
    }
    
    void RandomPopulation(){
        for(int i=0;i<popSize;i++)
        {
        	Tree t=GenRandomIndividual();
        	t.ParsimonizeTree();
            pop.add(t);
            
            //ParsimonyScore.ParsimonizeTree(pop.get(i));
        }
    }
    
    Tree GenRandomIndividual(){
        Tree t;
        Random rn= new Random();
        ArrayList<Node> ind= new ArrayList<Node>(leaves);
        ArrayList<Node> spcs= new ArrayList<Node>(leaves);
        
        int count=0;
        while(spcs.size()>1){
            Node newInt= new Node(null,Phylo.noOfSpecies+count);
            count++;
            for(int i=0;i<2;i++){
                int index= rn.nextInt(spcs.size());
                Node removed=spcs.remove(index);
                if(removed.spc!=null)
                {    ind.get(removed.label).parent=newInt;
                    newInt.child[i]=ind.get(removed.label); 
                }else{
                    removed.parent=newInt;
                    newInt.child[i]=removed;
                    ind.add(removed);  
                }
            }
            spcs.add(newInt);
        //    System.out.println(count+ " " + spcs.size());
        }
        Node r=spcs.remove(0);
        ind.add(r);
        t= new Tree(ind);
        t.root=r;
        return t;
    }
    
    void print(){
       
        for(int i=0; i< popSize;i++){
            pop.get(i).print();
            pop.get(i).printTree(pop.get(i).root,0);
            System.out.println();
        }
    }
    
    ArrayList<ArrayList<Node>> CrossOver()
    {
    	ArrayList<ArrayList<Node>> C=new ArrayList<ArrayList<Node>>();
    	
    	return C;
    }
    
    
}
