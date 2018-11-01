package printer;
//import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.PriorityQueue;

public class Printer {

	public static void main(String[] args) {
		try(BufferedReader buff=new BufferedReader(new FileReader("input.txt"))){
			String fileLine;
			BinaryHeap<PrintJob<Object>> queue=new BinaryHeap<PrintJob<Object>>();
			System.out.println("Input File\n---------------------------------------------------------------------------------------------------");
			while((fileLine=buff.readLine())!=null) {
				System.out.println(fileLine);
				//parse line into array indexes
				String [] lineArray= fileLine.split("\t");
				//check for inside or outside job
				if(lineArray[3].equals("I")) {
					queue.insert(new PrintJob<Object>(lineArray[0],Integer.parseInt(lineArray[1]),Integer.parseInt(lineArray[2])));
					
				}else {
					queue.insert(new OutsidePrintJob(lineArray[0],Integer.parseInt(lineArray[1]),Integer.parseInt(lineArray[2])));
				}
			}
			System.out.println("Printer Queue\n---------------------------------------------------------------------------------------------------");
			while(!queue.isEmpty()) {
				queue.deleteMin().printJob();;
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
