import java.util.Scanner;
import java.util.*;
import java.util.PriorityQueue;
public class AstarSistemasInteligentes {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite a estação inicial");
        String I = in.nextLine();  /*Pega a entrada do usuário no formato (estado inicial) =  E1,E2,E3,E4...E10, E11. */
        System.out.println("Digite a estação de destino");
        String F = in.nextLine();  /*Pega a entrada do usuário no formato (estado final) =  E1,E2,E3,E4...E10, E11. */
        
        String EIaux [] = I.split("E");
        String EFaux [] = F.split("E");
       
        int EI = Integer.parseInt(EIaux[1]);
        int EF = Integer.parseInt(EFaux[1]);
       
       adjMatriz matriz = new adjMatriz().adjMatrizcreate(14, EI-1, EF-1);
                          
                         /* LIGAÇÕES DE E1 */

        matriz.push(0, 1, 10);       /*E1 para E2 gastando 10   */   
        matriz.pushRotaCor(0, 1, "Azul");
        
                         /* LIGAÇÕES DE E2 */

        matriz.push(1, 2, 8.5);      /*E2 para E3 gastando 8.5  */   
        matriz.pushRotaCor(1, 2, "Azul");
        matriz.push(1, 8, 10);       /*E2 para E9 gastando 10   */  
        matriz.pushRotaCor(1, 8, "Amarelo");
        matriz.push(1, 9, 3.5);      /*E2 para E10 gastando 3.5 */  
        matriz.pushRotaCor(1, 9, "Amarelo");

                         /* LIGAÇÕES DE E3 */

        matriz.push(2, 3, 6.3);      /*E3 para E4 gastando 6.3  */   
        matriz.pushRotaCor(2, 3, "Azul");
        matriz.push(2, 8, 9.4);      /*E3 para E9 gastando 9.4  */  
        matriz.pushRotaCor(2, 8, "Vermelho");
        matriz.push(2, 12, 18.7);    /*E3 para E13 gastando 18.7*/  
        matriz.pushRotaCor(2, 12, "Vermelho");

                         /* LIGAÇÕES DE E4 */

        matriz.push(3, 4, 13);       /*E4 para E5 gastando 13   */  
        matriz.pushRotaCor(3, 4, "Azul");
        matriz.push(3, 7, 15.3);     /*E4 para E8 gastando 15.3 */ 
        matriz.pushRotaCor(3, 7, "Verde"); 
        matriz.push(3, 12, 12.8);    /*E4 para E13 gastando 12.8*/ 
        matriz.pushRotaCor(3, 12, "Verde");

                         /* LIGAÇÕES DE E5 */

        matriz.push(4, 5, 3);        /*E5 para E6 gastando 3    */   
        matriz.pushRotaCor(4, 5, "Azul");
        matriz.push(4, 6, 2.4);      /*E5 para E7 gastando 2.4  */ 
        matriz.pushRotaCor(4, 6, "Amarelo"); 
        matriz.push(4, 7, 30);       /*E5 para E8 gastando 30   */ 
        matriz.pushRotaCor(4, 7, "Amarelo");

                         /* LIGAÇÕES DE E6 */
                /*De E6 não vai para nenhuma estação */

                         /* LIGAÇÕES DE E7 */
                /*De E6 não vai para nenhuma estação */
                    
                         /* LIGAÇÕES DE E8 */

        matriz.push(7, 8, 9.6);      /*E8 para E9 gastando 9.6  */   
        matriz.pushRotaCor(7, 8, "Amarelo");
        matriz.push(7, 11, 6.4);     /*E8 para E12 gastando 6.4  */  
        matriz.pushRotaCor(7, 11, "Verde");

                         /* LIGAÇÕES DE E9 */

        matriz.push(8, 10, 12.2);    /*E9 para E11 gastando 12.2  */ 
        matriz.pushRotaCor(8, 10, "Vermelho");  

                         /* LIGAÇÕES DE E10 */
                /*De E10 não vai para nenhuma estação */

                         /* LIGAÇÕES DE E11 */
                /*De E11 não vai para nenhuma estação */

                         /* LIGAÇÕES DE E12 */
                /*De E12 não vai para nenhuma estação */

                         /* LIGAÇÕES DE E13 */

        matriz.push(12, 13, 5.1);    /*E13 para E14 gastando 5.1  */  
        matriz.pushRotaCor(12, 13, "Verde");

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



        matriz.graphTraverse();
       

    }
}

   
class adjMatriz {
    private double [][] matriz;
    public String [][] rotaCor;
    private double [][] matrizheuristica;
    public PriorityQueue <No> minHeap;
    private int [] mark;
    private int qtvertices; 
    public int EI;
    public int EF;
    public double custoTotal;

    adjMatriz adjMatrizcreate (int n, int EI, int EF) {  /*Criar matriz que relaciona custo real */
        this.EI = EI;  /*Marcando estado inicial */
        this.EF = EF;  /* Marcando estado final */
        this.minHeap = new PriorityQueue<>(14);
        this.mark =  new int [n];
        this.matriz =  new double [n][n];
        this.matrizheuristica =  new double [n][n];
        this.rotaCor = new String [n][n];
        this.qtvertices = n;
        this.custoTotal = 0;
        return this;
    }

