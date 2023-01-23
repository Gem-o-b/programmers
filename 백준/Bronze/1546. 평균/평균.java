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
		double arr[] = new double [Integer.parseInt(br.readLine())];
		String tmp[] = br.readLine().split(" ");
		for(int i =0;i<arr.length ; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
		}
		Arrays.sort(arr);
		double arrtmp = Arrays.stream(arr).map(i->i/arr[arr.length-1]*100).sum();
		arrtmp = arrtmp/arr.length;
		System.out.println(arrtmp);
	}
}