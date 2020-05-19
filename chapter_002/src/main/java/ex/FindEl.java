package ex;


public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        if (key == null) {
            throw new ElementNotFoundException("Key could not be null");
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                System.out.println(i);
                return i;
            }
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
