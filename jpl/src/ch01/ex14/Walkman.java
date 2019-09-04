package ch01.ex14;

class Walkman {
    private String data;

    protectedWalkman() {}

    public void setData(String data) {
       this.data = data;
    }

    public void play() {
        System.out.println(data);
    }

    public void deleteData() {
       this.data = null;
    }

    protected String getData() {
        return this.data;
    }
}