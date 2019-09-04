package ch01.ex15;

interface LookupOperation extends Lookup {
    public void add(String name, Object obj);
    public void remove(String name);    
}