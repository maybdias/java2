package apresentação2;
import java.util.*;
public class Produto {
	private String nome;
	private double preco;

	public static void main(String[] args) {
	//Declaração das váriaveis
		Produto p1 = new Produto();
		p1.nome = "Sabão em pó";
		p1.preco = 8.6;
			
		Produto p2 = new Produto();
		p2.nome = "Maçã";
		p2.preco = 1.3;
			
		Produto p3 = new Produto();
		p3.nome = "Salmão";
		p3.preco = 9.1;
			
		Produto p4 = new Produto();
		p4.nome = "Iogurte";
		p4.preco = 5.9;
		
	//Diferença de Queue e Priority Queue:
			Queue<Double> QueuePreco = new LinkedList<>();
			QueuePreco.add(p1.preco);
			QueuePreco.add(p2.preco);
			QueuePreco.add(p3.preco);
			QueuePreco.add(p4.preco);
			
			System.out.println("Queue:");
			while(!QueuePreco.isEmpty()){
	//utilização do poll()
				System.out.println(QueuePreco.poll());
			}
	//Priority Queue:
			PriorityQueue<Double>priorityQueuePreco = new PriorityQueue<>();
			priorityQueuePreco.add(p1.preco);
			priorityQueuePreco.add(p2.preco);
			priorityQueuePreco.add(p3.preco);
	//utilização do poll();
			System.out.println("Priority Queue:");
			while(!priorityQueuePreco.isEmpty()){
				System.out.println(priorityQueuePreco.poll());
			}
	//utilização do peek:
			Double elemento = priorityQueuePreco.peek();
	//nesse caso irá dar null como a fila de prioridade
			System.out.println("Peek: " + elemento);

			priorityQueuePreco.add(p4.preco);
	//Usando peek() para obter o elemento de maior prioridade sem removê-lo
			if (!priorityQueuePreco.isEmpty()){
	            Double elementoNaFrente = priorityQueuePreco.peek();
	//Imprimindo o elemento de maior prioridade
	            System.out.println("Elemento de maior prioridade: " + elementoNaFrente);
	        } else {
	            System.out.println("A fila de prioridade está vazia.");
	        }
		}
	}
