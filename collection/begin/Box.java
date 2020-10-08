package collection.begin;

public class Box<T> {
	T data;
	
	T getData(){
		return data;
	}
	
	void  putData(T val){
		data = val;
	}
}
