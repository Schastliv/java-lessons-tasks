package Lesson7;

public class InputField extends Ellement {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (value!=null) {
            this.value = value;
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void select(){
        System.out.println("Input Field selected");
    }
}
