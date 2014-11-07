package classes;

public class Division {

		//*************   VARIABLES    *************
		private int code;
		private String libelle;
		/**
         * Les infos de la division.
         *
         * code = code de la division
         * libelle= libelle de la division
         *
         */

		//*************   ACCESSEURS    *************
		public int getTcode()
		{
			return code;
		}

		public String getlibelle()
		{
		    return libelle;
		}

		/**
         * Accesseurs du code et du libelle
         *
         */

		public void setcode(int code){
			this.code = code;
		}
		public void setlibelle(String libelle){
			this.libelle = libelle;
		}

		//*************   CONSTRUCTEUR   *************

		public Division(int code , String libelle){

			this.code = code;
			this.libelle = libelle;
		}

		public Division(){

			code = 1;
			libelle = "laclasse";
		}

		//*************   Méthode toString  *************
		public String toString ( ){
		    return "Le code: "+code+", le libelle: "+libelle+".";
		}
		/**
         * Méthode toString qui retourne les infos de la division
         *
         */

	}

