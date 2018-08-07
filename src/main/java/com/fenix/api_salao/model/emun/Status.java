package com.fenix.api_salao.model.emun;

public enum Status {
		
		AGENDADO(1, "Agendado"),
		COMFIRMADO(2,"Comfirmado"),
		FINALIZADO(3, "Finalizado");
	
		private Integer  cod;
		private String descricao;
		
		private Status(Integer  cod, String descricao) {
			this.cod = cod;
			this.descricao = descricao;
		}

		public Integer getCod() {
			return cod;
		}

		public String getDescricao() {
			return descricao;
		}
		
		public static Status toEnum(Integer cod) {
			
			if (cod == null) {
				return null;
			}
			for (Status x : Status.values()) {
				if (cod.equals(x.getCod())) {
					return x;
				}
			}
			
		throw new IllegalArgumentException("Id invalido: "+cod);
		}

	

}
