public class equalsFunctionAndDoubleEqualsSign {
    @Override
    public boolean equals(Object object){
        if(this==object) return true;
        return this.hashCode()==object.hashCode();
    }
    public static void main(String[] args) {
        String str1 = "raj";
        String str2 = "raj";
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1.hashCode()==str2.hashCode());
        System.out.println(str2.hashCode());
    }
}
