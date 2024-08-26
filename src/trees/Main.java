package trees;

public class Main {
    public static void main(String[] args) {
        Tree arvore = new Tree();
        System.out.println("Tamanho: " + arvore.getSize());
        
        arvore.insert(5);
        System.out.println("Tamanho: " + arvore.getSize());
        
        arvore.insert(3);
        System.out.println("Tamanho: " + arvore.getSize());
        
        arvore.insert(6);
        System.out.println("Tamanho: " + arvore.getSize());
        
        arvore.insert(8);
        System.out.println("Tamanho: " + arvore.getSize());
        
        System.out.println("\nEm ordem:");
        arvore.printInOrder(arvore.getRoot());
        System.out.println("");
        
        System.out.println("\nPos-ordem:");
        arvore.printPosOrder(arvore.getRoot());
        System.out.println("");
        
        System.out.println("\nPre-ordem:");
        arvore.printPreOrder(arvore.getRoot());
        System.out.println("");
        
        System.out.print("\nQuantidade de elementos: ");
        System.out.println(arvore.countElements(arvore.getRoot()));
        System.out.println("");
        
        int n = 6;
        System.out.println("Existe " + n + " na arvore: ");
        System.out.println(arvore.isThere(arvore.getRoot(), n));
        System.out.print("");

        Tree subArvore = new Tree();
        
        subArvore.insert(6);
        subArvore.insert(8);

        System.out.println("\nsubArvore esta contida em arvore?");
        System.out.println(arvore.isSubTree(arvore.getRoot(), subArvore.getRoot()));
        System.out.println("");
    }
}
