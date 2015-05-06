package classesBasicas;

	public class Aulas {
		
		String nomeAula;
		String diaDaSemana;
		String horaDaAula;
		
		public Aulas(String aula, String diaDaSemana, String horaDaAula){
			setNomeAula(aula);
			setDiaDaSemana(diaDaSemana);
			setHoraAula(horaDaAula);
		}
		
		public void setNomeAula(String nomeAula){
			this.nomeAula = nomeAula;
		}
		
		public void setDiaDaSemana(String diaDaSemana){
			this.diaDaSemana = diaDaSemana;
		}
		
		public void setHoraAula(String horaAula){
			this.horaDaAula = horaAula;
		}
		
		public String getNomeDaAula(){
			return nomeAula;
		}
		public String getDiaDaSemana(){
			return diaDaSemana;
		}

}
