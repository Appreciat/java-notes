package javanotes.demo.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class FundApiFetchDemo {
    public static void main(String[] args) throws IOException {
        URL url = URI.create("http://fund.eastmoney.com/pingzhongdata/161725.js").toURL();
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
        StringBuilder result = new StringBuilder();

        String line;
        while ((line = in.readLine()) != null) {
            result.append(line);
        }

        System.out.println(result.toString());
    }
}
