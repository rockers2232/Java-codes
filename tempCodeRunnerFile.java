interface countP {
    void name(String s);
}

class Result implements countP {
    public void name(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "madam racecar apple level noon";
        Result obj = new Result(); // ✅ Create an instance
        obj.name(s); // ✅ Call the method using the instance

    }
}
