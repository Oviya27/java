package generics;

public class genericClass<T> {
		T obj;
		void add(T obj) {
				this.obj=obj;
		}
		T get() {
			return obj;
		}

		public static void main(String[] args) {
			genericClass<String> obj= new genericClass<String>();
			obj.add("hii everyone");
			System.out.println(obj.get());

		}


}
