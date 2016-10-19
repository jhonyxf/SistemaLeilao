
/*
 * Código fonte reproduzido do livro 
  * Testes Automatizados: um guia prático
   * Maurício Aniche
    * Caso do Código
     * http://www.casadocodigo.com.br/products/livro-testes-de-software
      */
      package v2;

      import java.util.ArrayList;
      import java.util.List;

      /**
       *
        * @author curcino
	 */
	 public class Leilao {

	     private String objetoLeiloado;
	     	
		    private static List<Lance> lances = new ArrayList<Lance>();

		        public Leilao(String objetoLeiloado) {
			        this.objetoLeiloado = objetoLeiloado;
				       
				           }

					       public String getObjetoLeiloado() {
					               return objetoLeiloado;
						           }

							       public void propoe(Lance lance) {
							               this.lances.add(lance);
								           }

									       public List<Lance> getLances() {
									               return lances;
										           }  
											       
											           public static void ordena(){
												       	for(int i=0; i<lances.size();i++){
													    		for(int j=i+1; j<lances.size();j++){
															    			if (lances.get(i).getValor()<lances.get(j).getValor()){
																		    				Lance temp = lances.get(i);
																						    				lances.set(i, lances.get(j));
																										    				lances.set(j, temp);
																														    			}
																																	    		}
																																			    	}
																																				    }
																																				        
																																					}

