package XPRACTICE;

import java.util.*;
import java.io.*;

public class SherlockParenthesis {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            sb.append("Case #").append(i + 1).append(": ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            long result = Math.min(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            result = result * (result + 1) / 2;
            sb.append(result).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();             // flush the buffer stream
        bw.close();             // close the buffer writer
    }
}