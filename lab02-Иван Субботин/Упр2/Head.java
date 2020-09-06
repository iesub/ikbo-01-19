package ru.mirea.lab02.task02;

public class Head {
    private boolean bold;
    private String headForm;
    public Head(boolean bold, String headForm){
        this.bold = bold;
        this.headForm = headForm;
    }
    public void setBold(boolean bold){
        this.bold = bold;
    }
    public void setHeadForm(String headForm){
        this.headForm = headForm;
    }
    public String getHeadForm(){
        return headForm;
    }
    public boolean getBold(){
        return bold;
    }

    @Override
    public String toString() {
        return "Head{" +
                "bold=" + bold +
                ", headForm='" + headForm + '\'' +
                '}';
    }
}
