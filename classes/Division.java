package classes;

public class Division {

		//*************   VARIABLES    *************
		/**
		 * Les infos de la division.
		 */

		private int code;
		private String libelle;


		//*************   ACCESSEURS    *************

		/**
         * Accesseurs du code et du libelle
         *
         */
		public int getTcode()
		{
			return code;
		}

		public String getlibelle()
		{
		    return libelle;
		}

		/**
         * Modifieurs du code et du libelle
         *
         */
		public void setcode(int code){
			this.code = code;
		}
		public void setlibelle(String libelle){
			this.libelle = libelle;
		}


		//*************   CONSTRUCTEUR   *************
		/**
         * Constructeur de la division
         *@param code "le code de la division"
         *@param libelle "le libelle de la division"
         */
		public Division(int code , String libelle){

			this.code = code;
			this.libelle = libelle;
		}

		/**
         * Constructeur par défaut de la division
         * code "le code de la division"
         * libelle "le libelle de la division"
         */
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

