package classesBasicas;

import java.sql.Date;

	public class Aulas {
		
		String nomeAula;
		String data;
		String horaDaAula;
		
		public Aulas(String aula, String data, String horaDaAula){
			setNomeAula(aula);
			setData(data);
			setHoraAula(horaDaAula);
		}
		
		public void setNomeAula(String nomeAula){
			this.nomeAula = nomeAula;
		}
		
		public void setData(String data){
			this.data = data;
		}
		
		public void setHoraAula(String horaAula){
			this.horaDaAula = horaAula;
		}
		
		public String getNomeDaAula(){
			return nomeAula;
		}
		public String getData(){
			return data;
		}

}
