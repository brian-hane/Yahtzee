/**
 * 
 */

/**
 * @author Brian Hane
 *
 */
public class YahtzeeDie {
	private int value;
	private int FACES =6;
	
	public YahtzeeDie(){
		this.roll();
	}
	public YahtzeeDie(int f){
		this.FACES=f;
		this.roll();
	}
	public void roll(){
		this.value = (int)(Math.random()*FACES)+1;
	}
	 public int getValue(){
	        return this.value;   
	    }

	 public String toString(){
	        return Integer.toString(this.value);
	    }
}
