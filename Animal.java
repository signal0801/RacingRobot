class Animal{
	protected String name;
	    protected int length;

		  public Animal(String name, int length){
			      this.name = name;
				      this.length = length;
					    }

}

class Cat extends Animal{
	  public Cat(){
		      super("ねこ", 10);
			    }

				  public void mew(){
					      System.out.println(name + " " + length + " みゃおー");
						    }
}


class AnimalSimulator{
	  public static void main(String[] args){
		      new Cat().mew();
			    }
}

