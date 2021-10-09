import java.util.Scanner;
public class AstarSistemasInteligentes {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String I = in.nextLine();  /*Pega a entrada do usuário no formato (estado inicial) =  E1,E2,E3,E4...E10, E11. */
        String F = in.nextLine();  /*Pega a entrada do usuário no formato (estado final) =  E1,E2,E3,E4...E10, E11. */
        
        String EIaux [] = I.split("E");
        String EFaux [] = F.split("E");
        int EI = Integer.parseInt(EIaux[1]);
        int EF = Integer.parseInt(EFaux[1]);
       
       adjMatriz matriz = new adjMatriz().adjMatrizcreate(14, EI, EF);
                          
                         /* LIGAÇÕES DE E1 */

        matriz.push(0, 1, 10);       /*E1 para E2 gastando 10   */   
        
                         /* LIGAÇÕES DE E2 */

        matriz.push(1, 2, 8.5);      /*E2 para E3 gastando 8.5  */   
        matriz.push(1, 8, 10);       /*E2 para E9 gastando 10   */  
        matriz.push(1, 9, 3.5);      /*E2 para E10 gastando 3.5 */  

                         /* LIGAÇÕES DE E3 */

        matriz.push(2, 3, 6.3);      /*E3 para E4 gastando 6.3  */   
        matriz.push(2, 8, 9.4);      /*E3 para E9 gastando 9.4  */  
        matriz.push(2, 12, 18.7);    /*E3 para E13 gastando 18.7*/  

                         /* LIGAÇÕES DE E4 */

        matriz.push(3, 4, 13);       /*E4 para E5 gastando 13   */   
        matriz.push(3, 7, 15.3);     /*E4 para E8 gastando 15.3 */  
        matriz.push(3, 12, 12.8);    /*E4 para E13 gastando 12.8*/ 

                         /* LIGAÇÕES DE E5 */

        matriz.push(4, 5, 3);        /*E5 para E6 gastando 3    */   
        matriz.push(4, 6, 2.4);      /*E5 para E7 gastando 2.4  */  
        matriz.push(4, 7, 30);       /*E5 para E8 gastando 30   */ 

                         /* LIGAÇÕES DE E6 */
                /*De E6 não vai para nenhuma estação */

                         /* LIGAÇÕES DE E7 */
                /*De E6 não vai para nenhuma estação */
                    
                         /* LIGAÇÕES DE E8 */

        matriz.push(7, 8, 9.6);      /*E8 para E9 gastando 9.6  */   
        matriz.push(7, 11, 6.4);     /*E8 para E12 gastando 6.4  */  

                         /* LIGAÇÕES DE E9 */

        matriz.push(8, 10, 12.2);    /*E9 para E11 gastando 12.2  */   

                         /* LIGAÇÕES DE E10 */
                /*De E10 não vai para nenhuma estação */

                         /* LIGAÇÕES DE E11 */
                /*De E11 não vai para nenhuma estação */

                         /* LIGAÇÕES DE E12 */
                /*De E12 não vai para nenhuma estação */

                         /* LIGAÇÕES DE E13 */

        matriz.push(12, 13, 5.1);    /*E13 para E14 gastando 5.1  */  

                         /* LIGAÇÕES DE E12 */
                /*De E12 não vai para nenhuma estação */

 
                         /* LIGAÇÕES DE E1 (Heurística) */

        matriz.push2(0, 1, 10);       /*E1 para E2 gastando 10    */
        matriz.push2(0, 2, 18.5);     /*E1 para E3 gastando 18,5  */
        matriz.push2(0, 3, 24.8);     /*E1 para E4 gastando 24.8  */
        matriz.push2(0, 4, 36.4);     /*E1 para E5 gastando 36.4  */
        matriz.push2(0, 5, 38.8);     /*E1 para E6 gastando 38.8  */
        matriz.push2(0, 6, 35.8);     /*E1 para E7 gastando 35.8  */
        matriz.push2(0, 7, 25.4);     /*E1 para E8 gastando 25.4  */
        matriz.push2(0, 8, 17.6);     /*E1 para E9 gastando 17.6  */
        matriz.push2(0, 9, 9.1);      /*E1 para E10 gastando 9.1  */
        matriz.push2(0, 10, 16.7);    /*E1 para E11 gastando 16.7 */
        matriz.push2(0, 11, 27.3);    /*E1 para E12 gastando 27.3 */
        matriz.push2(0, 12, 27.6);    /*E1 para E13 gastando 27.6 */
        matriz.push2(0, 13, 29.8);    /*E1 para E14 gastando 29.8 */

