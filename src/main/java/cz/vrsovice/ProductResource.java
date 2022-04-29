package cz.vrsovice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;


@Path("shop")
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
    public String data = "ID,Type,SKU,Name,Published,\"Is featured?\",\"Visibility in catalog\",\"Short description\",Description,\"Date sale price starts\",\"Date sale price ends\",\"Tax status\",\"Tax class\",\"In stock?\",Stock,\"Backorders allowed?\",\"Sold individually?\",\"Weight (lbs)\",\"Length (in)\",\"Width (in)\",\"Height (in)\",\"Allow customer reviews?\",\"Purchase note\",\"Sale price\",\"Regular price\",Categories,Tags,\"Shipping class\",Images,\"Download limit\",\"Download expiry days\",Parent,\"Grouped products\",Upsells,Cross-sells,\"External URL\",\"Button text\",Position,\"Attribute 1 name\",\"Attribute 1 value(s)\",\"Attribute 1 visible\",\"Attribute 1 global\",\"Attribute 2 name\",\"Attribute 2 value(s)\",\"Attribute 2 visible\",\"Attribute 2 global\",\"Meta: _wpcom_is_markdown\",\"Download 1 name\",\"Download 1 URL\",\"Download 2 name\",\"Download 2 URL\"\n" +
            "44,variable,woo-vneck-tee,\"V-Neck T-Shirt\",1,1,visible,\"This is a variable product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,.5,24,1,2,1,,,,\"Clothing > Tshirts\",,,\"https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/vneck-tee-2.jpg, https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/vnech-tee-green-1.jpg, https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/vnech-tee-blue-1.jpg\",,,,,,,,,0,Color,\"Blue, Green, Red\",1,1,Size,\"Large, Medium, Small\",1,1,1,,,,\n" +
            "45,variable,woo-hoodie,Hoodie,1,0,visible,\"This is a variable product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,1.5,10,8,3,1,,,,\"Clothing > Hoodies\",,,\"https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-2.jpg, https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-blue-1.jpg, https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-green-1.jpg, https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-with-logo-2.jpg\",,,,,,,,,0,Color,\"Blue, Green, Red\",1,1,Logo,\"Yes, No\",1,0,1,,,,\n" +
            "46,simple,woo-hoodie-with-logo,\"Hoodie with Logo\",1,0,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,2,10,6,3,1,,,45,\"Clothing > Hoodies\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-with-logo-2.jpg,,,,,,,,,0,Color,Blue,1,1,,,,,1,,,,\n" +
            "47,simple,woo-tshirt,T-Shirt,1,0,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,.8,8,6,1,1,,,18,\"Clothing > Tshirts\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/tshirt-2.jpg,,,,,,,,,0,Color,Gray,1,1,,,,,1,,,,\n" +
            "48,simple,woo-beanie,Beanie,1,0,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,.2,4,5,.5,1,,18,20,\"Clothing > Accessories\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/beanie-2.jpg,,,,,,,,,0,Color,Red,1,1,,,,,1,,,,\n" +
            "58,simple,woo-belt,Belt,1,0,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,1.2,12,2,1.5,1,,55,65,\"Clothing > Accessories\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/belt-2.jpg,,,,,,,,,0,,,,,,,,,1,,,,\n" +
            "60,simple,woo-cap,Cap,1,1,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,0.6,8,6.5,4,1,,16,18,\"Clothing > Accessories\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/cap-2.jpg,,,,,,,,,0,Color,Yellow,1,1,,,,,1,,,,\n" +
            "62,simple,woo-sunglasses,Sunglasses,1,1,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,.2,4,1.4,1,1,,,90,\"Clothing > Accessories\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/sunglasses-2.jpg,,,,,,,,,0,,,,,,,,,1,,,,\n" +
            "64,simple,woo-hoodie-with-pocket,\"Hoodie with Pocket\",1,1,hidden,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,3,10,8,2,1,,35,45,\"Clothing > Hoodies\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-with-pocket-2.jpg,,,,,,,,,0,Color,Gray,1,1,,,,,1,,,,\n" +
            "66,simple,woo-hoodie-with-zipper,\"Hoodie with Zipper\",1,1,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,2,8,6,2,1,,,45,\"Clothing > Hoodies\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-with-zipper-2.jpg,,,,,,,,,0,,,,,,,,,1,,,,\n" +
            "68,simple,woo-long-sleeve-tee,\"Long Sleeve Tee\",1,0,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,1,7,5,1,1,,,25,\"Clothing > Tshirts\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/long-sleeve-tee-2.jpg,,,,,,,,,0,Color,Green,1,1,,,,,1,,,,\n" +
            "70,simple,woo-polo,Polo,1,0,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,.8,6,5,1,1,,,20,\"Clothing > Tshirts\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/polo-2.jpg,,,,,,,,,0,Color,Blue,1,1,,,,,1,,,,\n" +
            "73,\"simple, downloadable, virtual\",woo-album,Album,1,0,visible,\"This is a simple, virtual product.\",\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,1,,,15,Music,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/album-1.jpg,1,1,,,,,,,0,,,,,,,,,1,\"Single 1\",https://demo.woothemes.com/woocommerce/wp-content/uploads/sites/56/2017/08/single.jpg,\"Single 2\",https://demo.woothemes.com/woocommerce/wp-content/uploads/sites/56/2017/08/album.jpg\n" +
            "75,\"simple, downloadable, virtual\",woo-single,Single,1,0,visible,\"This is a simple, virtual product.\",\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,1,,2,3,Music,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/single-1.jpg,1,1,,,,,,,0,,,,,,,,,1,Single,https://demo.woothemes.com/woocommerce/wp-content/uploads/sites/56/2017/08/single.jpg,,\n" +
            "76,variation,woo-vneck-tee-red,\"V-Neck T-Shirt - Red\",1,0,visible,,\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,0,,,20,,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/vneck-tee-2.jpg,,,woo-vneck-tee,,,,,,0,Color,Red,,1,Size,,,1,,,,,\n" +
            "77,variation,woo-vneck-tee-green,\"V-Neck T-Shirt - Green\",1,0,visible,,\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,0,,,20,,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/vnech-tee-green-1.jpg,,,woo-vneck-tee,,,,,,0,Color,Green,,1,Size,,,1,,,,,\n" +
            "78,variation,woo-vneck-tee-blue,\"V-Neck T-Shirt - Blue\",1,0,visible,,\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,0,,,15,,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/vnech-tee-blue-1.jpg,,,woo-vneck-tee,,,,,,0,Color,Blue,,1,Size,,,1,,,,,\n" +
            "79,variation,woo-hoodie-red,\"Hoodie - Red, No\",1,0,visible,,\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,0,,42,45,,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-2.jpg,,,woo-hoodie,,,,,,1,Color,Red,,1,Logo,No,,0,,,,,\n" +
            "80,variation,woo-hoodie-green,\"Hoodie - Green, No\",1,0,visible,,\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,0,,,45,,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-green-1.jpg,,,woo-hoodie,,,,,,2,Color,Green,,1,Logo,No,,0,,,,,\n" +
            "81,variation,woo-hoodie-blue,\"Hoodie - Blue, No\",1,0,visible,,\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,0,,,45,,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-blue-1.jpg,,,woo-hoodie,,,,,,3,Color,Blue,,1,Logo,No,,0,,,,,\n" +
            "83,simple,Woo-tshirt-logo,\"T-Shirt with Logo\",1,0,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,.5,10,12,.5,1,,,18,\"Clothing > Tshirts\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/t-shirt-with-logo-1.jpg,,,,,,,,,0,Color,Gray,1,1,,,,,1,,,,\n" +
            "85,simple,Woo-beanie-logo,\"Beanie with Logo\",1,0,visible,\"This is a simple product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,.2,6,4,1,1,,18,20,\"Clothing > Accessories\",,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/beanie-with-logo-1.jpg,,,,,,,,,0,Color,Red,1,1,,,,,1,,,,\n" +
            "87,grouped,logo-collection,\"Logo Collection\",1,0,visible,\"This is a grouped product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,,,,,1,,,,Clothing,,,\"https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/logo-1.jpg, https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/beanie-with-logo-1.jpg, https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/t-shirt-with-logo-1.jpg, https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-with-logo-2.jpg\",,,,\"woo-hoodie-with-logo, woo-tshirt, woo-beanie\",,,,,0,,,,,,,,,1,,,,\n" +
            "89,external,wp-pennant,\"WordPress Pennant\",1,0,visible,\"This is an external product.\",\"Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.\",,,taxable,,1,,0,0,,,,,1,,,11.05,Decor,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/pennant-1.jpg,,,,,,,https://mercantile.wordpress.org/product/wordpress-pennant/,\"Buy on the WordPress swag store!\",0,,,,,,,,,1,,,,\n" +
            "90,variation,woo-hoodie-blue-logo,\"Hoodie - Blue, Yes\",1,0,visible,,\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis orci ac odio dictum tincidunt. Donec ut metus leo. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed luctus, dui eu sagittis sodales, nulla nibh sagittis augue, vel porttitor diam enim non metus. Vestibulum aliquam augue neque. Phasellus tincidunt odio eget ullamcorper efficitur. Cras placerat ut turpis pellentesque vulputate. Nam sed consequat tortor. Curabitur finibus sapien dolor. Ut eleifend tellus nec erat pulvinar dignissim. Nam non arcu purus. Vivamus et massa massa.\",,,taxable,,1,,0,0,,,,,0,,,45,,,,https://woocommercecore.mystagingwebsite.com/wp-content/uploads/2017/12/hoodie-with-logo-2.jpg,,,woo-hoodie,,,,,,0,Color,Blue,,1,Logo,Yes,,0,,,,,\n";

    String[] arrayOfData = data.split("\n");
    ArrayList<Product> products = new ArrayList<>();

    private void addProducts() {
        for (int i = 1; i < arrayOfData.length; i++) {
            final String[] row = arrayOfData[i].split(",");
            boolean isfeatured = row[5].contains("1");
            products.add(new Product(row[2], Integer.parseInt(row[0]), row[3], row[7], row[1],isfeatured));
        }
    }

    Category categories = new Category(products);


    @GET
    public Response getAllProducts() {
        addProducts();

        return Response.ok(categories).build();
    }

    @GET
    @Path("featured")
    public Response getAllFeatured() {
        addProducts();
        return Response.ok(categories.getFeatured()).build();
    }

    @GET
    @Path("other")
    public Response getOthers() {
        addProducts();
        return Response.ok(categories.getOthers()).build();
    }

}
