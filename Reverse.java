class Reverse{
    public static void main(String[] args) {
        StringBuilder obj = new StringBuilder("mrinal");
        for (int i=0; i<obj.length(); i+=2){
            int front = i;
            int back = obj.length() - 1- i;

            char frontchar = obj.charAt(front);
            char backchar = obj.charAt(back);

            obj.setCharAt(front, backchar);
            obj.setCharAt(back, frontchar);
        }
        System.out.println(obj);
    }

}