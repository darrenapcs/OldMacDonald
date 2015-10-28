class Chick implements Animal 
{     
	private String myType;
	private String mySound;
	private String mysound1;
	

	public Chick(String type, String sound, String sound1)
	{
		myType = type;
		mySound = sound;
		mysound1 = sound1; 
	}
	public Chick()
	{
		myType = "unkown";
		mySound = "unkown";
		mysound1 = "unkown";
		


	}


	public String getSound()
	{
	if(Math.random()*1 > 0.5)
	     return mySound;
    else
    	return mysound1;
}
	
	public String getType(){return myType;}
}