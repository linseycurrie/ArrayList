import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public int getNumberCount(){
        return this.numbers.size();
    }

    public void addNumber(Integer number){
        this.numbers.add(number);
    }

    public int getNumberAtIndex(int number) {
        return this.numbers.get(number);
    }

//    public int getTotal() {
//        int total = 0;
//        for( int i = 0; i < getNumberCount(); i ++){
//            total += getNumberAtIndex(i);
//        }
//        return total;
//    }

    public int getTotal(){
        int total = 0;
        for(int number : this.numbers){
            total += number;
        }
        return total;
    }
}
