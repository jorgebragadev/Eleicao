	import java.util.Scanner;



	public class simulacaoEleicao {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int candidatoX = 0;
	        int candidatoY = 0;
	        int candidatoZ = 0;
	        int votosBranco = 0;
	        int votosNulo = 0;
	        
	       
	        

	        while (true) {
	            System.out.println("----- Eleição -----\n");
	            System.out.println("Candidato_X: " + candidatoX);
	            System.out.println("Candidato_Y: " + candidatoY);
	            System.out.println("Candidato_Z: " + candidatoZ);
	            System.out.println("Branco: " + votosBranco);
	            System.out.println("Nulo: " + votosNulo);
	            
	            
	            System.out.println("\n1 - Votar no candidato X");
	            System.out.println("2 - Votar no candidato Y");
	            System.out.println("3 - Votar no candidato Z");
	            System.out.println("4 - Votar em branco");
	            System.out.println("5 - Finalizar votação");

	            int opcao;
	            try {
	                opcao = input.nextInt();
	            } catch (Exception e) {
	                System.out.println("Erro: Opção inválida. Digite apenas números.");
	                input.nextLine(); // Limpa o buffer do Scanner
	                continue;
	            }

	            switch (opcao) {
	                case 1:
	                    candidatoX++;
	                    break;
	                case 2:
	                    candidatoY++;
	                    break;
	                case 3:
	                    candidatoZ++;
	                    break;
	                case 4:
	                    votosBranco++;
	                    break;
	                case 5:
	                    System.out.println("Votação finalizada.");
	                    input.close();
	                    int maiorVotos = Math.max(Math.max(candidatoX, candidatoY), candidatoZ);

	                    if (maiorVotos == 0) {
	                        System.out.println("Nenhum voto registrado.");
	                    } else {
	                        System.out.println("\nResultado da Eleição:");
	                        if (candidatoX == maiorVotos) {
	                            System.out.println("Candidato_X é o vencedor com " + candidatoX + " votos.");
	                        }
	                        if (candidatoY == maiorVotos) {
	                            System.out.println("Candidato_Y é o vencedor com " + candidatoY + " votos.");
	                        }
	                        if (candidatoZ == maiorVotos) {
	                            System.out.println("Candidato_Z é o vencedor com " + candidatoZ + " votos.");
	                        }
	                        System.out.println("Votos Brancos: " + votosBranco);
	                        System.out.println("Votos Nulos: " + votosNulo);
	                        
	    
	                    }
	                    return;
	                default:
	                    System.out.println("Erro: Opção inválida. Digite uma opção válida (1 a 5).");
	            }
	        }
	    }
	}


