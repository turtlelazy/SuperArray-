public class SuperArray{
	private String[] data;
	private int size;
	
	public SuperArray(){
		size = 0;
		data = new String[10];
	}
	
	public SuperArray(int initialCapacity){
		size = 0;
		data = new string[initialCapacity];
	}
	
	public int size(){
		return size;
	}
	
	public boolean add(String element){
		if(data.length<=size){
			resize();
		}
		data[size] = element;
		size++;
		return true;
	}
	
	public void add(int index, String element){
		if(data.length<=size){
			resize();
		}
		for(int i = size;i>index;i--){
			data[i] = data[i-1];
		}
		data[index] = element;
		size++;
	}
	
	public String remove(int index){
		for(int i = index; i < size;i++){
			data[i] = data[i+1];
		}
		size --;
	}
	
	public String get(int index){
		return data[index];
	}
	
	public String set(int index,String element){
		String replaced = data[index];
		data[index] = element;
		return replaced;
	}
	
	private void resize(){
		String[] cup = data;
		data = new String[size*2+1];
		for(int i = 0; i <cup.length;i++){
			data[i] = cup[i];
		}
	}
	public boolean isEmpty(){
		return (size == 0);
	}
	
	public void clear(){
		size = 0;
		data = new String[10];
	}
	
	public String toString(){
		String returnString = "[";
		for(int i =0; i <size;i++){
			returnString += data[i];
			if(i!=size-1){
				returnString+= ",";
			}
		}
		returnString += "]";
		return returnString;
	}
	
	public boolean contains(String s){
		for(int i = 0;i<sizei++){
			if(data[i].equals(s)){
				return true;
			}
		}
		return false;
	}
	
	public int indexOf(String s){
		for(int i = 0; i<size;i++){
			if(data[i].equals(s)){
				return i;
			}
		}
		return -1;
	}
	
	

}