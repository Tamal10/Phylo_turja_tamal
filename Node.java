/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phylo;

/**
 *
 * @author TAMAL
 */
public class Node {
    int label;
    Node child[]= new Node[2];
    Node parent;
    int score;
    int finalScore;
    int height;
    int helper;
    Species spc;
    
    
    Node(Species s,int l){
        label=l;
        spc=s;
        height=0;
        score=0;
        finalScore=0;
        child[0]=null;
        child[1]=null;
    }
    
    void print(){
        System.out.print(label);
//        if(child[0]!=null)
//            System.out.print(" " + child[0].label);
//        if(child[1]!=null)
//            System.out.print(" " + child[1].label);
//        if(parent!=null)
//            System.out.print(" " + parent.label);
        System.out.print("      ");
    }
}
