package classes;

public class Eleve {

		//*************   VARIABLES    *************

		private int code;
		private String nom;
		private String prenom;
		private String dateNaiss;
		/**
         * Les infos de l'élève.
         *
         * code = son code
         * nom= nom de famille
         * prenom = prenom
         * dateNaiss = date de naissance
         *
         */
		//*************   ACCESSEURS    *************
		public int getTcode()
		{
			return code;
		}

		public String getnom()
		{
		    return nom;
		}

		public String getprenom()
		{
		    return prenom;
		}

		public String getdateNaiss()
		{
		    return dateNaiss;
		}
		/**
         * Accesseurs du code,du nom, du prenom et de la date de naissance
         *
         */
		public void setcode(int code){
			this.code = code;
		}
		public void setnom(String nom){
			this.nom = nom;
		}
		public void setprenom(String prenom){
			this.prenom = prenom;
		}
		public void setdateNaiss(String dateNaiss){
			this.dateNaiss = dateNaiss;
		}

		/**
         * Modifieurs du code,du nom, du prenom et de la date de naissance
         *
         */

		//*************   CONSTRUCTEUR   *************

		public Eleve(int code , String nom ,String prenom ,String dateNaiss){

			this.code = code;
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaiss = dateNaiss;
		}
		/**
         * Constructeur de l'élève
         *
         */

		public Eleve(){

			code = 1;
			nom = "Sébillet";
			prenom = "Clément";
			dateNaiss = "16-04-1994";
		}
		/**
         * Constructeur par défaut de l'élève
         *
         */

		//*************   Méthode toString  *************
		public String toString ( ){
		    return "Le code: "+code+", le nom: "+nom+", le prenom: "+prenom+", la date de naissance: "+dateNaiss+".";
		}
		/**
         * Méthode toString qui retourne les infos de l'élève
         *
         */

	}

