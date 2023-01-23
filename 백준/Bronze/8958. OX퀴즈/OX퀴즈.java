import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt( br.readLine());
		int total =0;
		int combo = 0;
		for (int z = 0; z < num;z++) {
			String tmp[] = br.readLine().split("");
			for(int i =0;i<tmp.length ; i++) {
				if (tmp[i].equals("O")) {
					
					combo++;
					
					total += combo;
				}else {
					combo=0;
				}
			}
			System.out.println(total);
			total =0;
			combo =0;
		}
		
	}
}