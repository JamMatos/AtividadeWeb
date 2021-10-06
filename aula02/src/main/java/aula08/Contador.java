package aula08;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Contador {

		private static int contagem;
		static ArrayList<String> datas = new ArrayList<>();
		
		public static void novoAcesso() {
			contagem += 1;
		}
		
		public static int getQuantidadeAcessos() {
			return contagem;
		}
		
		public static Object getDataInicio() {
			return datas.get(0);
		}
		
		public static String getDataHora() {
			DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			datas.add(dateformat.format(date));
			return dateformat.format(date);
		}
		
		public static void main(String[] args) {
			Contador.novoAcesso();
		}
}
