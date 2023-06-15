package com.hasnatjanirafin.chinesefood;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodListActivity extends AppCompatActivity {


    private List<FoodItem> foodItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);


        foodItems = new ArrayList<>();


        foodItems.add(new FoodItem("Hot Pot (火锅)", R.drawable.picture1, "Hot Pot, or Huoguo, holds a special place in Chinese culinary culture, originating over 1,000 years ago. It is more than just a meal; it's a social experience, a communal feast that brings people together around a simmering pot of flavorful broth. Into this bubbling cauldron are dipped an array of raw ingredients—meats, seafood, vegetables, tofu, and noodles—each enhancing the broth's richness. Over time, regional variations have emerged, like the numbingly spicy Sichuan Hot Pot and the wholesome, medicinal Cantonese Hot Pot. Celebrated across China, especially during cold winter months, Hot Pot embodies the warmth and camaraderie of Chinese dining culture, transforming a simple meal into a memorable communal experience."));

        foodItems.add(new FoodItem("Peking Roasted Duck (北京烤鸭)", R.drawable.picture4, "Peking Roasted Duck is a shining star of Chinese cuisine, a dish synonymous with the culinary traditions of Beijing. Its origins can be traced back to the Yuan Dynasty, but it truly found fame during the Qing Dynasty when it graced the imperial menu. Peking Duck is renowned for its thin, crispy skin, tender meat, and the intricate preparation process that involves inflating, hanging, and roasting the duck. The result is a culinary masterpiece, often served with scallions, cucumber, sweet bean sauce, and soft pancakes. Peking Duck isn't just a meal; it's a dining ritual that reflects the elegance and sophistication of Chinese gastronomy, cherished by locals and tourists alike."));

        foodItems.add(new FoodItem("Kung Pao Chicken (宫保鸡丁)", R.drawable.picture6, "Kung Pao Chicken, also known as Gong Bao Ji Ding, is a fiery and flavor-packed dish from the Sichuan province. Born in the kitchens of the Qing Dynasty, it bears the name of a late Qing Dynasty official known as Ding Baozhen, whose title was 'Kung Pao'. The culinary brilliance of Kung Pao Chicken lies in the perfect balance of its ingredients - tender diced chicken stir-fried with crunchy peanuts, vibrant veggies, and those infamous Sichuan peppercorns, all united by a glossy, piquant sauce. This dish offers a symphony of flavors, with each bite delivering a spicy, sweet, and sour punch. Kung Pao Chicken, with its unforgettable melange of tastes, has won hearts not only in China but across the world, symbolizing the global influence of Chinese cuisine."));

        foodItems.add(new FoodItem("Mapo Tofu (麻婆豆腐)", R.drawable.picture7, "Mapo Tofu, often translated as 'Pockmarked Grandma's Tofu', is another iconic Sichuanese dish that basks in the glory of the region's signature peppercorns. Named after a reportedly disfigured old woman who supposedly invented the dish, Mapo Tofu stands out for its robust, tongue-numbing spice and comforting softness of tofu. Ground meat, usually beef or pork, is stir-fried with fermented broad bean paste, chili, and Sichuan peppercorns before tofu is added to simmer and absorb the flavors. The resulting dish, a fiery red pool of silken tofu and savory minced meat, is a celebration of Sichuan's bold and unapologetic flavors. It's a favorite in family dinners and high-end restaurants alike, demonstrating the universal appeal of this spicy, heartwarming dish."));

        foodItems.add(new FoodItem("Dumplings (饺子)", R.drawable.picture8, "Dumplings, or Jiaozi, are perhaps the most iconic of Chinese foods, symbolizing wealth, reunion, and good fortune. The tradition of dumpling making, which dates back to the Han Dynasty, is deeply woven into Chinese culture, particularly during the Lunar New Year celebrations. Dumplings are pockets of dough, usually filled with a mixture of finely chopped ingredients like meat, seafood, and vegetables. Whether they are boiled, steamed, or pan-fried, dumplings offer a bite-sized gastronomic adventure. They are a testament to Chinese culinary artistry, encapsulating diverse regional flavors within their simple, elegant folds. They've found global acclaim, connecting people to Chinese culture one bite at a time."));

        foodItems.add(new FoodItem("Chow Mein (炒面)", R.drawable.picture2, "Chow Mein, or 'fried noodles', has been a staple in Chinese cuisine for centuries, emerging from the northern regions of China where wheat-based dishes reign supreme. The beauty of Chow Mein lies in its simplicity: noodles stir-fried to perfection with a medley of ingredients like vegetables, meat, seafood, and a savory sauce. Yet within this simplicity lies infinite variety; every province, city, even every cook, has their unique take on Chow Mein. From the crispy Cantonese style to the soy-drenched Shanghai style, Chow Mein showcases the dynamism of Chinese culinary heritage. This dish has transcended borders, becoming a global favorite and introducing the world to the comfort and versatility of Chinese noodle dishes."));

        foodItems.add(new FoodItem("Sweet and Sour Pork (糖醋里脊)", R.drawable.picture3, "Sweet and Sour Pork, or Tang Cu Li Ji, is a classic dish in Chinese cuisine, specifically the Jiangsu province. It represents the Chinese culinary principle of balance, masterfully blending contrasting flavors. This dish involves batter-coated pork deep-fried until golden, then cloaked in a vibrant sauce that is sweet from sugar, sour from vinegar, and beautifully colored by the addition of tomato paste or ketchup. Sweet and Sour Pork's enduring popularity not only within China but also internationally testifies to the universal appeal of its unique flavor profile. It's a dish that showcases the innovative spirit of Chinese cuisine, turning ordinary ingredients into an extraordinary feast for the senses."));

        foodItems.add(new FoodItem("Spring Rolls (春卷)", R.drawable.picture9, "Spring Rolls, known as Chun Juan in Chinese, are a beloved feature of Chinese New Year celebrations, symbolizing spring's arrival and a new beginning. Their history spans centuries, with roots in the Eastern Jin Dynasty. Spring Rolls are cylindrical pastries, their thin, crisp wrappers enveloping a variety of fillings like vegetables, meat, or seafood. When fried, the golden, crackly exterior gives way to a soft, flavorful filling, making each bite a delightful experience. Regional variations of Spring Rolls exist throughout China, and their popularity has spread globally. They embody the spirit of Chinese festive culture, encapsulating the joy and prosperity of spring in their delicious, golden form."));

        foodItems.add(new FoodItem("Fried Rice (炒饭)", R.drawable.picture10, "Fried Rice, or Chǎofàn, is the epitome of Chinese comfort food, a testament to the culinary philosophy of transforming simple ingredients into a delightful dish. The history of Fried Rice is intertwined with China's rice farming culture, an innovative solution to use leftover rice. It involves stir-frying cooked rice with a medley of ingredients like vegetables, eggs, and various proteins, all seasoned with soy sauce. Varieties like Yangzhou Fried Rice and Fujian Fried Rice each have their distinctive flavors. A favorite in home-cooked meals and restaurants, Fried Rice has transcended borders, becoming a global ambassador of Chinese cuisine."));

        foodItems.add(new FoodItem("Beef Noodles Soup (牛肉面)", R.drawable.picture11, "Beef Noodle Soup, or Niúròu Miàn, is a beloved dish originating from China's Lanzhou region. It encapsulates the culinary mastery of Chinese noodle soups—a comforting bowl of hand-pulled noodles, tender beef slices, and leafy greens swimming in a deeply flavorful broth. Preparing this dish is a labor of love, requiring hours of slow-cooking the beef to achieve a rich, robust soup. It's not just food, it's an art form, with chefs often having their unique recipe passed down through generations. Celebrated in noodle shops across China and worldwide, Beef Noodle Soup is a soul-soothing symbol of China's vibrant food culture."));

        foodItems.add(new FoodItem("Steamed Vermicelli Rolls (肠粉)", R.drawable.picture12, "Steamed Vermicelli Rolls, known as Changfen in Chinese, are a cherished staple of Cantonese dim sum. These delicate, rice noodle rolls originated in Guangdong province and have been winning over taste buds for centuries. The rolls are made by spreading a thin layer of rice batter on a steaming tray, adding a variety of fillings—ranging from shrimp to barbecued pork to vegetables—and then rolling it up carefully before it's steamed to silky perfection. The resulting rolls, translucent and tender, are typically doused in a savory-sweet soy sauce. Changfen has made its way from the bustling streets of Guangzhou to dim sum restaurants worldwide, charming diners with its simplicity and elegance."));

        foodItems.add(new FoodItem("Dim Sum (点心)", R.drawable.picture13, "Dim Sum, which translates to 'touch the heart', is a central element of Cantonese cuisine, tracing its roots back to the teahouses of the Silk Road. Over time, Dim Sum has evolved into a wide array of bite-sized delicacies, designed to be savored alongside tea. From steamed buns and dumplings to rice noodle rolls and tarts, Dim Sum dishes offer a cornucopia of flavors and textures. The tradition of Yum Cha, enjoying tea and Dim Sum, is a cornerstone of Cantonese culture—a leisurely, communal affair that nourishes both body and soul. As the popularity of Dim Sum has spread globally, it has become a symbol of Chinese culinary tradition and artistry, offering a sensory journey through the heart of Cantonese cuisine."));

        foodItems.add(new FoodItem("Ma Po Tofu (麻婆豆腐)", R.drawable.picture14, "Ma Po Tofu, translating as 'Pockmarked Grandma's Tofu', is a cultural icon of Sichuan cuisine. It signifies the boldness and creativity of Sichuan food culture, capturing the culinary spirit of the region. With its fiery color and tongue-tingling spice, Ma Po Tofu is the epitome of the 'mala' (numbing and spicy) flavor that Sichuan cuisine is famed for. Despite its rustic presentation, it's a culinary adventure that challenges and delights the senses in equal measure. This dish has been embraced by food enthusiasts worldwide, emblematic of the complex and daring flavors that Chinese cuisine has to offer."));

        foodItems.add(new FoodItem("Moo Shu Pork (木须肉)", R.drawable.picture15, "Moo Shu Pork is a staple of northern Chinese cuisine, particularly prominent in Beijing. This dish is an exciting mix of thinly sliced pork, scrambled eggs, and an assortment of vegetables, including the hallmark ingredient—Moo Shu, or wood ear fungus—stir-fried in a robust sauce. Traditionally, it's served with a small, thin pancake and sweet bean sauce, the fillings rolled inside like a savory wrap. With its long history and the balance of textures and flavors it offers, Moo Shu Pork is a culinary representation of the Beijing region. It's enjoyed by locals and expats alike, both in its homeland and around the world."));

        foodItems.add(new FoodItem("Baozi (Steamed Buns - 包子)", R.drawable.picture16, "Baozi, or steamed buns, have been nourishing the Chinese people for centuries, tracing their roots back to the Three Kingdoms period. These fluffy, white buns—often stuffed with a variety of fillings like meat, vegetables, or sweet bean paste—are a symbol of Chinese culinary ingenuity. Baozi are a staple across China, enjoyed at breakfast, as a snack, or even a meal, from bustling city streets to rural villages. Whether it's a humble roadside stall or a high-end restaurant, the sight and scent of steaming baozi are an integral part of China's food landscape. Beyond China, Baozi has won over global food lovers, its soft texture and heartwarming fillings encapsulating the comfort and soul of Chinese cuisine."));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new FoodListAdapter(this, foodItems));
    }


    public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.FoodViewHolder> {
        private List<FoodItem> foodItems;
        private Context context;


        public FoodListAdapter(Context context, List<FoodItem> foodItems) {
            this.context = context;
            this.foodItems = foodItems;
        }

        @NonNull
        @Override
        public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.food_item, parent, false);
            return new FoodViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
            FoodItem foodItem = foodItems.get(position);
            holder.foodTitle.setText(foodItem.getName());
            holder.foodImage.setImageResource(foodItem.getImageResourceId());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, FoodDetailActivity.class);
                    intent.putExtra("foodItem", foodItem);
                    context.startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return foodItems.size();
        }


        public class FoodViewHolder extends RecyclerView.ViewHolder {
            ImageView foodImage;
            TextView foodTitle;

            public FoodViewHolder(@NonNull View itemView) {
                super(itemView);
                foodImage = itemView.findViewById(R.id.foodImage);
                foodTitle = itemView.findViewById(R.id.foodTitle);
            }
        }
    }
}
