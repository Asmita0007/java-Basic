class FinalDemo2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++)
            System.out.println("In loop");
        
            Thread.sleep(5000);
        
            System.out.println("InterruptedException occurred");
        
    }
}
