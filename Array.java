public class Array{
       private String[] elements;

       // define the array's capacity
       public Array(int capacity){
           this.elements = new String[capacity];
       }

       // add elements in the
        public void add(String element){
           for (int i=0; i<this.elements.length; i++){
               if (this.elements[i] == null){
                   this.elements[i] = element;
                   break;
               }
            }
        }
}