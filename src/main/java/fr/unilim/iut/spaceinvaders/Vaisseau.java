package fr.unilim.iut.spaceinvaders;

	public class Vaisseau {

		int longueur;
		int hauteur;
		Position origine;
		Dimension dimension;
		
		
		
		   public Vaisseau(int longueur, int hauteur, int x, int y) 
		   {
			   this.dimension = new Dimension(longueur, hauteur);
			   this.origine = new Position (x,y);
		   }

		
		  public Vaisseau(int longueur, int hauteur) {
	            this(longueur, hauteur, 0, 0);
	        }



		public boolean occupeLaPosition(int x, int y) {
			return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
		}

		private boolean estOrdonneeCouverte(int y) {
			return (this.origine.ordonnee()-this.dimension.hauteur()+1<=y) && (y<=this.origine.ordonnee());
		}

		private boolean estAbscisseCouverte(int x) {
			return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
		}

		public int abscisseLaPlusADroite() {
			return this.origine.abscisse()+this.dimension.longueur()-1;
		}
		
		public int abscisseLaPlusAGauche() {
	        return this.origine.abscisse();
		}
	    
		   public void seDeplacerVersLaDroite() {
			    this.origine.changerAbscisse(this.origine.abscisse()+1);
		   }

		
	       public void seDeplacerVersLaGauche() {
			    this.origine.changerAbscisse(this.origine.abscisse()-1);
		  }
		
		
	      public void positionner(int x, int y) {
			  this.origine.changerAbscisse(x);
			  this.origine.changerOrdonnee(y);
	      }

	}

