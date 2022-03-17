package bsu.comp152;

public class Vctor {
    double[] elements;


    public Vctor(double[] arr){
        elements = new double[arr.length];
        for (int i = 0; i < arr.length; i++){
            elements[i] = arr[i];
        }
    }

    //Getter
    public int getDimension(){
        return elements.length;
    }

    public String toString (){
        String output = "[";
        // The for-loop iterates through all the cards in hand
        for (int i = 0; i < elements.length; i++) {
            if (i == elements.length -1){ // if on the last index then do not add a comma to the string
                output += elements[i]; // just add the abbreviation at the i index to the bigger output string
            }
            else{
                //if not the last index then add a comma to the string
                output += (elements[i] + ","); //get the abbreviation of the card at the i index and add a comma after it to the output string
            }
        }
        // lastly, close off the entire string that has all the card abbreviations with a closing bracket
        return output += "]"; // then return the final string
    }

    public Vctor addVector(Vctor other){
        Vctor vect = new Vctor(other.elements);
        for (int i = 0; i < elements.length; i++) {
            vect.elements[i] = elements[i] + other.elements[i];
        }
        return vect;
    }

    public double geometricLength(){
        double totalArr = 0;
        for (int i = 0; i < elements.length; i++){
           totalArr += Math.pow(elements[i], 2);
        }
        return Math.sqrt(totalArr);
    }

    public double dotProduct (Vctor vec2){
        double total = 0;
        for (int i = 0; i < elements.length; i++){
            total += elements[i] * vec2.elements[i];
        }
        return total;
    }

}
