import java.util.*;

//import java.util.Enumeration;

 class FitCache{
	
	 /* *** Singleton class implementation *** */
	 /*
	private static Map<String, Double> fitnessCache ;
	private FitCache(){
		
	}
	
	public static Map<String, Double> getInstance() {
      fitnessCache = new HashMap<String, Double>();
      return fitnessCache;
   }
	*/
	public static HashMap<String, Double> fitnessCache =  new HashMap<String, Double>();

	public static boolean ifEmpty()
	{
		boolean empty = fitnessCache.isEmpty();
		
		return empty;
	}

	public static boolean ifExist(String ind)
	{
		boolean exists = fitnessCache.containsKey(ind);
		return exists;
	}

	public static void setFitness(String ind, double fitness)
	{
		fitnessCache.put(ind,fitness);
	}
  
	public static double getFitness(String ind)
	{
		return(fitnessCache.get(ind));
	}
	
	public static int hashSize()
	{
		return fitnessCache.size();
	}

	public static void printHash()
	{
		System.out.println(fitnessCache);
	}
	
	public static void randomImmigrant()
	{
		Object[] immigrant = fitnessCache.keySet().toArray();
		Object key = immigrant[new Random().nextInt(immigrant.length)];
		System.out.println("Random immigrant =>  " + key + " : " + fitnessCache.get(key));
 
	}
}