    void push (int v, int u, double aresta){
        this.matriz[v][u] = aresta;
    }


    void pushRotaCor (int v, int u, String CorRota) {
        this.rotaCor [v] [u] = CorRota;
        this.rotaCor [u] [v] = CorRota;
    }

    void push2 (int v, int u, double aresta){
        this.matrizheuristica[v][u] = aresta;
    }


    void verificarFronteira(No EA) {
        for (int i = 0; i <= this.qtvertices-1; i++) {

            if (i == 0) {
                System.out.print("E"+(EA.elemento+1)+": ");
            }
            
           
           
            if (this.matriz[EA.elemento][i] != 0 || this.matriz[i][EA.elemento]!=0) {
                
                System.out.print("E"+(i+1)+" ");
                double custoParcial = 0;  
                double custoAparente = 0; 
                double heuristica = 0;
                double auxCustoParcial = 0;
                String rota = this.rotaCor[EA.elemento][i];
                
                /*Calculando custo real parcial...*/
                if (this.matriz[EA.elemento][i] != 0) {
                    auxCustoParcial = (this.matriz[EA.elemento][i]/30)*60;
                    custoParcial = EA.custoG + auxCustoParcial; 
                   
                }else {
                    auxCustoParcial = (this.matriz[i][EA.elemento]/30)*60; 
                    custoParcial = EA.custoG + auxCustoParcial;  
                    
                }

                /*Calculando Baldeação */
                if (EA.rotaAtual != rota && EA.rotaAtual!="X") {
                    custoParcial = custoParcial + 4;
                }
                
                /*Calculando heurística*/
                if ( this.matrizheuristica[i][this.EF] == 0 ) {
                    heuristica = (this.matrizheuristica[this.EF][i]/30)*60;
                    custoAparente = custoParcial + heuristica; 
                }else {
                    heuristica = (this.matrizheuristica[i][this.EF]/30)*60;
                    custoAparente = custoParcial + heuristica;  
                }
      
                No candidato = new No(i,EA.elemento, custoParcial, custoAparente, rota);  
                candidato.inicializeCaminho();
                candidato.pushcaminho(EA);
                /*Atualizando caminho para o No candidato, usando como referencia o caminho
                registrado do nó anterior/atual/queTaSendoExpandido (EA)*/
                this.minHeap.add(candidato);  
                  
            }

            if (i == 13) {
                System.out.println(" ");
            }
        }
    }

    void graphTraverse (){

       

        No candidatoInicial = new No(this.EI, this.EI, 0, 0,"X");
        candidatoInicial.inicializeCaminho();
        candidatoInicial.pushcaminhoRESTRICAO(this.EI);
        this.minHeap.add(candidatoInicial);
       
        while (!this.minHeap.isEmpty()){
            No EA = this.minHeap.remove();   
            
           
                if (EA.elemento == this.EF) {
                    this.custoTotal = EA.custoG;   
                    int aux  = 0;
                    while (aux < 14) {
                        if (EA.caminho[aux] == -1) {
                            break;
                        }else {
                            System.out.println(EA.caminho[aux]+1);
                        }
                        aux++;
                    }   
                    System.out.println("CUSTO: "+ this.custoTotal+" minutos");
                    break;      
                }
                verificarFronteira(EA);
            
        
        }

       
    }

  

}

class No implements Comparable<No>{
    
    int elemento;
    double custoG; // Custo real acumulado
    double custoAparente; // g+h, o custo que dita a ordenação do algoritmo
    String rotaAtual;
    int caminho[];
   

    public No (int verticeAtual, int verticeAnterior, double custoG, double custoAparente, String rotaAtual) {

        this.elemento = verticeAtual;
        this.custoG = custoG;
        this.custoAparente = custoAparente;
        this.rotaAtual = rotaAtual;
        this.caminho = new int [14];
       
    }

    void inicializeCaminho () {

        for (int i = 0; i < 14; i++) {
            this.caminho [i] = -1; 
        }

    }

    void pushcaminho (No NoAnterior) {
        int sizeCaminho = 0;
        for (int i = 0; i < caminho.length; i++) {
            if (NoAnterior.caminho[i] != -1) {
                this.caminho[i] = NoAnterior.caminho[i];
                sizeCaminho++;
            }
        }

        this.caminho[sizeCaminho] = this.elemento;

    }

    void pushcaminhoRESTRICAO (int EI) {
       this.caminho[0] = EI;
    }

    public double getCustoAparente() {
        return custoAparente;
    }

    public int compareTo(No no) {
        if(this.getCustoAparente() > no.getCustoAparente()) {
            return 1;
        } else if (this.getCustoAparente() < no.getCustoAparente()) {
            return -1;
        } else {
            return 0;
        }
    }
}