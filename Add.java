public class Add implements Operate{
    @Override
    public Double getResult(Double... numbers){
System.out.println("ola que ase");
        Double sum = 0.0;

        for(Double num: numbers){
            sum += num;
        }
        return sum;
    }
}