                         /* LIGAÇÕES DE E2 (Heurística)*/
        
        matriz.push2(1, 2, 8.5);      /*E2 para E3 gastando 8.5   */
        matriz.push2(1, 3, 14.8);     /*E2 para E4 gastando 14.8  */
        matriz.push2(1, 4, 26.6);     /*E2 para E5 gastando 26.6  */
        matriz.push2(1, 5, 29.1);     /*E2 para E6 gastando 29.1  */
        matriz.push2(1, 6, 26.1);     /*E2 para E7 gastando 26.1  */
        matriz.push2(1, 7, 17.3);     /*E2 para E8 gastando 17.3  */
        matriz.push2(1, 8, 10);       /*E2 para E9 gastando 10    */
        matriz.push2(1, 9, 3.5);      /*E2 para E10 gastando 3.5  */
        matriz.push2(1, 10, 15.5);    /*E2 para E11 gastando 15.5 */
        matriz.push2(1, 11, 20.9);    /*E2 para E12 gastando 20.9 */
        matriz.push2(1, 12, 19.1);    /*E2 para E13 gastando 19.1 */
        matriz.push2(1, 13, 21.8);    /*E2 para E14 gastando 21.8 */

                         /* LIGAÇÕES DE E3 (Heurística)*/

        matriz.push2(2, 3, 6.3);      /*E3 para E4 gastando 6.3   */
        matriz.push2(2, 4, 18.2);     /*E3 para E5 gastando 18.2  */
        matriz.push2(2, 5, 20.6);     /*E3 para E6 gastando 20.6  */
        matriz.push2(2, 6, 17.6);     /*E3 para E7 gastando 17.6  */
        matriz.push2(2, 7, 13.6);     /*E3 para E8 gastando 13.6  */
        matriz.push2(2, 8, 9.4);      /*E3 para E9 gastando 9.4   */
        matriz.push2(2, 9, 10.3);     /*E3 para E10 gastando 10.3 */
        matriz.push2(2, 10, 19.5);    /*E3 para E11 gastando 19.5 */
        matriz.push2(2, 11, 19.1);    /*E3 para E12 gastando 19.1 */
        matriz.push2(2, 12, 12.1);    /*E3 para E13 gastando 12.1 */
        matriz.push2(2, 13, 16.6);    /*E3 para E14 gastando 16.6 */

                         /* LIGAÇÕES DE E4 (Heurística)*/

        matriz.push2(3, 4, 12);     /*E4 para E5 gastando  12   */
        matriz.push2(3, 5, 14.4);   /*E4 para E6 gastando 14.4  */
        matriz.push2(3, 6, 11.5);   /*E4 para E7 gastando 11.5  */
        matriz.push2(3, 7, 12.4);   /*E4 para E8 gastando 12.4  */
        matriz.push2(3, 8, 12.6);   /*E4 para E9 gastando 12.6  */
        matriz.push2(3, 9, 16.7);   /*E4 para E10 gastando 16.7 */
        matriz.push2(3, 10, 23.6);  /*E4 para E11 gastando 23.6 */
        matriz.push2(3, 11, 18.6);  /*E4 para E12 gastando 18.6 */
        matriz.push2(3, 12, 10.6);  /*E4 para E13 gastando 10.6 */
        matriz.push2(3, 13, 15.4);  /*E4 para E14 gastando 15.4 */

                        /* LIGAÇÕES DE E5 (Heurística)*/

        matriz.push2(4, 5, 3);      /*E5 para E6 gastando 3  */
        matriz.push2(4, 6, 2.4);    /*E5 para E7 gastando 2.4 */
        matriz.push2(4, 7, 19.4);   /*E5 para E8 gastando 19.4  */
        matriz.push2(4, 8, 23.3);   /*E5 para E9 gastando 23.3  */
        matriz.push2(4, 9, 28.2);   /*E5 para E10 gastando 28.2 */
        matriz.push2(4, 10, 34.2);  /*E5 para E11 gastando 34.2 */
        matriz.push2(4, 11, 24.8);  /*E5 para E12 gastando 24.8 */
        matriz.push2(4, 12, 14.5);  /*E5 para E13 gastando 14.5 */
        matriz.push2(4, 13, 17.9);  /*E5 para E14 gastando 17.9 */

