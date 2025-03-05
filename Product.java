class Product
{
    int pcode;
    String pname;
    int price;
    Product(int code, String name, int pr)
    {
        pcode=code;
        pname=name;
        price=pr;
    }
    void display()
    {
        System.out.println("product code: "+pcode);
        System.out.println("product name: "+pname);
        System.out.println("product price: "+price);
        System.out.println("....................");
        }
        public static void main(String[] args) {
            Product p1=new Product(1,"apple",10);
            Product p2=new Product(2,"banana",20);
            Product p3=new Product(3,"cherry",30);
            
            
            System.out.println("Product Details:");
            p1.display();
            p2.display();
            p3.display();
        
        
        
            Product lowest;
            if(p1.price<p2.price&&p1.price<p3.price)
            lowest=p1;
            else if(p2.price<p3.price)
            lowest=p2;
            else
            lowest=p3;

            System.out.println("Product with lowest price:");
            lowest.display();
            }

        }
        
