import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[28];
		int tmp = 0;
		int count = 1;
		int tmp2 =0;
		for(int i = 0;i<28;i++) {
			arr[i] = Integer.parseInt( br.readLine());
		}
		Arrays.sort(arr);
		while(true) {
			
			if (arr[tmp] != count) {
				System.out.println(count);
				tmp2++;
			}else {
				tmp++;
			}
			if (tmp ==28) {
				if (tmp2 ==1) {
					System.out.println(30);
				}
				break;
			}
			count++;
			
		}
		
	}
}