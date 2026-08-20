package com.DSAPrograms;

public class MovieDAta_ConstructorChaining {


			String villan;
			String heroName;
			String Heroine;
			int no_ofmovie;
			int movieId;
			double budget;

			public MovieDAta_ConstructorChaining() {
				System.out.println("it is current class constructor ");
				this.villan = "jagapathiBAbu";
			}

			public MovieDAta_ConstructorChaining(MovieDAta_ConstructorChaining c, String heroName, String Heroine) {
				System.out.println("it is current class  two string constructor ");
				this.villan = c.villan;

				this.heroName = heroName;
				this.Heroine = Heroine;
			}

			public MovieDAta_ConstructorChaining(MovieDAta_ConstructorChaining c, int no_ofmovie, int movieId) {
				System.out.println(c.heroName);//
				System.out.println(c.Heroine);//
				this(c, c.heroName, c.Heroine);
				System.out.println("it is current class two int  constructor ");

				this.no_ofmovie = no_ofmovie;
				this.movieId = movieId;
			}

			public MovieDAta_ConstructorChaining(MovieDAta_ConstructorChaining c, double budget) {
				this(c, c.no_ofmovie, c.movieId);
				System.out.println("it is full  current class constructor ");

				this.budget = budget;

			}

			void info() {
				System.out.println(villan);
				System.out.println(heroName);
				System.out.println(Heroine);
				System.out.println(no_ofmovie);
				System.out.println(movieId);
				System.out.println(budget);
				System.out.println("*******************************");

			}

			public static void main(String[] args) {
				MovieDAta_ConstructorChaining x = new MovieDAta_ConstructorChaining();
				x.info();
				MovieDAta_ConstructorChaining x1 = new MovieDAta_ConstructorChaining(x, "Prabhas", "Sruthi");
				x1.info();

				MovieDAta_ConstructorChaining x2 = new MovieDAta_ConstructorChaining(x1, 12, 545);
				x2.info();

				MovieDAta_ConstructorChaining x3 = new MovieDAta_ConstructorChaining(x2, 45000000.00);
				x3.info();
				MovieDAta_ConstructorChaining x4=x3;
				System.out.println("*******************");
				x4.info();
				

			}

		
	}


