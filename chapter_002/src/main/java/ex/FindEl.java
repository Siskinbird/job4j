package ex;


public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                System.out.println(i);
                return i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Key could not be null");
        }
        return rsl;
    }
    public static void main(String[] args){
        try {
            FindEl.indexOf(null, null);
        } catch (ElementNotFoundException key) {
            key.printStackTrace();
        }
    }
}
