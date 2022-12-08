package com.example.kombuchawebshopbackend.Common;

import com.example.kombuchawebshopbackend.Entity.Blog;
import com.example.kombuchawebshopbackend.Entity.Product;
import com.example.kombuchawebshopbackend.Repository.BlogRepository;
import com.example.kombuchawebshopbackend.Repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitialData implements CommandLineRunner {

    ProductRepository productRepository;
    BlogRepository blogRepository;

    public InitialData(ProductRepository productRepository, BlogRepository blogRepository) {
        this.productRepository = productRepository;
        this.blogRepository = blogRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Product product1 = new Product("Asparagus Rex", 50, "Asparagus is a unique type of kombucha. That's because, in contrast to other kombuchas, a majority of the liquid (but not all) actually comes from the kombucha fermentation. That means you get a softer, rounder flavor in Asparagus. This beverage is very good for you, and a great way to spice up your drinking routine.It is the closest drink to the elixir of life. Try it, you won't regret it!", 10);
        Product product2 = new Product("Cherry Poppins", 55, "This cherry based kombucha will blow your taste buds. The sweet cherry will bring a burst of tartness to the kombucha drinker. The cherry has a light honey flavor. As the cherry has so much sugar in it, it's best to keep it light in flavor. Personally I'd keep the cherry flavor on the light side. I'd mix it into a homemade soda. You can also add a little vanilla to enhance the taste of the kombucha. Either way, you'll love the taste of this kombucha.", 10);
        Product product3 = new Product("Professor Grape", 55, "This fermented grapes kombucha is almost like wine, but healthier. The extra sugar in the grape juice gives the finished product a very sweet taste and tingling on the tongue. It is a perfect daily refresher. Grapes and kombucha make a perfect natural blend for your health. Just mix the grapes, lemon juice and ice into a bubbly kombucha. Let sit for 5-10 minutes and boom your kombucha cocktail is ready.It helps you to fight in a natural way heart Disease. We highly recommend not to delay ordering this great drink!", 10);
        Product product4 = new Product("Rassy Dassy", 55, "Raspberry! One of the most popular berry in the world. This healthy and absolutely fantastic tasting kombucha has some serious health benefits. It helps you to slow down the aging process, detoxifies, adds an extra dose of vitamin C and reduces inflammation. Also it is packed with nutrition. Your body can absorb 75% of raspberry on the first day. A daily dose of kombucha helps you to minimize the occurrence of acne and blemishes. This energizing berry kombucha can boost your energy, improve your mood and give you a healthy glow. It is a perfect cure for insomnia. Not only does raspberry help you to get rid of those unwanted pimples but also helps you to get rid of dark circles. It's benefits are endless. For more details on them read our blog page.", 10);
        Product product5 = new Product("Berry Fairy", 55, "One of our most popular kombucha is the strawberry one. It uses strawberries from our farm, which are canned on our farm. It is also 100% organic, and comes in a perfect size bottle for a very fair price. The strawberry kombucha is full of strawberries and also uses high quality fermentation microbes. The consistency is similar to a fruit smoothie. For more information about the strawberry kombucha feel free to contact Kalle. Order your strawberry kombucha from our website. It is guaranteed that you are going to love it.", 10);

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);
        productRepository.save(product5);

        Blog blog1 = new Blog("Hello World!", "This is Kalle with the latest Kombucha news! Stay tuned!This is Kalle with the latest Kombucha news! Stay tuned!This is Kalle with the latest Kombucha news! Stay tuned! This is Kalle with the latest Kombucha news! Stay tuned!This is Kalle with the latest Kombucha news! Stay tuned! This is Kalle with the latest Kombucha news! Stay tuned!This is Kalle with the latest Kombucha news! Stay tuned!", LocalDate.of(2022,12,1), LocalTime.of(8,10));
        Blog blog2 = new Blog("No Update!", "No news, everything is cool! Get your Limited Kombucha today! ", LocalDate.of(2022,12,3), LocalTime.of(12,31));
        Blog blog3 = new Blog("Some Update!", "Hi there, everything is still cool! Still waiting for the first customer! Anytime now!", LocalDate.of(2022,12,4), LocalTime.of(14,55));
        Blog blog4 = new Blog("Is anyone here?", "Where are you guys at?!", LocalDate.of(2022,12,4), LocalTime.of(22,22));
        blogRepository.save(blog1);
        blogRepository.save(blog2);
        blogRepository.save(blog3);
        blogRepository.save(blog4);
    }
}