                         /* LIGAÇÕES DE E6 (Heurística)*/

        matriz.push2(5, 6, 3.3);    /*E6 para E7 gastando 3.3   */
        matriz.push2(5, 7, 22.3);   /*E6 para E8 gastando 22.3  */
        matriz.push2(5, 8, 25.7);   /*E6 para E9 gastando 25.7  */
        matriz.push2(5, 9, 30.3);   /*E6 para E10 gastando 30.3 */
        matriz.push2(5, 10, 36.7);  /*E6 para E11 gastando 36.7 */
        matriz.push2(5, 11, 27.6);  /*E6 para E12 gastando 27.6 */
        matriz.push2(5, 12, 15.2);  /*E6 para E13 gastando 15.2 */
        matriz.push2(5, 13, 18.2);  /*E6 para E14 gastando 18.2 */

                         /* LIGAÇÕES DE E7 (Heurística)*/

        matriz.push2(6, 7, 20);     /*E7 para E8 gastando 20    */
        matriz.push2(6, 8, 23);     /*E7 para E9 gastando 23    */
        matriz.push2(6, 9, 27.3);   /*E7 para E10 gastando 27.3 */
        matriz.push2(6, 10, 34.2);  /*E7 para E11 gastando 34.2 */
        matriz.push2(6, 11, 25.7);  /*E7 para E12 gastando 25.7 */
        matriz.push2(6, 12, 12.4);  /*E7 para E13 gastando 12.4 */
        matriz.push2(6, 13, 15.6);  /*E7 para E14 gastando 15.6 */

                         /* LIGAÇÕES DE E8 (Heurística)*/

        matriz.push2(7, 8, 8.2);    /*E8 para E9 gastando 8.2   */
        matriz.push2(7, 9, 20.3);   /*E8 para E10 gastando 20.3 */
        matriz.push2(7, 10, 16.1);  /*E8 para E11 gastando 16.1 */
        matriz.push2(7, 11, 6.4);   /*E8 para E12 gastando 6.4 */
        matriz.push2(7, 12, 22.7);  /*E8 para E13 gastando 22.7 */
        matriz.push2(7, 13, 27.6);  /*E8 para E14 gastando 27.6 */

                         /* LIGAÇÕES DE E9 (Heurística)*/

        matriz.push2(8, 9, 13.5);   /*E9 para E10 gastando 13.5 */
        matriz.push2(8, 10, 11.2);  /*E9 para E11 gastando 11.2 */
        matriz.push2(8, 11, 10.9);  /*E9 para E12 gastando 10.9 */
        matriz.push2(8, 12, 21.2);  /*E9 para E13 gastando 21.2 */
        matriz.push2(8, 13, 26.6);  /*E9 para E14 gastando 26.6 */

                         /* LIGAÇÕES DE E10 (Heurística)*/
   
        matriz.push2(9, 10, 17.6);  /*E10 para E11 gastando 17.6 */
        matriz.push2(9, 11, 24.2);  /*E10 para E12 gastando 24.2 */
        matriz.push2(9, 12, 18.7);  /*E10 para E13 gastando 18.7 */
        matriz.push2(9, 13, 21.2);  /*E10 para E14 gastando 21.2 */

                         /* LIGAÇÕES DE E11 (Heurística)*/
   
        matriz.push2(10, 11, 14.2);  /*E11 para E12 gastando 14.2 */
        matriz.push2(10, 12, 31.5);  /*E11 para E13 gastando 31.5 */
        matriz.push2(10, 13, 35.5);  /*E11 para E14 gastando 35.5 */

                         /* LIGAÇÕES DE E12 (Heurística)*/
   
        matriz.push2(11, 12, 28.8);  /*E12 para E13 gastando 28.8 */
        matriz.push2(11, 13, 33.6);  /*E12 para E14 gastando 33.6 */

                         /* LIGAÇÕES DE E13 (Heurística)*/
   
        matriz.push2(12, 13, 5.1);  /*E13 para E14 gastando 33.6 */

       



     //   matriz.graphTraverse();
     //   matriz.print();


    }
}

