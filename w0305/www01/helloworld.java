public class helloworld {
    public static void main(String[] args) {
        System.out.println("helloworld");
        System.out.println("helloworld");
        
        int grade = 80;
        
        if (grade > 60) {
            // 根據圖片最後一行的截斷內容，推測是在輸出字串後串接 grade 變數
            System.out.println("You can pass\n" + grade);
        }
    }
}