import java.util.*;

//import java.util.Enumeration;

 class FitCache{
	
	 /* *** Singleton class implementation *** */
	 
	private static FitCache fitnessCache = null;
	private HashMap<String, Double> myCache;
	
	private FitCache(){
		myCache=new HashMap<String, Double>();
	}
	
	public static FitCache getInstance() {
		if(fitnessCache==null)
		{
			fitnessCache = new FitCache();
		}
      return fitnessCache;
   }
  
	//public static HashMap<String, Double> fitnessCache =  new HashMap<String, Double>();

	public boolean ifEmpty()
	{
		boolean empty = myCache.isEmpty();
		
		return empty;
	}

	public boolean ifExist(String ind)
	{
		boolean exists = myCache.containsKey(ind);
		return exists;
	}

	public  void setFitness(String ind, double fitness)
	{
		myCache.put(ind,fitness);
	}
  
	public double getFitness(String ind)
	{
		return(myCache.get(ind));
	}
	
	public int hashSize()
	{
		return myCache.size();
	}

	public void printHash()
	{
		System.out.println(myCache);
	}
	
	public void randomImmigrant()
	{
		Object[] immigrant = myCache.keySet().toArray();
		Object key = immigrant[new Random().nextInt(immigrant.length)];
		System.out.println("Random immigrant =>  " + key + " : " + myCache.get(key));
 
	}
}