class adjMatriz {
    private double [][] matriz;
    private int qtarestas;
    private int [] mark;
    private int qtvertices; 
    public int EI;
    public int EF;
    private Pilha s;

    adjMatriz adjMatrizcreate (int n, int EI, int EF) {  /*Criar matriz que relaciona custo real */
        this.EI = EI;  /*Marcando estado inicial */
        this.EF = EF;  /* Marcando estado final */
        this.mark =  new int [n];
        this.matriz =  new double [n][n];
        this.qtarestas = 0;
        this.qtvertices = n;
        this.s = new Pilha();
        return this;
    }

    void push (int v, int u, double aresta){
        this.matriz[v][u] = aresta;
    }

    void push2 (int v, int u, double aresta){
       /*SÓ PRA TIRAR O ERRO */
    }

    void print () {
        s.print();
    }

    /*O método first retorna o indice que representa o primeiro vértice ligado a v(indice que representa o vértice passado como parâmetro.) */

    int first (int v) {
        for (int i = 0; i <= this.qtvertices - 1; i++) {
            if (this.matriz[v][i]!=0) {
                return i;
            }
        }

        return this.qtvertices;
    }

    /*O método next retorna o indice que representa o próximo vértice ligado a v COMEÇANDO A BUSCA A PARTIR DE W(W REPRESENTA O INDICE DE UM VÉRTICE). */

    int next(int v, int w) {
        for (int i = w + 1; i <= this.qtvertices-1; i++) {
            if (this.matriz[v][i] != 0) {
                return i;
            }
        }
        return qtvertices;

    }

    /*O método set Edge altera o status da aresta entre 2 vértices. */

    void setEdge(int i, int j, int wt) {
        if (wt == 0) {
            /*Não pode, pq eu nao sei.*/
            /*Retorne error*/
            return;
        }

        if (this.matriz[i][j] == 0) {
            this.qtarestas++;
            this.matriz[i][j] = wt;
            /*Lembre-se que 0 denota ausência de aresta entre dois vértices */
        }

    }

    void delEdge(int i, int j, int wt) {
        if (this.matriz[i][j] != 0) {
            this.qtarestas--;
            this.matriz[i][j] = 0;
            /*Lembre-se que 0 denota ausência de aresta entre dois vértices */
        }

    }

    /*As funções setMark e getMark faz referencia ao array mark. setMark seta todas as posições do array para 0, o que significa que nenhum vertice foi visitado. e getMark retorna o status de visita de um vértice. */

    public void setMark(int v, int visitado) {
        this.mark [v] = visitado;
        /* 0 denota não visitado. */
    }

    public int getMark(int v) {
        return this.mark[v];

    }

    void graphTraverse (){

        for (int v = 0; v <= this.qtvertices - 1; v++) {
            setMark(v, 0); /*0 significa que não foi visitado */          
        }

        for (int v = 0; v <= this.qtvertices - 1; v++) {
            if (getMark(v) == 0) {
                dfs(v, this.s); /*Se o grafo não foi visitado chame o traverse(v), que neste caso pode ser DFS OU BFS...*/
                
                
                
            }
        }
    }



    void dfs(int v, Pilha s) {
        setMark(v, 1);
        int w = first(v);
        while (w <  this.qtvertices) {
            if (mark[w] == 0) {
                dfs(w);  /*Vai mudar */
            }
            w =  next(v, w);
        }

        s.inserir(v);
        
    }

}

class No {
    
    No next;
    int elemento;
    
    
    No createNos (int valor, No ponteiro) {
        this.next = new No();
        this.next.elemento = valor;
        this.next.next = ponteiro;            
        return this.next;
    }
    
    No getProximo () {
        return this.next;
    }
    
    
}

class Pilha {
   private No instanciaInicial;
   private No top;
   private int size;

    Pilha() {
        
        this.top = null;
        this.size = 0;
        this.instanciaInicial = new No();

    }

    void inserir (int valor) {
        

        this.top = this.instanciaInicial.createNos(valor, this.instanciaInicial.getProximo());
        
        this.size++;
    }

    void pop () {
        if(this.top == null) {
            return;
        }

        this.top = this.top.next;
        this.size--;
    }

    void print () {
        No aux = this.top;
        for (int i = 0; i < this.size; i++) {
            System.out.println(aux.elemento);
            aux = aux.next;
        }
    }
}

