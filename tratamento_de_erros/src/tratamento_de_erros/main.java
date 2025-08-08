package tratamento_de_erros;

import java.util.Scanner;

import java.util.List;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.time.LocalDateTime;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		int idade;
		String local;
		String nome;
		String funcao;
		String endereco;
		String email;
		String telefone;
		String estado;
		int assento;
		String cpf;
		while (true) {
			try {
				System.out.println("Digite sua idade: ");
				 idade = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Digite somente numeros");
				input.nextLine();
			}
		}
		while (true) {
			try {
				System.out.println("Digite o lugar onde você trabalha: ");
				 local = text.nextLine().trim().toLowerCase();

				if (local.isEmpty() == false) {
					if (local.matches("[A-za-z ]+")) {
						break;
					} else {
						System.out.println("Digite somente letras");
					}

				} else {
					System.out.println("Não pode ficar vazio seu animal");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida");
			}

		}
		// Matches

		while (true) {

			try {
				System.out.println("Digite seu nome");
				 nome = text.nextLine().trim().toLowerCase();

				if (nome.matches("[A-za-z ]+")) {
					break;
				} else {
					System.out.println("Digite somente letras");
				}

			} catch (Exception e) {
				System.out.println("Digite uma mensagem válida" + e.getMessage());
			}
		}
			while (true) {
				try {
					System.out.println("Digite sua função:  ");
					 funcao = text.nextLine().trim().toLowerCase();
					if (funcao.isEmpty() == false) {
						if (funcao.matches("[A-Za-z ]+")) {
							break;
						} else {
							System.out.println("Digite somente letras");
						}
					} else {
						System.out.println("A função não pode ficar vazia");
					}
				} catch (Exception e) {
					System.out.println("Entrada inválida");
				}
			}
				while (true) {
					try {
						System.out.println("Digite o seu endereço: "); 
						endereco = text.nextLine().trim().toLowerCase();
						if (endereco.isEmpty() == false) {
							if (endereco.matches("[A-za-z0-9, ]+")) {
								break;
							} else {
								System.out.println("Endereço não pode ficar vazio");
							}
						} else {
							System.out.println("Não pode ficar vazio");
						}
					} catch (Exception e) {
						System.out.println("Entrada inválida  "+ e.getMessage());

					}
				}
				while (true) {
					try {
						System.out.println("Digite seu e-mail");
						 email = text.nextLine();
						if (email.isEmpty() == false) {
							if (email.matches("[a-z0-9._%+-]+@[A-za-z0-9.-]+\\.[A-Za-z]{2,}")) {
								break;
							} else {
								System.out.println("Campo não pode estar vazio");
							}
						} else {
							System.out.println("E-mail inválido");
						}
					} catch (Exception e) {
						System.out.println("Entrada inválida");
					}
				}
				while (true) {
					try {
						System.out.println("Digite seu telefone \n Ex: (XX) XXXXXXXXX");
						 telefone = text.nextLine().trim();
						if (telefone.isEmpty() == false) {
							if (telefone.length() == 14 && telefone.matches("[0-9() ]+")) {

								break;
							} else {
								System.out.println("Telefone inválido");
							}
						} else {
							System.out.println("Campo não pode ficar vazio");
						}

					} catch (Exception e) {
						System.out.println("Entrada inválida");
					}
				}
				while (true) {
					List<String> uf = Arrays.asList("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT",
							"MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE",
							"TO");
					System.out.println("Digite seu estado");
					 estado = text.nextLine().trim().toUpperCase();
					if (estado.isEmpty() == false) {
						if (uf.contains(estado)) {
							break;
						} else {
							System.out.println("Digite uma uf válida");
						}
					}
				}

				while (true) {
					try {
						System.out.println("Digite o seu assento");
						 assento = input.nextInt();

						if (assento >= 1 && assento <= 60) {
							break;
						} else {
							System.out.println("Assento inválido");
						}
					} catch (Exception e) {
						System.out.println("Entrada inválida");
						input.nextLine();
					}
				}

				while (true) {
					try {
						System.out.println("Digite o seu cpf: ");
						 cpf = text.nextLine();
						valida_cpf valcpf = new valida_cpf();
						if (valcpf.isCPF(cpf)) {
							System.out.println(valida_cpf.imprimeCPF(cpf));
							break;
						} else {
							System.out.println("CPF inválido");
						}

					} catch (Exception e) {
						System.out.println("Entrada inválida");
					}
				}

				LocalDateTime dataHoraAtual = LocalDateTime.now();
				System.out.println("------------");
				
				System.out.println("Nome: "+nome+"\n"+ "Idade: "+ idade+ "\n"+ "Função: "
				+ funcao+"\n"+"Endereço: " + endereco+"\n"+ "E-mail: "
						+email+"\n"+"Telefone: "+telefone+"\n"+ "Estado: "
				+estado+"\n"+"Local: "+local+"\n"+"Assento: "+assento+"\n"+"CPF: "+cpf+"\n"+"Endereço: "+endereco);
				

			}

		
	}



